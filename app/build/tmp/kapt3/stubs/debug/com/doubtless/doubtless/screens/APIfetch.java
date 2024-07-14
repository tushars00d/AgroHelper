package com.doubtless.doubtless.screens;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0012\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0015"}, d2 = {"Lcom/doubtless/doubtless/screens/APIfetch;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "linearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getLinearLayoutManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "setLinearLayoutManager", "(Landroidx/recyclerview/widget/LinearLayoutManager;)V", "myAdapter", "Lcom/doubtless/doubtless/screens/MyAdapter;", "getMyAdapter", "()Lcom/doubtless/doubtless/screens/MyAdapter;", "setMyAdapter", "(Lcom/doubtless/doubtless/screens/MyAdapter;)V", "getMyData", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"})
public final class APIfetch extends androidx.appcompat.app.AppCompatActivity {
    public com.doubtless.doubtless.screens.MyAdapter myAdapter;
    public androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager;
    @org.jetbrains.annotations.NotNull
    public static final com.doubtless.doubtless.screens.APIfetch.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String BASE_URL = "https://jsonplaceholder.typicode.com/";
    
    public APIfetch() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.doubtless.doubtless.screens.MyAdapter getMyAdapter() {
        return null;
    }
    
    public final void setMyAdapter(@org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.MyAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.recyclerview.widget.LinearLayoutManager getLinearLayoutManager() {
        return null;
    }
    
    public final void setLinearLayoutManager(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.LinearLayoutManager p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getMyData() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/doubtless/doubtless/screens/APIfetch$Companion;", "", "()V", "BASE_URL", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}