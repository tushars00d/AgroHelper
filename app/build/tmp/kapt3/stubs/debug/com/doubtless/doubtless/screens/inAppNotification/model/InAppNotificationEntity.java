package com.doubtless.doubtless.screens.inAppNotification.model;

import java.lang.System;

@androidx.room.Entity(tableName = "InAppNotifications")
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 22\u00020\u0001:\u00012B\u008f\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0011J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0010H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0095\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u00c6\u0001J\u0013\u0010-\u001a\u00020\u00102\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010/\u001a\u000200H\u00d6\u0001J\t\u00101\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001dR\u0014\u0010\u0002\u001a\u00020\u0003X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013\u00a8\u00063"}, d2 = {"Lcom/doubtless/doubtless/screens/inAppNotification/model/InAppNotificationEntity;", "", "notificationId", "", "answerAuthorId", "answerAuthorName", "answerId", "authorPhotoUrl", "createdOn", "Lcom/google/firebase/Timestamp;", "description", "doubtAuthorId", "doubtHeading", "doubtId", "type", "isRead", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/Timestamp;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getAnswerAuthorId", "()Ljava/lang/String;", "getAnswerAuthorName", "getAnswerId", "getAuthorPhotoUrl", "getCreatedOn", "()Lcom/google/firebase/Timestamp;", "getDescription", "getDoubtAuthorId", "getDoubtHeading", "getDoubtId", "()Z", "getNotificationId", "getType", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "app_debug"})
@com.google.firebase.firestore.IgnoreExtraProperties
@com.google.errorprone.annotations.Keep
public final class InAppNotificationEntity {
    @org.jetbrains.annotations.NotNull
    @androidx.room.PrimaryKey
    private final java.lang.String notificationId = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String answerAuthorId = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String answerAuthorName = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String answerId = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String authorPhotoUrl = null;
    @org.jetbrains.annotations.Nullable
    @com.google.firebase.firestore.ServerTimestamp
    private final com.google.firebase.Timestamp createdOn = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String description = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String doubtAuthorId = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String doubtHeading = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String doubtId = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String type = null;
    private final boolean isRead = false;
    @org.jetbrains.annotations.NotNull
    public static final com.doubtless.doubtless.screens.inAppNotification.model.InAppNotificationEntity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TYPE_POST_ANSWER = "postAnswer";
    
    @org.jetbrains.annotations.NotNull
    public final com.doubtless.doubtless.screens.inAppNotification.model.InAppNotificationEntity copy(@org.jetbrains.annotations.NotNull
    java.lang.String notificationId, @org.jetbrains.annotations.Nullable
    java.lang.String answerAuthorId, @org.jetbrains.annotations.Nullable
    java.lang.String answerAuthorName, @org.jetbrains.annotations.Nullable
    java.lang.String answerId, @org.jetbrains.annotations.Nullable
    java.lang.String authorPhotoUrl, @org.jetbrains.annotations.Nullable
    com.google.firebase.Timestamp createdOn, @org.jetbrains.annotations.Nullable
    java.lang.String description, @org.jetbrains.annotations.Nullable
    java.lang.String doubtAuthorId, @org.jetbrains.annotations.Nullable
    java.lang.String doubtHeading, @org.jetbrains.annotations.Nullable
    java.lang.String doubtId, @org.jetbrains.annotations.Nullable
    java.lang.String type, boolean isRead) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public InAppNotificationEntity(@org.jetbrains.annotations.NotNull
    java.lang.String notificationId, @org.jetbrains.annotations.Nullable
    java.lang.String answerAuthorId, @org.jetbrains.annotations.Nullable
    java.lang.String answerAuthorName, @org.jetbrains.annotations.Nullable
    java.lang.String answerId, @org.jetbrains.annotations.Nullable
    java.lang.String authorPhotoUrl, @org.jetbrains.annotations.Nullable
    com.google.firebase.Timestamp createdOn, @org.jetbrains.annotations.Nullable
    java.lang.String description, @org.jetbrains.annotations.Nullable
    java.lang.String doubtAuthorId, @org.jetbrains.annotations.Nullable
    java.lang.String doubtHeading, @org.jetbrains.annotations.Nullable
    java.lang.String doubtId, @org.jetbrains.annotations.Nullable
    java.lang.String type, boolean isRead) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @com.google.firebase.firestore.Exclude
    public final java.lang.String getNotificationId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAnswerAuthorId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAnswerAuthorName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAnswerId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAuthorPhotoUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.google.firebase.Timestamp component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.google.firebase.Timestamp getCreatedOn() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDoubtAuthorId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDoubtHeading() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDoubtId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getType() {
        return null;
    }
    
    public final boolean component12() {
        return false;
    }
    
    public final boolean isRead() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/doubtless/doubtless/screens/inAppNotification/model/InAppNotificationEntity$Companion;", "", "()V", "TYPE_POST_ANSWER", "", "fromDocumentSnapshot", "Lcom/doubtless/doubtless/screens/inAppNotification/model/InAppNotificationEntity;", "documentSnapshot", "Lcom/google/firebase/firestore/DocumentSnapshot;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.doubtless.doubtless.screens.inAppNotification.model.InAppNotificationEntity fromDocumentSnapshot(@org.jetbrains.annotations.Nullable
        com.google.firebase.firestore.DocumentSnapshot documentSnapshot) {
            return null;
        }
    }
}