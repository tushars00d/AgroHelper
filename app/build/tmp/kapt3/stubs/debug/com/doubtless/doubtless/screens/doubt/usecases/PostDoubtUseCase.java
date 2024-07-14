package com.doubtless.doubtless.screens.doubt.usecases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\nB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/doubtless/doubtless/screens/doubt/usecases/PostDoubtUseCase;", "", "server", "Lcom/doubtless/doubtless/network/DoubtlessServer;", "(Lcom/doubtless/doubtless/network/DoubtlessServer;)V", "post", "Lcom/doubtless/doubtless/screens/doubt/usecases/PostDoubtUseCase$Result;", "request", "Lcom/doubtless/doubtless/screens/doubt/PublishDoubtRequest;", "(Lcom/doubtless/doubtless/screens/doubt/PublishDoubtRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Result", "app_debug"})
public final class PostDoubtUseCase {
    private final com.doubtless.doubtless.network.DoubtlessServer server = null;
    
    public PostDoubtUseCase(@org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.network.DoubtlessServer server) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object post(@org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.doubt.PublishDoubtRequest request, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.doubtless.doubtless.screens.doubt.usecases.PostDoubtUseCase.Result> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/doubtless/doubtless/screens/doubt/usecases/PostDoubtUseCase$Result;", "", "()V", "Error", "Success", "Lcom/doubtless/doubtless/screens/doubt/usecases/PostDoubtUseCase$Result$Error;", "Lcom/doubtless/doubtless/screens/doubt/usecases/PostDoubtUseCase$Result$Success;", "app_debug"})
    public static abstract class Result {
        
        private Result() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/doubtless/doubtless/screens/doubt/usecases/PostDoubtUseCase$Result$Success;", "Lcom/doubtless/doubtless/screens/doubt/usecases/PostDoubtUseCase$Result;", "()V", "app_debug"})
        public static final class Success extends com.doubtless.doubtless.screens.doubt.usecases.PostDoubtUseCase.Result {
            @org.jetbrains.annotations.NotNull
            public static final com.doubtless.doubtless.screens.doubt.usecases.PostDoubtUseCase.Result.Success INSTANCE = null;
            
            private Success() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/doubtless/doubtless/screens/doubt/usecases/PostDoubtUseCase$Result$Error;", "Lcom/doubtless/doubtless/screens/doubt/usecases/PostDoubtUseCase$Result;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "app_debug"})
        public static final class Error extends com.doubtless.doubtless.screens.doubt.usecases.PostDoubtUseCase.Result {
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