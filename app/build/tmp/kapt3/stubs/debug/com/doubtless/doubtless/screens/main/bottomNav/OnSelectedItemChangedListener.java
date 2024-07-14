package com.doubtless.doubtless.screens.main.bottomNav;

import java.lang.System;

/**
 * gets triggered also when the initial default index is selected without user interaction
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/doubtless/doubtless/screens/main/bottomNav/OnSelectedItemChangedListener;", "", "onNewSelectedIndex", "", "newIndex", "", "app_debug"})
public abstract interface OnSelectedItemChangedListener {
    
    public abstract void onNewSelectedIndex(int newIndex);
}