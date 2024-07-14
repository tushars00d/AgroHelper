package com.doubtless.doubtless.screens.search.usecases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\nB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/doubtless/doubtless/screens/search/usecases/FetchSearchResultsUseCase;", "", "server", "Lcom/doubtless/doubtless/network/DoubtlessServer;", "(Lcom/doubtless/doubtless/network/DoubtlessServer;)V", "getSearchResult", "Lcom/doubtless/doubtless/screens/search/usecases/FetchSearchResultsUseCase$Result;", "query", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Result", "app_debug"})
public final class FetchSearchResultsUseCase {
    private final com.doubtless.doubtless.network.DoubtlessServer server = null;
    
    public FetchSearchResultsUseCase(@org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.network.DoubtlessServer server) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getSearchResult(@org.jetbrains.annotations.NotNull
    java.lang.String query, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.doubtless.doubtless.screens.search.usecases.FetchSearchResultsUseCase.Result> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/doubtless/doubtless/screens/search/usecases/FetchSearchResultsUseCase$Result;", "", "()V", "Error", "Success", "Lcom/doubtless/doubtless/screens/search/usecases/FetchSearchResultsUseCase$Result$Error;", "Lcom/doubtless/doubtless/screens/search/usecases/FetchSearchResultsUseCase$Result$Success;", "app_debug"})
    public static abstract class Result {
        
        private Result() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/doubtless/doubtless/screens/search/usecases/FetchSearchResultsUseCase$Result$Success;", "Lcom/doubtless/doubtless/screens/search/usecases/FetchSearchResultsUseCase$Result;", "searchResult", "", "Lcom/doubtless/doubtless/screens/search/SearchResult;", "(Ljava/util/List;)V", "getSearchResult", "()Ljava/util/List;", "app_debug"})
        public static final class Success extends com.doubtless.doubtless.screens.search.usecases.FetchSearchResultsUseCase.Result {
            @org.jetbrains.annotations.NotNull
            private final java.util.List<com.doubtless.doubtless.screens.search.SearchResult> searchResult = null;
            
            public Success(@org.jetbrains.annotations.NotNull
            java.util.List<com.doubtless.doubtless.screens.search.SearchResult> searchResult) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.util.List<com.doubtless.doubtless.screens.search.SearchResult> getSearchResult() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/doubtless/doubtless/screens/search/usecases/FetchSearchResultsUseCase$Result$Error;", "Lcom/doubtless/doubtless/screens/search/usecases/FetchSearchResultsUseCase$Result;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "app_debug"})
        public static final class Error extends com.doubtless.doubtless.screens.search.usecases.FetchSearchResultsUseCase.Result {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String message = null;
            
            public Error(@org.jetbrains.annotations.NotNull
            java.lang.String message) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getMessage() {
                return null;
            }
        }
    }
}