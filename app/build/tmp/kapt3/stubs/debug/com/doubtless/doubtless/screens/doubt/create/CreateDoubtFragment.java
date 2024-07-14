package com.doubtless.doubtless.screens.doubt.create;

import java.lang.System;

/**
 * NOTE : right now this fragment only opens up from bottom nav so the navigation functionality is coded assuming that.
 * change things in future if this assumption changes.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u00a0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u00104\u001a\u000205H\u0002J<\u00106\u001a\u0002052\u0006\u00107\u001a\u00020\u00122\u0006\u00108\u001a\u00020\u00122\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00120:2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00120:2\u0006\u0010<\u001a\u00020=H\u0002J\b\u0010>\u001a\u000205H\u0002J\u000e\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00120:H\u0002J\n\u0010@\u001a\u0004\u0018\u00010\u0012H\u0002J\u0012\u0010A\u001a\u0002052\b\u0010B\u001a\u0004\u0018\u00010CH\u0016J$\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020G2\b\u0010H\u001a\u0004\u0018\u00010I2\b\u0010B\u001a\u0004\u0018\u00010CH\u0016J\b\u0010J\u001a\u000205H\u0016J\b\u0010K\u001a\u000205H\u0016J\b\u0010L\u001a\u000205H\u0016J\u001a\u0010M\u001a\u0002052\u0006\u0010N\u001a\u00020E2\b\u0010B\u001a\u0004\u0018\u00010CH\u0016J \u0010O\u001a\u0002052\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u0014H\u0002J$\u0010P\u001a\u0002052\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00120:2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00120:H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00148B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R+\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00148B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001d\u0010\u0017\"\u0004\b\u001e\u0010\u0019R+\u0010 \u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00148B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b#\u0010\u001b\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\'X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006Q"}, d2 = {"Lcom/doubtless/doubtless/screens/doubt/create/CreateDoubtFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/doubtless/doubtless/databinding/FragmentCreateDoubtBinding;", "analyticsTracker", "Lcom/doubtless/doubtless/analytics/AnalyticsTracker;", "binding", "getBinding", "()Lcom/doubtless/doubtless/databinding/FragmentCreateDoubtBinding;", "db", "Lcom/google/firebase/firestore/FirebaseFirestore;", "doubtDataSharedPrefUseCase", "Lcom/doubtless/doubtless/screens/doubt/usecases/DoubtDataSharedPrefUseCase;", "isButtonClicked", "", "keywordsEntered", "", "", "<set-?>", "", "maxDescriptionCharLimit", "getMaxDescriptionCharLimit", "()I", "setMaxDescriptionCharLimit", "(I)V", "maxDescriptionCharLimit$delegate", "Lkotlin/properties/ReadWriteProperty;", "maxHeadingCharLimit", "getMaxHeadingCharLimit", "setMaxHeadingCharLimit", "maxHeadingCharLimit$delegate", "maxKeywordsLimit", "getMaxKeywordsLimit", "setMaxKeywordsLimit", "maxKeywordsLimit$delegate", "navigator", "Lcom/doubtless/doubtless/navigation/FragNavigator;", "onBackPressListener", "Lcom/doubtless/doubtless/navigation/OnBackPressListener;", "onBoardingAttributes", "Lcom/doubtless/doubtless/screens/onboarding/OnBoardingAttributes;", "onBoardingDataUseCase", "Lcom/doubtless/doubtless/screens/onboarding/usecases/FetchOnBoardingDataUseCase;", "postDoubtUseCase", "Lcom/doubtless/doubtless/screens/doubt/usecases/PostDoubtUseCase;", "remoteConfig", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "userManager", "Lcom/doubtless/doubtless/screens/auth/usecases/UserManager;", "viewModel", "Lcom/doubtless/doubtless/screens/doubt/create/CreateDoubtViewModel;", "checkText", "", "createDoubt", "heading", "description", "tags", "", "keywords", "user", "Lcom/doubtless/doubtless/screens/auth/User;", "getMaxCharacterLimit", "getSelectedTags", "isEverythingValid", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onPause", "onResume", "onViewCreated", "view", "setMaxCharacterLimit", "showConfirmationDialog", "app_debug"})
public final class CreateDoubtFragment extends androidx.fragment.app.Fragment {
    private com.doubtless.doubtless.databinding.FragmentCreateDoubtBinding _binding;
    private com.google.firebase.firestore.FirebaseFirestore db;
    private com.doubtless.doubtless.screens.doubt.create.CreateDoubtViewModel viewModel;
    private com.doubtless.doubtless.screens.auth.usecases.UserManager userManager;
    private com.doubtless.doubtless.analytics.AnalyticsTracker analyticsTracker;
    private com.doubtless.doubtless.screens.doubt.usecases.PostDoubtUseCase postDoubtUseCase;
    private com.google.firebase.remoteconfig.FirebaseRemoteConfig remoteConfig;
    private com.doubtless.doubtless.navigation.FragNavigator navigator;
    private final kotlin.properties.ReadWriteProperty maxHeadingCharLimit$delegate = null;
    private final kotlin.properties.ReadWriteProperty maxDescriptionCharLimit$delegate = null;
    private final kotlin.properties.ReadWriteProperty maxKeywordsLimit$delegate = null;
    private boolean isButtonClicked = false;
    private final java.util.List<java.lang.String> keywordsEntered = null;
    private com.doubtless.doubtless.screens.doubt.usecases.DoubtDataSharedPrefUseCase doubtDataSharedPrefUseCase;
    private com.doubtless.doubtless.screens.onboarding.usecases.FetchOnBoardingDataUseCase onBoardingDataUseCase;
    private com.doubtless.doubtless.screens.onboarding.OnBoardingAttributes onBoardingAttributes;
    private final com.doubtless.doubtless.navigation.OnBackPressListener onBackPressListener = null;
    
    public CreateDoubtFragment() {
        super();
    }
    
    private final com.doubtless.doubtless.databinding.FragmentCreateDoubtBinding getBinding() {
        return null;
    }
    
    private final int getMaxHeadingCharLimit() {
        return 0;
    }
    
    private final void setMaxHeadingCharLimit(int p0) {
    }
    
    private final int getMaxDescriptionCharLimit() {
        return 0;
    }
    
    private final void setMaxDescriptionCharLimit(int p0) {
    }
    
    private final int getMaxKeywordsLimit() {
        return 0;
    }
    
    private final void setMaxKeywordsLimit(int p0) {
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
    
    @java.lang.Override
    public void onResume() {
    }
    
    @java.lang.Override
    public void onPause() {
    }
    
    private final void checkText() {
    }
    
    private final java.lang.String isEverythingValid() {
        return null;
    }
    
    private final java.util.List<java.lang.String> getSelectedTags() {
        return null;
    }
    
    private final void showConfirmationDialog(java.util.List<java.lang.String> tags, java.util.List<java.lang.String> keywords) {
    }
    
    private final void getMaxCharacterLimit() {
    }
    
    private final void setMaxCharacterLimit(int maxHeadingCharLimit, int maxDescriptionCharLimit, int maxKeywordsLimit) {
    }
    
    private final void createDoubt(java.lang.String heading, java.lang.String description, java.util.List<java.lang.String> tags, java.util.List<java.lang.String> keywords, com.doubtless.doubtless.screens.auth.User user) {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
}