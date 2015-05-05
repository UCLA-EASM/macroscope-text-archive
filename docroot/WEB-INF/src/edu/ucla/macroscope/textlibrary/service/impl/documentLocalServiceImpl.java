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

package edu.ucla.macroscope.textlibrary.service.impl;

import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;

import edu.ucla.macroscope.textlibrary.model.Document;
import edu.ucla.macroscope.textlibrary.service.DocumentLocalServiceUtil;
import edu.ucla.macroscope.textlibrary.service.base.DocumentLocalServiceBaseImpl;

/**
 * The implementation of the document local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link edu.ucla.macroscope.textlibrary.service.DocumentLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author dave
 * @see edu.ucla.macroscope.textlibrary.service.base.DocumentLocalServiceBaseImpl
 * @see edu.ucla.macroscope.textlibrary.service.DocumentLocalServiceUtil
 */
public class DocumentLocalServiceImpl extends DocumentLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link edu.ucla.macroscope.textlibrary.service.DocumentLocalServiceUtil} to access the document local service.
	 */
	
	public Document addDocument(
			long userId, long groupId, String title, String content, String author, String collection
			) throws PortalException, SystemException {
		
		User user = userPersistence.findByPrimaryKey(userId);
		
		Date now = new Date();
		
		long documentId = counterLocalService.increment(Document.class.getName());
		
		Document document = documentPersistence.create(documentId);
		
		document.setContent(content);
		document.setTitle(title);
		document.setAuthor(author);
		document.setCollection(collection);
		
		document.setGroupId(groupId);
		document.setCompanyId(user.getCompanyId());
		document.setCreateDate(now);
		
		super.addDocument(document);
		
		resourceLocalService.addResources(document.getCompanyId(), document.getGroupId(), document.getUserId(), 
				Document.class.getName(), document.getDocumentId(), false, true, true);
		
		return document;
	}
	
	public Document deleteDocument(Document document) throws SystemException {
		return documentPersistence.remove(document);
	}
	
	public Document deleteDocument(long documentId) throws PortalException, SystemException {
		Document document = documentPersistence.findByPrimaryKey(documentId);
		return deleteDocument(document);
	}
	
	public Document getDocument(long documentId) throws PortalException, SystemException {
		return documentPersistence.findByPrimaryKey(documentId);
	}
	
	public List<Document> getDocumentsByGroupId(long groupId) throws SystemException {
		return documentPersistence.findByGroupId(groupId);
	}
	
	public List<Document> getDocumentsByGroupId(long groupId, int start, int end) throws SystemException {
		return documentPersistence.findByGroupId(groupId, start, end);
	}
	
	public int getDocumentCountByGroupId(long groupId) throws SystemException {
		return documentPersistence.countByGroupId(groupId);
	}
	
	public List<Document> getDocumentsByTitle(String title) throws SystemException {
		return documentPersistence.findByTitle(title);
	}
	
	public List<Document> getDocumentsByTitle(String title, int start, int end) throws SystemException {
		return documentPersistence.findByTitle(title, start, end);
	}
	
	public List<Document> getDocumentsByAuthor(String author) throws SystemException {
		return documentPersistence.findByAuthor(author);
	}

	public List<Document> getDocumentsByAuthor(String author, int start, int end) throws SystemException {
		return documentPersistence.findByAuthor(author, start, end);
	}
	
	public List<Document> getDocumentsByCollection(String collection) throws SystemException {
		return documentPersistence.findByCollection(collection);
	}

	public List<Document> getDocumentsByCollection(String collection, int start, int end) throws SystemException {
		return documentPersistence.findByCollection(collection, start, end);
	}
	
	public List<Document> getDocumentsByAuthorAndCollection(String author, String collection) throws SystemException {
		return documentPersistence.findByAuthorAndCollection(author, collection);
	}
		
	public List<Document> getDocumentsByAuthorAndCollection(String author, String collection, int start, int end) throws SystemException {
		return documentPersistence.findByAuthorAndCollection(author, collection, start, end);
	}
	
	public Document updateDocument(
			long userId, long documentId, long groupId, String title, String content, String author, String collection,
			ServiceContext serviceContext
			) throws PortalException, SystemException {
		
		Date now = new Date();
		
		Document document = DocumentLocalServiceUtil.fetchDocument(documentId);
		
		document.setUserId(userId);
		document.setGroupId(groupId);
		document.setTitle(title);
		document.setContent(content);
		document.setAuthor(author);
		document.setCollection(collection);
		
		
		document.setModifiedDate(now);
		
		super.updateDocument(document);
		
		return document;
	}
}