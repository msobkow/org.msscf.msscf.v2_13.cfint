// Description: Java 11 Table Object interface for CFInt.

/*
 *	org.msscf.msscf.CFInt
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	MSS Code Factory CFInt 2.13 Internet Essentials
 *	
 *	Copyright (C) 2016-2026 Mark Stephen Sobkow (mailto:mark.sobkow@gmail.com)
 *	
 *	This program is free software: you can redistribute it and/or modify
 *	it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	This program is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.msscf.msscf.v2_13.cfint.CFIntObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;
import org.msscf.msscf.v2_13.cfsec.CFSec.*;
import org.msscf.msscf.v2_13.cfsec.CFSecObj.*;
import org.msscf.msscf.v2_13.cfint.CFInt.*;

public interface ICFIntMajorVersionTableObj
{
	ICFIntSchemaObj getSchema();
	void setSchema( ICFIntSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new MajorVersion instance.
	 *
	 *	@return	A new instance.
	 */
	ICFIntMajorVersionObj newInstance();

	/**
	 *	Instantiate a new MajorVersion edition of the specified MajorVersion instance.
	 *
	 *	@return	A new edition.
	 */
	ICFIntMajorVersionEditObj newEditInstance( ICFIntMajorVersionObj orig );

	/**
	 *	Internal use only.
	 */
	ICFIntMajorVersionObj realiseMajorVersion( ICFIntMajorVersionObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFIntMajorVersionObj createMajorVersion( ICFIntMajorVersionObj Obj );

	/**
	 *	Read a MajorVersion-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The MajorVersion-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFIntMajorVersionObj readMajorVersion( CFIntMajorVersionPKey pkey );

	/**
	 *	Read a MajorVersion-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The MajorVersion-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFIntMajorVersionObj readMajorVersion( CFIntMajorVersionPKey pkey,
		boolean forceRead );

	ICFIntMajorVersionObj readCachedMajorVersion( CFIntMajorVersionPKey pkey );

	public void reallyDeepDisposeMajorVersion( ICFIntMajorVersionObj obj );

	void deepDisposeMajorVersion( CFIntMajorVersionPKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFIntMajorVersionObj lockMajorVersion( CFIntMajorVersionPKey pkey );

	/**
	 *	Return a sorted list of all the MajorVersion-derived instances in the database.
	 *
	 *	@return	List of ICFIntMajorVersionObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFIntMajorVersionObj> readAllMajorVersion();

	/**
	 *	Return a sorted map of all the MajorVersion-derived instances in the database.
	 *
	 *	@return	List of ICFIntMajorVersionObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFIntMajorVersionObj> readAllMajorVersion( boolean forceRead );

	List<ICFIntMajorVersionObj> readCachedAllMajorVersion();

	/**
	 *	Get the CFIntMajorVersionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@param	argId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return	CFIntMajorVersionObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFIntMajorVersionObj readMajorVersionByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFIntMajorVersionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@param	argId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return	CFIntMajorVersionObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFIntMajorVersionObj readMajorVersionByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the map of CFIntMajorVersionObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return	List of CFIntMajorVersionObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFIntMajorVersionObj> readMajorVersionByTenantIdx( long TenantId );

	/**
	 *	Get the map of CFIntMajorVersionObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return	List of CFIntMajorVersionObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFIntMajorVersionObj> readMajorVersionByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFIntMajorVersionObj instances sorted by their primary keys for the duplicate SubProjectIdx key.
	 *
	 *	@param	argTenantId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@param	argSubProjectId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return	List of CFIntMajorVersionObj cached instances sorted by their primary keys for the duplicate SubProjectIdx key,
	 *		which may be an empty set.
	 */
	List<ICFIntMajorVersionObj> readMajorVersionBySubProjectIdx( long TenantId,
		long SubProjectId );

	/**
	 *	Get the map of CFIntMajorVersionObj instances sorted by their primary keys for the duplicate SubProjectIdx key.
	 *
	 *	@param	argTenantId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@param	argSubProjectId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return	List of CFIntMajorVersionObj cached instances sorted by their primary keys for the duplicate SubProjectIdx key,
	 *		which may be an empty set.
	 */
	List<ICFIntMajorVersionObj> readMajorVersionBySubProjectIdx( long TenantId,
		long SubProjectId,
		boolean forceRead );

	/**
	 *	Get the CFIntMajorVersionObj instance for the unique NameIdx key.
	 *
	 *	@param	argTenantId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@param	argSubProjectId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@param	argName	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return	CFIntMajorVersionObj cached instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFIntMajorVersionObj readMajorVersionByNameIdx(long TenantId,
		long SubProjectId,
		String Name );

	/**
	 *	Get the CFIntMajorVersionObj instance for the unique NameIdx key.
	 *
	 *	@param	argTenantId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@param	argSubProjectId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@param	argName	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return	CFIntMajorVersionObj refreshed instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFIntMajorVersionObj readMajorVersionByNameIdx(long TenantId,
		long SubProjectId,
		String Name,
		boolean forceRead );

	ICFIntMajorVersionObj readCachedMajorVersionByIdIdx( long TenantId,
		long Id );

	List<ICFIntMajorVersionObj> readCachedMajorVersionByTenantIdx( long TenantId );

	List<ICFIntMajorVersionObj> readCachedMajorVersionBySubProjectIdx( long TenantId,
		long SubProjectId );

	ICFIntMajorVersionObj readCachedMajorVersionByNameIdx( long TenantId,
		long SubProjectId,
		String Name );

	void deepDisposeMajorVersionByIdIdx( long TenantId,
		long Id );

	void deepDisposeMajorVersionByTenantIdx( long TenantId );

	void deepDisposeMajorVersionBySubProjectIdx( long TenantId,
		long SubProjectId );

	void deepDisposeMajorVersionByNameIdx( long TenantId,
		long SubProjectId,
		String Name );

	/**
	 *	Internal use only.
	 */
	ICFIntMajorVersionObj updateMajorVersion( ICFIntMajorVersionObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteMajorVersion( ICFIntMajorVersionObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@param	argId	The MajorVersion key attribute of the instance generating the id.
	 */
	void deleteMajorVersionByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The MajorVersion key attribute of the instance generating the id.
	 */
	void deleteMajorVersionByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@param	argSubProjectId	The MajorVersion key attribute of the instance generating the id.
	 */
	void deleteMajorVersionBySubProjectIdx( long TenantId,
		long SubProjectId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@param	argSubProjectId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@param	argName	The MajorVersion key attribute of the instance generating the id.
	 */
	void deleteMajorVersionByNameIdx(long TenantId,
		long SubProjectId,
		String Name );
}
