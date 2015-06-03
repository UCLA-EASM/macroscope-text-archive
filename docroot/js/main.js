




(function (Liferay, angular) {
	angular.portlet.add('macroscope-text-archive-portlet', 'text-archive', function () {
		var documentListApp = angular.module("tableListApp", ['angularFileUpload']);
	
		documentListApp.controller("DocumentListController", DocumentListController);
		
		documentListApp.controller("FileUploadController", FileUploadController);
		
		return [documentListApp.name];
	});
})(Liferay, angular);
