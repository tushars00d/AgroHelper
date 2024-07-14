package com.doubtless.doubtless.screens.doubt.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J$\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010#\u001a\u00020\u001aH\u0016J\u001a\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u001e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010&\u001a\u00020\u001a2\u0006\u0010\'\u001a\u00020\u0013H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/doubtless/doubtless/screens/doubt/view/ViewDoubtsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/doubtless/doubtless/databinding/FragmentViewDoubtsBinding;", "adapter", "Lcom/doubtless/doubtless/screens/common/GenericFeedAdapter;", "analyticsTracker", "Lcom/doubtless/doubtless/analytics/AnalyticsTracker;", "binding", "getBinding", "()Lcom/doubtless/doubtless/databinding/FragmentViewDoubtsBinding;", "feedConfig", "Lcom/doubtless/doubtless/screens/home/entities/FeedConfig;", "navigator", "Lcom/doubtless/doubtless/navigation/FragNavigator;", "remoteConfig", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "tag", "", "userManager", "Lcom/doubtless/doubtless/screens/auth/usecases/UserManager;", "viewModel", "Lcom/doubtless/doubtless/screens/doubt/view/ViewDoubtsViewModel;", "getViewModel", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onViewCreated", "view", "showToast", "msg", "app_debug"})
public final class ViewDoubtsFragment extends androidx.fragment.app.Fragment {
    private com.doubtless.doubtless.databinding.FragmentViewDoubtsBinding _binding;
    private com.doubtless.doubtless.screens.doubt.view.ViewDoubtsViewModel viewModel;
    private com.doubtless.doubtless.screens.common.GenericFeedAdapter adapter;
    private com.doubtless.doubtless.screens.auth.usecases.UserManager userManager;
    private com.doubtless.doubtless.analytics.AnalyticsTracker analyticsTracker;
    private com.doubtless.doubtless.navigation.FragNavigator navigator;
    private com.google.firebase.remoteconfig.FirebaseRemoteConfig remoteConfig;
    private com.doubtless.doubtless.screens.home.entities.FeedConfig feedConfig;
    private java.lang.String tag;
    
    public ViewDoubtsFragment() {
        super();
    }
    
    private final com.doubtless.doubtless.databinding.FragmentViewDoubtsBinding getBinding() {
        return null;
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void showToast(java.lang.String msg) {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    private final com.doubtless.doubtless.screens.doubt.view.ViewDoubtsViewModel getViewModel() {
        return null;
    }
}