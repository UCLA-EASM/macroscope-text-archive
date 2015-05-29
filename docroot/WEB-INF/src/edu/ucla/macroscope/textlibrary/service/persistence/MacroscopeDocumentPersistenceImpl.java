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

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException;
import edu.ucla.macroscope.textlibrary.model.MacroscopeDocument;
import edu.ucla.macroscope.textlibrary.model.impl.MacroscopeDocumentImpl;
import edu.ucla.macroscope.textlibrary.model.impl.MacroscopeDocumentModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the macroscope document service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author dave
 * @see MacroscopeDocumentPersistence
 * @see MacroscopeDocumentUtil
 * @generated
 */
public class MacroscopeDocumentPersistenceImpl extends BasePersistenceImpl<MacroscopeDocument>
	implements MacroscopeDocumentPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link MacroscopeDocumentUtil} to access the macroscope document persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = MacroscopeDocumentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(MacroscopeDocumentModelImpl.ENTITY_CACHE_ENABLED,
			MacroscopeDocumentModelImpl.FINDER_CACHE_ENABLED,
			MacroscopeDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(MacroscopeDocumentModelImpl.ENTITY_CACHE_ENABLED,
			MacroscopeDocumentModelImpl.FINDER_CACHE_ENABLED,
			MacroscopeDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(MacroscopeDocumentModelImpl.ENTITY_CACHE_ENABLED,
			MacroscopeDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(MacroscopeDocumentModelImpl.ENTITY_CACHE_ENABLED,
			MacroscopeDocumentModelImpl.FINDER_CACHE_ENABLED,
			MacroscopeDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
		new FinderPath(MacroscopeDocumentModelImpl.ENTITY_CACHE_ENABLED,
			MacroscopeDocumentModelImpl.FINDER_CACHE_ENABLED,
			MacroscopeDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
			new String[] { Long.class.getName() },
			MacroscopeDocumentModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(MacroscopeDocumentModelImpl.ENTITY_CACHE_ENABLED,
			MacroscopeDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the macroscope documents where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching macroscope documents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MacroscopeDocument> findByGroupId(long groupId)
		throws SystemException {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<MacroscopeDocument> findByGroupId(long groupId, int start,
		int end) throws SystemException {
		return findByGroupId(groupId, start, end, null);
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
	@Override
	public List<MacroscopeDocument> findByGroupId(long groupId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID;
			finderArgs = new Object[] { groupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID;
			finderArgs = new Object[] { groupId, start, end, orderByComparator };
		}

		List<MacroscopeDocument> list = (List<MacroscopeDocument>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MacroscopeDocument macroscopeDocument : list) {
				if ((groupId != macroscopeDocument.getGroupId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_MACROSCOPEDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MacroscopeDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<MacroscopeDocument>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MacroscopeDocument>(list);
				}
				else {
					list = (List<MacroscopeDocument>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public MacroscopeDocument findByGroupId_First(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchMacroscopeDocumentException, SystemException {
		MacroscopeDocument macroscopeDocument = fetchByGroupId_First(groupId,
				orderByComparator);

		if (macroscopeDocument != null) {
			return macroscopeDocument;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMacroscopeDocumentException(msg.toString());
	}

	/**
	 * Returns the first macroscope document in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching macroscope document, or <code>null</code> if a matching macroscope document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MacroscopeDocument fetchByGroupId_First(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		List<MacroscopeDocument> list = findByGroupId(groupId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public MacroscopeDocument findByGroupId_Last(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchMacroscopeDocumentException, SystemException {
		MacroscopeDocument macroscopeDocument = fetchByGroupId_Last(groupId,
				orderByComparator);

		if (macroscopeDocument != null) {
			return macroscopeDocument;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMacroscopeDocumentException(msg.toString());
	}

	/**
	 * Returns the last macroscope document in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching macroscope document, or <code>null</code> if a matching macroscope document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MacroscopeDocument fetchByGroupId_Last(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByGroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<MacroscopeDocument> list = findByGroupId(groupId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public MacroscopeDocument[] findByGroupId_PrevAndNext(long documentId,
		long groupId, OrderByComparator orderByComparator)
		throws NoSuchMacroscopeDocumentException, SystemException {
		MacroscopeDocument macroscopeDocument = findByPrimaryKey(documentId);

		Session session = null;

		try {
			session = openSession();

			MacroscopeDocument[] array = new MacroscopeDocumentImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, macroscopeDocument,
					groupId, orderByComparator, true);

			array[1] = macroscopeDocument;

			array[2] = getByGroupId_PrevAndNext(session, macroscopeDocument,
					groupId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected MacroscopeDocument getByGroupId_PrevAndNext(Session session,
		MacroscopeDocument macroscopeDocument, long groupId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MACROSCOPEDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(MacroscopeDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(macroscopeDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MacroscopeDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the macroscope documents where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByGroupId(long groupId) throws SystemException {
		for (MacroscopeDocument macroscopeDocument : findByGroupId(groupId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(macroscopeDocument);
		}
	}

	/**
	 * Returns the number of macroscope documents where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching macroscope documents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByGroupId(long groupId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID;

		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_MACROSCOPEDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "macroscopeDocument.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TITLE = new FinderPath(MacroscopeDocumentModelImpl.ENTITY_CACHE_ENABLED,
			MacroscopeDocumentModelImpl.FINDER_CACHE_ENABLED,
			MacroscopeDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTitle",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TITLE = new FinderPath(MacroscopeDocumentModelImpl.ENTITY_CACHE_ENABLED,
			MacroscopeDocumentModelImpl.FINDER_CACHE_ENABLED,
			MacroscopeDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTitle",
			new String[] { String.class.getName() },
			MacroscopeDocumentModelImpl.TITLE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TITLE = new FinderPath(MacroscopeDocumentModelImpl.ENTITY_CACHE_ENABLED,
			MacroscopeDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTitle",
			new String[] { String.class.getName() });

	/**
	 * Returns all the macroscope documents where title = &#63;.
	 *
	 * @param title the title
	 * @return the matching macroscope documents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MacroscopeDocument> findByTitle(String title)
		throws SystemException {
		return findByTitle(title, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<MacroscopeDocument> findByTitle(String title, int start, int end)
		throws SystemException {
		return findByTitle(title, start, end, null);
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
	@Override
	public List<MacroscopeDocument> findByTitle(String title, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TITLE;
			finderArgs = new Object[] { title };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TITLE;
			finderArgs = new Object[] { title, start, end, orderByComparator };
		}

		List<MacroscopeDocument> list = (List<MacroscopeDocument>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MacroscopeDocument macroscopeDocument : list) {
				if (!Validator.equals(title, macroscopeDocument.getTitle())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_MACROSCOPEDOCUMENT_WHERE);

			boolean bindTitle = false;

			if (title == null) {
				query.append(_FINDER_COLUMN_TITLE_TITLE_1);
			}
			else if (title.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TITLE_TITLE_3);
			}
			else {
				bindTitle = true;

				query.append(_FINDER_COLUMN_TITLE_TITLE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MacroscopeDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindTitle) {
					qPos.add(title);
				}

				if (!pagination) {
					list = (List<MacroscopeDocument>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MacroscopeDocument>(list);
				}
				else {
					list = (List<MacroscopeDocument>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public MacroscopeDocument findByTitle_First(String title,
		OrderByComparator orderByComparator)
		throws NoSuchMacroscopeDocumentException, SystemException {
		MacroscopeDocument macroscopeDocument = fetchByTitle_First(title,
				orderByComparator);

		if (macroscopeDocument != null) {
			return macroscopeDocument;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("title=");
		msg.append(title);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMacroscopeDocumentException(msg.toString());
	}

	/**
	 * Returns the first macroscope document in the ordered set where title = &#63;.
	 *
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching macroscope document, or <code>null</code> if a matching macroscope document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MacroscopeDocument fetchByTitle_First(String title,
		OrderByComparator orderByComparator) throws SystemException {
		List<MacroscopeDocument> list = findByTitle(title, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public MacroscopeDocument findByTitle_Last(String title,
		OrderByComparator orderByComparator)
		throws NoSuchMacroscopeDocumentException, SystemException {
		MacroscopeDocument macroscopeDocument = fetchByTitle_Last(title,
				orderByComparator);

		if (macroscopeDocument != null) {
			return macroscopeDocument;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("title=");
		msg.append(title);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMacroscopeDocumentException(msg.toString());
	}

	/**
	 * Returns the last macroscope document in the ordered set where title = &#63;.
	 *
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching macroscope document, or <code>null</code> if a matching macroscope document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MacroscopeDocument fetchByTitle_Last(String title,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByTitle(title);

		if (count == 0) {
			return null;
		}

		List<MacroscopeDocument> list = findByTitle(title, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public MacroscopeDocument[] findByTitle_PrevAndNext(long documentId,
		String title, OrderByComparator orderByComparator)
		throws NoSuchMacroscopeDocumentException, SystemException {
		MacroscopeDocument macroscopeDocument = findByPrimaryKey(documentId);

		Session session = null;

		try {
			session = openSession();

			MacroscopeDocument[] array = new MacroscopeDocumentImpl[3];

			array[0] = getByTitle_PrevAndNext(session, macroscopeDocument,
					title, orderByComparator, true);

			array[1] = macroscopeDocument;

			array[2] = getByTitle_PrevAndNext(session, macroscopeDocument,
					title, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected MacroscopeDocument getByTitle_PrevAndNext(Session session,
		MacroscopeDocument macroscopeDocument, String title,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MACROSCOPEDOCUMENT_WHERE);

		boolean bindTitle = false;

		if (title == null) {
			query.append(_FINDER_COLUMN_TITLE_TITLE_1);
		}
		else if (title.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_TITLE_TITLE_3);
		}
		else {
			bindTitle = true;

			query.append(_FINDER_COLUMN_TITLE_TITLE_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(MacroscopeDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindTitle) {
			qPos.add(title);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(macroscopeDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MacroscopeDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the macroscope documents where title = &#63; from the database.
	 *
	 * @param title the title
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByTitle(String title) throws SystemException {
		for (MacroscopeDocument macroscopeDocument : findByTitle(title,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(macroscopeDocument);
		}
	}

	/**
	 * Returns the number of macroscope documents where title = &#63;.
	 *
	 * @param title the title
	 * @return the number of matching macroscope documents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByTitle(String title) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TITLE;

		Object[] finderArgs = new Object[] { title };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_MACROSCOPEDOCUMENT_WHERE);

			boolean bindTitle = false;

			if (title == null) {
				query.append(_FINDER_COLUMN_TITLE_TITLE_1);
			}
			else if (title.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TITLE_TITLE_3);
			}
			else {
				bindTitle = true;

				query.append(_FINDER_COLUMN_TITLE_TITLE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindTitle) {
					qPos.add(title);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_TITLE_TITLE_1 = "macroscopeDocument.title IS NULL";
	private static final String _FINDER_COLUMN_TITLE_TITLE_2 = "macroscopeDocument.title = ?";
	private static final String _FINDER_COLUMN_TITLE_TITLE_3 = "(macroscopeDocument.title IS NULL OR macroscopeDocument.title = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_AUTHOR = new FinderPath(MacroscopeDocumentModelImpl.ENTITY_CACHE_ENABLED,
			MacroscopeDocumentModelImpl.FINDER_CACHE_ENABLED,
			MacroscopeDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByAuthor",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AUTHOR =
		new FinderPath(MacroscopeDocumentModelImpl.ENTITY_CACHE_ENABLED,
			MacroscopeDocumentModelImpl.FINDER_CACHE_ENABLED,
			MacroscopeDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByAuthor",
			new String[] { String.class.getName() },
			MacroscopeDocumentModelImpl.AUTHOR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_AUTHOR = new FinderPath(MacroscopeDocumentModelImpl.ENTITY_CACHE_ENABLED,
			MacroscopeDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByAuthor",
			new String[] { String.class.getName() });

	/**
	 * Returns all the macroscope documents where author = &#63;.
	 *
	 * @param author the author
	 * @return the matching macroscope documents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MacroscopeDocument> findByAuthor(String author)
		throws SystemException {
		return findByAuthor(author, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<MacroscopeDocument> findByAuthor(String author, int start,
		int end) throws SystemException {
		return findByAuthor(author, start, end, null);
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
	@Override
	public List<MacroscopeDocument> findByAuthor(String author, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AUTHOR;
			finderArgs = new Object[] { author };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_AUTHOR;
			finderArgs = new Object[] { author, start, end, orderByComparator };
		}

		List<MacroscopeDocument> list = (List<MacroscopeDocument>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MacroscopeDocument macroscopeDocument : list) {
				if (!Validator.equals(author, macroscopeDocument.getAuthor())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_MACROSCOPEDOCUMENT_WHERE);

			boolean bindAuthor = false;

			if (author == null) {
				query.append(_FINDER_COLUMN_AUTHOR_AUTHOR_1);
			}
			else if (author.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_AUTHOR_AUTHOR_3);
			}
			else {
				bindAuthor = true;

				query.append(_FINDER_COLUMN_AUTHOR_AUTHOR_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MacroscopeDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindAuthor) {
					qPos.add(author);
				}

				if (!pagination) {
					list = (List<MacroscopeDocument>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MacroscopeDocument>(list);
				}
				else {
					list = (List<MacroscopeDocument>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public MacroscopeDocument findByAuthor_First(String author,
		OrderByComparator orderByComparator)
		throws NoSuchMacroscopeDocumentException, SystemException {
		MacroscopeDocument macroscopeDocument = fetchByAuthor_First(author,
				orderByComparator);

		if (macroscopeDocument != null) {
			return macroscopeDocument;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("author=");
		msg.append(author);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMacroscopeDocumentException(msg.toString());
	}

	/**
	 * Returns the first macroscope document in the ordered set where author = &#63;.
	 *
	 * @param author the author
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching macroscope document, or <code>null</code> if a matching macroscope document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MacroscopeDocument fetchByAuthor_First(String author,
		OrderByComparator orderByComparator) throws SystemException {
		List<MacroscopeDocument> list = findByAuthor(author, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public MacroscopeDocument findByAuthor_Last(String author,
		OrderByComparator orderByComparator)
		throws NoSuchMacroscopeDocumentException, SystemException {
		MacroscopeDocument macroscopeDocument = fetchByAuthor_Last(author,
				orderByComparator);

		if (macroscopeDocument != null) {
			return macroscopeDocument;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("author=");
		msg.append(author);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMacroscopeDocumentException(msg.toString());
	}

	/**
	 * Returns the last macroscope document in the ordered set where author = &#63;.
	 *
	 * @param author the author
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching macroscope document, or <code>null</code> if a matching macroscope document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MacroscopeDocument fetchByAuthor_Last(String author,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByAuthor(author);

		if (count == 0) {
			return null;
		}

		List<MacroscopeDocument> list = findByAuthor(author, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public MacroscopeDocument[] findByAuthor_PrevAndNext(long documentId,
		String author, OrderByComparator orderByComparator)
		throws NoSuchMacroscopeDocumentException, SystemException {
		MacroscopeDocument macroscopeDocument = findByPrimaryKey(documentId);

		Session session = null;

		try {
			session = openSession();

			MacroscopeDocument[] array = new MacroscopeDocumentImpl[3];

			array[0] = getByAuthor_PrevAndNext(session, macroscopeDocument,
					author, orderByComparator, true);

			array[1] = macroscopeDocument;

			array[2] = getByAuthor_PrevAndNext(session, macroscopeDocument,
					author, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected MacroscopeDocument getByAuthor_PrevAndNext(Session session,
		MacroscopeDocument macroscopeDocument, String author,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MACROSCOPEDOCUMENT_WHERE);

		boolean bindAuthor = false;

		if (author == null) {
			query.append(_FINDER_COLUMN_AUTHOR_AUTHOR_1);
		}
		else if (author.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_AUTHOR_AUTHOR_3);
		}
		else {
			bindAuthor = true;

			query.append(_FINDER_COLUMN_AUTHOR_AUTHOR_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(MacroscopeDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindAuthor) {
			qPos.add(author);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(macroscopeDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MacroscopeDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the macroscope documents where author = &#63; from the database.
	 *
	 * @param author the author
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByAuthor(String author) throws SystemException {
		for (MacroscopeDocument macroscopeDocument : findByAuthor(author,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(macroscopeDocument);
		}
	}

	/**
	 * Returns the number of macroscope documents where author = &#63;.
	 *
	 * @param author the author
	 * @return the number of matching macroscope documents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByAuthor(String author) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_AUTHOR;

		Object[] finderArgs = new Object[] { author };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_MACROSCOPEDOCUMENT_WHERE);

			boolean bindAuthor = false;

			if (author == null) {
				query.append(_FINDER_COLUMN_AUTHOR_AUTHOR_1);
			}
			else if (author.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_AUTHOR_AUTHOR_3);
			}
			else {
				bindAuthor = true;

				query.append(_FINDER_COLUMN_AUTHOR_AUTHOR_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindAuthor) {
					qPos.add(author);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_AUTHOR_AUTHOR_1 = "macroscopeDocument.author IS NULL";
	private static final String _FINDER_COLUMN_AUTHOR_AUTHOR_2 = "macroscopeDocument.author = ?";
	private static final String _FINDER_COLUMN_AUTHOR_AUTHOR_3 = "(macroscopeDocument.author IS NULL OR macroscopeDocument.author = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COLLECTION =
		new FinderPath(MacroscopeDocumentModelImpl.ENTITY_CACHE_ENABLED,
			MacroscopeDocumentModelImpl.FINDER_CACHE_ENABLED,
			MacroscopeDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCollection",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COLLECTION =
		new FinderPath(MacroscopeDocumentModelImpl.ENTITY_CACHE_ENABLED,
			MacroscopeDocumentModelImpl.FINDER_CACHE_ENABLED,
			MacroscopeDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCollection",
			new String[] { String.class.getName() },
			MacroscopeDocumentModelImpl.COLLECTION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COLLECTION = new FinderPath(MacroscopeDocumentModelImpl.ENTITY_CACHE_ENABLED,
			MacroscopeDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCollection",
			new String[] { String.class.getName() });

	/**
	 * Returns all the macroscope documents where collection = &#63;.
	 *
	 * @param collection the collection
	 * @return the matching macroscope documents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MacroscopeDocument> findByCollection(String collection)
		throws SystemException {
		return findByCollection(collection, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<MacroscopeDocument> findByCollection(String collection,
		int start, int end) throws SystemException {
		return findByCollection(collection, start, end, null);
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
	@Override
	public List<MacroscopeDocument> findByCollection(String collection,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COLLECTION;
			finderArgs = new Object[] { collection };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COLLECTION;
			finderArgs = new Object[] { collection, start, end, orderByComparator };
		}

		List<MacroscopeDocument> list = (List<MacroscopeDocument>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MacroscopeDocument macroscopeDocument : list) {
				if (!Validator.equals(collection,
							macroscopeDocument.getCollection())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_MACROSCOPEDOCUMENT_WHERE);

			boolean bindCollection = false;

			if (collection == null) {
				query.append(_FINDER_COLUMN_COLLECTION_COLLECTION_1);
			}
			else if (collection.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_COLLECTION_COLLECTION_3);
			}
			else {
				bindCollection = true;

				query.append(_FINDER_COLUMN_COLLECTION_COLLECTION_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MacroscopeDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCollection) {
					qPos.add(collection);
				}

				if (!pagination) {
					list = (List<MacroscopeDocument>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MacroscopeDocument>(list);
				}
				else {
					list = (List<MacroscopeDocument>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public MacroscopeDocument findByCollection_First(String collection,
		OrderByComparator orderByComparator)
		throws NoSuchMacroscopeDocumentException, SystemException {
		MacroscopeDocument macroscopeDocument = fetchByCollection_First(collection,
				orderByComparator);

		if (macroscopeDocument != null) {
			return macroscopeDocument;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("collection=");
		msg.append(collection);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMacroscopeDocumentException(msg.toString());
	}

	/**
	 * Returns the first macroscope document in the ordered set where collection = &#63;.
	 *
	 * @param collection the collection
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching macroscope document, or <code>null</code> if a matching macroscope document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MacroscopeDocument fetchByCollection_First(String collection,
		OrderByComparator orderByComparator) throws SystemException {
		List<MacroscopeDocument> list = findByCollection(collection, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public MacroscopeDocument findByCollection_Last(String collection,
		OrderByComparator orderByComparator)
		throws NoSuchMacroscopeDocumentException, SystemException {
		MacroscopeDocument macroscopeDocument = fetchByCollection_Last(collection,
				orderByComparator);

		if (macroscopeDocument != null) {
			return macroscopeDocument;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("collection=");
		msg.append(collection);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMacroscopeDocumentException(msg.toString());
	}

	/**
	 * Returns the last macroscope document in the ordered set where collection = &#63;.
	 *
	 * @param collection the collection
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching macroscope document, or <code>null</code> if a matching macroscope document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MacroscopeDocument fetchByCollection_Last(String collection,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCollection(collection);

		if (count == 0) {
			return null;
		}

		List<MacroscopeDocument> list = findByCollection(collection, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public MacroscopeDocument[] findByCollection_PrevAndNext(long documentId,
		String collection, OrderByComparator orderByComparator)
		throws NoSuchMacroscopeDocumentException, SystemException {
		MacroscopeDocument macroscopeDocument = findByPrimaryKey(documentId);

		Session session = null;

		try {
			session = openSession();

			MacroscopeDocument[] array = new MacroscopeDocumentImpl[3];

			array[0] = getByCollection_PrevAndNext(session, macroscopeDocument,
					collection, orderByComparator, true);

			array[1] = macroscopeDocument;

			array[2] = getByCollection_PrevAndNext(session, macroscopeDocument,
					collection, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected MacroscopeDocument getByCollection_PrevAndNext(Session session,
		MacroscopeDocument macroscopeDocument, String collection,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MACROSCOPEDOCUMENT_WHERE);

		boolean bindCollection = false;

		if (collection == null) {
			query.append(_FINDER_COLUMN_COLLECTION_COLLECTION_1);
		}
		else if (collection.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_COLLECTION_COLLECTION_3);
		}
		else {
			bindCollection = true;

			query.append(_FINDER_COLUMN_COLLECTION_COLLECTION_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(MacroscopeDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindCollection) {
			qPos.add(collection);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(macroscopeDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MacroscopeDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the macroscope documents where collection = &#63; from the database.
	 *
	 * @param collection the collection
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCollection(String collection) throws SystemException {
		for (MacroscopeDocument macroscopeDocument : findByCollection(
				collection, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(macroscopeDocument);
		}
	}

	/**
	 * Returns the number of macroscope documents where collection = &#63;.
	 *
	 * @param collection the collection
	 * @return the number of matching macroscope documents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCollection(String collection) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COLLECTION;

		Object[] finderArgs = new Object[] { collection };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_MACROSCOPEDOCUMENT_WHERE);

			boolean bindCollection = false;

			if (collection == null) {
				query.append(_FINDER_COLUMN_COLLECTION_COLLECTION_1);
			}
			else if (collection.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_COLLECTION_COLLECTION_3);
			}
			else {
				bindCollection = true;

				query.append(_FINDER_COLUMN_COLLECTION_COLLECTION_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCollection) {
					qPos.add(collection);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_COLLECTION_COLLECTION_1 = "macroscopeDocument.collection IS NULL";
	private static final String _FINDER_COLUMN_COLLECTION_COLLECTION_2 = "macroscopeDocument.collection = ?";
	private static final String _FINDER_COLUMN_COLLECTION_COLLECTION_3 = "(macroscopeDocument.collection IS NULL OR macroscopeDocument.collection = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_AUTHORANDCOLLECTION =
		new FinderPath(MacroscopeDocumentModelImpl.ENTITY_CACHE_ENABLED,
			MacroscopeDocumentModelImpl.FINDER_CACHE_ENABLED,
			MacroscopeDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByAuthorAndCollection",
			new String[] {
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AUTHORANDCOLLECTION =
		new FinderPath(MacroscopeDocumentModelImpl.ENTITY_CACHE_ENABLED,
			MacroscopeDocumentModelImpl.FINDER_CACHE_ENABLED,
			MacroscopeDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByAuthorAndCollection",
			new String[] { String.class.getName(), String.class.getName() },
			MacroscopeDocumentModelImpl.AUTHOR_COLUMN_BITMASK |
			MacroscopeDocumentModelImpl.COLLECTION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_AUTHORANDCOLLECTION = new FinderPath(MacroscopeDocumentModelImpl.ENTITY_CACHE_ENABLED,
			MacroscopeDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByAuthorAndCollection",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns all the macroscope documents where author = &#63; and collection = &#63;.
	 *
	 * @param author the author
	 * @param collection the collection
	 * @return the matching macroscope documents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MacroscopeDocument> findByAuthorAndCollection(String author,
		String collection) throws SystemException {
		return findByAuthorAndCollection(author, collection, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<MacroscopeDocument> findByAuthorAndCollection(String author,
		String collection, int start, int end) throws SystemException {
		return findByAuthorAndCollection(author, collection, start, end, null);
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
	@Override
	public List<MacroscopeDocument> findByAuthorAndCollection(String author,
		String collection, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AUTHORANDCOLLECTION;
			finderArgs = new Object[] { author, collection };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_AUTHORANDCOLLECTION;
			finderArgs = new Object[] {
					author, collection,
					
					start, end, orderByComparator
				};
		}

		List<MacroscopeDocument> list = (List<MacroscopeDocument>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MacroscopeDocument macroscopeDocument : list) {
				if (!Validator.equals(author, macroscopeDocument.getAuthor()) ||
						!Validator.equals(collection,
							macroscopeDocument.getCollection())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_MACROSCOPEDOCUMENT_WHERE);

			boolean bindAuthor = false;

			if (author == null) {
				query.append(_FINDER_COLUMN_AUTHORANDCOLLECTION_AUTHOR_1);
			}
			else if (author.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_AUTHORANDCOLLECTION_AUTHOR_3);
			}
			else {
				bindAuthor = true;

				query.append(_FINDER_COLUMN_AUTHORANDCOLLECTION_AUTHOR_2);
			}

			boolean bindCollection = false;

			if (collection == null) {
				query.append(_FINDER_COLUMN_AUTHORANDCOLLECTION_COLLECTION_1);
			}
			else if (collection.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_AUTHORANDCOLLECTION_COLLECTION_3);
			}
			else {
				bindCollection = true;

				query.append(_FINDER_COLUMN_AUTHORANDCOLLECTION_COLLECTION_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MacroscopeDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindAuthor) {
					qPos.add(author);
				}

				if (bindCollection) {
					qPos.add(collection);
				}

				if (!pagination) {
					list = (List<MacroscopeDocument>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MacroscopeDocument>(list);
				}
				else {
					list = (List<MacroscopeDocument>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public MacroscopeDocument findByAuthorAndCollection_First(String author,
		String collection, OrderByComparator orderByComparator)
		throws NoSuchMacroscopeDocumentException, SystemException {
		MacroscopeDocument macroscopeDocument = fetchByAuthorAndCollection_First(author,
				collection, orderByComparator);

		if (macroscopeDocument != null) {
			return macroscopeDocument;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("author=");
		msg.append(author);

		msg.append(", collection=");
		msg.append(collection);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMacroscopeDocumentException(msg.toString());
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
	@Override
	public MacroscopeDocument fetchByAuthorAndCollection_First(String author,
		String collection, OrderByComparator orderByComparator)
		throws SystemException {
		List<MacroscopeDocument> list = findByAuthorAndCollection(author,
				collection, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public MacroscopeDocument findByAuthorAndCollection_Last(String author,
		String collection, OrderByComparator orderByComparator)
		throws NoSuchMacroscopeDocumentException, SystemException {
		MacroscopeDocument macroscopeDocument = fetchByAuthorAndCollection_Last(author,
				collection, orderByComparator);

		if (macroscopeDocument != null) {
			return macroscopeDocument;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("author=");
		msg.append(author);

		msg.append(", collection=");
		msg.append(collection);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMacroscopeDocumentException(msg.toString());
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
	@Override
	public MacroscopeDocument fetchByAuthorAndCollection_Last(String author,
		String collection, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByAuthorAndCollection(author, collection);

		if (count == 0) {
			return null;
		}

		List<MacroscopeDocument> list = findByAuthorAndCollection(author,
				collection, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public MacroscopeDocument[] findByAuthorAndCollection_PrevAndNext(
		long documentId, String author, String collection,
		OrderByComparator orderByComparator)
		throws NoSuchMacroscopeDocumentException, SystemException {
		MacroscopeDocument macroscopeDocument = findByPrimaryKey(documentId);

		Session session = null;

		try {
			session = openSession();

			MacroscopeDocument[] array = new MacroscopeDocumentImpl[3];

			array[0] = getByAuthorAndCollection_PrevAndNext(session,
					macroscopeDocument, author, collection, orderByComparator,
					true);

			array[1] = macroscopeDocument;

			array[2] = getByAuthorAndCollection_PrevAndNext(session,
					macroscopeDocument, author, collection, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected MacroscopeDocument getByAuthorAndCollection_PrevAndNext(
		Session session, MacroscopeDocument macroscopeDocument, String author,
		String collection, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MACROSCOPEDOCUMENT_WHERE);

		boolean bindAuthor = false;

		if (author == null) {
			query.append(_FINDER_COLUMN_AUTHORANDCOLLECTION_AUTHOR_1);
		}
		else if (author.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_AUTHORANDCOLLECTION_AUTHOR_3);
		}
		else {
			bindAuthor = true;

			query.append(_FINDER_COLUMN_AUTHORANDCOLLECTION_AUTHOR_2);
		}

		boolean bindCollection = false;

		if (collection == null) {
			query.append(_FINDER_COLUMN_AUTHORANDCOLLECTION_COLLECTION_1);
		}
		else if (collection.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_AUTHORANDCOLLECTION_COLLECTION_3);
		}
		else {
			bindCollection = true;

			query.append(_FINDER_COLUMN_AUTHORANDCOLLECTION_COLLECTION_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(MacroscopeDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindAuthor) {
			qPos.add(author);
		}

		if (bindCollection) {
			qPos.add(collection);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(macroscopeDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MacroscopeDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the macroscope documents where author = &#63; and collection = &#63; from the database.
	 *
	 * @param author the author
	 * @param collection the collection
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByAuthorAndCollection(String author, String collection)
		throws SystemException {
		for (MacroscopeDocument macroscopeDocument : findByAuthorAndCollection(
				author, collection, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(macroscopeDocument);
		}
	}

	/**
	 * Returns the number of macroscope documents where author = &#63; and collection = &#63;.
	 *
	 * @param author the author
	 * @param collection the collection
	 * @return the number of matching macroscope documents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByAuthorAndCollection(String author, String collection)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_AUTHORANDCOLLECTION;

		Object[] finderArgs = new Object[] { author, collection };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_MACROSCOPEDOCUMENT_WHERE);

			boolean bindAuthor = false;

			if (author == null) {
				query.append(_FINDER_COLUMN_AUTHORANDCOLLECTION_AUTHOR_1);
			}
			else if (author.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_AUTHORANDCOLLECTION_AUTHOR_3);
			}
			else {
				bindAuthor = true;

				query.append(_FINDER_COLUMN_AUTHORANDCOLLECTION_AUTHOR_2);
			}

			boolean bindCollection = false;

			if (collection == null) {
				query.append(_FINDER_COLUMN_AUTHORANDCOLLECTION_COLLECTION_1);
			}
			else if (collection.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_AUTHORANDCOLLECTION_COLLECTION_3);
			}
			else {
				bindCollection = true;

				query.append(_FINDER_COLUMN_AUTHORANDCOLLECTION_COLLECTION_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindAuthor) {
					qPos.add(author);
				}

				if (bindCollection) {
					qPos.add(collection);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_AUTHORANDCOLLECTION_AUTHOR_1 = "macroscopeDocument.author IS NULL AND ";
	private static final String _FINDER_COLUMN_AUTHORANDCOLLECTION_AUTHOR_2 = "macroscopeDocument.author = ? AND ";
	private static final String _FINDER_COLUMN_AUTHORANDCOLLECTION_AUTHOR_3 = "(macroscopeDocument.author IS NULL OR macroscopeDocument.author = '') AND ";
	private static final String _FINDER_COLUMN_AUTHORANDCOLLECTION_COLLECTION_1 = "macroscopeDocument.collection IS NULL";
	private static final String _FINDER_COLUMN_AUTHORANDCOLLECTION_COLLECTION_2 = "macroscopeDocument.collection = ?";
	private static final String _FINDER_COLUMN_AUTHORANDCOLLECTION_COLLECTION_3 = "(macroscopeDocument.collection IS NULL OR macroscopeDocument.collection = '')";

	public MacroscopeDocumentPersistenceImpl() {
		setModelClass(MacroscopeDocument.class);
	}

	/**
	 * Caches the macroscope document in the entity cache if it is enabled.
	 *
	 * @param macroscopeDocument the macroscope document
	 */
	@Override
	public void cacheResult(MacroscopeDocument macroscopeDocument) {
		EntityCacheUtil.putResult(MacroscopeDocumentModelImpl.ENTITY_CACHE_ENABLED,
			MacroscopeDocumentImpl.class, macroscopeDocument.getPrimaryKey(),
			macroscopeDocument);

		macroscopeDocument.resetOriginalValues();
	}

	/**
	 * Caches the macroscope documents in the entity cache if it is enabled.
	 *
	 * @param macroscopeDocuments the macroscope documents
	 */
	@Override
	public void cacheResult(List<MacroscopeDocument> macroscopeDocuments) {
		for (MacroscopeDocument macroscopeDocument : macroscopeDocuments) {
			if (EntityCacheUtil.getResult(
						MacroscopeDocumentModelImpl.ENTITY_CACHE_ENABLED,
						MacroscopeDocumentImpl.class,
						macroscopeDocument.getPrimaryKey()) == null) {
				cacheResult(macroscopeDocument);
			}
			else {
				macroscopeDocument.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all macroscope documents.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(MacroscopeDocumentImpl.class.getName());
		}

		EntityCacheUtil.clearCache(MacroscopeDocumentImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the macroscope document.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MacroscopeDocument macroscopeDocument) {
		EntityCacheUtil.removeResult(MacroscopeDocumentModelImpl.ENTITY_CACHE_ENABLED,
			MacroscopeDocumentImpl.class, macroscopeDocument.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<MacroscopeDocument> macroscopeDocuments) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (MacroscopeDocument macroscopeDocument : macroscopeDocuments) {
			EntityCacheUtil.removeResult(MacroscopeDocumentModelImpl.ENTITY_CACHE_ENABLED,
				MacroscopeDocumentImpl.class, macroscopeDocument.getPrimaryKey());
		}
	}

	/**
	 * Creates a new macroscope document with the primary key. Does not add the macroscope document to the database.
	 *
	 * @param documentId the primary key for the new macroscope document
	 * @return the new macroscope document
	 */
	@Override
	public MacroscopeDocument create(long documentId) {
		MacroscopeDocument macroscopeDocument = new MacroscopeDocumentImpl();

		macroscopeDocument.setNew(true);
		macroscopeDocument.setPrimaryKey(documentId);

		return macroscopeDocument;
	}

	/**
	 * Removes the macroscope document with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param documentId the primary key of the macroscope document
	 * @return the macroscope document that was removed
	 * @throws edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException if a macroscope document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MacroscopeDocument remove(long documentId)
		throws NoSuchMacroscopeDocumentException, SystemException {
		return remove((Serializable)documentId);
	}

	/**
	 * Removes the macroscope document with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the macroscope document
	 * @return the macroscope document that was removed
	 * @throws edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException if a macroscope document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MacroscopeDocument remove(Serializable primaryKey)
		throws NoSuchMacroscopeDocumentException, SystemException {
		Session session = null;

		try {
			session = openSession();

			MacroscopeDocument macroscopeDocument = (MacroscopeDocument)session.get(MacroscopeDocumentImpl.class,
					primaryKey);

			if (macroscopeDocument == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMacroscopeDocumentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(macroscopeDocument);
		}
		catch (NoSuchMacroscopeDocumentException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected MacroscopeDocument removeImpl(
		MacroscopeDocument macroscopeDocument) throws SystemException {
		macroscopeDocument = toUnwrappedModel(macroscopeDocument);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(macroscopeDocument)) {
				macroscopeDocument = (MacroscopeDocument)session.get(MacroscopeDocumentImpl.class,
						macroscopeDocument.getPrimaryKeyObj());
			}

			if (macroscopeDocument != null) {
				session.delete(macroscopeDocument);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (macroscopeDocument != null) {
			clearCache(macroscopeDocument);
		}

		return macroscopeDocument;
	}

	@Override
	public MacroscopeDocument updateImpl(
		edu.ucla.macroscope.textlibrary.model.MacroscopeDocument macroscopeDocument)
		throws SystemException {
		macroscopeDocument = toUnwrappedModel(macroscopeDocument);

		boolean isNew = macroscopeDocument.isNew();

		MacroscopeDocumentModelImpl macroscopeDocumentModelImpl = (MacroscopeDocumentModelImpl)macroscopeDocument;

		Session session = null;

		try {
			session = openSession();

			if (macroscopeDocument.isNew()) {
				session.save(macroscopeDocument);

				macroscopeDocument.setNew(false);
			}
			else {
				session.evict(macroscopeDocument);
				session.saveOrUpdate(macroscopeDocument);
			}

			session.flush();
			session.clear();
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !MacroscopeDocumentModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((macroscopeDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						macroscopeDocumentModelImpl.getOriginalGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);

				args = new Object[] { macroscopeDocumentModelImpl.getGroupId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);
			}

			if ((macroscopeDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TITLE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						macroscopeDocumentModelImpl.getOriginalTitle()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TITLE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TITLE,
					args);

				args = new Object[] { macroscopeDocumentModelImpl.getTitle() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TITLE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TITLE,
					args);
			}

			if ((macroscopeDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AUTHOR.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						macroscopeDocumentModelImpl.getOriginalAuthor()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_AUTHOR, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AUTHOR,
					args);

				args = new Object[] { macroscopeDocumentModelImpl.getAuthor() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_AUTHOR, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AUTHOR,
					args);
			}

			if ((macroscopeDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COLLECTION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						macroscopeDocumentModelImpl.getOriginalCollection()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COLLECTION,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COLLECTION,
					args);

				args = new Object[] { macroscopeDocumentModelImpl.getCollection() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COLLECTION,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COLLECTION,
					args);
			}

			if ((macroscopeDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AUTHORANDCOLLECTION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						macroscopeDocumentModelImpl.getOriginalAuthor(),
						macroscopeDocumentModelImpl.getOriginalCollection()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_AUTHORANDCOLLECTION,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AUTHORANDCOLLECTION,
					args);

				args = new Object[] {
						macroscopeDocumentModelImpl.getAuthor(),
						macroscopeDocumentModelImpl.getCollection()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_AUTHORANDCOLLECTION,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AUTHORANDCOLLECTION,
					args);
			}
		}

		EntityCacheUtil.putResult(MacroscopeDocumentModelImpl.ENTITY_CACHE_ENABLED,
			MacroscopeDocumentImpl.class, macroscopeDocument.getPrimaryKey(),
			macroscopeDocument);

		macroscopeDocument.resetOriginalValues();

		return macroscopeDocument;
	}

	protected MacroscopeDocument toUnwrappedModel(
		MacroscopeDocument macroscopeDocument) {
		if (macroscopeDocument instanceof MacroscopeDocumentImpl) {
			return macroscopeDocument;
		}

		MacroscopeDocumentImpl macroscopeDocumentImpl = new MacroscopeDocumentImpl();

		macroscopeDocumentImpl.setNew(macroscopeDocument.isNew());
		macroscopeDocumentImpl.setPrimaryKey(macroscopeDocument.getPrimaryKey());

		macroscopeDocumentImpl.setDocumentId(macroscopeDocument.getDocumentId());
		macroscopeDocumentImpl.setGroupId(macroscopeDocument.getGroupId());
		macroscopeDocumentImpl.setCompanyId(macroscopeDocument.getCompanyId());
		macroscopeDocumentImpl.setUserId(macroscopeDocument.getUserId());
		macroscopeDocumentImpl.setUserName(macroscopeDocument.getUserName());
		macroscopeDocumentImpl.setCreateDate(macroscopeDocument.getCreateDate());
		macroscopeDocumentImpl.setModifiedDate(macroscopeDocument.getModifiedDate());
		macroscopeDocumentImpl.setContent(macroscopeDocument.getContent());
		macroscopeDocumentImpl.setTitle(macroscopeDocument.getTitle());
		macroscopeDocumentImpl.setAuthor(macroscopeDocument.getAuthor());
		macroscopeDocumentImpl.setCollection(macroscopeDocument.getCollection());

		return macroscopeDocumentImpl;
	}

	/**
	 * Returns the macroscope document with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the macroscope document
	 * @return the macroscope document
	 * @throws edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException if a macroscope document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MacroscopeDocument findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMacroscopeDocumentException, SystemException {
		MacroscopeDocument macroscopeDocument = fetchByPrimaryKey(primaryKey);

		if (macroscopeDocument == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMacroscopeDocumentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return macroscopeDocument;
	}

	/**
	 * Returns the macroscope document with the primary key or throws a {@link edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException} if it could not be found.
	 *
	 * @param documentId the primary key of the macroscope document
	 * @return the macroscope document
	 * @throws edu.ucla.macroscope.textlibrary.NoSuchMacroscopeDocumentException if a macroscope document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MacroscopeDocument findByPrimaryKey(long documentId)
		throws NoSuchMacroscopeDocumentException, SystemException {
		return findByPrimaryKey((Serializable)documentId);
	}

	/**
	 * Returns the macroscope document with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the macroscope document
	 * @return the macroscope document, or <code>null</code> if a macroscope document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MacroscopeDocument fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		MacroscopeDocument macroscopeDocument = (MacroscopeDocument)EntityCacheUtil.getResult(MacroscopeDocumentModelImpl.ENTITY_CACHE_ENABLED,
				MacroscopeDocumentImpl.class, primaryKey);

		if (macroscopeDocument == _nullMacroscopeDocument) {
			return null;
		}

		if (macroscopeDocument == null) {
			Session session = null;

			try {
				session = openSession();

				macroscopeDocument = (MacroscopeDocument)session.get(MacroscopeDocumentImpl.class,
						primaryKey);

				if (macroscopeDocument != null) {
					cacheResult(macroscopeDocument);
				}
				else {
					EntityCacheUtil.putResult(MacroscopeDocumentModelImpl.ENTITY_CACHE_ENABLED,
						MacroscopeDocumentImpl.class, primaryKey,
						_nullMacroscopeDocument);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(MacroscopeDocumentModelImpl.ENTITY_CACHE_ENABLED,
					MacroscopeDocumentImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return macroscopeDocument;
	}

	/**
	 * Returns the macroscope document with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param documentId the primary key of the macroscope document
	 * @return the macroscope document, or <code>null</code> if a macroscope document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MacroscopeDocument fetchByPrimaryKey(long documentId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)documentId);
	}

	/**
	 * Returns all the macroscope documents.
	 *
	 * @return the macroscope documents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MacroscopeDocument> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<MacroscopeDocument> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<MacroscopeDocument> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<MacroscopeDocument> list = (List<MacroscopeDocument>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_MACROSCOPEDOCUMENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MACROSCOPEDOCUMENT;

				if (pagination) {
					sql = sql.concat(MacroscopeDocumentModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<MacroscopeDocument>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MacroscopeDocument>(list);
				}
				else {
					list = (List<MacroscopeDocument>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the macroscope documents from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (MacroscopeDocument macroscopeDocument : findAll()) {
			remove(macroscopeDocument);
		}
	}

	/**
	 * Returns the number of macroscope documents.
	 *
	 * @return the number of macroscope documents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_MACROSCOPEDOCUMENT);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the macroscope document persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.edu.ucla.macroscope.textlibrary.model.MacroscopeDocument")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<MacroscopeDocument>> listenersList = new ArrayList<ModelListener<MacroscopeDocument>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<MacroscopeDocument>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(MacroscopeDocumentImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_MACROSCOPEDOCUMENT = "SELECT macroscopeDocument FROM MacroscopeDocument macroscopeDocument";
	private static final String _SQL_SELECT_MACROSCOPEDOCUMENT_WHERE = "SELECT macroscopeDocument FROM MacroscopeDocument macroscopeDocument WHERE ";
	private static final String _SQL_COUNT_MACROSCOPEDOCUMENT = "SELECT COUNT(macroscopeDocument) FROM MacroscopeDocument macroscopeDocument";
	private static final String _SQL_COUNT_MACROSCOPEDOCUMENT_WHERE = "SELECT COUNT(macroscopeDocument) FROM MacroscopeDocument macroscopeDocument WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "macroscopeDocument.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No MacroscopeDocument exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No MacroscopeDocument exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(MacroscopeDocumentPersistenceImpl.class);
	private static MacroscopeDocument _nullMacroscopeDocument = new MacroscopeDocumentImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<MacroscopeDocument> toCacheModel() {
				return _nullMacroscopeDocumentCacheModel;
			}
		};

	private static CacheModel<MacroscopeDocument> _nullMacroscopeDocumentCacheModel =
		new CacheModel<MacroscopeDocument>() {
			@Override
			public MacroscopeDocument toEntityModel() {
				return _nullMacroscopeDocument;
			}
		};
}