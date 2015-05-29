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

package edu.ucla.macroscope.textlibrary.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import edu.ucla.macroscope.textlibrary.model.MacroscopeDocument;

import java.util.List;

/**
 * The persistence utility for the macroscope document service. This utility wraps {@link MacroscopeDocumentPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author dave
 * @see MacroscopeDocumentPersistence
 * @see MacroscopeDocumentPersistenceImpl
 * @generated
 */
public class MacroscopeDocumentUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(MacroscopeDocument macroscopeDocument) {
		getPersistence().clearCache(macroscopeDocument);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MacroscopeDocument> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MacroscopeDocument> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MacroscopeDocument> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static MacroscopeDocument update(
		MacroscopeDocument macroscopeDocument) throws SystemException {
		return getPersistence().update(macroscopeDocument);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static MacroscopeDocument update(
		MacroscopeDocument macroscopeDocument, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(macroscopeDocument, serviceContext);
	}

	/**
	* Returns all the macroscope documents where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching macroscope documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<edu.ucla.macroscope.textlibrary.model.MacroscopeDocument> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Returns a range of all the macroscope documents where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link edu.ucla.macroscope.textlibrary.model.impl.MacroscopeDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of macroscope documents
	* @param end the upper bound of the range of macroscope documents (not inclusive)
	* @return the range of matching macroscope documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<edu.ucla.macroscope.textlibrary.model.MacroscopeDocument> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the macroscope documents where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link edu.ucla.macroscope.textlibrary.model.impl.MacroscopeDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of macroscope documents
	* @param end the upper bound of the range of macroscope documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching macroscope documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<edu.ucla.macroscope.textlibrary.model.MacroscopeDocument> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns the first macroscope document in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching macroscope document
	* @throws edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException if a matching macroscope document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.ucla.macroscope.textlibrary.model.MacroscopeDocument findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first macroscope document in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching macroscope document, or <code>null</code> if a matching macroscope document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.ucla.macroscope.textlibrary.model.MacroscopeDocument fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last macroscope document in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching macroscope document
	* @throws edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException if a matching macroscope document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.ucla.macroscope.textlibrary.model.MacroscopeDocument findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last macroscope document in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching macroscope document, or <code>null</code> if a matching macroscope document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.ucla.macroscope.textlibrary.model.MacroscopeDocument fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the macroscope documents before and after the current macroscope document in the ordered set where groupId = &#63;.
	*
	* @param documentId the primary key of the current macroscope document
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next macroscope document
	* @throws edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException if a macroscope document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.ucla.macroscope.textlibrary.model.MacroscopeDocument[] findByGroupId_PrevAndNext(
		long documentId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(documentId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the macroscope documents where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of macroscope documents where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching macroscope documents
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns all the macroscope documents where title = &#63;.
	*
	* @param title the title
	* @return the matching macroscope documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<edu.ucla.macroscope.textlibrary.model.MacroscopeDocument> findByTitle(
		java.lang.String title)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTitle(title);
	}

	/**
	* Returns a range of all the macroscope documents where title = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link edu.ucla.macroscope.textlibrary.model.impl.MacroscopeDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param title the title
	* @param start the lower bound of the range of macroscope documents
	* @param end the upper bound of the range of macroscope documents (not inclusive)
	* @return the range of matching macroscope documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<edu.ucla.macroscope.textlibrary.model.MacroscopeDocument> findByTitle(
		java.lang.String title, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTitle(title, start, end);
	}

	/**
	* Returns an ordered range of all the macroscope documents where title = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link edu.ucla.macroscope.textlibrary.model.impl.MacroscopeDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param title the title
	* @param start the lower bound of the range of macroscope documents
	* @param end the upper bound of the range of macroscope documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching macroscope documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<edu.ucla.macroscope.textlibrary.model.MacroscopeDocument> findByTitle(
		java.lang.String title, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTitle(title, start, end, orderByComparator);
	}

	/**
	* Returns the first macroscope document in the ordered set where title = &#63;.
	*
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching macroscope document
	* @throws edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException if a matching macroscope document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.ucla.macroscope.textlibrary.model.MacroscopeDocument findByTitle_First(
		java.lang.String title,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException {
		return getPersistence().findByTitle_First(title, orderByComparator);
	}

	/**
	* Returns the first macroscope document in the ordered set where title = &#63;.
	*
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching macroscope document, or <code>null</code> if a matching macroscope document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.ucla.macroscope.textlibrary.model.MacroscopeDocument fetchByTitle_First(
		java.lang.String title,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByTitle_First(title, orderByComparator);
	}

	/**
	* Returns the last macroscope document in the ordered set where title = &#63;.
	*
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching macroscope document
	* @throws edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException if a matching macroscope document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.ucla.macroscope.textlibrary.model.MacroscopeDocument findByTitle_Last(
		java.lang.String title,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException {
		return getPersistence().findByTitle_Last(title, orderByComparator);
	}

	/**
	* Returns the last macroscope document in the ordered set where title = &#63;.
	*
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching macroscope document, or <code>null</code> if a matching macroscope document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.ucla.macroscope.textlibrary.model.MacroscopeDocument fetchByTitle_Last(
		java.lang.String title,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByTitle_Last(title, orderByComparator);
	}

	/**
	* Returns the macroscope documents before and after the current macroscope document in the ordered set where title = &#63;.
	*
	* @param documentId the primary key of the current macroscope document
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next macroscope document
	* @throws edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException if a macroscope document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.ucla.macroscope.textlibrary.model.MacroscopeDocument[] findByTitle_PrevAndNext(
		long documentId, java.lang.String title,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException {
		return getPersistence()
				   .findByTitle_PrevAndNext(documentId, title, orderByComparator);
	}

	/**
	* Removes all the macroscope documents where title = &#63; from the database.
	*
	* @param title the title
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByTitle(java.lang.String title)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByTitle(title);
	}

	/**
	* Returns the number of macroscope documents where title = &#63;.
	*
	* @param title the title
	* @return the number of matching macroscope documents
	* @throws SystemException if a system exception occurred
	*/
	public static int countByTitle(java.lang.String title)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByTitle(title);
	}

