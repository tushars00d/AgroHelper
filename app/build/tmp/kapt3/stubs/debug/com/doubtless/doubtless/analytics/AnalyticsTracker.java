package com.doubtless.doubtless.analytics;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH\u0002J\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u000bJ\u0006\u0010\u0014\u001a\u00020\u000bJ\u0006\u0010\u0015\u001a\u00020\u000bJ\u000e\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u000bJ\u0006\u0010\u001a\u001a\u00020\u000bJ\u000e\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/doubtless/doubtless/analytics/AnalyticsTracker;", "", "amplitude", "Lcom/amplitude/android/Amplitude;", "userManager", "Lcom/doubtless/doubtless/screens/auth/usecases/UserManager;", "(Lcom/amplitude/android/Amplitude;Lcom/doubtless/doubtless/screens/auth/usecases/UserManager;)V", "getCommonAttrs", "", "", "trackAppLaunch", "", "trackDoubtDownVoted", "doubtData", "Lcom/doubtless/doubtless/screens/doubt/DoubtData;", "trackDoubtUpVoted", "trackFeedNextPage", "listSize", "", "trackFeedRefresh", "trackFeedbackButtonClicked", "trackLoginStarted", "trackLoginSuccess", "isNewUser", "", "trackLogout", "trackPostDoubtButtonClicked", "trackSearchedDoubtClicked", "trackTagsFragment", "tag", "app_debug"})
public final class AnalyticsTracker {
    private final com.amplitude.android.Amplitude amplitude = null;
    private final com.doubtless.doubtless.screens.auth.usecases.UserManager userManager = null;
    
    public AnalyticsTracker(@org.jetbrains.annotations.NotNull
    com.amplitude.android.Amplitude amplitude, @org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.auth.usecases.UserManager userManager) {
        super();
    }
    
    public final void trackTagsFragment(@org.jetbrains.annotations.NotNull
    java.lang.String tag) {
    }
    
    public final void trackLoginStarted() {
    }
    
    public final void trackLoginSuccess(boolean isNewUser) {
    }
    
    public final void trackLogout() {
    }
    
    public final void trackFeedbackButtonClicked() {
    }
    
    public final void trackPostDoubtButtonClicked() {
    }
    
    public final void trackAppLaunch() {
    }
    
    public final void trackFeedRefresh() {
    }
    
    public final void trackFeedNextPage(int listSize) {
    }
    
    public final void trackDoubtUpVoted(@org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.doubt.DoubtData doubtData) {
    }
    
    public final void trackDoubtDownVoted(@org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.doubt.DoubtData doubtData) {
    }
    
    public final void trackSearchedDoubtClicked(@org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.doubt.DoubtData doubtData) {
    }
    
    private final java.util.Map<java.lang.String, java.lang.String> getCommonAttrs() {
        return null;
    }
}