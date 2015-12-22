/**
 *   ownCloud Android client application
 *
 *   @author Bartek Przybylski
 *   Copyright (C) 2011  Bartek Przybylski
 *   Copyright (C) 2015 ownCloud Inc.
 *
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License version 2,
 *   as published by the Free Software Foundation.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package com.owncloud.android.db;

import android.net.Uri;
import android.provider.BaseColumns;

import com.owncloud.android.MainApp;

/**
 * Meta-Class that holds various static field information
 */
public class ProviderMeta {

    public static final String DB_NAME = "filelist";
    public static final int DB_VERSION = 9;

    private ProviderMeta() {
    }

    static public class ProviderTableMeta implements BaseColumns {
        public static final String FILE_TABLE_NAME = "filelist";
        public static final String OCSHARES_TABLE_NAME = "ocshares";
        public static final Uri CONTENT_URI = Uri.parse("content://"
                + MainApp.getAuthority() + "/");
        public static final Uri CONTENT_URI_FILE = Uri.parse("content://"
                + MainApp.getAuthority() + "/file");
        public static final Uri CONTENT_URI_DIR = Uri.parse("content://"
                + MainApp.getAuthority() + "/dir");
        public static final Uri CONTENT_URI_SHARE = Uri.parse("content://"
                + MainApp.getAuthority() + "/shares");

        public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.owncloud.file";
        public static final String CONTENT_TYPE_ITEM = "vnd.android.cursor.item/vnd.owncloud.file";

        // Columns of filelist table
        public static final String FILE_PARENT = "parent";
        public static final String FILE_NAME = "filename";
        public static final String FILE_CREATION = "created";
        public static final String FILE_MODIFIED = "modified";
        public static final String FILE_MODIFIED_AT_LAST_SYNC_FOR_DATA = "modified_at_last_sync_for_data";
        public static final String FILE_CONTENT_LENGTH = "content_length";
        public static final String FILE_CONTENT_TYPE = "content_type";
        public static final String FILE_STORAGE_PATH = "media_path";
        public static final String FILE_PATH = "path";
        public static final String FILE_ACCOUNT_OWNER = "file_owner";
        public static final String FILE_LAST_SYNC_DATE = "last_sync_date";  // _for_properties, but let's keep it as it is
        public static final String FILE_LAST_SYNC_DATE_FOR_DATA = "last_sync_date_for_data";
        public static final String FILE_KEEP_IN_SYNC = "keep_in_sync";
        public static final String FILE_ETAG = "etag";
        public static final String FILE_SHARE_BY_LINK = "share_by_link";
        public static final String FILE_PUBLIC_LINK = "public_link";
        public static final String FILE_PERMISSIONS = "permissions";
        public static final String FILE_REMOTE_ID = "remote_id";
        public static final String FILE_UPDATE_THUMBNAIL = "update_thumbnail";
        public static final String FILE_IS_DOWNLOADING= "is_downloading";

        public static final String FILE_DEFAULT_SORT_ORDER = FILE_NAME
                + " collate nocase asc";
        
        // Columns of ocshares table
        public static final String OCSHARES_FILE_SOURCE = "file_source";
        public static final String OCSHARES_ITEM_SOURCE = "item_source";
        public static final String OCSHARES_SHARE_TYPE = "share_type";
        public static final String OCSHARES_SHARE_WITH = "shate_with";
        public static final String OCSHARES_PATH = "path";
        public static final String OCSHARES_PERMISSIONS = "permissions";
        public static final String OCSHARES_SHARED_DATE = "shared_date";
        public static final String OCSHARES_EXPIRATION_DATE = "expiration_date";
        public static final String OCSHARES_TOKEN = "token";
        public static final String OCSHARES_SHARE_WITH_DISPLAY_NAME = "shared_with_display_name";
        public static final String OCSHARES_IS_DIRECTORY = "is_directory";
        public static final String OCSHARES_USER_ID = "user_id";
        public static final String OCSHARES_ID_REMOTE_SHARED = "id_remote_shared";
        public static final String OCSHARES_ACCOUNT_OWNER = "owner_share";
        
        public static final String OCSHARES_DEFAULT_SORT_ORDER = OCSHARES_FILE_SOURCE 
                + " collate nocase asc";
        

    }
}
