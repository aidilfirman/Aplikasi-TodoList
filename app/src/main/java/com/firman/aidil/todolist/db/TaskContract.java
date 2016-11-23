package com.firman.aidil.todolist.db;

import android.provider.BaseColumns;

public class TaskContract {
    public static final String DB_NAME = "com.firman.aidil.todolist.db";
    public static final int DB_VERSION = 1;
    public static final String TASK = "tugas";

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "tugas";
        public static final String _ID = BaseColumns._ID;
        public static final String COL_TASK_TITLE = "judul";
    }
}