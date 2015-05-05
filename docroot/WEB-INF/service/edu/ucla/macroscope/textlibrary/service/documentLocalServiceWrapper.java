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
 * Provides a wrapper for {@link documentLocalService}.
 *
 * @author dave
 * @see documentLocalService
 * @generated
 */
public class documentLocalServiceWrapper implements documentLocalService,
	ServiceWrapper<documentLocalService> {
	public documentLocalServiceWrapper(
		documentLocalService documentLocalService) {
		_documentLocalService = documentLocalService;
	}

	/**
	* Adds the document to the database. Also notifies the appropriate model listeners.
	*
	* @param document the document
	* @return the document that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public edu.ucla.macroscope.textlibrary.model.document adddocument(
		edu.ucla.macroscope.textlibrary.model.document document)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _documentLocalService.adddocument(document);
	}

	/**
	* Creates a new document with the primary key. Does not add the document to the database.
	*
	* @param documentId the primary key for the new document
	* @return the new document
	*/
	@Override
	public edu.ucla.macroscope.textlibrary.model.document createdocument(
		long documentId) {
		return _documentLocalService.createdocument(documentId);
	}

	/**
	* Deletes the document with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param documentId the primary key of the document
	* @return the document that was removed
	* @throws PortalException if a document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public edu.ucla.macroscope.textlibrary.model.document deletedocument(
		long documentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _documentLocalService.deletedocument(documentId);
	}

	/**
	* Deletes the document from the database. Also notifies the appropriate model listeners.
	*
	* @param document the document
	* @return the document that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public edu.ucla.macroscope.textlibrary.model.document deletedocument(
		edu.ucla.macroscope.textlibrary.model.document document)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _documentLocalService.deletedocument(document);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _documentLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _documentLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link edu.ucla.macroscope.textlibrary.model.impl.documentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _documentLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link edu.ucla.macroscope.textlibrary.model.impl.documentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _documentLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _documentLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _documentLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public edu.ucla.macroscope.textlibrary.model.document fetchdocument(
		long documentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _documentLocalService.fetchdocument(documentId);
	}

	/**
	* Returns the document with the primary key.
	*
	* @param documentId the primary key of the document
	* @return the document
	* @throws PortalException if a document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public edu.ucla.macroscope.textlibrary.model.document getdocument(
		long documentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _documentLocalService.getdocument(documentId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _documentLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the documents.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link edu.ucla.macroscope.textlibrary.model.impl.documentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of documents
	* @param end the upper bound of the range of documents (not inclusive)
	* @return the range of documents
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<edu.ucla.macroscope.textlibrary.model.document> getdocuments(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _documentLocalService.getdocuments(start, end);
	}

	/**
	* Returns the number of documents.
	*
	* @return the number of documents
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getdocumentsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _documentLocalService.getdocumentsCount();
	}

	/**
	* Updates the document in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param document the document
	* @return the document that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public edu.ucla.macroscope.textlibrary.model.document updatedocument(
		edu.ucla.macroscope.textlibrary.model.document document)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _documentLocalService.updatedocument(document);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _documentLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_documentLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _documentLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public documentLocalService getWrappeddocumentLocalService() {
		return _documentLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappeddocumentLocalService(
		documentLocalService documentLocalService) {
		_documentLocalService = documentLocalService;
	}

	@Override
	public documentLocalService getWrappedService() {
		return _documentLocalService;
	}

	@Override
	public void setWrappedService(documentLocalService documentLocalService) {
		_documentLocalService = documentLocalService;
	}

	private documentLocalService _documentLocalService;
}