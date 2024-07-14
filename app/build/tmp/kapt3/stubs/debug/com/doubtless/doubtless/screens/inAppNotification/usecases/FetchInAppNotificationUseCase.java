package com.doubtless.doubtless.screens.inAppNotification.usecases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\nB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/doubtless/doubtless/screens/inAppNotification/usecases/FetchInAppNotificationUseCase;", "", "inAppNotificationDao", "Lcom/doubtless/doubtless/screens/inAppNotification/dao/InAppNotificationDao;", "unreadNotificationUseCase", "Lcom/doubtless/doubtless/screens/inAppNotification/usecases/FetchUnreadNotificationUseCase;", "(Lcom/doubtless/doubtless/screens/inAppNotification/dao/InAppNotificationDao;Lcom/doubtless/doubtless/screens/inAppNotification/usecases/FetchUnreadNotificationUseCase;)V", "getNotifications", "Lcom/doubtless/doubtless/screens/inAppNotification/usecases/FetchInAppNotificationUseCase$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Result", "app_debug"})
public final class FetchInAppNotificationUseCase {
    private final com.doubtless.doubtless.screens.inAppNotification.dao.InAppNotificationDao inAppNotificationDao = null;
    private final com.doubtless.doubtless.screens.inAppNotification.usecases.FetchUnreadNotificationUseCase unreadNotificationUseCase = null;
    
    public FetchInAppNotificationUseCase(@org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.inAppNotification.dao.InAppNotificationDao inAppNotificationDao, @org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.inAppNotification.usecases.FetchUnreadNotificationUseCase unreadNotificationUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getNotifications(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.doubtless.doubtless.screens.inAppNotification.usecases.FetchInAppNotificationUseCase.Result> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/doubtless/doubtless/screens/inAppNotification/usecases/FetchInAppNotificationUseCase$Result;", "", "()V", "Error", "Success", "Lcom/doubtless/doubtless/screens/inAppNotification/usecases/FetchInAppNotificationUseCase$Result$Error;", "Lcom/doubtless/doubtless/screens/inAppNotification/usecases/FetchInAppNotificationUseCase$Result$Success;", "app_debug"})
    public static abstract class Result {
        
        private Result() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/doubtless/doubtless/screens/inAppNotification/usecases/FetchInAppNotificationUseCase$Result$Success;", "Lcom/doubtless/doubtless/screens/inAppNotification/usecases/FetchInAppNotificationUseCase$Result;", "notifications", "", "Lcom/doubtless/doubtless/screens/inAppNotification/model/InAppNotificationEntity;", "error", "", "(Ljava/util/List;Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "getNotifications", "()Ljava/util/List;", "app_debug"})
        public static final class Success extends com.doubtless.doubtless.screens.inAppNotification.usecases.FetchInAppNotificationUseCase.Result {
            @org.jetbrains.annotations.NotNull
            private final java.util.List<com.doubtless.doubtless.screens.inAppNotification.model.InAppNotificationEntity> notifications = null;
            @org.jetbrains.annotations.Nullable
            private final java.lang.String error = null;
            
            public Success(@org.jetbrains.annotations.NotNull
            java.util.List<com.doubtless.doubtless.screens.inAppNotification.model.InAppNotificationEntity> notifications, @org.jetbrains.annotations.Nullable
            java.lang.String error) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.util.List<com.doubtless.doubtless.screens.inAppNotification.model.InAppNotificationEntity> getNotifications() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.String getError() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/doubtless/doubtless/screens/inAppNotification/usecases/FetchInAppNotificationUseCase$Result$Error;", "Lcom/doubtless/doubtless/screens/inAppNotification/usecases/FetchInAppNotificationUseCase$Result;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "app_debug"})
        public static final class Error extends com.doubtless.doubtless.screens.inAppNotification.usecases.FetchInAppNotificationUseCase.Result {
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