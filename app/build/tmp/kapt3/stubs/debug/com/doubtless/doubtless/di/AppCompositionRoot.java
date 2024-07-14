package com.doubtless.doubtless.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0094\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\nJ\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0010\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#J\u0010\u0010$\u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#J\u0006\u0010%\u001a\u00020&J\u0006\u0010\'\u001a\u00020(J\u000e\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020+J\u0006\u0010,\u001a\u00020-J\u000e\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0006J\u0006\u00101\u001a\u000202J\b\u00103\u001a\u000204H\u0002J\b\u00105\u001a\u000206H\u0002J\u0006\u00107\u001a\u000208J\u000e\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<J\u0006\u0010=\u001a\u00020>J\u000e\u0010?\u001a\u00020@2\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010A\u001a\u00020BJ\b\u0010C\u001a\u00020DH\u0002J\u0006\u0010E\u001a\u00020FJ\u001a\u0010G\u001a\u00020!2\u0006\u0010H\u001a\u00020I2\b\b\u0001\u0010J\u001a\u00020KH\u0002J\b\u0010L\u001a\u00020MH\u0002J\u0010\u0010N\u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#J\u0010\u0010O\u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#J\b\u0010P\u001a\u00020QH\u0002J\u0006\u0010R\u001a\u00020SJ\b\u0010T\u001a\u00020UH\u0002J\u0006\u0010V\u001a\u00020WJ\u0006\u0010X\u001a\u00020YJ\u0006\u0010Z\u001a\u00020[J\u0006\u0010\\\u001a\u00020\fJ\b\u0010]\u001a\u00020^H\u0002J\b\u0010_\u001a\u00020\u0012H\u0002J\b\u0010`\u001a\u00020\u0014H\u0002J\u0006\u0010a\u001a\u00020\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006b"}, d2 = {"Lcom/doubtless/doubtless/di/AppCompositionRoot;", "", "appContext", "Lcom/doubtless/doubtless/DoubtlessApp;", "(Lcom/doubtless/doubtless/DoubtlessApp;)V", "BASE_URL", "", "amplitude", "Lcom/amplitude/android/Amplitude;", "analyticsTracker", "Lcom/doubtless/doubtless/analytics/AnalyticsTracker;", "doubtlessServer", "Lcom/doubtless/doubtless/network/DoubtlessServer;", "router", "Lcom/doubtless/doubtless/navigation/Router;", "getRouter", "()Lcom/doubtless/doubtless/navigation/Router;", "userDataServerUseCase", "Lcom/doubtless/doubtless/screens/auth/usecases/UserDataServerUseCase;", "userDataStorageUseCase", "Lcom/doubtless/doubtless/screens/auth/usecases/UserDataStorageUseCase;", "userManager", "Lcom/doubtless/doubtless/screens/auth/usecases/UserManager;", "getAddOnBoardingDataUseCase", "Lcom/doubtless/doubtless/screens/onboarding/usecases/AddOnBoardingDataUseCase;", "user", "Lcom/doubtless/doubtless/screens/auth/User;", "getAnalyticsTracker", "getAnswerVotingDoubtCase", "Lcom/doubtless/doubtless/screens/doubt/usecases/VotingUseCase;", "answerData", "Lcom/doubtless/doubtless/screens/answers/AnswerData;", "getCreateFragmentNavigator", "Lcom/doubtless/doubtless/navigation/FragNavigator;", "mainActivity", "Lcom/doubtless/doubtless/screens/main/MainActivity;", "getDashboardFragNavigator", "getDeleteAccountUseCase", "Lcom/doubtless/doubtless/screens/dashboard/usecases/DeleteAccountUseCase;", "getDoubtDataSharedPrefUseCase", "Lcom/doubtless/doubtless/screens/doubt/usecases/DoubtDataSharedPrefUseCase;", "getDoubtVotingDoubtCase", "doubtData", "Lcom/doubtless/doubtless/screens/doubt/DoubtData;", "getExtractKeywordsUseCase", "Lcom/doubtless/doubtless/screens/search/usecases/ExtractKeywordsUseCase;", "getFetchAnswerUseCase", "Lcom/doubtless/doubtless/screens/answers/usecases/FetchAnswerUseCase;", "doubtId", "getFetchDoubtDataFromDoubtIdUseCase", "Lcom/doubtless/doubtless/screens/doubt/usecases/FetchDoubtDataFromDoubtIdUseCase;", "getFetchFeedByDataUseCase", "Lcom/doubtless/doubtless/screens/home/usecases/FetchFeedByDateUseCase;", "getFetchFeedByPopularityUseCase", "Lcom/doubtless/doubtless/screens/home/usecases/FetchFeedByPopularityUseCase;", "getFetchFilterTagsUseCase", "Lcom/doubtless/doubtless/screens/doubt/usecases/FetchFilterTagsUseCase;", "getFetchHomeFeedUseCase", "Lcom/doubtless/doubtless/screens/home/usecases/FetchHomeFeedUseCase;", "feedConfig", "Lcom/doubtless/doubtless/screens/home/entities/FeedConfig;", "getFetchNotificationUseCase", "Lcom/doubtless/doubtless/screens/inAppNotification/usecases/FetchInAppNotificationUseCase;", "getFetchOnBoardingDataUseCase", "Lcom/doubtless/doubtless/screens/onboarding/usecases/FetchOnBoardingDataUseCase;", "getFetchSearchResultsUseCase", "Lcom/doubtless/doubtless/screens/search/usecases/FetchSearchResultsUseCase;", "getFetchUnreadNotificationUseCase", "Lcom/doubtless/doubtless/screens/inAppNotification/usecases/FetchUnreadNotificationUseCase;", "getFetchUserProfileFeedUseCase", "Lcom/doubtless/doubtless/screens/dashboard/usecases/FetchUserProfileFeedUseCase;", "getFragNavigator", "supportFragmentManager", "Landroidx/fragment/app/FragmentManager;", "containerId", "", "getGson", "Lcom/google/gson/Gson;", "getHomeFragNavigator", "getInAppFragNavigator", "getInAppNotificationDao", "Lcom/doubtless/doubtless/screens/inAppNotification/dao/InAppNotificationDao;", "getMarkInAppNotificationsReadUseCase", "Lcom/doubtless/doubtless/screens/inAppNotification/usecases/MarkInAppNotificationsReadUseCase;", "getMentorsWhoInteractedUseCase", "Lcom/doubtless/doubtless/screens/doubt/usecases/FetchInteractedMentorDataForDoubt;", "getPostDoubtUseCase", "Lcom/doubtless/doubtless/screens/doubt/usecases/PostDoubtUseCase;", "getPublishAnswerUseCase", "Lcom/doubtless/doubtless/screens/answers/usecases/PublishAnswerUseCase;", "getRemoteConfig", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "getServer", "getSharedPref", "Landroid/content/SharedPreferences;", "getUserDataServer", "getUserDataStorage", "getUserManager", "app_debug"})
public final class AppCompositionRoot {
    private com.doubtless.doubtless.analytics.AnalyticsTracker analyticsTracker;
    private final com.amplitude.android.Amplitude amplitude = null;
    private com.doubtless.doubtless.screens.auth.usecases.UserManager userManager;
    private com.doubtless.doubtless.screens.auth.usecases.UserDataStorageUseCase userDataStorageUseCase;
    private com.doubtless.doubtless.screens.auth.usecases.UserDataServerUseCase userDataServerUseCase;
    @org.jetbrains.annotations.NotNull
    private final com.doubtless.doubtless.navigation.Router router = null;
    private final java.lang.String BASE_URL = "https://asia-south1-doubtless-app.cloudfunctions.net/doubtless/api/";
    private com.doubtless.doubtless.network.DoubtlessServer doubtlessServer;
    
