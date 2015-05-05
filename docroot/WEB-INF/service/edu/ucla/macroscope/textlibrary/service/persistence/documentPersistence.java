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

import edu.ucla.macroscope.textlibrary.model.document;

/**
 * The persistence interface for the document service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author dave
 * @see documentPersistenceImpl
 * @see documentUtil
 * @generated
 */
public interface documentPersistence extends BasePersistence<document> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link documentUtil} to access the document persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the documents where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<edu.ucla.macroscope.textlibrary.model.document> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the documents where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link edu.ucla.macroscope.textlibrary.model.impl.documentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of documents
	* @param end the upper bound of the range of documents (not inclusive)
	* @return the range of matching documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<edu.ucla.macroscope.textlibrary.model.document> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the documents where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link edu.ucla.macroscope.textlibrary.model.impl.documentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of documents
	* @param end the upper bound of the range of documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<edu.ucla.macroscope.textlibrary.model.document> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first document in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document
	* @throws edu.ucla.macroscope.textlibrary.NoSuchdocumentException if a matching document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.ucla.macroscope.textlibrary.model.document findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.textlibrary.NoSuchdocumentException;

	/**
	* Returns the first document in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document, or <code>null</code> if a matching document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.ucla.macroscope.textlibrary.model.document fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last document in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document
	* @throws edu.ucla.macroscope.textlibrary.NoSuchdocumentException if a matching document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.ucla.macroscope.textlibrary.model.document findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.textlibrary.NoSuchdocumentException;

	/**
	* Returns the last document in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document, or <code>null</code> if a matching document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.ucla.macroscope.textlibrary.model.document fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the documents before and after the current document in the ordered set where groupId = &#63;.
	*
	* @param documentId the primary key of the current document
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next document
	* @throws edu.ucla.macroscope.textlibrary.NoSuchdocumentException if a document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.ucla.macroscope.textlibrary.model.document[] findByGroupId_PrevAndNext(
		long documentId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.textlibrary.NoSuchdocumentException;

	/**
	* Removes all the documents where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of documents where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching documents
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the documents where title = &#63;.
	*
	* @param title the title
	* @return the matching documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<edu.ucla.macroscope.textlibrary.model.document> findByTitle(
		java.lang.String title)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the documents where title = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link edu.ucla.macroscope.textlibrary.model.impl.documentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param title the title
	* @param start the lower bound of the range of documents
	* @param end the upper bound of the range of documents (not inclusive)
	* @return the range of matching documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<edu.ucla.macroscope.textlibrary.model.document> findByTitle(
		java.lang.String title, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the documents where title = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link edu.ucla.macroscope.textlibrary.model.impl.documentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param title the title
	* @param start the lower bound of the range of documents
	* @param end the upper bound of the range of documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<edu.ucla.macroscope.textlibrary.model.document> findByTitle(
		java.lang.String title, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first document in the ordered set where title = &#63;.
	*
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document
	* @throws edu.ucla.macroscope.textlibrary.NoSuchdocumentException if a matching document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.ucla.macroscope.textlibrary.model.document findByTitle_First(
		java.lang.String title,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.textlibrary.NoSuchdocumentException;

	/**
	* Returns the first document in the ordered set where title = &#63;.
	*
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document, or <code>null</code> if a matching document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.ucla.macroscope.textlibrary.model.document fetchByTitle_First(
		java.lang.String title,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last document in the ordered set where title = &#63;.
	*
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document
	* @throws edu.ucla.macroscope.textlibrary.NoSuchdocumentException if a matching document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.ucla.macroscope.textlibrary.model.document findByTitle_Last(
		java.lang.String title,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.textlibrary.NoSuchdocumentException;

	/**
	* Returns the last document in the ordered set where title = &#63;.
	*
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document, or <code>null</code> if a matching document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.ucla.macroscope.textlibrary.model.document fetchByTitle_Last(
		java.lang.String title,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the documents before and after the current document in the ordered set where title = &#63;.
	*
	* @param documentId the primary key of the current document
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next document
	* @throws edu.ucla.macroscope.textlibrary.NoSuchdocumentException if a document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.ucla.macroscope.textlibrary.model.document[] findByTitle_PrevAndNext(
		long documentId, java.lang.String title,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.textlibrary.NoSuchdocumentException;

	/**
	* Removes all the documents where title = &#63; from the database.
	*
	* @param title the title
	* @throws SystemException if a system exception occurred
	*/
	public void removeByTitle(java.lang.String title)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of documents where title = &#63;.
	*
	* @param title the title
	* @return the number of matching documents
	* @throws SystemException if a system exception occurred
	*/
	public int countByTitle(java.lang.String title)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the documents where author = &#63;.
	*
	* @param author the author
	* @return the matching documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<edu.ucla.macroscope.textlibrary.model.document> findByAuthor(
		java.lang.String author)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the documents where author = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link edu.ucla.macroscope.textlibrary.model.impl.documentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param author the author
	* @param start the lower bound of the range of documents
	* @param end the upper bound of the range of documents (not inclusive)
	* @return the range of matching documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<edu.ucla.macroscope.textlibrary.model.document> findByAuthor(
		java.lang.String author, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the documents where author = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link edu.ucla.macroscope.textlibrary.model.impl.documentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param author the author
	* @param start the lower bound of the range of documents
	* @param end the upper bound of the range of documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<edu.ucla.macroscope.textlibrary.model.document> findByAuthor(
		java.lang.String author, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first document in the ordered set where author = &#63;.
	*
	* @param author the author
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document
	* @throws edu.ucla.macroscope.textlibrary.NoSuchdocumentException if a matching document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.ucla.macroscope.textlibrary.model.document findByAuthor_First(
		java.lang.String author,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.textlibrary.NoSuchdocumentException;

	/**
	* Returns the first document in the ordered set where author = &#63;.
	*
	* @param author the author
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document, or <code>null</code> if a matching document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.ucla.macroscope.textlibrary.model.document fetchByAuthor_First(
		java.lang.String author,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last document in the ordered set where author = &#63;.
	*
	* @param author the author
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document
	* @throws edu.ucla.macroscope.textlibrary.NoSuchdocumentException if a matching document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.ucla.macroscope.textlibrary.model.document findByAuthor_Last(
		java.lang.String author,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.textlibrary.NoSuchdocumentException;

	/**
	* Returns the last document in the ordered set where author = &#63;.
	*
	* @param author the author
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document, or <code>null</code> if a matching document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.ucla.macroscope.textlibrary.model.document fetchByAuthor_Last(
		java.lang.String author,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the documents before and after the current document in the ordered set where author = &#63;.
	*
	* @param documentId the primary key of the current document
	* @param author the author
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next document
	* @throws edu.ucla.macroscope.textlibrary.NoSuchdocumentException if a document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.ucla.macroscope.textlibrary.model.document[] findByAuthor_PrevAndNext(
		long documentId, java.lang.String author,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.textlibrary.NoSuchdocumentException;

	/**
	* Removes all the documents where author = &#63; from the database.
	*
	* @param author the author
	* @throws SystemException if a system exception occurred
	*/
	public void removeByAuthor(java.lang.String author)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of documents where author = &#63;.
	*
	* @param author the author
	* @return the number of matching documents
	* @throws SystemException if a system exception occurred
	*/
	public int countByAuthor(java.lang.String author)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the documents where collection = &#63;.
	*
	* @param collection the collection
	* @return the matching documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<edu.ucla.macroscope.textlibrary.model.document> findByCollection(
		java.lang.String collection)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the documents where collection = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link edu.ucla.macroscope.textlibrary.model.impl.documentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param collection the collection
	* @param start the lower bound of the range of documents
	* @param end the upper bound of the range of documents (not inclusive)
	* @return the range of matching documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<edu.ucla.macroscope.textlibrary.model.document> findByCollection(
		java.lang.String collection, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the documents where collection = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link edu.ucla.macroscope.textlibrary.model.impl.documentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param collection the collection
	* @param start the lower bound of the range of documents
	* @param end the upper bound of the range of documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<edu.ucla.macroscope.textlibrary.model.document> findByCollection(
		java.lang.String collection, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first document in the ordered set where collection = &#63;.
	*
	* @param collection the collection
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document
	* @throws edu.ucla.macroscope.textlibrary.NoSuchdocumentException if a matching document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.ucla.macroscope.textlibrary.model.document findByCollection_First(
		java.lang.String collection,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.textlibrary.NoSuchdocumentException;

	/**
	* Returns the first document in the ordered set where collection = &#63;.
	*
	* @param collection the collection
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document, or <code>null</code> if a matching document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.ucla.macroscope.textlibrary.model.document fetchByCollection_First(
		java.lang.String collection,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last document in the ordered set where collection = &#63;.
	*
	* @param collection the collection
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document
	* @throws edu.ucla.macroscope.textlibrary.NoSuchdocumentException if a matching document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.ucla.macroscope.textlibrary.model.document findByCollection_Last(
		java.lang.String collection,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.textlibrary.NoSuchdocumentException;

	/**
	* Returns the last document in the ordered set where collection = &#63;.
	*
	* @param collection the collection
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document, or <code>null</code> if a matching document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.ucla.macroscope.textlibrary.model.document fetchByCollection_Last(
		java.lang.String collection,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the documents before and after the current document in the ordered set where collection = &#63;.
	*
	* @param documentId the primary key of the current document
	* @param collection the collection
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next document
	* @throws edu.ucla.macroscope.textlibrary.NoSuchdocumentException if a document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.ucla.macroscope.textlibrary.model.document[] findByCollection_PrevAndNext(
		long documentId, java.lang.String collection,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.textlibrary.NoSuchdocumentException;

	/**
	* Removes all the documents where collection = &#63; from the database.
	*
	* @param collection the collection
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCollection(java.lang.String collection)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of documents where collection = &#63;.
	*
	* @param collection the collection
	* @return the number of matching documents
	* @throws SystemException if a system exception occurred
	*/
	public int countByCollection(java.lang.String collection)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the document in the entity cache if it is enabled.
	*
	* @param document the document
	*/
	public void cacheResult(
		edu.ucla.macroscope.textlibrary.model.document document);

	/**
	* Caches the documents in the entity cache if it is enabled.
	*
	* @param documents the documents
	*/
	public void cacheResult(
		java.util.List<edu.ucla.macroscope.textlibrary.model.document> documents);

	/**
	* Creates a new document with the primary key. Does not add the document to the database.
	*
	* @param documentId the primary key for the new document
	* @return the new document
	*/
	public edu.ucla.macroscope.textlibrary.model.document create(
		long documentId);

	/**
	* Removes the document with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param documentId the primary key of the document
	* @return the document that was removed
	* @throws edu.ucla.macroscope.textlibrary.NoSuchdocumentException if a document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.ucla.macroscope.textlibrary.model.document remove(
		long documentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.textlibrary.NoSuchdocumentException;

	public edu.ucla.macroscope.textlibrary.model.document updateImpl(
		edu.ucla.macroscope.textlibrary.model.document document)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the document with the primary key or throws a {@link edu.ucla.macroscope.textlibrary.NoSuchdocumentException} if it could not be found.
	*
	* @param documentId the primary key of the document
	* @return the document
	* @throws edu.ucla.macroscope.textlibrary.NoSuchdocumentException if a document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.ucla.macroscope.textlibrary.model.document findByPrimaryKey(
		long documentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.ucla.macroscope.textlibrary.NoSuchdocumentException;

	/**
	* Returns the document with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param documentId the primary key of the document
	* @return the document, or <code>null</code> if a document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.ucla.macroscope.textlibrary.model.document fetchByPrimaryKey(
		long documentId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the documents.
	*
	* @return the documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<edu.ucla.macroscope.textlibrary.model.document> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<edu.ucla.macroscope.textlibrary.model.document> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the documents.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link edu.ucla.macroscope.textlibrary.model.impl.documentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of documents
	* @param end the upper bound of the range of documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<edu.ucla.macroscope.textlibrary.model.document> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the documents from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of documents.
	*
	* @return the number of documents
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}