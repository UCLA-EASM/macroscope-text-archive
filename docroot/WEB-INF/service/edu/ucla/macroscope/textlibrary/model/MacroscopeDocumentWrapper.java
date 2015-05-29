/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package edu.ucla.macroscope.textlibrary.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.sql.Blob;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link MacroscopeDocument}.
 * </p>
 *
 * @author dave
 * @see MacroscopeDocument
 * @generated
 */
public class MacroscopeDocumentWrapper implements MacroscopeDocument,
	ModelWrapper<MacroscopeDocument> {
	public MacroscopeDocumentWrapper(MacroscopeDocument macroscopeDocument) {
		_macroscopeDocument = macroscopeDocument;
	}

	@Override
	public Class<?> getModelClass() {
		return MacroscopeDocument.class;
	}

	@Override
	public String getModelClassName() {
		return MacroscopeDocument.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("documentId", getDocumentId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("content", getContent());
		attributes.put("title", getTitle());
		attributes.put("author", getAuthor());
		attributes.put("collection", getCollection());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long documentId = (Long)attributes.get("documentId");

		if (documentId != null) {
			setDocumentId(documentId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Blob content = (Blob)attributes.get("content");

		if (content != null) {
			setContent(content);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String author = (String)attributes.get("author");

		if (author != null) {
			setAuthor(author);
		}

		String collection = (String)attributes.get("collection");

		if (collection != null) {
			setCollection(collection);
		}
	}

	/**
	* Returns the primary key of this macroscope document.
	*
	* @return the primary key of this macroscope document
	*/
	@Override
	public long getPrimaryKey() {
		return _macroscopeDocument.getPrimaryKey();
	}

	/**
	* Sets the primary key of this macroscope document.
	*
	* @param primaryKey the primary key of this macroscope document
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_macroscopeDocument.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the document ID of this macroscope document.
	*
	* @return the document ID of this macroscope document
	*/
	@Override
	public long getDocumentId() {
		return _macroscopeDocument.getDocumentId();
	}

	/**
	* Sets the document ID of this macroscope document.
	*
	* @param documentId the document ID of this macroscope document
	*/
	@Override
	public void setDocumentId(long documentId) {
		_macroscopeDocument.setDocumentId(documentId);
	}

	/**
	* Returns the group ID of this macroscope document.
	*
	* @return the group ID of this macroscope document
	*/
	@Override
	public long getGroupId() {
		return _macroscopeDocument.getGroupId();
	}

	/**
	* Sets the group ID of this macroscope document.
	*
	* @param groupId the group ID of this macroscope document
	*/
	@Override
	public void setGroupId(long groupId) {
		_macroscopeDocument.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this macroscope document.
	*
	* @return the company ID of this macroscope document
	*/
	@Override
	public long getCompanyId() {
		return _macroscopeDocument.getCompanyId();
	}

	/**
	* Sets the company ID of this macroscope document.
	*
	* @param companyId the company ID of this macroscope document
	*/
	@Override
	public void setCompanyId(long companyId) {
		_macroscopeDocument.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this macroscope document.
	*
	* @return the user ID of this macroscope document
	*/
	@Override
	public long getUserId() {
		return _macroscopeDocument.getUserId();
	}

	/**
	* Sets the user ID of this macroscope document.
	*
	* @param userId the user ID of this macroscope document
	*/
	@Override
	public void setUserId(long userId) {
		_macroscopeDocument.setUserId(userId);
	}

	/**
	* Returns the user uuid of this macroscope document.
	*
	* @return the user uuid of this macroscope document
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _macroscopeDocument.getUserUuid();
	}

	/**
	* Sets the user uuid of this macroscope document.
	*
	* @param userUuid the user uuid of this macroscope document
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_macroscopeDocument.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this macroscope document.
	*
	* @return the user name of this macroscope document
	*/
	@Override
	public java.lang.String getUserName() {
		return _macroscopeDocument.getUserName();
	}

	/**
	* Sets the user name of this macroscope document.
	*
	* @param userName the user name of this macroscope document
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_macroscopeDocument.setUserName(userName);
	}

	/**
	* Returns the create date of this macroscope document.
	*
	* @return the create date of this macroscope document
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _macroscopeDocument.getCreateDate();
	}

	/**
	* Sets the create date of this macroscope document.
	*
	* @param createDate the create date of this macroscope document
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_macroscopeDocument.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this macroscope document.
	*
	* @return the modified date of this macroscope document
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _macroscopeDocument.getModifiedDate();
	}

	/**
	* Sets the modified date of this macroscope document.
	*
	* @param modifiedDate the modified date of this macroscope document
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_macroscopeDocument.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the content of this macroscope document.
	*
	* @return the content of this macroscope document
	*/
	@Override
	public java.sql.Blob getContent() {
		return _macroscopeDocument.getContent();
	}

	/**
	* Sets the content of this macroscope document.
	*
	* @param content the content of this macroscope document
	*/
	@Override
	public void setContent(java.sql.Blob content) {
		_macroscopeDocument.setContent(content);
	}

	/**
	* Returns the title of this macroscope document.
	*
	* @return the title of this macroscope document
	*/
	@Override
	public java.lang.String getTitle() {
		return _macroscopeDocument.getTitle();
	}

	/**
	* Sets the title of this macroscope document.
	*
	* @param title the title of this macroscope document
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_macroscopeDocument.setTitle(title);
	}

	/**
	* Returns the author of this macroscope document.
	*
	* @return the author of this macroscope document
	*/
	@Override
	public java.lang.String getAuthor() {
		return _macroscopeDocument.getAuthor();
	}

	/**
	* Sets the author of this macroscope document.
	*
	* @param author the author of this macroscope document
	*/
	@Override
	public void setAuthor(java.lang.String author) {
		_macroscopeDocument.setAuthor(author);
	}

	/**
	* Returns the collection of this macroscope document.
	*
	* @return the collection of this macroscope document
	*/
	@Override
	public java.lang.String getCollection() {
		return _macroscopeDocument.getCollection();
	}

	/**
	* Sets the collection of this macroscope document.
	*
	* @param collection the collection of this macroscope document
	*/
	@Override
	public void setCollection(java.lang.String collection) {
		_macroscopeDocument.setCollection(collection);
	}

	@Override
	public boolean isNew() {
		return _macroscopeDocument.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_macroscopeDocument.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _macroscopeDocument.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_macroscopeDocument.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _macroscopeDocument.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _macroscopeDocument.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_macroscopeDocument.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _macroscopeDocument.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_macroscopeDocument.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_macroscopeDocument.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_macroscopeDocument.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new MacroscopeDocumentWrapper((MacroscopeDocument)_macroscopeDocument.clone());
	}

	@Override
	public int compareTo(
		edu.ucla.macroscope.textlibrary.model.MacroscopeDocument macroscopeDocument) {
		return _macroscopeDocument.compareTo(macroscopeDocument);
	}

	@Override
	public int hashCode() {
		return _macroscopeDocument.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<edu.ucla.macroscope.textlibrary.model.MacroscopeDocument> toCacheModel() {
		return _macroscopeDocument.toCacheModel();
	}

	@Override
	public edu.ucla.macroscope.textlibrary.model.MacroscopeDocument toEscapedModel() {
		return new MacroscopeDocumentWrapper(_macroscopeDocument.toEscapedModel());
	}

	@Override
	public edu.ucla.macroscope.textlibrary.model.MacroscopeDocument toUnescapedModel() {
		return new MacroscopeDocumentWrapper(_macroscopeDocument.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _macroscopeDocument.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _macroscopeDocument.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_macroscopeDocument.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MacroscopeDocumentWrapper)) {
			return false;
		}

		MacroscopeDocumentWrapper macroscopeDocumentWrapper = (MacroscopeDocumentWrapper)obj;

		if (Validator.equals(_macroscopeDocument,
					macroscopeDocumentWrapper._macroscopeDocument)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public MacroscopeDocument getWrappedMacroscopeDocument() {
		return _macroscopeDocument;
	}

	@Override
	public MacroscopeDocument getWrappedModel() {
		return _macroscopeDocument;
	}

	@Override
	public void resetOriginalValues() {
		_macroscopeDocument.resetOriginalValues();
	}

	private MacroscopeDocument _macroscopeDocument;
}