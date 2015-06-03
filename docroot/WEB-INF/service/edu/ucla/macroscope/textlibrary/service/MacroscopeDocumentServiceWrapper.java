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

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MacroscopeDocumentService}.
 *
 * @author dave
 * @see MacroscopeDocumentService
 * @generated
 */
public class MacroscopeDocumentServiceWrapper
	implements MacroscopeDocumentService,
		ServiceWrapper<MacroscopeDocumentService> {
	public MacroscopeDocumentServiceWrapper(
		MacroscopeDocumentService macroscopeDocumentService) {
		_macroscopeDocumentService = macroscopeDocumentService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _macroscopeDocumentService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_macroscopeDocumentService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _macroscopeDocumentService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.lang.String assign(java.lang.String documentIds,
		java.lang.String title, java.lang.String author,
		java.lang.String collection) {
		return _macroscopeDocumentService.assign(documentIds, title, author,
			collection);
	}

	@Override
	public java.lang.String uploadFile(java.io.File file) {
		return _macroscopeDocumentService.uploadFile(file);
	}

	@Override
	public java.util.List getDocuments(java.lang.String authors,
		java.lang.String collections, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _macroscopeDocumentService.getDocuments(authors, collections,
			start, end);
	}

	@Override
	public java.lang.String getContent(long documentId) {
		return _macroscopeDocumentService.getContent(documentId);
	}

	@Override
	public java.lang.String deleteDocument(int documentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _macroscopeDocumentService.deleteDocument(documentId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public MacroscopeDocumentService getWrappedMacroscopeDocumentService() {
		return _macroscopeDocumentService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedMacroscopeDocumentService(
		MacroscopeDocumentService macroscopeDocumentService) {
		_macroscopeDocumentService = macroscopeDocumentService;
	}

	@Override
	public MacroscopeDocumentService getWrappedService() {
		return _macroscopeDocumentService;
	}

	@Override
	public void setWrappedService(
		MacroscopeDocumentService macroscopeDocumentService) {
		_macroscopeDocumentService = macroscopeDocumentService;
	}

	private MacroscopeDocumentService _macroscopeDocumentService;
}