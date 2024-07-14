package com.doubtless.doubtless.screens.home.entities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J+\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lcom/doubtless/doubtless/screens/home/entities/FeedEntity;", "", "type", "", "doubt", "Lcom/doubtless/doubtless/screens/doubt/DoubtData;", "search_doubt", "Lcom/doubtless/doubtless/screens/search/SearchResult;", "(ILcom/doubtless/doubtless/screens/doubt/DoubtData;Lcom/doubtless/doubtless/screens/search/SearchResult;)V", "getDoubt", "()Lcom/doubtless/doubtless/screens/doubt/DoubtData;", "getSearch_doubt", "()Lcom/doubtless/doubtless/screens/search/SearchResult;", "getType", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "app_debug"})
public final class FeedEntity {
    private final int type = 0;
    @org.jetbrains.annotations.Nullable
    private final com.doubtless.doubtless.screens.doubt.DoubtData doubt = null;
    @org.jetbrains.annotations.Nullable
    private final com.doubtless.doubtless.screens.search.SearchResult search_doubt = null;
    @org.jetbrains.annotations.NotNull
    public static final com.doubtless.doubtless.screens.home.entities.FeedEntity.Companion Companion = null;
    public static final int TYPE_DOUBT = 1;
    public static final int TYPE_SEARCH_RESULT = 2;
    public static final int TYPE_USER_PROFILE = 3;
    
    @org.jetbrains.annotations.NotNull
    public final com.doubtless.doubtless.screens.home.entities.FeedEntity copy(int type, @org.jetbrains.annotations.Nullable
    com.doubtless.doubtless.screens.doubt.DoubtData doubt, @org.jetbrains.annotations.Nullable
    com.doubtless.doubtless.screens.search.SearchResult search_doubt) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public FeedEntity(int type, @org.jetbrains.annotations.Nullable
    com.doubtless.doubtless.screens.doubt.DoubtData doubt, @org.jetbrains.annotations.Nullable
    com.doubtless.doubtless.screens.search.SearchResult search_doubt) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getType() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.doubtless.doubtless.screens.doubt.DoubtData component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.doubtless.doubtless.screens.doubt.DoubtData getDoubt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.doubtless.doubtless.screens.search.SearchResult component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.doubtless.doubtless.screens.search.SearchResult getSearch_doubt() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/doubtless/doubtless/screens/home/entities/FeedEntity$Companion;", "", "()V", "TYPE_DOUBT", "", "TYPE_SEARCH_RESULT", "TYPE_USER_PROFILE", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}