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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.List;

import org.hsqldb.lib.StringInputStream;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.jdbc.OutputBlob;
import com.liferay.portal.kernel.dao.orm.Disjunction;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Property;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;

import edu.ucla.macroscope.textlibrary.model.MacroscopeDocument;
import edu.ucla.macroscope.textlibrary.model.MacroscopeDocumentModel;
import edu.ucla.macroscope.textlibrary.service.MacroscopeDocumentLocalService;
import edu.ucla.macroscope.textlibrary.service.MacroscopeDocumentLocalServiceUtil;
import edu.ucla.macroscope.textlibrary.service.MacroscopeDocumentService;
import edu.ucla.macroscope.textlibrary.service.base.MacroscopeDocumentServiceBaseImpl;

/**
 * The implementation of the macroscope document remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link edu.ucla.macroscope.textlibrary.service.MacroscopeDocumentService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author dave
 * @see edu.ucla.macroscope.textlibrary.service.base.MacroscopeDocumentServiceBaseImpl
 * @see edu.ucla.macroscope.textlibrary.service.MacroscopeDocumentServiceUtil
 */
public class MacroscopeDocumentServiceImpl
	extends MacroscopeDocumentServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link edu.ucla.macroscope.textlibrary.service.MacroscopeDocumentServiceUtil} to access the macroscope document remote service.
	 */
	
	final String NO_CHANGE = "NO_CHANGE";
	
	public String assign(String documentIds, String title, String author, String collection) {
		String[] documentIdList = documentIds.split(",");
		
		long titleCounter = 0;
		
		for (String unparsedDocumentId : documentIdList) {
			long parsedDocumentId = Long.parseLong(unparsedDocumentId);
			
			try {
				MacroscopeDocument md = MacroscopeDocumentLocalServiceUtil.getMacroscopeDocument(parsedDocumentId);
				
				if (title != NO_CHANGE) {
					String docTitle = title;
					if (documentIdList.length > 1) {
						docTitle = title + " " + titleCounter;
						titleCounter++;
					}
					md.setTitle(docTitle);
				}
				if (author != NO_CHANGE) {
					md.setAuthor(author);
				}
				if (collection != NO_CHANGE) {
					md.setCollection(collection);
				}
			} catch (SystemException sx) {
				return "FAILURE: " + parsedDocumentId;
			} catch (PortalException px) {
				return "FAILURE: " + parsedDocumentId;
			}
		}
		return "SUCCESS";
	}
	
	@JSONWebService(method="POST")
	public String uploadFile(File content) {
		try {
			System.out.println("Uploading file in JSON ...");
			MacroscopeDocument md = MacroscopeDocumentLocalServiceUtil.createMacroscopeDocument(CounterLocalServiceUtil.increment());
			System.out.println("Creating document ...");
//			OutputBlob contentBlob = new OutputBlob(new StringInputStream(content), content.length());
			OutputBlob contentBlob = new OutputBlob(new FileInputStream(content), content.length());
			md.setContent(contentBlob);
			System.out.println("Document created ...");
			return md.getPrimaryKey() + "";
		} catch (SystemException ex) {
			System.out.println("System Exception ...");
			System.out.println(ex);
			return ex.toString();
		} catch (FileNotFoundException ex) {
			System.out.println("File not found: how did this happen?");
			return ex.toString();
		}
	}
	
	@JSONWebService(method="GET")
	public List getDocuments(String authors, String collections, int start, int end) throws SystemException {
		String[] pAuthors = {};
		String[] pCollections = {};
		
		DynamicQuery query = DynamicQueryFactoryUtil.forClass(MacroscopeDocument.class, this.getClassLoader());
		
		boolean doDynamicQuery = false;
		
		if (!authors.isEmpty()) {
			doDynamicQuery = true;
			pAuthors = authors.split(",");
			if (pAuthors.length > 0) {
				Disjunction junction = RestrictionsFactoryUtil.disjunction();
				for (String author : pAuthors) {
					junction.add(PropertyFactoryUtil.forName("author").eq(author));
				}
				query.add(junction);
			} else {
				query.add(PropertyFactoryUtil.forName("author").eq(pAuthors[0]));
			}
		}
		
		if (!collections.isEmpty()) {
			doDynamicQuery = true;
			pCollections = collections.split(",");
			if (pCollections.length > 0) {
				Disjunction junction = RestrictionsFactoryUtil.disjunction();
				for (String collection : pCollections) {
					junction.add(PropertyFactoryUtil.forName("collection").eq(collection));
				}
				query.add(junction);
			} else {
				query.add(PropertyFactoryUtil.forName("collection").eq(pCollections[0]));
			}
		}
		
		if (doDynamicQuery) {
			return MacroscopeDocumentLocalServiceUtil.dynamicQuery(query, start, end);
		} else {
			return MacroscopeDocumentLocalServiceUtil.getMacroscopeDocuments(start, end);
		}
	}
	
	public String deleteDocument(int documentId) throws SystemException {
		
		try {
			MacroscopeDocumentLocalServiceUtil.deleteMacroscopeDocument(documentId);
			return "OK";
		} catch (PortalException ex) {
			return "NOT_FOUND";
		}
	}
	
}