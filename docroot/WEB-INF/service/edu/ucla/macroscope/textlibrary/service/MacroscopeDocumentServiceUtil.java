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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for MacroscopeDocument. This utility wraps
 * {@link edu.ucla.macroscope.textlibrary.service.impl.MacroscopeDocumentServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author dave
 * @see MacroscopeDocumentService
 * @see edu.ucla.macroscope.textlibrary.service.base.MacroscopeDocumentServiceBaseImpl
 * @see edu.ucla.macroscope.textlibrary.service.impl.MacroscopeDocumentServiceImpl
 * @generated
 */
public class MacroscopeDocumentServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link edu.ucla.macroscope.textlibrary.service.impl.MacroscopeDocumentServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static java.lang.String assign(java.lang.String documentIds,
		java.lang.String title, java.lang.String author,
		java.lang.String collection) {
		return getService().assign(documentIds, title, author, collection);
	}

	public static java.lang.String uploadFile(java.io.File file) {
		return getService().uploadFile(file);
	}

	public static java.util.List getDocuments(java.lang.String authors,
		java.lang.String collections, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDocuments(authors, collections, start, end);
	}

	public static java.lang.String getContent(long documentId) {
		return getService().getContent(documentId);
	}

	public static java.lang.String delete(int documentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().delete(documentId);
	}

	public static void clearService() {
		_service = null;
	}

	public static MacroscopeDocumentService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					MacroscopeDocumentService.class.getName());

			if (invokableService instanceof MacroscopeDocumentService) {
				_service = (MacroscopeDocumentService)invokableService;
			}
			else {
				_service = new MacroscopeDocumentServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(MacroscopeDocumentServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(MacroscopeDocumentService service) {
	}

	private static MacroscopeDocumentService _service;
}