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

import java.io.Serializable;

import java.sql.Blob;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link edu.ucla.macroscope.textlibrary.service.http.MacroscopeDocumentServiceSoap}.
 *
 * @author dave
 * @see edu.ucla.macroscope.textlibrary.service.http.MacroscopeDocumentServiceSoap
 * @generated
 */
public class MacroscopeDocumentSoap implements Serializable {
	public static MacroscopeDocumentSoap toSoapModel(MacroscopeDocument model) {
		MacroscopeDocumentSoap soapModel = new MacroscopeDocumentSoap();

		soapModel.setDocumentId(model.getDocumentId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setContent(model.getContent());
		soapModel.setTitle(model.getTitle());
		soapModel.setAuthor(model.getAuthor());
		soapModel.setCollection(model.getCollection());

		return soapModel;
	}

	public static MacroscopeDocumentSoap[] toSoapModels(
		MacroscopeDocument[] models) {
		MacroscopeDocumentSoap[] soapModels = new MacroscopeDocumentSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static MacroscopeDocumentSoap[][] toSoapModels(
		MacroscopeDocument[][] models) {
		MacroscopeDocumentSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new MacroscopeDocumentSoap[models.length][models[0].length];
		}
		else {
			soapModels = new MacroscopeDocumentSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static MacroscopeDocumentSoap[] toSoapModels(
		List<MacroscopeDocument> models) {
		List<MacroscopeDocumentSoap> soapModels = new ArrayList<MacroscopeDocumentSoap>(models.size());

		for (MacroscopeDocument model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new MacroscopeDocumentSoap[soapModels.size()]);
	}

	public MacroscopeDocumentSoap() {
	}

	public long getPrimaryKey() {
		return _documentId;
	}

	public void setPrimaryKey(long pk) {
		setDocumentId(pk);
	}

	public long getDocumentId() {
		return _documentId;
	}

	public void setDocumentId(long documentId) {
		_documentId = documentId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public Blob getContent() {
		return _content;
	}

	public void setContent(Blob content) {
		_content = content;
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public String getAuthor() {
		return _author;
	}

	public void setAuthor(String author) {
		_author = author;
	}

	public String getCollection() {
		return _collection;
	}

	public void setCollection(String collection) {
		_collection = collection;
	}

	private long _documentId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private Blob _content;
	private String _title;
	private String _author;
	private String _collection;
}