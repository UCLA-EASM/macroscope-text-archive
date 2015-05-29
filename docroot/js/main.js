
(function(Liferay, angular) {
   if (angular.portlet)
      return;
   
   angular.portlet = {};

   var angularPortlets = {};

   angular.portlet.add = function(pluginName, portletName, angularFunction) {
      var portletId = "_WAR_" + pluginName.replace(/[_]|[-]/g, "");

      portletId = portletName.replace(/[_]|[-]/g, "") + portletId;
      angularPortlets[portletId] = angularFunction;
   };

   Liferay.Portlet.ready(function(portletInstanceId, node) {
      var portletId = portletInstanceId.replace(/[_]INSTANCE[_].+/g, "");

      if (angularPortlets[portletId]) {
         angular.bootstrap(node.getDOMNode(), angularPortlets[portletId](
            portletInstanceId, node.getDOMNode()));
      }
      
   });
})(Liferay, angular);



(function (Liferay, angular) {
	angular.portlet.add('macroscope-text-archive-portlet', 'text-archive', function () {
		var documentListApp = angular.module("tableListApp", []);
	
		documentListApp.controller("DocumentListController", ['$scope', '$http', function ($scope, $http) {
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
			
		}]);
		
		documentListApp.controller("FileUploadController", ['$scope', '$http', 'FileUploader', function ($scope, $http, FileUploader) {
			$scope.files = [];
			
			var uploader = $scope.uploader = new FileUploader({
				url: '/api/jsonws/macroscope-text-archive-portlet.macroscopedocument/upload-file'
			});
			
			uploader.onWhenAddingFileFailed = function(item /*{File|FileLikeObject}*/, filter, options) {
	            console.info('onWhenAddingFileFailed', item, filter, options);
	        };
	        uploader.onAfterAddingFile = function(fileItem) {
	            console.info('onAfterAddingFile', fileItem);
	        };
	        uploader.onAfterAddingAll = function(addedFileItems) {
	            console.info('onAfterAddingAll', addedFileItems);
	        };
	        uploader.onBeforeUploadItem = function(item) {
	            console.info('onBeforeUploadItem', item);
	        };
	        uploader.onProgressItem = function(fileItem, progress) {
	            console.info('onProgressItem', fileItem, progress);
	        };
	        uploader.onProgressAll = function(progress) {
	            console.info('onProgressAll', progress);
	        };
	        uploader.onSuccessItem = function(fileItem, response, status, headers) {
	            console.info('onSuccessItem', fileItem, response, status, headers);
	        };
	        uploader.onErrorItem = function(fileItem, response, status, headers) {
	            console.info('onErrorItem', fileItem, response, status, headers);
	        };
	        uploader.onCancelItem = function(fileItem, response, status, headers) {
	            console.info('onCancelItem', fileItem, response, status, headers);
	        };
	        uploader.onCompleteItem = function(fileItem, response, status, headers) {
	            console.info('onCompleteItem', fileItem, response, status, headers);
	        };
	        uploader.onCompleteAll = function() {
	            console.info('onCompleteAll');
	        };

	        console.info('uploader', uploader);
	        
		}]);
		
		return [documentListApp.name];
	});
})(Liferay, angular);
