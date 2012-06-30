/**
 *  This file is part of MythTV for Android
 * 
 *  MythTV for Android is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  MythTV for Android is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with MythTV for Android.  If not, see <http://www.gnu.org/licenses/>.
 *   
 * This software can be found at <https://github.com/MythTV-Android/mythtv-for-android/>
 *
 */
package org.mythtv.services.api.myth;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author Daniel Frey
 *
 */
public class StorageGroupDirectories {

	@JsonProperty( "StorageGroupDirs" )
	private List<StorageGroupDirectory> storageGroupDirectories;
	
	public StorageGroupDirectories() { }

	/**
	 * @return the storageGroupDirectories
	 */
	public List<StorageGroupDirectory> getStorageGroupDirectories() {
		return storageGroupDirectories;
	}

	/**
	 * @param storageGroupDirectories the storageGroupDirectories to set
	 */
	public void setStorageGroupDirectories( List<StorageGroupDirectory> storageGroupDirectories ) {
		this.storageGroupDirectories = storageGroupDirectories;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append( "StorageGroupDirectories [" );
		
		if( storageGroupDirectories != null ) {
			builder.append( "storageGroupDirectories=" );
			builder.append( storageGroupDirectories );
		}
		
		builder.append( "]" );
	
		return builder.toString();
	}
	
}
