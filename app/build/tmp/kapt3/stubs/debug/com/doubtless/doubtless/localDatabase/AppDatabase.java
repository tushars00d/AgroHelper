package com.doubtless.doubtless.localDatabase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/doubtless/doubtless/localDatabase/AppDatabase;", "", "()V", "AppDB", "Companion", "app_debug"})
public final class AppDatabase {
    @org.jetbrains.annotations.NotNull
    public static final com.doubtless.doubtless.localDatabase.AppDatabase.Companion Companion = null;
    private static com.doubtless.doubtless.localDatabase.AppDatabase.AppDB database;
    
    public AppDatabase() {
        super();
    }
    
    @androidx.room.TypeConverters(value = {com.doubtless.doubtless.localDatabase.Converters.class})
    @androidx.room.Database(entities = {com.doubtless.doubtless.screens.inAppNotification.model.InAppNotificationEntity.class}, version = 1)
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/doubtless/doubtless/localDatabase/AppDatabase$AppDB;", "Landroidx/room/RoomDatabase;", "()V", "inAppNotificationDao", "Lcom/doubtless/doubtless/screens/inAppNotification/dao/InAppNotificationDao;", "app_debug"})
    public static abstract class AppDB extends androidx.room.RoomDatabase {
        
        public AppDB() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public abstract com.doubtless.doubtless.screens.inAppNotification.dao.InAppNotificationDao inAppNotificationDao();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/doubtless/doubtless/localDatabase/AppDatabase$Companion;", "", "()V", "database", "Lcom/doubtless/doubtless/localDatabase/AppDatabase$AppDB;", "getDbInstance", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @kotlin.jvm.Synchronized
        public final synchronized com.doubtless.doubtless.localDatabase.AppDatabase.AppDB getDbInstance() {
            return null;
        }
    }
}