var FileUploadController = ['$scope', '$http', 'FileUploader', function ($scope, $http, FileUploader) {
	$scope.data = {
		title : '',
		author: '',
		collection: '',
		documentIds : []
	};
	
	$scope.save = function (data) {
		// NOTE: Strictly speaking, this is the wrong thing to do--appending them to the URL parameters
		// However, Angular defaults to sending POST requests as a JSON body, and that doesn't work with
		// Liferay. 
		$http({
			url: '/api/jsonws/macroscope-text-archive-portlet.macroscopedocument/assign',
			method: 'POST',
			params: {
				title: data.title,
				author: data.author,
				collection: data.collection,
				documentIds: data.documentIds.join(',')
			}
		}).success(function () {
			alert("Assigned!");
		});
	}
	
	var uploader = $scope.uploader = new FileUploader({
		url: '/api/jsonws/macroscope-text-archive-portlet.macroscopedocument/upload-file/'
	});
	
	uploader.fileIds = $scope.data.documentIds;
	
	
	
    uploader.onCancelItem = function(fileItem, response, status, headers) {
        console.info('onCancelItem', fileItem, response, status, headers);
    };
    uploader.onSuccessItem = function(fileItem, response, status, headers) {
		this.fileIds.push(parseInt(response));
	};
    
}];