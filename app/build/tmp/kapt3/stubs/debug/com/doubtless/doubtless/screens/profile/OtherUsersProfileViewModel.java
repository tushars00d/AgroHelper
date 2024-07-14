package com.doubtless.doubtless.screens.profile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 &2\u00020\u0001:\u0001&B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020\u001eJ\u000e\u0010#\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0011J\u0006\u0010$\u001a\u00020%R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/doubtless/doubtless/screens/profile/OtherUsersProfileViewModel;", "Landroidx/lifecycle/ViewModel;", "fetchUserProfileFeedUseCase", "Lcom/doubtless/doubtless/screens/dashboard/usecases/FetchUserProfileFeedUseCase;", "analyticsTracker", "Lcom/doubtless/doubtless/analytics/AnalyticsTracker;", "(Lcom/doubtless/doubtless/screens/dashboard/usecases/FetchUserProfileFeedUseCase;Lcom/doubtless/doubtless/analytics/AnalyticsTracker;)V", "_fetchedHomeEntities", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/doubtless/doubtless/screens/home/entities/FeedEntity;", "_fetchedUserData", "Lcom/doubtless/doubtless/screens/auth/User;", "_homeEntities", "", "_homeEntitiesIds", "", "", "", "fetchedHomeEntities", "Landroidx/lifecycle/LiveData;", "getFetchedHomeEntities", "()Landroidx/lifecycle/LiveData;", "fetchedUserData", "getFetchedUserData", "()Landroidx/lifecycle/MutableLiveData;", "homeEntities", "getHomeEntities", "()Ljava/util/List;", "isLoading", "", "fetchDoubts", "Lkotlinx/coroutines/Job;", "userId", "forPageOne", "fetchUserDetails", "notifyFetchedDoubtsConsumed", "", "Companion", "app_debug"})
public final class OtherUsersProfileViewModel extends androidx.lifecycle.ViewModel {
    private final com.doubtless.doubtless.screens.dashboard.usecases.FetchUserProfileFeedUseCase fetchUserProfileFeedUseCase = null;
    private final com.doubtless.doubtless.analytics.AnalyticsTracker analyticsTracker = null;
    private final java.util.List<com.doubtless.doubtless.screens.home.entities.FeedEntity> _homeEntities = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.doubtless.doubtless.screens.home.entities.FeedEntity> homeEntities = null;
    private final java.util.Map<java.lang.String, java.lang.Integer> _homeEntitiesIds = null;
    private boolean isLoading = false;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.doubtless.doubtless.screens.home.entities.FeedEntity>> _fetchedHomeEntities = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.doubtless.doubtless.screens.home.entities.FeedEntity>> fetchedHomeEntities = null;
    private final androidx.lifecycle.MutableLiveData<com.doubtless.doubtless.screens.auth.User> _fetchedUserData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.doubtless.doubtless.screens.auth.User> fetchedUserData = null;
    @org.jetbrains.annotations.NotNull
    public static final com.doubtless.doubtless.screens.profile.OtherUsersProfileViewModel.Companion Companion = null;
    
    public OtherUsersProfileViewModel(@org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.dashboard.usecases.FetchUserProfileFeedUseCase fetchUserProfileFeedUseCase, @org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.analytics.AnalyticsTracker analyticsTracker) {
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
    public final androidx.lifecycle.MutableLiveData<com.doubtless.doubtless.screens.auth.User> getFetchedUserData() {
        return null;
    }
    
    public final void notifyFetchedDoubtsConsumed() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job fetchUserDetails(@org.jetbrains.annotations.NotNull
    java.lang.String userId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job fetchDoubts(@org.jetbrains.annotations.NotNull
    java.lang.String userId, boolean forPageOne) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/doubtless/doubtless/screens/profile/OtherUsersProfileViewModel$Companion;", "", "()V", "Factory", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J%\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0016\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/doubtless/doubtless/screens/profile/OtherUsersProfileViewModel$Companion$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "fetchUserProfileFeedUseCase", "Lcom/doubtless/doubtless/screens/dashboard/usecases/FetchUserProfileFeedUseCase;", "analyticsTracker", "Lcom/doubtless/doubtless/analytics/AnalyticsTracker;", "(Lcom/doubtless/doubtless/screens/dashboard/usecases/FetchUserProfileFeedUseCase;Lcom/doubtless/doubtless/analytics/AnalyticsTracker;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
        public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
            private final com.doubtless.doubtless.screens.dashboard.usecases.FetchUserProfileFeedUseCase fetchUserProfileFeedUseCase = null;
            private final com.doubtless.doubtless.analytics.AnalyticsTracker analyticsTracker = null;
            
            public Factory(@org.jetbrains.annotations.NotNull
            com.doubtless.doubtless.screens.dashboard.usecases.FetchUserProfileFeedUseCase fetchUserProfileFeedUseCase, @org.jetbrains.annotations.NotNull
            com.doubtless.doubtless.analytics.AnalyticsTracker analyticsTracker) {
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