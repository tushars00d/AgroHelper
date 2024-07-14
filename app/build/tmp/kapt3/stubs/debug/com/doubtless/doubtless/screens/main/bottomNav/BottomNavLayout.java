package com.doubtless.doubtless.screens.main.bottomNav;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u0011H\u0002J\u0006\u0010\u0012\u001a\u00020\bJ\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0014J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\bH\u0002J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\bH\u0002J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\fH\u0002J\u000e\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000fJ\u0018\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\fH\u0002R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\tR\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/doubtless/doubtless/screens/main/bottomNav/BottomNavLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "currentSelectedIndex", "", "Ljava/lang/Integer;", "elements", "Ljava/util/ArrayList;", "Lcom/doubtless/doubtless/screens/main/bottomNav/BottomIntractableElement;", "Lkotlin/collections/ArrayList;", "onSelectedItemChangedListener", "Lcom/doubtless/doubtless/screens/main/bottomNav/OnSelectedItemChangedListener;", "findBottomNavElements", "", "getCurrentSelectedIndex", "notifyAllUnSelectedElements", "", "onAttachedToWindow", "onNewSelectedIndex", "index", "performUiUpdateOnIndexSelection", "selectedIndex", "performUiUpdateOnIndexUnSelection", "element", "setOnSelectedItemChangedListener", "setSelectStateOfSelectedItemAndNotifyUnselectedForElse", "idx", "clickedBtn", "app_debug"})
public final class BottomNavLayout extends androidx.constraintlayout.widget.ConstraintLayout {
    private java.lang.Integer currentSelectedIndex;
    private final java.util.ArrayList<com.doubtless.doubtless.screens.main.bottomNav.BottomIntractableElement> elements = null;
    private com.doubtless.doubtless.screens.main.bottomNav.OnSelectedItemChangedListener onSelectedItemChangedListener;
    
    public BottomNavLayout(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.util.AttributeSet attributeSet) {
        super(null);
    }
    
    @java.lang.Override
    protected void onAttachedToWindow() {
    }
    
    private final void onNewSelectedIndex(int index) {
    }
    
    private final void notifyAllUnSelectedElements() {
    }
    
    private final void setSelectStateOfSelectedItemAndNotifyUnselectedForElse(int idx, com.doubtless.doubtless.screens.main.bottomNav.BottomIntractableElement clickedBtn) {
    }
    
    private final void performUiUpdateOnIndexSelection(int selectedIndex) {
    }
    
    private final void performUiUpdateOnIndexUnSelection(com.doubtless.doubtless.screens.main.bottomNav.BottomIntractableElement element) {
    }
    
    private final java.util.List<com.doubtless.doubtless.screens.main.bottomNav.BottomIntractableElement> findBottomNavElements() {
        return null;
    }
    
    public final int getCurrentSelectedIndex() {
        return 0;
    }
    
    public final void setOnSelectedItemChangedListener(@org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.main.bottomNav.OnSelectedItemChangedListener onSelectedItemChangedListener) {
    }
}