var DocumentListController = ['$scope', '$http', '$modal', function ($scope, $http, $modal) {
	$scope.items = [];
	
	$scope.totalItems = 0;
	$scope.itemsPerPage = 10;
	$scope.currentPage = 0;
	$scope.totalPages = 0;
	
	$scope.prevPage = function () {
		if ($scope.currentPage > 0) {
			$scope.currentPage -= 1;
		}
		reloadSearch();
	}
	
	$scope.nextPage = function () {
		if ($scope.nextPage < $scope.totalPages) {
			$scope.currentPage += 1;
		}
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
	
	$scope.delete = function () {
		for (var i = 0; i < $scope.items.length; i++) {
			var item = $scope.items[i];
			
			if (item.isChecked) {
				$http.post({
					url: '/api/jsonws/macroscope-text-archive-portlet.macroscopedocument/delete-document/',
					data: {documentId: item.id}
				}).success(function (data) {
					alert("Document " + item.id + " deleted");
				}).error(function (data) {
					alert("Problem deleting document " + item.id);
				});
			} // end if
		} // end for
	} // end remove function
	
	$scope.showEditScreen = function () {
		$modal.open({
			templateUrl: 'editscreen.html',
			controller: 'FileUploadController',
			resolve: function () {
				console.log("All done ...");
			}
		});
	};
	
}
];