package com.doubtless.doubtless.screens.inAppNotification;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00112\u00020\u0001:\u0002\u0011\u0012B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0013"}, d2 = {"Lcom/doubtless/doubtless/screens/inAppNotification/InAppNotificationViewModel;", "Landroidx/lifecycle/ViewModel;", "fetchInAppNotificationUseCase", "Lcom/doubtless/doubtless/screens/inAppNotification/usecases/FetchInAppNotificationUseCase;", "markInAppNotificationsReadUseCase", "Lcom/doubtless/doubtless/screens/inAppNotification/usecases/MarkInAppNotificationsReadUseCase;", "(Lcom/doubtless/doubtless/screens/inAppNotification/usecases/FetchInAppNotificationUseCase;Lcom/doubtless/doubtless/screens/inAppNotification/usecases/MarkInAppNotificationsReadUseCase;)V", "_notificationStatus", "Landroidx/lifecycle/MutableLiveData;", "Lcom/doubtless/doubtless/screens/inAppNotification/InAppNotificationViewModel$Result;", "notificationStatus", "Landroidx/lifecycle/LiveData;", "getNotificationStatus", "()Landroidx/lifecycle/LiveData;", "fetchNotification", "Lkotlinx/coroutines/Job;", "markNotificationsAsRead", "Companion", "Result", "app_debug"})
public final class InAppNotificationViewModel extends androidx.lifecycle.ViewModel {
    private final com.doubtless.doubtless.screens.inAppNotification.usecases.FetchInAppNotificationUseCase fetchInAppNotificationUseCase = null;
    private final com.doubtless.doubtless.screens.inAppNotification.usecases.MarkInAppNotificationsReadUseCase markInAppNotificationsReadUseCase = null;
    private final androidx.lifecycle.MutableLiveData<com.doubtless.doubtless.screens.inAppNotification.InAppNotificationViewModel.Result> _notificationStatus = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.doubtless.doubtless.screens.inAppNotification.InAppNotificationViewModel.Result> notificationStatus = null;
    @org.jetbrains.annotations.NotNull
    public static final com.doubtless.doubtless.screens.inAppNotification.InAppNotificationViewModel.Companion Companion = null;
    