    public AppCompositionRoot(@org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.DoubtlessApp appContext) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.Synchronized
    public final synchronized com.doubtless.doubtless.analytics.AnalyticsTracker getAnalyticsTracker() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.doubtless.doubtless.screens.home.usecases.FetchHomeFeedUseCase getFetchHomeFeedUseCase(@org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.home.entities.FeedConfig feedConfig) {
        return null;
    }
    
    private final com.doubtless.doubtless.screens.home.usecases.FetchFeedByPopularityUseCase getFetchFeedByPopularityUseCase() {
        return null;
    }
    
    private final com.doubtless.doubtless.screens.home.usecases.FetchFeedByDateUseCase getFetchFeedByDataUseCase() {
        return null;
    }
    
    private final com.doubtless.doubtless.screens.doubt.usecases.FetchInteractedMentorDataForDoubt getMentorsWhoInteractedUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.doubtless.doubtless.screens.answers.usecases.FetchAnswerUseCase getFetchAnswerUseCase(@org.jetbrains.annotations.NotNull
    java.lang.String doubtId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.doubtless.doubtless.screens.answers.usecases.PublishAnswerUseCase getPublishAnswerUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.doubtless.doubtless.screens.search.usecases.ExtractKeywordsUseCase getExtractKeywordsUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.doubtless.doubtless.screens.search.usecases.FetchSearchResultsUseCase getFetchSearchResultsUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.doubtless.doubtless.screens.onboarding.usecases.FetchOnBoardingDataUseCase getFetchOnBoardingDataUseCase(@org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.auth.User user) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.doubtless.doubtless.screens.onboarding.usecases.AddOnBoardingDataUseCase getAddOnBoardingDataUseCase(@org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.auth.User user) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.doubtless.doubtless.screens.doubt.usecases.DoubtDataSharedPrefUseCase getDoubtDataSharedPrefUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.doubtless.doubtless.screens.doubt.usecases.PostDoubtUseCase getPostDoubtUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.doubtless.doubtless.screens.inAppNotification.usecases.FetchInAppNotificationUseCase getFetchNotificationUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.doubtless.doubtless.screens.inAppNotification.usecases.MarkInAppNotificationsReadUseCase getMarkInAppNotificationsReadUseCase() {
        return null;
    }
    
    private final com.doubtless.doubtless.screens.inAppNotification.usecases.FetchUnreadNotificationUseCase getFetchUnreadNotificationUseCase() {
        return null;
    }
    
    private final com.doubtless.doubtless.screens.inAppNotification.dao.InAppNotificationDao getInAppNotificationDao() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.doubtless.doubtless.screens.doubt.usecases.VotingUseCase getAnswerVotingDoubtCase(@org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.answers.AnswerData answerData) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.doubtless.doubtless.screens.doubt.usecases.VotingUseCase getDoubtVotingDoubtCase(@org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.doubt.DoubtData doubtData) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.doubtless.doubtless.screens.doubt.usecases.FetchDoubtDataFromDoubtIdUseCase getFetchDoubtDataFromDoubtIdUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.Synchronized
    public final synchronized com.doubtless.doubtless.screens.auth.usecases.UserManager getUserManager() {
        return null;
    }
    
    @kotlin.jvm.Synchronized
    private final synchronized com.doubtless.doubtless.screens.auth.usecases.UserDataStorageUseCase getUserDataStorage() {
        return null;
    }
    
    @kotlin.jvm.Synchronized
    private final synchronized com.doubtless.doubtless.screens.auth.usecases.UserDataServerUseCase getUserDataServer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.doubtless.doubtless.navigation.Router getRouter() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.doubtless.doubtless.navigation.FragNavigator getHomeFragNavigator(@org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.main.MainActivity mainActivity) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.doubtless.doubtless.navigation.FragNavigator getCreateFragmentNavigator(@org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.main.MainActivity mainActivity) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.doubtless.doubtless.navigation.FragNavigator getInAppFragNavigator(@org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.main.MainActivity mainActivity) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.doubtless.doubtless.navigation.FragNavigator getDashboardFragNavigator(@org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.main.MainActivity mainActivity) {
        return null;
    }
    
    private final com.doubtless.doubtless.navigation.FragNavigator getFragNavigator(androidx.fragment.app.FragmentManager supportFragmentManager, @androidx.annotation.IdRes
    int containerId) {
        return null;
    }
    
    private final android.content.SharedPreferences getSharedPref() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.Synchronized
    public final synchronized com.doubtless.doubtless.network.DoubtlessServer getServer() {
        return null;
    }
    
    private final com.google.gson.Gson getGson() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.firebase.remoteconfig.FirebaseRemoteConfig getRemoteConfig() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.doubtless.doubtless.screens.dashboard.usecases.FetchUserProfileFeedUseCase getFetchUserProfileFeedUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.doubtless.doubtless.screens.dashboard.usecases.DeleteAccountUseCase getDeleteAccountUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.doubtless.doubtless.screens.doubt.usecases.FetchFilterTagsUseCase getFetchFilterTagsUseCase() {
        return null;
    }
}