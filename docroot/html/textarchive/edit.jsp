<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui"%>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>


<portlet:actionURL name="assignFileData" var="assignFileDataURL"></portlet:actionURL>

<aui:form action="<%=assignFileDataURL%>" method="post">
	<aui:input type="text" name="title" label="Title" />
	<aui:input type="text" name="author" label="Author" />
	<aui:input type="text" name="collection" label="Collection Name" />
	<aui:input type="hidden" name="filesAffected" value="" />

	<aui:input type="submit" name="submit" value="Save" />
</aui:form>

<portlet:actionURL name="uploadFile" var="uploadFileURL"></portlet:actionURL>

<aui:form name="files" enctype="multipart/form-data">
	<aui:input type="file" name="filename" label="File" />
	<aui:button type="submit" name="btnUploadFile" value="Upload file" />
</aui:form>

<!-- <script src="$javascript_folder/test.js"></script> -->
<table nv-file-drop="" uploader="uploader">
	<thead>
		<tr>
			<th width="50%">Name</th>
			<th ng-show="uploader.isHTML5">Size</th>
			<th ng-show="uploader.isHTML5">Progress</th>
			<th>Status</th>
			<th>Actions</th>
		</tr>
	</thead>
	<tbody>
		<tr ng-repeat="item in uploader.queue">
			<td><strong>{{ item.file.name }}</strong></td>
			<td ng-show="uploader.isHTML5" nowrap>{{
				item.file.size/1024/1024|number:2 }} MB</td>
			<td ng-show="uploader.isHTML5">
				<div class="progress" style="margin-bottom: 0;">
					<div class="progress-bar" role="progressbar"
						ng-style="{ 'width': item.progress + '%' }"></div>
				</div>
			</td>
			<td class="text-center"><span ng-show="item.isSuccess"><i
					class="glyphicon glyphicon-ok"></i></span> <span ng-show="item.isCancel"><i
					class="glyphicon glyphicon-ban-circle"></i></span> <span
				ng-show="item.isError"><i class="glyphicon glyphicon-remove"></i></span>
			</td>
			<td nowrap>
				<button type="button" class="btn btn-success btn-xs"
					ng-click="item.upload()"
					ng-disabled="item.isReady || item.isUploading || item.isSuccess">
					<span class="glyphicon glyphicon-upload"></span> Upload
				</button>
				<button type="button" class="btn btn-warning btn-xs"
					ng-click="item.cancel()" ng-disabled="!item.isUploading">
					<span class="glyphicon glyphicon-ban-circle"></span> Cancel
				</button>
				<button type="button" class="btn btn-danger btn-xs"
					ng-click="item.remove()">
					<span class="glyphicon glyphicon-trash"></span> Remove
				</button>
			</td>
		</tr>
	</tbody>
</table>

<script>
	AUI()
			.use(
					'aui-io-request',
					function(A) {
						var btnUploadFile = A
								.one("#<portlet:namespace />btnUploadFile");

						btnUploadFile
								.on(
										"click",
										function(event) {
											event.preventDefault();
											var myForm = A
													.one("#<portlet:namespace/>files");
											var ajaxURL = "http://localhost:8080/api/jsonws/macroscope-text-archive-portlet.macroscopedocument/upload-file";

											var configs = {
												method : 'POST',
												form : {
													id : myForm,
													upload : true
												},
												sync : true,
												on : {
													complete : function() {
														/* console.log("File Upload Complete!"); */
														displayFiles();
													}
												}
											};

											A.io.request(ajaxURL, configs);
										})

						var displayFiles = function() {
							console.log("Upload file")
							// append file ID to the form
							// append file ID to the file list

						}
					});
</script>