var DocumentListController = ['$scope', '$http', '$modal', function ($scope, $http, $modal) {
	$scope.items = [];
	
	$scope.message = "";
	
	$scope.totalItems = 0;
	$scope.itemsPerPage = 10;
	$scope.currentPage = 0;
	$scope.totalPages = 0;
	
	$scope.hasNextPage = true;
	
	$scope.prevPage = function () {
		if ($scope.currentPage > 0) {
			$scope.currentPage -= 1;
		}
		reloadSearch();
	}
	
	$scope.nextPage = function () {
//		if ($scope.nextPage < $scope.totalPages) {
			$scope.currentPage += 1;
//		}
		reloadSearch();
	};
	
	var reloadSearch = function () {
		$http.get('/api/jsonws/macroscope-text-archive-portlet.macroscopedocument/get-documents/?' + 
				'authors=' + 
				'&collections=' +
				'&start=' + ($scope.currentPage * $scope.itemsPerPage) + 
				'&end=' + (($scope.currentPage + 1) * $scope.itemsPerPage)
			).success(function (data) {
				$scope.items = data;
				if (data.length < $scope.itemsPerPage) {
					$scope.hasNextPage = false;
				} else {
					$scope.hasNextPage = true;
				}
		}).error(function (error) {
			alert("Nothing found");
		});
	};
	
	reloadSearch();
	
	$scope.select = function (document) {
		if (document.isChecked) {
			document.isChecked = false;
		} else {
			document.isChecked = true;
		}
	};
	
	var getSelectedDocuments = function () {
		return $scope.items.filter(function (i) {return i.isChecked;}).map(function (i) {return i.documentId;});
	};
	
	$scope.delete = function () {
		var selectedDocuments = getSelectedDocuments(),
			deletedDocuments = []
		;
		
		for (var i = 0; i < selectedDocuments.length; i++) {
			var item = selectedDocuments[i];
			
			$http.post('/api/jsonws/macroscope-text-archive-portlet.macroscopedocument/delete/document-id/' + item)
			.success(function (response, status, fn, request) {
				var documentId = request.url.split('/').pop();
				deletedDocuments.push(documentId);
				
				if (deletedDocuments.length == selectedDocuments.length) {
					
					var pluralize = 's';
					
					if (selectedDocuments.length == 1) {
						pluralize = '';
					}
					$scope.message = selectedDocuments.length + " document" + pluralize + " deleted";
					reloadSearch();
				}
			}).error(function (data) {
				alert("Problem deleting document " + item);
			});
		} // end for
	} // end remove function
	
	$scope.showEditScreen = function () {
		$modal.open({
			templateUrl: 'editscreen.html',
			controller: 'FileUploadController',
			resolve: {
				documentIds: function (ids) {
					return function () {
						return ids;
					}
				}(getSelectedDocuments())
			}
		}).result.then(function () {
			reloadSearch()
		});
	};
	
}
];