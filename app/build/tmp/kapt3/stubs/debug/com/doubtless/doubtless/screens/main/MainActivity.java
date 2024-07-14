package com.doubtless.doubtless.screens.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\t\u001a\u0004\u0018\u00010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0006H\u0016J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0006H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/doubtless/doubtless/screens/main/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/doubtless/doubtless/navigation/BackPressDispatcher;", "()V", "backPressListeners", "", "Lcom/doubtless/doubtless/navigation/OnBackPressListener;", "binding", "Lcom/doubtless/doubtless/databinding/ActivityMainBinding;", "getMainFragment", "Lcom/doubtless/doubtless/screens/main/MainFragment;", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "registerBackPress", "listener", "unregisterBackPress", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements com.doubtless.doubtless.navigation.BackPressDispatcher {
    private com.doubtless.doubtless.databinding.ActivityMainBinding binding;
    private final java.util.List<com.doubtless.doubtless.navigation.OnBackPressListener> backPressListeners = null;
    
    public MainActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.doubtless.doubtless.screens.main.MainFragment getMainFragment() {
        return null;
    }
    
    @java.lang.Override
    public void registerBackPress(@org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.navigation.OnBackPressListener listener) {
    }
    
    @java.lang.Override
    public void unregisterBackPress(@org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.navigation.OnBackPressListener listener) {
    }
    
    @java.lang.Override
    public void onBackPressed() {
    }
}