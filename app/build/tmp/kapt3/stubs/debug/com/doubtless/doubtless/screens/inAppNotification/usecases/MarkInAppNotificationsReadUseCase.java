package com.doubtless.doubtless.screens.inAppNotification.usecases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0016\u0010\r\u001a\u00020\u000e2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/doubtless/doubtless/screens/inAppNotification/usecases/MarkInAppNotificationsReadUseCase;", "", "dao", "Lcom/doubtless/doubtless/screens/inAppNotification/dao/InAppNotificationDao;", "firestore", "Lcom/google/firebase/firestore/FirebaseFirestore;", "(Lcom/doubtless/doubtless/screens/inAppNotification/dao/InAppNotificationDao;Lcom/google/firebase/firestore/FirebaseFirestore;)V", "markRead", "Lcom/doubtless/doubtless/screens/inAppNotification/usecases/MarkInAppNotificationsReadUseCase$Result;", "notifications", "", "Lcom/doubtless/doubtless/screens/inAppNotification/model/InAppNotificationEntity;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markReadOnFirestore", "", "Result", "app_debug"})
public final class MarkInAppNotificationsReadUseCase {
    private final com.doubtless.doubtless.screens.inAppNotification.dao.InAppNotificationDao dao = null;
    private final com.google.firebase.firestore.FirebaseFirestore firestore = null;
    
    public MarkInAppNotificationsReadUseCase(@org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.inAppNotification.dao.InAppNotificationDao dao, @org.jetbrains.annotations.NotNull
    com.google.firebase.firestore.FirebaseFirestore firestore) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object markRead(@org.jetbrains.annotations.NotNull
    java.util.List<com.doubtless.doubtless.screens.inAppNotification.model.InAppNotificationEntity> notifications, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.doubtless.doubtless.screens.inAppNotification.usecases.MarkInAppNotificationsReadUseCase.Result> continuation) {
        return null;
    }
    
    private final void markReadOnFirestore(java.util.List<com.doubtless.doubtless.screens.inAppNotification.model.InAppNotificationEntity> notifications) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/doubtless/doubtless/screens/inAppNotification/usecases/MarkInAppNotificationsReadUseCase$Result;", "", "()V", "Error", "Success", "Lcom/doubtless/doubtless/screens/inAppNotification/usecases/MarkInAppNotificationsReadUseCase$Result$Error;", "Lcom/doubtless/doubtless/screens/inAppNotification/usecases/MarkInAppNotificationsReadUseCase$Result$Success;", "app_debug"})
    public static abstract class Result {
        
        private Result() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/doubtless/doubtless/screens/inAppNotification/usecases/MarkInAppNotificationsReadUseCase$Result$Success;", "Lcom/doubtless/doubtless/screens/inAppNotification/usecases/MarkInAppNotificationsReadUseCase$Result;", "()V", "app_debug"})
        public static final class Success extends com.doubtless.doubtless.screens.inAppNotification.usecases.MarkInAppNotificationsReadUseCase.Result {
            @org.jetbrains.annotations.NotNull
            public static final com.doubtless.doubtless.screens.inAppNotification.usecases.MarkInAppNotificationsReadUseCase.Result.Success INSTANCE = null;
            
            private Success() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/doubtless/doubtless/screens/inAppNotification/usecases/MarkInAppNotificationsReadUseCase$Result$Error;", "Lcom/doubtless/doubtless/screens/inAppNotification/usecases/MarkInAppNotificationsReadUseCase$Result;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "app_debug"})
        public static final class Error extends com.doubtless.doubtless.screens.inAppNotification.usecases.MarkInAppNotificationsReadUseCase.Result {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String message = null;
            
            public Error(@org.jetbrains.annotations.NotNull
            java.lang.String message) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getMessage() {
                return null;
            }
        }
    }
}