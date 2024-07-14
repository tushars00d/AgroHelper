package com.doubtless.doubtless.screens.answers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\rH\u0002J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J&\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u001f\u001a\u00020\u0016H\u0016J\u001a\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u001a2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/doubtless/doubtless/screens/answers/AnswersFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/doubtless/doubtless/databinding/FragmentAnswersBinding;", "adapter", "Lcom/doubtless/doubtless/screens/answers/AnswerDoubtsAdapter;", "analyticsTracker", "Lcom/doubtless/doubtless/analytics/AnalyticsTracker;", "binding", "getBinding", "()Lcom/doubtless/doubtless/databinding/FragmentAnswersBinding;", "doubtData", "Lcom/doubtless/doubtless/screens/doubt/DoubtData;", "navigator", "Lcom/doubtless/doubtless/navigation/FragNavigator;", "userManager", "Lcom/doubtless/doubtless/screens/auth/usecases/UserManager;", "viewModel", "Lcom/doubtless/doubtless/screens/answers/AnswersViewModel;", "getViewModel", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onViewCreated", "view", "Companion", "app_debug"})
public final class AnswersFragment extends androidx.fragment.app.Fragment {
    private com.doubtless.doubtless.databinding.FragmentAnswersBinding _binding;
    private com.doubtless.doubtless.screens.answers.AnswersViewModel viewModel;
    private com.doubtless.doubtless.screens.answers.AnswerDoubtsAdapter adapter;
    private com.doubtless.doubtless.screens.auth.usecases.UserManager userManager;
    private com.doubtless.doubtless.analytics.AnalyticsTracker analyticsTracker;
    private com.doubtless.doubtless.navigation.FragNavigator navigator;
    private com.doubtless.doubtless.screens.doubt.DoubtData doubtData;
    @org.jetbrains.annotations.NotNull
    public static final com.doubtless.doubtless.screens.answers.AnswersFragment.Companion Companion = null;
    
    public AnswersFragment() {
        super();
    }
    
    private final com.doubtless.doubtless.databinding.FragmentAnswersBinding getBinding() {
        return null;
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable
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
    
    private final com.doubtless.doubtless.screens.answers.AnswersViewModel getViewModel(com.doubtless.doubtless.screens.doubt.DoubtData doubtData) {
        return null;
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/doubtless/doubtless/screens/answers/AnswersFragment$Companion;", "", "()V", "getInstance", "Lcom/doubtless/doubtless/screens/answers/AnswersFragment;", "doubtData", "Lcom/doubtless/doubtless/screens/doubt/DoubtData;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.doubtless.doubtless.screens.answers.AnswersFragment getInstance(@org.jetbrains.annotations.NotNull
        com.doubtless.doubtless.screens.doubt.DoubtData doubtData) {
            return null;
        }
    }
}