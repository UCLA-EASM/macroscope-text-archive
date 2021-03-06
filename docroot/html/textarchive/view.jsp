<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui" %>


<%@ page import="java.util.List" %>
<!--  %@ page import="edu.ucla.macroscope.textlibrary.service.DocumentLocalServiceUtil" %-->

<portlet:defineObjects />

<div ng-controller="DocumentListController">
	<p ng-model="message" class="alert alert-success">{{message}}</p>
	<table>
		<thead>
		<!-- 
			<tr>
				<th colspan="5">
					Page {{currentPage}} of {{totalPages}} (total items: {{totalItems}}) 
				</th>
			</tr> 
		-->
			<tr class="table-heading">
				<th ng-click="prevPage()" class="control">
					<span class="control">
						<span class="glyphicon glyphicon-chevron-left" ng-if="currentPage > 0" ></span>
					</span>
				</th>
				<th>Title</th>
				<th>Author</th>
				<th>Collection</th>
				<th ng-click="nextPage()" class="control">
					<span class="control">
						<span class="glyphicon glyphicon-chevron-right" ng-if="hasNextPage" ></span>
					</span>
				</th>
			</tr>
		</thead>
		<tbody>
			<tr ng-repeat="document in items" ng-model="document">
				<td><input type=checkbox ng-click="select(document)" /></td>
				<td>{{document.title}} ({{document.documentId}})</td>
				<td>{{document.author}}</td>
				<td>{{document.collection}}</td>
			</tr>
		</tbody>
	</table>
	<button ng-click="delete()" />Delete</button>
	<button ng-click="showEditScreen()">Upload a file</button>
	<button ng-click="showEditScreen()">Edit files</button>
</div>

<!-- Author list -->

<portlet:actionURL name="showDataAssignmentScreen" var="documentEditURL">
</portlet:actionURL>

<a href="<%= documentEditURL %>">Edit</a>

<%
List authors = null; // TODO: implement selecting unique authors
%>

<script type="text/ng-template" id="editscreen.html">

	<form ng-model="data">
		Title: <input type="text" name="title" label="Title" ng-model="data.title" value="{{data.title}}" /><br/>
		Author: <input type="text" name="author" label="Author" ng-model="data.author" value="{{data.author}}" /><br/>
		Collection: <input type="text" name="collection" label="Collection Name" ng-model="data.collection" value="{{data.collection}}" /><br/>
	
		<button type="submit" name="submit" ng-click="save(data)">Save</button>
	</form>

	<table nv-file-drop="" nv-file-select uploader="uploader">
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
	
	<input type="file" name="file" nv-file-select="" uploader="uploader" />
</script>

