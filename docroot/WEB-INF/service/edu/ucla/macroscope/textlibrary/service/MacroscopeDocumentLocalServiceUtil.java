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
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for MacroscopeDocument. This utility wraps
 * {@link edu.ucla.macroscope.textlibrary.service.impl.MacroscopeDocumentLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author dave
 * @see MacroscopeDocumentLocalService
 * @see edu.ucla.macroscope.textlibrary.service.base.MacroscopeDocumentLocalServiceBaseImpl
 * @see edu.ucla.macroscope.textlibrary.service.impl.MacroscopeDocumentLocalServiceImpl
 * @generated
 */
public class MacroscopeDocumentLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link edu.ucla.macroscope.textlibrary.service.impl.MacroscopeDocumentLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the macroscope document to the database. Also notifies the appropriate model listeners.
	*
	* @param macroscopeDocument the macroscope document
	* @return the macroscope document that was added
	* @throws SystemException if a system exception occurred
	*/
	public static edu.ucla.macroscope.textlibrary.model.MacroscopeDocument addMacroscopeDocument(
		edu.ucla.macroscope.textlibrary.model.MacroscopeDocument macroscopeDocument)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addMacroscopeDocument(macroscopeDocument);
	}

	/**
	* Creates a new macroscope document with the primary key. Does not add the macroscope document to the database.
	*
	* @param documentId the primary key for the new macroscope document
	* @return the new macroscope document
	*/
	public static edu.ucla.macroscope.textlibrary.model.MacroscopeDocument createMacroscopeDocument(
		long documentId) {
		return getService().createMacroscopeDocument(documentId);
	}

	/**
	* Deletes the macroscope document with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param documentId the primary key of the macroscope document
	* @return the macroscope document that was removed
	* @throws PortalException if a macroscope document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.ucla.macroscope.textlibrary.model.MacroscopeDocument deleteMacroscopeDocument(
		long documentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteMacroscopeDocument(documentId);
	}

	/**
	* Deletes the macroscope document from the database. Also notifies the appropriate model listeners.
	*
	* @param macroscopeDocument the macroscope document
	* @return the macroscope document that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static edu.ucla.macroscope.textlibrary.model.MacroscopeDocument deleteMacroscopeDocument(
		edu.ucla.macroscope.textlibrary.model.MacroscopeDocument macroscopeDocument)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteMacroscopeDocument(macroscopeDocument);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link edu.ucla.macroscope.textlibrary.model.impl.MacroscopeDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link edu.ucla.macroscope.textlibrary.model.impl.MacroscopeDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static edu.ucla.macroscope.textlibrary.model.MacroscopeDocument fetchMacroscopeDocument(
		long documentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchMacroscopeDocument(documentId);
	}

	/**
	* Returns the macroscope document with the primary key.
	*
	* @param documentId the primary key of the macroscope document
	* @return the macroscope document
	* @throws PortalException if a macroscope document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.ucla.macroscope.textlibrary.model.MacroscopeDocument getMacroscopeDocument(
		long documentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getMacroscopeDocument(documentId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the macroscope documents.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link edu.ucla.macroscope.textlibrary.model.impl.MacroscopeDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of macroscope documents
	* @param end the upper bound of the range of macroscope documents (not inclusive)
	* @return the range of macroscope documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<edu.ucla.macroscope.textlibrary.model.MacroscopeDocument> getMacroscopeDocuments(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMacroscopeDocuments(start, end);
	}

	/**
	* Returns the number of macroscope documents.
	*
	* @return the number of macroscope documents
	* @throws SystemException if a system exception occurred
	*/
	public static int getMacroscopeDocumentsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMacroscopeDocumentsCount();
	}

	/**
	* Updates the macroscope document in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param macroscopeDocument the macroscope document
	* @return the macroscope document that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static edu.ucla.macroscope.textlibrary.model.MacroscopeDocument updateMacroscopeDocument(
		edu.ucla.macroscope.textlibrary.model.MacroscopeDocument macroscopeDocument)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateMacroscopeDocument(macroscopeDocument);
	}

	public static edu.ucla.macroscope.textlibrary.model.MacroscopeDocumentContentBlobModel getContentBlobModel(
		java.io.Serializable primaryKey)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getContentBlobModel(primaryKey);
	}

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

	public static void clearService() {
		_service = null;
	}

	public static MacroscopeDocumentLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					MacroscopeDocumentLocalService.class.getName());

			if (invokableLocalService instanceof MacroscopeDocumentLocalService) {
				_service = (MacroscopeDocumentLocalService)invokableLocalService;
			}
			else {
				_service = new MacroscopeDocumentLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(MacroscopeDocumentLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(MacroscopeDocumentLocalService service) {
	}

	private static MacroscopeDocumentLocalService _service;
}