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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link document}.
 * </p>
 *
 * @author dave
 * @see document
 * @generated
 */
public class documentWrapper implements document, ModelWrapper<document> {
	public documentWrapper(document document) {
		_document = document;
	}

	@Override
	public Class<?> getModelClass() {
		return document.class;
	}

	@Override
	public String getModelClassName() {
		return document.class.getName();
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

		String content = (String)attributes.get("content");

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
	* Returns the primary key of this document.
	*
	* @return the primary key of this document
	*/
	@Override
	public long getPrimaryKey() {
		return _document.getPrimaryKey();
	}

	/**
	* Sets the primary key of this document.
	*
	* @param primaryKey the primary key of this document
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_document.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the document ID of this document.
	*
	* @return the document ID of this document
	*/
	@Override
	public long getDocumentId() {
		return _document.getDocumentId();
	}

	/**
	* Sets the document ID of this document.
	*
	* @param documentId the document ID of this document
	*/
	@Override
	public void setDocumentId(long documentId) {
		_document.setDocumentId(documentId);
	}

	/**
	* Returns the group ID of this document.
	*
	* @return the group ID of this document
	*/
	@Override
	public long getGroupId() {
		return _document.getGroupId();
	}

	/**
	* Sets the group ID of this document.
	*
	* @param groupId the group ID of this document
	*/
	@Override
	public void setGroupId(long groupId) {
		_document.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this document.
	*
	* @return the company ID of this document
	*/
	@Override
	public long getCompanyId() {
		return _document.getCompanyId();
	}

	/**
	* Sets the company ID of this document.
	*
	* @param companyId the company ID of this document
	*/
	@Override
	public void setCompanyId(long companyId) {
		_document.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this document.
	*
	* @return the user ID of this document
	*/
	@Override
	public long getUserId() {
		return _document.getUserId();
	}

	/**
	* Sets the user ID of this document.
	*
	* @param userId the user ID of this document
	*/
	@Override
	public void setUserId(long userId) {
		_document.setUserId(userId);
	}

	/**
	* Returns the user uuid of this document.
	*
	* @return the user uuid of this document
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _document.getUserUuid();
	}

	/**
	* Sets the user uuid of this document.
	*
	* @param userUuid the user uuid of this document
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_document.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this document.
	*
	* @return the user name of this document
	*/
	@Override
	public java.lang.String getUserName() {
		return _document.getUserName();
	}

	/**
	* Sets the user name of this document.
	*
	* @param userName the user name of this document
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_document.setUserName(userName);
	}

	/**
	* Returns the create date of this document.
	*
	* @return the create date of this document
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _document.getCreateDate();
	}

	/**
	* Sets the create date of this document.
	*
	* @param createDate the create date of this document
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_document.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this document.
	*
	* @return the modified date of this document
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _document.getModifiedDate();
	}

	/**
	* Sets the modified date of this document.
	*
	* @param modifiedDate the modified date of this document
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_document.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the content of this document.
	*
	* @return the content of this document
	*/
	@Override
	public java.lang.String getContent() {
		return _document.getContent();
	}

	/**
	* Sets the content of this document.
	*
	* @param content the content of this document
	*/
	@Override
	public void setContent(java.lang.String content) {
		_document.setContent(content);
	}

	/**
	* Returns the title of this document.
	*
	* @return the title of this document
	*/
	@Override
	public java.lang.String getTitle() {
		return _document.getTitle();
	}

	/**
	* Sets the title of this document.
	*
	* @param title the title of this document
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_document.setTitle(title);
	}

	/**
	* Returns the author of this document.
	*
	* @return the author of this document
	*/
	@Override
	public java.lang.String getAuthor() {
		return _document.getAuthor();
	}

	/**
	* Sets the author of this document.
	*
	* @param author the author of this document
	*/
	@Override
	public void setAuthor(java.lang.String author) {
		_document.setAuthor(author);
	}

	/**
	* Returns the collection of this document.
	*
	* @return the collection of this document
	*/
	@Override
	public java.lang.String getCollection() {
		return _document.getCollection();
	}

	/**
	* Sets the collection of this document.
	*
	* @param collection the collection of this document
	*/
	@Override
	public void setCollection(java.lang.String collection) {
		_document.setCollection(collection);
	}

	@Override
	public boolean isNew() {
		return _document.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_document.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _document.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_document.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _document.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _document.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_document.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _document.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_document.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_document.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_document.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new documentWrapper((document)_document.clone());
	}

	@Override
	public int compareTo(
		edu.ucla.macroscope.textlibrary.model.document document) {
		return _document.compareTo(document);
	}

	@Override
	public int hashCode() {
		return _document.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<edu.ucla.macroscope.textlibrary.model.document> toCacheModel() {
		return _document.toCacheModel();
	}

	@Override
	public edu.ucla.macroscope.textlibrary.model.document toEscapedModel() {
		return new documentWrapper(_document.toEscapedModel());
	}

	@Override
	public edu.ucla.macroscope.textlibrary.model.document toUnescapedModel() {
		return new documentWrapper(_document.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _document.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _document.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_document.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof documentWrapper)) {
			return false;
		}

		documentWrapper documentWrapper = (documentWrapper)obj;

		if (Validator.equals(_document, documentWrapper._document)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public document getWrappeddocument() {
		return _document;
	}

	@Override
	public document getWrappedModel() {
		return _document;
	}

	@Override
	public void resetOriginalValues() {
		_document.resetOriginalValues();
	}

	private document _document;
}