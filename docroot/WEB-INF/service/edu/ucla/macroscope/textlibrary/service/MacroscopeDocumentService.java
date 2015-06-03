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

package edu.ucla.macroscope.textlibrary.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.security.ac.AccessControlled;
import com.liferay.portal.service.BaseService;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service interface for MacroscopeDocument. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author dave
 * @see MacroscopeDocumentServiceUtil
 * @see edu.ucla.macroscope.textlibrary.service.base.MacroscopeDocumentServiceBaseImpl
 * @see edu.ucla.macroscope.textlibrary.service.impl.MacroscopeDocumentServiceImpl
 * @generated
 */
@AccessControlled
@JSONWebService
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface MacroscopeDocumentService extends BaseService, InvokableService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MacroscopeDocumentServiceUtil} to access the macroscope document remote service. Add custom service methods to {@link edu.ucla.macroscope.textlibrary.service.impl.MacroscopeDocumentServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier();

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier);

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable;

	@com.liferay.portal.kernel.jsonwebservice.JSONWebService(method = "POST")
	public java.lang.String assign(java.lang.String documentIds,
		java.lang.String title, java.lang.String author,
		java.lang.String collection);

	@com.liferay.portal.kernel.jsonwebservice.JSONWebService(method = "POST")
	public java.lang.String uploadFile(java.io.File file);

	@com.liferay.portal.kernel.jsonwebservice.JSONWebService(method = "GET")
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getDocuments(java.lang.String authors,
		java.lang.String collections, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	@com.liferay.portal.kernel.jsonwebservice.JSONWebService(method = "GET")
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.lang.String getContent(long documentId);

	public java.lang.String delete(int documentId)
		throws com.liferay.portal.kernel.exception.SystemException;
}