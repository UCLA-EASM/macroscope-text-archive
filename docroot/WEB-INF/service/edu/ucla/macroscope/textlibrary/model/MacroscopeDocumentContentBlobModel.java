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

import java.sql.Blob;

/**
 * The Blob model class for lazy loading the content column in MacroscopeDocument.
 *
 * @author dave
 * @see MacroscopeDocument
 * @generated
 */
public class MacroscopeDocumentContentBlobModel {
	public MacroscopeDocumentContentBlobModel() {
	}

	public MacroscopeDocumentContentBlobModel(long documentId) {
		_documentId = documentId;
	}

	public MacroscopeDocumentContentBlobModel(long documentId, Blob contentBlob) {
		_documentId = documentId;
		_contentBlob = contentBlob;
	}

	public long getDocumentId() {
		return _documentId;
	}

	public void setDocumentId(long documentId) {
		_documentId = documentId;
	}

	public Blob getContentBlob() {
		return _contentBlob;
	}

	public void setContentBlob(Blob contentBlob) {
		_contentBlob = contentBlob;
	}

	private long _documentId;
	private Blob _contentBlob;
}