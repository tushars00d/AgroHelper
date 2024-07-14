package com.doubtless.doubtless.localDatabase;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.doubtless.doubtless.screens.inAppNotification.dao.InAppNotificationDao;
import com.doubtless.doubtless.screens.inAppNotification.dao.InAppNotificationDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_AppDB_Impl extends AppDatabase.AppDB {
  private volatile InAppNotificationDao _inAppNotificationDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `InAppNotifications` (`notificationId` TEXT NOT NULL, `answerAuthorId` TEXT, `answerAuthorName` TEXT, `answerId` TEXT, `authorPhotoUrl` TEXT, `createdOn` INTEGER, `description` TEXT, `doubtAuthorId` TEXT, `doubtHeading` TEXT, `doubtId` TEXT, `type` TEXT, `isRead` INTEGER NOT NULL, PRIMARY KEY(`notificationId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '980e36a2ecb72440bb69426381d922a8')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `InAppNotifications`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      public void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsInAppNotifications = new HashMap<String, TableInfo.Column>(12);
        _columnsInAppNotifications.put("notificationId", new TableInfo.Column("notificationId", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInAppNotifications.put("answerAuthorId", new TableInfo.Column("answerAuthorId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInAppNotifications.put("answerAuthorName", new TableInfo.Column("answerAuthorName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInAppNotifications.put("answerId", new TableInfo.Column("answerId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInAppNotifications.put("authorPhotoUrl", new TableInfo.Column("authorPhotoUrl", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInAppNotifications.put("createdOn", new TableInfo.Column("createdOn", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInAppNotifications.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInAppNotifications.put("doubtAuthorId", new TableInfo.Column("doubtAuthorId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInAppNotifications.put("doubtHeading", new TableInfo.Column("doubtHeading", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInAppNotifications.put("doubtId", new TableInfo.Column("doubtId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInAppNotifications.put("type", new TableInfo.Column("type", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInAppNotifications.put("isRead", new TableInfo.Column("isRead", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysInAppNotifications = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesInAppNotifications = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoInAppNotifications = new TableInfo("InAppNotifications", _columnsInAppNotifications, _foreignKeysInAppNotifications, _indicesInAppNotifications);
        final TableInfo _existingInAppNotifications = TableInfo.read(_db, "InAppNotifications");
        if (! _infoInAppNotifications.equals(_existingInAppNotifications)) {
          return new RoomOpenHelper.ValidationResult(false, "InAppNotifications(com.doubtless.doubtless.screens.inAppNotification.model.InAppNotificationEntity).\n"
                  + " Expected:\n" + _infoInAppNotifications + "\n"
                  + " Found:\n" + _existingInAppNotifications);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "980e36a2ecb72440bb69426381d922a8", "6f4e1d6184cb960c6d974e45093c86cf");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "InAppNotifications");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `InAppNotifications`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(InAppNotificationDao.class, InAppNotificationDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public InAppNotificationDao inAppNotificationDao() {
    if (_inAppNotificationDao != null) {
      return _inAppNotificationDao;
    } else {
      synchronized(this) {
        if(_inAppNotificationDao == null) {
          _inAppNotificationDao = new InAppNotificationDao_Impl(this);
        }
        return _inAppNotificationDao;
      }
    }
  }
}
