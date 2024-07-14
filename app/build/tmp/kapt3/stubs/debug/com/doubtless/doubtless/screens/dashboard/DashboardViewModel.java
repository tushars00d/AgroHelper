package com.doubtless.doubtless.screens.dashboard;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 (2\u00020\u0001:\u0001(B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\"\u001a\u00020#J\u0010\u0010$\u001a\u00020#2\b\b\u0002\u0010%\u001a\u00020!J\u0006\u0010&\u001a\u00020\'R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u001b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f0\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/doubtless/doubtless/screens/dashboard/DashboardViewModel;", "Landroidx/lifecycle/ViewModel;", "deleteAccountUseCase", "Lcom/doubtless/doubtless/screens/dashboard/usecases/DeleteAccountUseCase;", "fetchUserProfileFeedUseCase", "Lcom/doubtless/doubtless/screens/dashboard/usecases/FetchUserProfileFeedUseCase;", "analyticsTracker", "Lcom/doubtless/doubtless/analytics/AnalyticsTracker;", "userManager", "Lcom/doubtless/doubtless/screens/auth/usecases/UserManager;", "(Lcom/doubtless/doubtless/screens/dashboard/usecases/DeleteAccountUseCase;Lcom/doubtless/doubtless/screens/dashboard/usecases/FetchUserProfileFeedUseCase;Lcom/doubtless/doubtless/analytics/AnalyticsTracker;Lcom/doubtless/doubtless/screens/auth/usecases/UserManager;)V", "_accountDeletingResult", "Landroidx/lifecycle/MutableLiveData;", "Lcom/doubtless/doubtless/screens/dashboard/usecases/DeleteAccountUseCase$Result;", "_fetchedHomeEntities", "", "Lcom/doubtless/doubtless/screens/home/entities/FeedEntity;", "_homeEntities", "", "_homeEntitiesIds", "", "", "", "accountDeletionResult", "Landroidx/lifecycle/LiveData;", "getAccountDeletionResult", "()Landroidx/lifecycle/LiveData;", "fetchedHomeEntities", "getFetchedHomeEntities", "homeEntities", "getHomeEntities", "()Ljava/util/List;", "isLoading", "", "deleteAccount", "Lkotlinx/coroutines/Job;", "fetchDoubts", "forPageOne", "notifyFetchedDoubtsConsumed", "", "Companion", "app_debug"})
public final class DashboardViewModel extends androidx.lifecycle.ViewModel {
    private final com.doubtless.doubtless.screens.dashboard.usecases.DeleteAccountUseCase deleteAccountUseCase = null;
    private final com.doubtless.doubtless.screens.dashboard.usecases.FetchUserProfileFeedUseCase fetchUserProfileFeedUseCase = null;
    private final com.doubtless.doubtless.analytics.AnalyticsTracker analyticsTracker = null;
    private final com.doubtless.doubtless.screens.auth.usecases.UserManager userManager = null;
    private final java.util.List<com.doubtless.doubtless.screens.home.entities.FeedEntity> _homeEntities = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.doubtless.doubtless.screens.home.entities.FeedEntity> homeEntities = null;
    private final java.util.Map<java.lang.String, java.lang.Integer> _homeEntitiesIds = null;
    private boolean isLoading = false;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.doubtless.doubtless.screens.home.entities.FeedEntity>> _fetchedHomeEntities = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.doubtless.doubtless.screens.home.entities.FeedEntity>> fetchedHomeEntities = null;
    private final androidx.lifecycle.MutableLiveData<com.doubtless.doubtless.screens.dashboard.usecases.DeleteAccountUseCase.Result> _accountDeletingResult = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.doubtless.doubtless.screens.dashboard.usecases.DeleteAccountUseCase.Result> accountDeletionResult = null;
    @org.jetbrains.annotations.NotNull
    public static final com.doubtless.doubtless.screens.dashboard.DashboardViewModel.Companion Companion = null;
    
    public DashboardViewModel(@org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.dashboard.usecases.DeleteAccountUseCase deleteAccountUseCase, @org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.dashboard.usecases.FetchUserProfileFeedUseCase fetchUserProfileFeedUseCase, @org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.analytics.AnalyticsTracker analyticsTracker, @org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.auth.usecases.UserManager userManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.doubtless.doubtless.screens.home.entities.FeedEntity> getHomeEntities() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.doubtless.doubtless.screens.home.entities.FeedEntity>> getFetchedHomeEntities() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.doubtless.doubtless.screens.dashboard.usecases.DeleteAccountUseCase.Result> getAccountDeletionResult() {
        return null;
    }
    
    public final void notifyFetchedDoubtsConsumed() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job fetchDoubts(boolean forPageOne) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job deleteAccount() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/doubtless/doubtless/screens/dashboard/DashboardViewModel$Companion;", "", "()V", "Factory", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ%\u0010\u000b\u001a\u0002H\f\"\b\b\u0000\u0010\f*\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\f0\u000fH\u0016\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/doubtless/doubtless/screens/dashboard/DashboardViewModel$Companion$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "deleteAccountUseCase", "Lcom/doubtless/doubtless/screens/dashboard/usecases/DeleteAccountUseCase;", "fetchUserProfileFeedUseCase", "Lcom/doubtless/doubtless/screens/dashboard/usecases/FetchUserProfileFeedUseCase;", "analyticsTracker", "Lcom/doubtless/doubtless/analytics/AnalyticsTracker;", "userManager", "Lcom/doubtless/doubtless/screens/auth/usecases/UserManager;", "(Lcom/doubtless/doubtless/screens/dashboard/usecases/DeleteAccountUseCase;Lcom/doubtless/doubtless/screens/dashboard/usecases/FetchUserProfileFeedUseCase;Lcom/doubtless/doubtless/analytics/AnalyticsTracker;Lcom/doubtless/doubtless/screens/auth/usecases/UserManager;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
        public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
            private final com.doubtless.doubtless.screens.dashboard.usecases.DeleteAccountUseCase deleteAccountUseCase = null;
            private final com.doubtless.doubtless.screens.dashboard.usecases.FetchUserProfileFeedUseCase fetchUserProfileFeedUseCase = null;
            private final com.doubtless.doubtless.analytics.AnalyticsTracker analyticsTracker = null;
            private final com.doubtless.doubtless.screens.auth.usecases.UserManager userManager = null;
            
            public Factory(@org.jetbrains.annotations.NotNull
            com.doubtless.doubtless.screens.dashboard.usecases.DeleteAccountUseCase deleteAccountUseCase, @org.jetbrains.annotations.NotNull
            com.doubtless.doubtless.screens.dashboard.usecases.FetchUserProfileFeedUseCase fetchUserProfileFeedUseCase, @org.jetbrains.annotations.NotNull
            com.doubtless.doubtless.analytics.AnalyticsTracker analyticsTracker, @org.jetbrains.annotations.NotNull
            com.doubtless.doubtless.screens.auth.usecases.UserManager userManager) {
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