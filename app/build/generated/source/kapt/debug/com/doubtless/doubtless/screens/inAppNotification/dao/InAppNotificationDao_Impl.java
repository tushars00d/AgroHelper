package com.doubtless.doubtless.screens.inAppNotification.dao;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.doubtless.doubtless.localDatabase.Converters;
import com.doubtless.doubtless.screens.inAppNotification.model.InAppNotificationEntity;
import com.google.firebase.Timestamp;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class InAppNotificationDao_Impl implements InAppNotificationDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<InAppNotificationEntity> __insertionAdapterOfInAppNotificationEntity;

  private final Converters __converters = new Converters();

  public InAppNotificationDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfInAppNotificationEntity = new EntityInsertionAdapter<InAppNotificationEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `InAppNotifications` (`notificationId`,`answerAuthorId`,`answerAuthorName`,`answerId`,`authorPhotoUrl`,`createdOn`,`description`,`doubtAuthorId`,`doubtHeading`,`doubtId`,`type`,`isRead`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, InAppNotificationEntity value) {
        if (value.getNotificationId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getNotificationId());
        }
        if (value.getAnswerAuthorId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getAnswerAuthorId());
        }
        if (value.getAnswerAuthorName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getAnswerAuthorName());
        }
        if (value.getAnswerId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getAnswerId());
        }
        if (value.getAuthorPhotoUrl() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getAuthorPhotoUrl());
        }
        final long _tmp = __converters.timestampToLong(value.getCreatedOn());
        stmt.bindLong(6, _tmp);
        if (value.getDescription() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getDescription());
        }
        if (value.getDoubtAuthorId() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getDoubtAuthorId());
        }
        if (value.getDoubtHeading() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getDoubtHeading());
        }
        if (value.getDoubtId() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getDoubtId());
        }
        if (value.getType() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getType());
        }
        final int _tmp_1 = value.isRead() ? 1 : 0;
        stmt.bindLong(12, _tmp_1);
      }
    };
  }

  @Override
  public void insertNewNotifications(final List<InAppNotificationEntity> notificationEntities) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfInAppNotificationEntity.insert(notificationEntities);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<InAppNotificationEntity> getAllReadNotifications() {
    final String _sql = "SELECT * FROM InAppNotifications WHERE isRead = true";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfNotificationId = CursorUtil.getColumnIndexOrThrow(_cursor, "notificationId");
      final int _cursorIndexOfAnswerAuthorId = CursorUtil.getColumnIndexOrThrow(_cursor, "answerAuthorId");
      final int _cursorIndexOfAnswerAuthorName = CursorUtil.getColumnIndexOrThrow(_cursor, "answerAuthorName");
      final int _cursorIndexOfAnswerId = CursorUtil.getColumnIndexOrThrow(_cursor, "answerId");
      final int _cursorIndexOfAuthorPhotoUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "authorPhotoUrl");
      final int _cursorIndexOfCreatedOn = CursorUtil.getColumnIndexOrThrow(_cursor, "createdOn");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfDoubtAuthorId = CursorUtil.getColumnIndexOrThrow(_cursor, "doubtAuthorId");
      final int _cursorIndexOfDoubtHeading = CursorUtil.getColumnIndexOrThrow(_cursor, "doubtHeading");
      final int _cursorIndexOfDoubtId = CursorUtil.getColumnIndexOrThrow(_cursor, "doubtId");
      final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
      final int _cursorIndexOfIsRead = CursorUtil.getColumnIndexOrThrow(_cursor, "isRead");
      final List<InAppNotificationEntity> _result = new ArrayList<InAppNotificationEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final InAppNotificationEntity _item;
        final String _tmpNotificationId;
        if (_cursor.isNull(_cursorIndexOfNotificationId)) {
          _tmpNotificationId = null;
        } else {
          _tmpNotificationId = _cursor.getString(_cursorIndexOfNotificationId);
        }
        final String _tmpAnswerAuthorId;
        if (_cursor.isNull(_cursorIndexOfAnswerAuthorId)) {
          _tmpAnswerAuthorId = null;
        } else {
          _tmpAnswerAuthorId = _cursor.getString(_cursorIndexOfAnswerAuthorId);
        }
        final String _tmpAnswerAuthorName;
        if (_cursor.isNull(_cursorIndexOfAnswerAuthorName)) {
          _tmpAnswerAuthorName = null;
        } else {
          _tmpAnswerAuthorName = _cursor.getString(_cursorIndexOfAnswerAuthorName);
        }
        final String _tmpAnswerId;
        if (_cursor.isNull(_cursorIndexOfAnswerId)) {
          _tmpAnswerId = null;
        } else {
          _tmpAnswerId = _cursor.getString(_cursorIndexOfAnswerId);
        }
        final String _tmpAuthorPhotoUrl;
        if (_cursor.isNull(_cursorIndexOfAuthorPhotoUrl)) {
          _tmpAuthorPhotoUrl = null;
        } else {
          _tmpAuthorPhotoUrl = _cursor.getString(_cursorIndexOfAuthorPhotoUrl);
        }
        final Timestamp _tmpCreatedOn;
        final long _tmp;
        _tmp = _cursor.getLong(_cursorIndexOfCreatedOn);
        _tmpCreatedOn = __converters.longToTimestamp(_tmp);
        final String _tmpDescription;
        if (_cursor.isNull(_cursorIndexOfDescription)) {
          _tmpDescription = null;
        } else {
          _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        }
        final String _tmpDoubtAuthorId;
        if (_cursor.isNull(_cursorIndexOfDoubtAuthorId)) {
          _tmpDoubtAuthorId = null;
        } else {
          _tmpDoubtAuthorId = _cursor.getString(_cursorIndexOfDoubtAuthorId);
        }
        final String _tmpDoubtHeading;
        if (_cursor.isNull(_cursorIndexOfDoubtHeading)) {
          _tmpDoubtHeading = null;
        } else {
          _tmpDoubtHeading = _cursor.getString(_cursorIndexOfDoubtHeading);
        }
        final String _tmpDoubtId;
        if (_cursor.isNull(_cursorIndexOfDoubtId)) {
          _tmpDoubtId = null;
        } else {
          _tmpDoubtId = _cursor.getString(_cursorIndexOfDoubtId);
        }
        final String _tmpType;
        if (_cursor.isNull(_cursorIndexOfType)) {
          _tmpType = null;
        } else {
          _tmpType = _cursor.getString(_cursorIndexOfType);
        }
        final boolean _tmpIsRead;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfIsRead);
        _tmpIsRead = _tmp_1 != 0;
        _item = new InAppNotificationEntity(_tmpNotificationId,_tmpAnswerAuthorId,_tmpAnswerAuthorName,_tmpAnswerId,_tmpAuthorPhotoUrl,_tmpCreatedOn,_tmpDescription,_tmpDoubtAuthorId,_tmpDoubtHeading,_tmpDoubtId,_tmpType,_tmpIsRead);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
