package com.doubtless.doubtless.theming.retro;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001$B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u001d\u001a\u00020\u001eH\u0004J\b\u0010\u001f\u001a\u00020\u001eH\u0004J\b\u0010 \u001a\u00020\u001eH\u0014J\u0012\u0010!\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\bX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/doubtless/doubtless/theming/retro/RetroLayout;", "Landroidx/cardview/widget/CardView;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "animUpUnconsumed", "", "bottomShadow", "Landroid/view/View;", "contentContainer", "contentDisplacement", "", "currState", "Lcom/doubtless/doubtless/theming/retro/RetroLayout$STATE;", "duration", "", "isPlainStyled", "lastClicked", "root", "shadowDisplacement", "shouldPerformUpAnimationWhenReleased", "getShouldPerformUpAnimationWhenReleased", "()Z", "setShouldPerformUpAnimationWhenReleased", "(Z)V", "sideShadow", "space", "animateDown", "", "animateUp", "onAttachedToWindow", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "STATE", "app_debug"})
public class RetroLayout extends androidx.cardview.widget.CardView {
    private final android.view.View root = null;
    private final androidx.cardview.widget.CardView contentContainer = null;
    private final android.view.View sideShadow = null;
    private final android.view.View bottomShadow = null;
    private final boolean isPlainStyled = false;
    private long lastClicked;
    private final long duration = 90L;
    private boolean animUpUnconsumed = false;
    private com.doubtless.doubtless.theming.retro.RetroLayout.STATE currState = com.doubtless.doubtless.theming.retro.RetroLayout.STATE.RELEASED;
    private boolean shouldPerformUpAnimationWhenReleased = true;
    private final float space = 0.0F;
    private final float contentDisplacement = 0.0F;
    private final float shadowDisplacement = 0.0F;
    
    public RetroLayout(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attributeSet) {
        super(null);
    }
    
    @java.lang.Override
    protected void onAttachedToWindow() {
    }
    
    protected final boolean getShouldPerformUpAnimationWhenReleased() {
        return false;
    }
    
    protected final void setShouldPerformUpAnimationWhenReleased(boolean p0) {
    }
    
    @java.lang.Override
    public boolean onTouchEvent(@org.jetbrains.annotations.Nullable
    android.view.MotionEvent event) {
        return false;
    }
    
    protected final void animateDown() {
    }
    
    protected final void animateUp() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0084\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/doubtless/doubtless/theming/retro/RetroLayout$STATE;", "", "(Ljava/lang/String;I)V", "PRESSING", "PRESSED", "RELEASING", "RELEASED", "app_debug"})
    public static enum STATE {
        /*public static final*/ PRESSING /* = new PRESSING() */,
        /*public static final*/ PRESSED /* = new PRESSED() */,
        /*public static final*/ RELEASING /* = new RELEASING() */,
        /*public static final*/ RELEASED /* = new RELEASED() */;
        
        STATE() {
        }
    }
}