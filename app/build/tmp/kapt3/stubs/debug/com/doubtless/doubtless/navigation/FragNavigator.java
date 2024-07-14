package com.doubtless.doubtless.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\bJ\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/doubtless/doubtless/navigation/FragNavigator;", "", "containerId", "", "supportFragmentManager", "Landroidx/fragment/app/FragmentManager;", "(ILandroidx/fragment/app/FragmentManager;)V", "moveToDoubtDetailFragment", "", "doubtData", "Lcom/doubtless/doubtless/screens/doubt/DoubtData;", "moveToOtherUsersProfileFragment", "userId", "", "moveToSearchFragment", "onBackPress", "", "app_debug"})
public final class FragNavigator {
    private final int containerId = 0;
    private final androidx.fragment.app.FragmentManager supportFragmentManager = null;
    
    public FragNavigator(@androidx.annotation.IdRes
    int containerId, @org.jetbrains.annotations.NotNull
    androidx.fragment.app.FragmentManager supportFragmentManager) {
        super();
    }
    
    public final boolean onBackPress() {
        return false;
    }
    
    public final void moveToSearchFragment() {
    }
    
    public final void moveToDoubtDetailFragment(@org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.doubt.DoubtData doubtData) {
    }
    
    public final void moveToOtherUsersProfileFragment(@org.jetbrains.annotations.NotNull
    java.lang.String userId) {
    }
}