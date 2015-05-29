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

import com.liferay.portal.service.persistence.BasePersistence;

import edu.ucla.macroscope.textlibrary.model.MacroscopeDocument;

/**
 * The persistence interface for the macroscope document service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author dave
 * @see MacroscopeDocumentPersistenceImpl
 * @see MacroscopeDocumentUtil
 * @generated
 */
public interface MacroscopeDocumentPersistence extends BasePersistence<MacroscopeDocument> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MacroscopeDocumentUtil} to access the macroscope document persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the macroscope documents where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching macroscope documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<edu.ucla.macroscope.textlibrary.model.MacroscopeDocument> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<edu.ucla.macroscope.textlibrary.model.MacroscopeDocument> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<edu.ucla.macroscope.textlibrary.model.MacroscopeDocument> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first macroscope document in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching macroscope document
	* @throws edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException if a matching macroscope document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.ucla.macroscope.textlibrary.model.MacroscopeDocument findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException;

	/**
	* Returns the first macroscope document in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching macroscope document, or <code>null</code> if a matching macroscope document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.ucla.macroscope.textlibrary.model.MacroscopeDocument fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last macroscope document in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching macroscope document
	* @throws edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException if a matching macroscope document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.ucla.macroscope.textlibrary.model.MacroscopeDocument findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException;

	/**
	* Returns the last macroscope document in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching macroscope document, or <code>null</code> if a matching macroscope document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.ucla.macroscope.textlibrary.model.MacroscopeDocument fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public edu.ucla.macroscope.textlibrary.model.MacroscopeDocument[] findByGroupId_PrevAndNext(
		long documentId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException;

	/**
	* Removes all the macroscope documents where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of macroscope documents where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching macroscope documents
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the macroscope documents where title = &#63;.
	*
	* @param title the title
	* @return the matching macroscope documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<edu.ucla.macroscope.textlibrary.model.MacroscopeDocument> findByTitle(
		java.lang.String title)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<edu.ucla.macroscope.textlibrary.model.MacroscopeDocument> findByTitle(
		java.lang.String title, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<edu.ucla.macroscope.textlibrary.model.MacroscopeDocument> findByTitle(
		java.lang.String title, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first macroscope document in the ordered set where title = &#63;.
	*
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching macroscope document
	* @throws edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException if a matching macroscope document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.ucla.macroscope.textlibrary.model.MacroscopeDocument findByTitle_First(
		java.lang.String title,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException;

	/**
	* Returns the first macroscope document in the ordered set where title = &#63;.
	*
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching macroscope document, or <code>null</code> if a matching macroscope document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.ucla.macroscope.textlibrary.model.MacroscopeDocument fetchByTitle_First(
		java.lang.String title,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last macroscope document in the ordered set where title = &#63;.
	*
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching macroscope document
	* @throws edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException if a matching macroscope document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.ucla.macroscope.textlibrary.model.MacroscopeDocument findByTitle_Last(
		java.lang.String title,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException;

	/**
	* Returns the last macroscope document in the ordered set where title = &#63;.
	*
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching macroscope document, or <code>null</code> if a matching macroscope document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.ucla.macroscope.textlibrary.model.MacroscopeDocument fetchByTitle_Last(
		java.lang.String title,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public edu.ucla.macroscope.textlibrary.model.MacroscopeDocument[] findByTitle_PrevAndNext(
		long documentId, java.lang.String title,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException;

	/**
	* Removes all the macroscope documents where title = &#63; from the database.
	*
	* @param title the title
	* @throws SystemException if a system exception occurred
	*/
	public void removeByTitle(java.lang.String title)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of macroscope documents where title = &#63;.
	*
	* @param title the title
	* @return the number of matching macroscope documents
	* @throws SystemException if a system exception occurred
	*/
	public int countByTitle(java.lang.String title)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the macroscope documents where author = &#63;.
	*
	* @param author the author
	* @return the matching macroscope documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<edu.ucla.macroscope.textlibrary.model.MacroscopeDocument> findByAuthor(
		java.lang.String author)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<edu.ucla.macroscope.textlibrary.model.MacroscopeDocument> findByAuthor(
		java.lang.String author, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<edu.ucla.macroscope.textlibrary.model.MacroscopeDocument> findByAuthor(
		java.lang.String author, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first macroscope document in the ordered set where author = &#63;.
	*
	* @param author the author
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching macroscope document
	* @throws edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException if a matching macroscope document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.ucla.macroscope.textlibrary.model.MacroscopeDocument findByAuthor_First(
		java.lang.String author,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException;

	/**
	* Returns the first macroscope document in the ordered set where author = &#63;.
	*
	* @param author the author
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching macroscope document, or <code>null</code> if a matching macroscope document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.ucla.macroscope.textlibrary.model.MacroscopeDocument fetchByAuthor_First(
		java.lang.String author,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last macroscope document in the ordered set where author = &#63;.
	*
	* @param author the author
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching macroscope document
	* @throws edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException if a matching macroscope document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.ucla.macroscope.textlibrary.model.MacroscopeDocument findByAuthor_Last(
		java.lang.String author,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException;

	/**
	* Returns the last macroscope document in the ordered set where author = &#63;.
	*
	* @param author the author
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching macroscope document, or <code>null</code> if a matching macroscope document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.ucla.macroscope.textlibrary.model.MacroscopeDocument fetchByAuthor_Last(
		java.lang.String author,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public edu.ucla.macroscope.textlibrary.model.MacroscopeDocument[] findByAuthor_PrevAndNext(
		long documentId, java.lang.String author,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException;

	/**
	* Removes all the macroscope documents where author = &#63; from the database.
	*
	* @param author the author
	* @throws SystemException if a system exception occurred
	*/
	public void removeByAuthor(java.lang.String author)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of macroscope documents where author = &#63;.
	*
	* @param author the author
	* @return the number of matching macroscope documents
	* @throws SystemException if a system exception occurred
	*/
	public int countByAuthor(java.lang.String author)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the macroscope documents where collection = &#63;.
	*
	* @param collection the collection
	* @return the matching macroscope documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<edu.ucla.macroscope.textlibrary.model.MacroscopeDocument> findByCollection(
		java.lang.String collection)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<edu.ucla.macroscope.textlibrary.model.MacroscopeDocument> findByCollection(
		java.lang.String collection, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<edu.ucla.macroscope.textlibrary.model.MacroscopeDocument> findByCollection(
		java.lang.String collection, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first macroscope document in the ordered set where collection = &#63;.
	*
	* @param collection the collection
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching macroscope document
	* @throws edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException if a matching macroscope document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.ucla.macroscope.textlibrary.model.MacroscopeDocument findByCollection_First(
		java.lang.String collection,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException;

	/**
	* Returns the first macroscope document in the ordered set where collection = &#63;.
	*
	* @param collection the collection
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching macroscope document, or <code>null</code> if a matching macroscope document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.ucla.macroscope.textlibrary.model.MacroscopeDocument fetchByCollection_First(
		java.lang.String collection,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last macroscope document in the ordered set where collection = &#63;.
	*
	* @param collection the collection
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching macroscope document
	* @throws edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException if a matching macroscope document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.ucla.macroscope.textlibrary.model.MacroscopeDocument findByCollection_Last(
		java.lang.String collection,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException;

	/**
	* Returns the last macroscope document in the ordered set where collection = &#63;.
	*
	* @param collection the collection
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching macroscope document, or <code>null</code> if a matching macroscope document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.ucla.macroscope.textlibrary.model.MacroscopeDocument fetchByCollection_Last(
		java.lang.String collection,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public edu.ucla.macroscope.textlibrary.model.MacroscopeDocument[] findByCollection_PrevAndNext(
		long documentId, java.lang.String collection,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException;

	/**
	* Removes all the macroscope documents where collection = &#63; from the database.
	*
	* @param collection the collection
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCollection(java.lang.String collection)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of macroscope documents where collection = &#63;.
	*
	* @param collection the collection
	* @return the number of matching macroscope documents
	* @throws SystemException if a system exception occurred
	*/
	public int countByCollection(java.lang.String collection)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the macroscope documents where author = &#63; and collection = &#63;.
	*
	* @param author the author
	* @param collection the collection
	* @return the matching macroscope documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<edu.ucla.macroscope.textlibrary.model.MacroscopeDocument> findByAuthorAndCollection(
		java.lang.String author, java.lang.String collection)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<edu.ucla.macroscope.textlibrary.model.MacroscopeDocument> findByAuthorAndCollection(
		java.lang.String author, java.lang.String collection, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<edu.ucla.macroscope.textlibrary.model.MacroscopeDocument> findByAuthorAndCollection(
		java.lang.String author, java.lang.String collection, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public edu.ucla.macroscope.textlibrary.model.MacroscopeDocument findByAuthorAndCollection_First(
		java.lang.String author, java.lang.String collection,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException;

	/**
	* Returns the first macroscope document in the ordered set where author = &#63; and collection = &#63;.
	*
	* @param author the author
	* @param collection the collection
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching macroscope document, or <code>null</code> if a matching macroscope document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.ucla.macroscope.textlibrary.model.MacroscopeDocument fetchByAuthorAndCollection_First(
		java.lang.String author, java.lang.String collection,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public edu.ucla.macroscope.textlibrary.model.MacroscopeDocument findByAuthorAndCollection_Last(
		java.lang.String author, java.lang.String collection,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException;

	/**
	* Returns the last macroscope document in the ordered set where author = &#63; and collection = &#63;.
	*
	* @param author the author
	* @param collection the collection
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching macroscope document, or <code>null</code> if a matching macroscope document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.ucla.macroscope.textlibrary.model.MacroscopeDocument fetchByAuthorAndCollection_Last(
		java.lang.String author, java.lang.String collection,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public edu.ucla.macroscope.textlibrary.model.MacroscopeDocument[] findByAuthorAndCollection_PrevAndNext(
		long documentId, java.lang.String author, java.lang.String collection,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException;

	/**
	* Removes all the macroscope documents where author = &#63; and collection = &#63; from the database.
	*
	* @param author the author
	* @param collection the collection
	* @throws SystemException if a system exception occurred
	*/
	public void removeByAuthorAndCollection(java.lang.String author,
		java.lang.String collection)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of macroscope documents where author = &#63; and collection = &#63;.
	*
	* @param author the author
	* @param collection the collection
	* @return the number of matching macroscope documents
	* @throws SystemException if a system exception occurred
	*/
	public int countByAuthorAndCollection(java.lang.String author,
		java.lang.String collection)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the macroscope document in the entity cache if it is enabled.
	*
	* @param macroscopeDocument the macroscope document
	*/
	public void cacheResult(
		edu.ucla.macroscope.textlibrary.model.MacroscopeDocument macroscopeDocument);

	/**
	* Caches the macroscope documents in the entity cache if it is enabled.
	*
	* @param macroscopeDocuments the macroscope documents
	*/
	public void cacheResult(
		java.util.List<edu.ucla.macroscope.textlibrary.model.MacroscopeDocument> macroscopeDocuments);

	/**
	* Creates a new macroscope document with the primary key. Does not add the macroscope document to the database.
	*
	* @param documentId the primary key for the new macroscope document
	* @return the new macroscope document
	*/
	public edu.ucla.macroscope.textlibrary.model.MacroscopeDocument create(
		long documentId);

	/**
	* Removes the macroscope document with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param documentId the primary key of the macroscope document
	* @return the macroscope document that was removed
	* @throws edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException if a macroscope document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.ucla.macroscope.textlibrary.model.MacroscopeDocument remove(
		long documentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException;

	public edu.ucla.macroscope.textlibrary.model.MacroscopeDocument updateImpl(
		edu.ucla.macroscope.textlibrary.model.MacroscopeDocument macroscopeDocument)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the macroscope document with the primary key or throws a {@link edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException} if it could not be found.
	*
	* @param documentId the primary key of the macroscope document
	* @return the macroscope document
	* @throws edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException if a macroscope document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.ucla.macroscope.textlibrary.model.MacroscopeDocument findByPrimaryKey(
		long documentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException;

	/**
	* Returns the macroscope document with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param documentId the primary key of the macroscope document
	* @return the macroscope document, or <code>null</code> if a macroscope document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.ucla.macroscope.textlibrary.model.MacroscopeDocument fetchByPrimaryKey(
		long documentId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the macroscope documents.
	*
	* @return the macroscope documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<edu.ucla.macroscope.textlibrary.model.MacroscopeDocument> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<edu.ucla.macroscope.textlibrary.model.MacroscopeDocument> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<edu.ucla.macroscope.textlibrary.model.MacroscopeDocument> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the macroscope documents from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of macroscope documents.
	*
	* @return the number of macroscope documents
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}