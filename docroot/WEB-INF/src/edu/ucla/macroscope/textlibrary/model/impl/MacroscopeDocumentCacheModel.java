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

package edu.ucla.macroscope.textlibrary.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import edu.ucla.macroscope.textlibrary.model.MacroscopeDocument;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MacroscopeDocument in entity cache.
 *
 * @author dave
 * @see MacroscopeDocument
 * @generated
 */
public class MacroscopeDocumentCacheModel implements CacheModel<MacroscopeDocument>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{documentId=");
		sb.append(documentId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", title=");
		sb.append(title);
		sb.append(", author=");
		sb.append(author);
		sb.append(", collection=");
		sb.append(collection);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MacroscopeDocument toEntityModel() {
		MacroscopeDocumentImpl macroscopeDocumentImpl = new MacroscopeDocumentImpl();

		macroscopeDocumentImpl.setDocumentId(documentId);
		macroscopeDocumentImpl.setGroupId(groupId);
		macroscopeDocumentImpl.setCompanyId(companyId);
		macroscopeDocumentImpl.setUserId(userId);

		if (userName == null) {
			macroscopeDocumentImpl.setUserName(StringPool.BLANK);
		}
		else {
			macroscopeDocumentImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			macroscopeDocumentImpl.setCreateDate(null);
		}
		else {
			macroscopeDocumentImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			macroscopeDocumentImpl.setModifiedDate(null);
		}
		else {
			macroscopeDocumentImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (title == null) {
			macroscopeDocumentImpl.setTitle(StringPool.BLANK);
		}
		else {
			macroscopeDocumentImpl.setTitle(title);
		}

		if (author == null) {
			macroscopeDocumentImpl.setAuthor(StringPool.BLANK);
		}
		else {
			macroscopeDocumentImpl.setAuthor(author);
		}

		if (collection == null) {
			macroscopeDocumentImpl.setCollection(StringPool.BLANK);
		}
		else {
			macroscopeDocumentImpl.setCollection(collection);
		}

		macroscopeDocumentImpl.resetOriginalValues();

		return macroscopeDocumentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		documentId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		title = objectInput.readUTF();
		author = objectInput.readUTF();
		collection = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(documentId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (title == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(title);
		}

		if (author == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(author);
		}

		if (collection == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(collection);
		}
	}

	public long documentId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String title;
	public String author;
	public String collection;
}