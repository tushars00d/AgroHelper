package com.doubtless.doubtless.screens.doubt.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 %2\u00020\u0001:\u0001%B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u0012J\u0006\u0010!\u001a\u00020\"J\u0010\u0010#\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010\u0012R\"\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R%\u0010\u0014\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f0\u000b0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/doubtless/doubtless/screens/doubt/view/ViewDoubtsViewModel;", "Landroidx/lifecycle/ViewModel;", "fetchHomeFeedUseCase", "Lcom/doubtless/doubtless/screens/home/usecases/FetchHomeFeedUseCase;", "analyticsTracker", "Lcom/doubtless/doubtless/analytics/AnalyticsTracker;", "userManager", "Lcom/doubtless/doubtless/screens/auth/usecases/UserManager;", "(Lcom/doubtless/doubtless/screens/home/usecases/FetchHomeFeedUseCase;Lcom/doubtless/doubtless/analytics/AnalyticsTracker;Lcom/doubtless/doubtless/screens/auth/usecases/UserManager;)V", "_fetchedHomeEntities", "Landroidx/lifecycle/MutableLiveData;", "Lcom/doubtless/doubtless/utils/Resource;", "", "Lcom/doubtless/doubtless/screens/home/entities/FeedEntity;", "_homeEntities", "", "_homeEntitiesIds", "", "", "", "fetchedHomeEntities", "Landroidx/lifecycle/LiveData;", "getFetchedHomeEntities", "()Landroidx/lifecycle/LiveData;", "homeEntities", "getHomeEntities", "()Ljava/util/List;", "isLoading", "", "fetchDoubts", "Lkotlinx/coroutines/Job;", "forPageOne", "feedTag", "notifyFetchedDoubtsConsumed", "", "refreshList", "tag", "Companion", "app_debug"})
public final class ViewDoubtsViewModel extends androidx.lifecycle.ViewModel {
    private final com.doubtless.doubtless.screens.home.usecases.FetchHomeFeedUseCase fetchHomeFeedUseCase = null;
    private final com.doubtless.doubtless.analytics.AnalyticsTracker analyticsTracker = null;
    private final com.doubtless.doubtless.screens.auth.usecases.UserManager userManager = null;
    private final java.util.List<com.doubtless.doubtless.screens.home.entities.FeedEntity> _homeEntities = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.doubtless.doubtless.screens.home.entities.FeedEntity> homeEntities = null;
    private final java.util.Map<java.lang.String, java.lang.Integer> _homeEntitiesIds = null;
    private boolean isLoading = false;
    private final androidx.lifecycle.MutableLiveData<com.doubtless.doubtless.utils.Resource<java.util.List<com.doubtless.doubtless.screens.home.entities.FeedEntity>>> _fetchedHomeEntities = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.doubtless.doubtless.utils.Resource<java.util.List<com.doubtless.doubtless.screens.home.entities.FeedEntity>>> fetchedHomeEntities = null;
    @org.jetbrains.annotations.NotNull
    public static final com.doubtless.doubtless.screens.doubt.view.ViewDoubtsViewModel.Companion Companion = null;
    
    public ViewDoubtsViewModel(@org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.home.usecases.FetchHomeFeedUseCase fetchHomeFeedUseCase, @org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.analytics.AnalyticsTracker analyticsTracker, @org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.auth.usecases.UserManager userManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.doubtless.doubtless.screens.home.entities.FeedEntity> getHomeEntities() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.doubtless.doubtless.utils.Resource<java.util.List<com.doubtless.doubtless.screens.home.entities.FeedEntity>>> getFetchedHomeEntities() {
        return null;
    }
    
    public final void notifyFetchedDoubtsConsumed() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job fetchDoubts(boolean forPageOne, @org.jetbrains.annotations.NotNull
    java.lang.String feedTag) {
        return null;
    }
    
    public final void refreshList(@org.jetbrains.annotations.Nullable
    java.lang.String tag) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/doubtless/doubtless/screens/doubt/view/ViewDoubtsViewModel$Companion;", "", "()V", "Factory", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ%\u0010\t\u001a\u0002H\n\"\b\b\u0000\u0010\n*\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\n0\rH\u0016\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/doubtless/doubtless/screens/doubt/view/ViewDoubtsViewModel$Companion$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "fetchHomeFeedUseCase", "Lcom/doubtless/doubtless/screens/home/usecases/FetchHomeFeedUseCase;", "analyticsTracker", "Lcom/doubtless/doubtless/analytics/AnalyticsTracker;", "userManager", "Lcom/doubtless/doubtless/screens/auth/usecases/UserManager;", "(Lcom/doubtless/doubtless/screens/home/usecases/FetchHomeFeedUseCase;Lcom/doubtless/doubtless/analytics/AnalyticsTracker;Lcom/doubtless/doubtless/screens/auth/usecases/UserManager;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
        public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
            private final com.doubtless.doubtless.screens.home.usecases.FetchHomeFeedUseCase fetchHomeFeedUseCase = null;
            private final com.doubtless.doubtless.analytics.AnalyticsTracker analyticsTracker = null;
            private final com.doubtless.doubtless.screens.auth.usecases.UserManager userManager = null;
            
            public Factory(@org.jetbrains.annotations.NotNull
            com.doubtless.doubtless.screens.home.usecases.FetchHomeFeedUseCase fetchHomeFeedUseCase, @org.jetbrains.annotations.NotNull
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