	/**
	* Returns all the macroscope documents where author = &#63;.
	*
	* @param author the author
	* @return the matching macroscope documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<edu.ucla.macroscope.textlibrary.model.MacroscopeDocument> findByAuthor(
		java.lang.String author)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByAuthor(author);
	}

	/**
	* Returns a range of all the macroscope documents where author = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link edu.ucla.macroscope.textlibrary.model.impl.MacroscopeDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param author the author
	* @param start the lower bound of the range of macroscope documents
	* @param end the upper bound of the range of macroscope documents (not inclusive)
	* @return the range of matching macroscope documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<edu.ucla.macroscope.textlibrary.model.MacroscopeDocument> findByAuthor(
		java.lang.String author, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByAuthor(author, start, end);
	}

	/**
	* Returns an ordered range of all the macroscope documents where author = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link edu.ucla.macroscope.textlibrary.model.impl.MacroscopeDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param author the author
	* @param start the lower bound of the range of macroscope documents
	* @param end the upper bound of the range of macroscope documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching macroscope documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<edu.ucla.macroscope.textlibrary.model.MacroscopeDocument> findByAuthor(
		java.lang.String author, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAuthor(author, start, end, orderByComparator);
	}

	/**
	* Returns the first macroscope document in the ordered set where author = &#63;.
	*
	* @param author the author
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching macroscope document
	* @throws edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException if a matching macroscope document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.ucla.macroscope.textlibrary.model.MacroscopeDocument findByAuthor_First(
		java.lang.String author,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException {
		return getPersistence().findByAuthor_First(author, orderByComparator);
	}

	/**
	* Returns the first macroscope document in the ordered set where author = &#63;.
	*
	* @param author the author
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching macroscope document, or <code>null</code> if a matching macroscope document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.ucla.macroscope.textlibrary.model.MacroscopeDocument fetchByAuthor_First(
		java.lang.String author,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByAuthor_First(author, orderByComparator);
	}

	/**
	* Returns the last macroscope document in the ordered set where author = &#63;.
	*
	* @param author the author
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching macroscope document
	* @throws edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException if a matching macroscope document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.ucla.macroscope.textlibrary.model.MacroscopeDocument findByAuthor_Last(
		java.lang.String author,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException {
		return getPersistence().findByAuthor_Last(author, orderByComparator);
	}

	/**
	* Returns the last macroscope document in the ordered set where author = &#63;.
	*
	* @param author the author
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching macroscope document, or <code>null</code> if a matching macroscope document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.ucla.macroscope.textlibrary.model.MacroscopeDocument fetchByAuthor_Last(
		java.lang.String author,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByAuthor_Last(author, orderByComparator);
	}

	/**
	* Returns the macroscope documents before and after the current macroscope document in the ordered set where author = &#63;.
	*
	* @param documentId the primary key of the current macroscope document
	* @param author the author
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next macroscope document
	* @throws edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException if a macroscope document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.ucla.macroscope.textlibrary.model.MacroscopeDocument[] findByAuthor_PrevAndNext(
		long documentId, java.lang.String author,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException {
		return getPersistence()
				   .findByAuthor_PrevAndNext(documentId, author,
			orderByComparator);
	}

	/**
	* Removes all the macroscope documents where author = &#63; from the database.
	*
	* @param author the author
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByAuthor(java.lang.String author)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByAuthor(author);
	}

	/**
	* Returns the number of macroscope documents where author = &#63;.
	*
	* @param author the author
	* @return the number of matching macroscope documents
	* @throws SystemException if a system exception occurred
	*/
	public static int countByAuthor(java.lang.String author)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByAuthor(author);
	}

	/**
	* Returns all the macroscope documents where collection = &#63;.
	*
	* @param collection the collection
	* @return the matching macroscope documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<edu.ucla.macroscope.textlibrary.model.MacroscopeDocument> findByCollection(
		java.lang.String collection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCollection(collection);
	}

	/**
	* Returns a range of all the macroscope documents where collection = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link edu.ucla.macroscope.textlibrary.model.impl.MacroscopeDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param collection the collection
	* @param start the lower bound of the range of macroscope documents
	* @param end the upper bound of the range of macroscope documents (not inclusive)
	* @return the range of matching macroscope documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<edu.ucla.macroscope.textlibrary.model.MacroscopeDocument> findByCollection(
		java.lang.String collection, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCollection(collection, start, end);
	}

	/**
	* Returns an ordered range of all the macroscope documents where collection = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link edu.ucla.macroscope.textlibrary.model.impl.MacroscopeDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param collection the collection
	* @param start the lower bound of the range of macroscope documents
	* @param end the upper bound of the range of macroscope documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching macroscope documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<edu.ucla.macroscope.textlibrary.model.MacroscopeDocument> findByCollection(
		java.lang.String collection, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCollection(collection, start, end, orderByComparator);
	}

	/**
	* Returns the first macroscope document in the ordered set where collection = &#63;.
	*
	* @param collection the collection
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching macroscope document
	* @throws edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException if a matching macroscope document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.ucla.macroscope.textlibrary.model.MacroscopeDocument findByCollection_First(
		java.lang.String collection,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException {
		return getPersistence()
				   .findByCollection_First(collection, orderByComparator);
	}

	/**
	* Returns the first macroscope document in the ordered set where collection = &#63;.
	*
	* @param collection the collection
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching macroscope document, or <code>null</code> if a matching macroscope document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.ucla.macroscope.textlibrary.model.MacroscopeDocument fetchByCollection_First(
		java.lang.String collection,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCollection_First(collection, orderByComparator);
	}

	/**
	* Returns the last macroscope document in the ordered set where collection = &#63;.
	*
	* @param collection the collection
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching macroscope document
	* @throws edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException if a matching macroscope document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.ucla.macroscope.textlibrary.model.MacroscopeDocument findByCollection_Last(
		java.lang.String collection,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException {
		return getPersistence()
				   .findByCollection_Last(collection, orderByComparator);
	}

	/**
	* Returns the last macroscope document in the ordered set where collection = &#63;.
	*
	* @param collection the collection
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching macroscope document, or <code>null</code> if a matching macroscope document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.ucla.macroscope.textlibrary.model.MacroscopeDocument fetchByCollection_Last(
		java.lang.String collection,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCollection_Last(collection, orderByComparator);
	}

	/**
	* Returns the macroscope documents before and after the current macroscope document in the ordered set where collection = &#63;.
	*
	* @param documentId the primary key of the current macroscope document
	* @param collection the collection
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next macroscope document
	* @throws edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException if a macroscope document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.ucla.macroscope.textlibrary.model.MacroscopeDocument[] findByCollection_PrevAndNext(
		long documentId, java.lang.String collection,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException {
		return getPersistence()
				   .findByCollection_PrevAndNext(documentId, collection,
			orderByComparator);
	}

	/**
	* Removes all the macroscope documents where collection = &#63; from the database.
	*
	* @param collection the collection
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCollection(java.lang.String collection)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCollection(collection);
	}

	/**
	* Returns the number of macroscope documents where collection = &#63;.
	*
	* @param collection the collection
	* @return the number of matching macroscope documents
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCollection(java.lang.String collection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCollection(collection);
	}

	/**
	* Returns all the macroscope documents where author = &#63; and collection = &#63;.
	*
	* @param author the author
	* @param collection the collection
	* @return the matching macroscope documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<edu.ucla.macroscope.textlibrary.model.MacroscopeDocument> findByAuthorAndCollection(
		java.lang.String author, java.lang.String collection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByAuthorAndCollection(author, collection);
	}

	/**
	* Returns a range of all the macroscope documents where author = &#63; and collection = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link edu.ucla.macroscope.textlibrary.model.impl.MacroscopeDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param author the author
	* @param collection the collection
	* @param start the lower bound of the range of macroscope documents
	* @param end the upper bound of the range of macroscope documents (not inclusive)
	* @return the range of matching macroscope documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<edu.ucla.macroscope.textlibrary.model.MacroscopeDocument> findByAuthorAndCollection(
		java.lang.String author, java.lang.String collection, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAuthorAndCollection(author, collection, start, end);
	}

	/**
	* Returns an ordered range of all the macroscope documents where author = &#63; and collection = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link edu.ucla.macroscope.textlibrary.model.impl.MacroscopeDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param author the author
	* @param collection the collection
	* @param start the lower bound of the range of macroscope documents
	* @param end the upper bound of the range of macroscope documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching macroscope documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<edu.ucla.macroscope.textlibrary.model.MacroscopeDocument> findByAuthorAndCollection(
		java.lang.String author, java.lang.String collection, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAuthorAndCollection(author, collection, start, end,
			orderByComparator);
	}

	/**
	* Returns the first macroscope document in the ordered set where author = &#63; and collection = &#63;.
	*
	* @param author the author
	* @param collection the collection
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching macroscope document
	* @throws edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException if a matching macroscope document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.ucla.macroscope.textlibrary.model.MacroscopeDocument findByAuthorAndCollection_First(
		java.lang.String author, java.lang.String collection,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException {
		return getPersistence()
				   .findByAuthorAndCollection_First(author, collection,
			orderByComparator);
	}

	/**
	* Returns the first macroscope document in the ordered set where author = &#63; and collection = &#63;.
	*
	* @param author the author
	* @param collection the collection
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching macroscope document, or <code>null</code> if a matching macroscope document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.ucla.macroscope.textlibrary.model.MacroscopeDocument fetchByAuthorAndCollection_First(
		java.lang.String author, java.lang.String collection,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAuthorAndCollection_First(author, collection,
			orderByComparator);
	}

	/**
	* Returns the last macroscope document in the ordered set where author = &#63; and collection = &#63;.
	*
	* @param author the author
	* @param collection the collection
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching macroscope document
	* @throws edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException if a matching macroscope document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.ucla.macroscope.textlibrary.model.MacroscopeDocument findByAuthorAndCollection_Last(
		java.lang.String author, java.lang.String collection,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException {
		return getPersistence()
				   .findByAuthorAndCollection_Last(author, collection,
			orderByComparator);
	}

	/**
	* Returns the last macroscope document in the ordered set where author = &#63; and collection = &#63;.
	*
	* @param author the author
	* @param collection the collection
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching macroscope document, or <code>null</code> if a matching macroscope document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.ucla.macroscope.textlibrary.model.MacroscopeDocument fetchByAuthorAndCollection_Last(
		java.lang.String author, java.lang.String collection,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAuthorAndCollection_Last(author, collection,
			orderByComparator);
	}

	/**
	* Returns the macroscope documents before and after the current macroscope document in the ordered set where author = &#63; and collection = &#63;.
	*
	* @param documentId the primary key of the current macroscope document
	* @param author the author
	* @param collection the collection
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next macroscope document
	* @throws edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException if a macroscope document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.ucla.macroscope.textlibrary.model.MacroscopeDocument[] findByAuthorAndCollection_PrevAndNext(
		long documentId, java.lang.String author, java.lang.String collection,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException {
		return getPersistence()
				   .findByAuthorAndCollection_PrevAndNext(documentId, author,
			collection, orderByComparator);
	}

	/**
	* Removes all the macroscope documents where author = &#63; and collection = &#63; from the database.
	*
	* @param author the author
	* @param collection the collection
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByAuthorAndCollection(java.lang.String author,
		java.lang.String collection)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByAuthorAndCollection(author, collection);
	}

	/**
	* Returns the number of macroscope documents where author = &#63; and collection = &#63;.
	*
	* @param author the author
	* @param collection the collection
	* @return the number of matching macroscope documents
	* @throws SystemException if a system exception occurred
	*/
	public static int countByAuthorAndCollection(java.lang.String author,
		java.lang.String collection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByAuthorAndCollection(author, collection);
	}

	/**
	* Caches the macroscope document in the entity cache if it is enabled.
	*
	* @param macroscopeDocument the macroscope document
	*/
	public static void cacheResult(
		edu.ucla.macroscope.textlibrary.model.MacroscopeDocument macroscopeDocument) {
		getPersistence().cacheResult(macroscopeDocument);
	}

	/**
	* Caches the macroscope documents in the entity cache if it is enabled.
	*
	* @param macroscopeDocuments the macroscope documents
	*/
	public static void cacheResult(
		java.util.List<edu.ucla.macroscope.textlibrary.model.MacroscopeDocument> macroscopeDocuments) {
		getPersistence().cacheResult(macroscopeDocuments);
	}

	/**
	* Creates a new macroscope document with the primary key. Does not add the macroscope document to the database.
	*
	* @param documentId the primary key for the new macroscope document
	* @return the new macroscope document
	*/
	public static edu.ucla.macroscope.textlibrary.model.MacroscopeDocument create(
		long documentId) {
		return getPersistence().create(documentId);
	}

	/**
	* Removes the macroscope document with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param documentId the primary key of the macroscope document
	* @return the macroscope document that was removed
	* @throws edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException if a macroscope document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.ucla.macroscope.textlibrary.model.MacroscopeDocument remove(
		long documentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException {
		return getPersistence().remove(documentId);
	}

	public static edu.ucla.macroscope.textlibrary.model.MacroscopeDocument updateImpl(
		edu.ucla.macroscope.textlibrary.model.MacroscopeDocument macroscopeDocument)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(macroscopeDocument);
	}

	/**
	* Returns the macroscope document with the primary key or throws a {@link edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException} if it could not be found.
	*
	* @param documentId the primary key of the macroscope document
	* @return the macroscope document
	* @throws edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException if a macroscope document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.ucla.macroscope.textlibrary.model.MacroscopeDocument findByPrimaryKey(
		long documentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException {
		return getPersistence().findByPrimaryKey(documentId);
	}

	/**
	* Returns the macroscope document with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param documentId the primary key of the macroscope document
	* @return the macroscope document, or <code>null</code> if a macroscope document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.ucla.macroscope.textlibrary.model.MacroscopeDocument fetchByPrimaryKey(
		long documentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(documentId);
	}

	/**
	* Returns all the macroscope documents.
	*
	* @return the macroscope documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<edu.ucla.macroscope.textlibrary.model.MacroscopeDocument> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<edu.ucla.macroscope.textlibrary.model.MacroscopeDocument> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the macroscope documents.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link edu.ucla.macroscope.textlibrary.model.impl.MacroscopeDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of macroscope documents
	* @param end the upper bound of the range of macroscope documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of macroscope documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<edu.ucla.macroscope.textlibrary.model.MacroscopeDocument> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the macroscope documents from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of macroscope documents.
	*
	* @return the number of macroscope documents
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static MacroscopeDocumentPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (MacroscopeDocumentPersistence)PortletBeanLocatorUtil.locate(edu.ucla.macroscope.textlibrary.service.ClpSerializer.getServletContextName(),
					MacroscopeDocumentPersistence.class.getName());

			ReferenceRegistry.registerReference(MacroscopeDocumentUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(MacroscopeDocumentPersistence persistence) {
	}

	private static MacroscopeDocumentPersistence _persistence;
}