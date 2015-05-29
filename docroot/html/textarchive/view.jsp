<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui" %>


<%@ page import="java.util.List" %>
<!--  %@ page import="edu.ucla.macroscope.textlibrary.service.DocumentLocalServiceUtil" %-->

<portlet:defineObjects />

<% 

// If no query parameters have been set ...
//List documents = DocumentLocalServiceUtil.getDocuments(0, 20);

%>

<div ng-controller="DocumentListController">
	<table>
		<thead>
			<tr>
				<th ng-click="prevPage()">< Prev</th>
				<th>Title</th>
				<th>Author</th>
				<th>Collection</th>
				<th ng-click="nextPage()">Next ></th>
			</tr>
			<tr>
				<th colspan="5">
					Page {{currentPage}} of {{totalPages}} (total items: {{totalItems}}) 
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
</div>

<!-- Author list -->

<portlet:actionURL name="showDataAssignmentScreen" var="documentEditURL">
</portlet:actionURL>

<a href="<%= documentEditURL %>">Upload a document</a>


<%
List authors = null; // TODO: implement selecting unique authors
%>

<%--
<table id="author-list">
	<thead>
		<th>Name</th>
	</thead>
	<tbody>
		<c:forEach items="${authors}" var="author">
			<tr>
				<portlet:renderURL var="selectThisAuthorURL">
					<portlet:param name="authors" value="author.name" />
					<!--  TODO: add already-selected authors -->
					<!--  TODO: add collection -->
				</portlet:renderURL>
				<a href="<%= selectThisAuthorURL %>"><%= author.name %></a>
			</tr>
		</c:forEach>
	</tbody>
</table>
--%>

<portlet:renderURL var="clearAuthorsURL">
	<portlet:param name="authors" value="" />
	<!--  TODO: Add collection -->
</portlet:renderURL>

<a href="<%= clearAuthorsURL %>">Clear All Authors</a>