    public InAppNotificationViewModel(@org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.inAppNotification.usecases.FetchInAppNotificationUseCase fetchInAppNotificationUseCase, @org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.inAppNotification.usecases.MarkInAppNotificationsReadUseCase markInAppNotificationsReadUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.doubtless.doubtless.screens.inAppNotification.InAppNotificationViewModel.Result> getNotificationStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job fetchNotification() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job markNotificationsAsRead() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/doubtless/doubtless/screens/inAppNotification/InAppNotificationViewModel$Result;", "", "()V", "Error", "Loading", "NoData", "Success", "Lcom/doubtless/doubtless/screens/inAppNotification/InAppNotificationViewModel$Result$Error;", "Lcom/doubtless/doubtless/screens/inAppNotification/InAppNotificationViewModel$Result$Loading;", "Lcom/doubtless/doubtless/screens/inAppNotification/InAppNotificationViewModel$Result$NoData;", "Lcom/doubtless/doubtless/screens/inAppNotification/InAppNotificationViewModel$Result$Success;", "app_debug"})
    public static abstract class Result {
        
        private Result() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/doubtless/doubtless/screens/inAppNotification/InAppNotificationViewModel$Result$Success;", "Lcom/doubtless/doubtless/screens/inAppNotification/InAppNotificationViewModel$Result;", "notifications", "", "Lcom/doubtless/doubtless/screens/inAppNotification/model/InAppNotificationEntity;", "additionalError", "", "(Ljava/util/List;Ljava/lang/String;)V", "getAdditionalError", "()Ljava/lang/String;", "getNotifications", "()Ljava/util/List;", "app_debug"})
        public static final class Success extends com.doubtless.doubtless.screens.inAppNotification.InAppNotificationViewModel.Result {
            @org.jetbrains.annotations.NotNull
            private final java.util.List<com.doubtless.doubtless.screens.inAppNotification.model.InAppNotificationEntity> notifications = null;
            @org.jetbrains.annotations.Nullable
            private final java.lang.String additionalError = null;
            
            public Success(@org.jetbrains.annotations.NotNull
            java.util.List<com.doubtless.doubtless.screens.inAppNotification.model.InAppNotificationEntity> notifications, @org.jetbrains.annotations.Nullable
            java.lang.String additionalError) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.util.List<com.doubtless.doubtless.screens.inAppNotification.model.InAppNotificationEntity> getNotifications() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.String getAdditionalError() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/doubtless/doubtless/screens/inAppNotification/InAppNotificationViewModel$Result$NoData;", "Lcom/doubtless/doubtless/screens/inAppNotification/InAppNotificationViewModel$Result;", "additionalError", "", "(Ljava/lang/String;)V", "getAdditionalError", "()Ljava/lang/String;", "app_debug"})
        public static final class NoData extends com.doubtless.doubtless.screens.inAppNotification.InAppNotificationViewModel.Result {
            @org.jetbrains.annotations.Nullable
            private final java.lang.String additionalError = null;
            
            public NoData() {
                super();
            }
            
            public NoData(@org.jetbrains.annotations.Nullable
            java.lang.String additionalError) {
                super();
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.String getAdditionalError() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/doubtless/doubtless/screens/inAppNotification/InAppNotificationViewModel$Result$Error;", "Lcom/doubtless/doubtless/screens/inAppNotification/InAppNotificationViewModel$Result;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "app_debug"})
        public static final class Error extends com.doubtless.doubtless.screens.inAppNotification.InAppNotificationViewModel.Result {
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
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/doubtless/doubtless/screens/inAppNotification/InAppNotificationViewModel$Result$Loading;", "Lcom/doubtless/doubtless/screens/inAppNotification/InAppNotificationViewModel$Result;", "()V", "app_debug"})
        public static final class Loading extends com.doubtless.doubtless.screens.inAppNotification.InAppNotificationViewModel.Result {
            @org.jetbrains.annotations.NotNull
            public static final com.doubtless.doubtless.screens.inAppNotification.InAppNotificationViewModel.Result.Loading INSTANCE = null;
            
            private Loading() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/doubtless/doubtless/screens/inAppNotification/InAppNotificationViewModel$Companion;", "", "()V", "Factory", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J%\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0016\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/doubtless/doubtless/screens/inAppNotification/InAppNotificationViewModel$Companion$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "fetchInAppNotificationUseCase", "Lcom/doubtless/doubtless/screens/inAppNotification/usecases/FetchInAppNotificationUseCase;", "markInAppNotificationsReadUseCase", "Lcom/doubtless/doubtless/screens/inAppNotification/usecases/MarkInAppNotificationsReadUseCase;", "(Lcom/doubtless/doubtless/screens/inAppNotification/usecases/FetchInAppNotificationUseCase;Lcom/doubtless/doubtless/screens/inAppNotification/usecases/MarkInAppNotificationsReadUseCase;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
        public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
            private final com.doubtless.doubtless.screens.inAppNotification.usecases.FetchInAppNotificationUseCase fetchInAppNotificationUseCase = null;
            private final com.doubtless.doubtless.screens.inAppNotification.usecases.MarkInAppNotificationsReadUseCase markInAppNotificationsReadUseCase = null;
            
            public Factory(@org.jetbrains.annotations.NotNull
            com.doubtless.doubtless.screens.inAppNotification.usecases.FetchInAppNotificationUseCase fetchInAppNotificationUseCase, @org.jetbrains.annotations.NotNull
            com.doubtless.doubtless.screens.inAppNotification.usecases.MarkInAppNotificationsReadUseCase markInAppNotificationsReadUseCase) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull
            java.lang.Class<T> modelClass) {
                return null;
            }
        }
    }
}