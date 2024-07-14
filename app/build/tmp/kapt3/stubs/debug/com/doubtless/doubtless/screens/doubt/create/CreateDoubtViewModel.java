package com.doubtless.doubtless.screens.doubt.create;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0002\u0010\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/doubtless/doubtless/screens/doubt/create/CreateDoubtViewModel;", "Landroidx/lifecycle/ViewModel;", "postDoubtUseCase", "Lcom/doubtless/doubtless/screens/doubt/usecases/PostDoubtUseCase;", "(Lcom/doubtless/doubtless/screens/doubt/usecases/PostDoubtUseCase;)V", "_postDoubtStatus", "Landroidx/lifecycle/MutableLiveData;", "Lcom/doubtless/doubtless/screens/doubt/create/CreateDoubtViewModel$Result;", "postDoubtStatus", "Landroidx/lifecycle/LiveData;", "getPostDoubtStatus", "()Landroidx/lifecycle/LiveData;", "postDoubt", "Lkotlinx/coroutines/Job;", "publishDoubtRequest", "Lcom/doubtless/doubtless/screens/doubt/PublishDoubtRequest;", "Companion", "Result", "app_debug"})
public final class CreateDoubtViewModel extends androidx.lifecycle.ViewModel {
    private final com.doubtless.doubtless.screens.doubt.usecases.PostDoubtUseCase postDoubtUseCase = null;
    private final androidx.lifecycle.MutableLiveData<com.doubtless.doubtless.screens.doubt.create.CreateDoubtViewModel.Result> _postDoubtStatus = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.doubtless.doubtless.screens.doubt.create.CreateDoubtViewModel.Result> postDoubtStatus = null;
    @org.jetbrains.annotations.NotNull
    public static final com.doubtless.doubtless.screens.doubt.create.CreateDoubtViewModel.Companion Companion = null;
    
    public CreateDoubtViewModel(@org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.doubt.usecases.PostDoubtUseCase postDoubtUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.doubtless.doubtless.screens.doubt.create.CreateDoubtViewModel.Result> getPostDoubtStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job postDoubt(@org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.doubt.PublishDoubtRequest publishDoubtRequest) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/doubtless/doubtless/screens/doubt/create/CreateDoubtViewModel$Result;", "", "()V", "Error", "Success", "Lcom/doubtless/doubtless/screens/doubt/create/CreateDoubtViewModel$Result$Error;", "Lcom/doubtless/doubtless/screens/doubt/create/CreateDoubtViewModel$Result$Success;", "app_debug"})
    public static abstract class Result {
        
        private Result() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/doubtless/doubtless/screens/doubt/create/CreateDoubtViewModel$Result$Success;", "Lcom/doubtless/doubtless/screens/doubt/create/CreateDoubtViewModel$Result;", "()V", "app_debug"})
        public static final class Success extends com.doubtless.doubtless.screens.doubt.create.CreateDoubtViewModel.Result {
            @org.jetbrains.annotations.NotNull
            public static final com.doubtless.doubtless.screens.doubt.create.CreateDoubtViewModel.Result.Success INSTANCE = null;
            
            private Success() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/doubtless/doubtless/screens/doubt/create/CreateDoubtViewModel$Result$Error;", "Lcom/doubtless/doubtless/screens/doubt/create/CreateDoubtViewModel$Result;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "app_debug"})
        public static final class Error extends com.doubtless.doubtless.screens.doubt.create.CreateDoubtViewModel.Result {
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
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/doubtless/doubtless/screens/doubt/create/CreateDoubtViewModel$Companion;", "", "()V", "Factory", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u0002H\u0006\"\b\b\u0000\u0010\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\tH\u0016\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/doubtless/doubtless/screens/doubt/create/CreateDoubtViewModel$Companion$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "postDoubtUseCase", "Lcom/doubtless/doubtless/screens/doubt/usecases/PostDoubtUseCase;", "(Lcom/doubtless/doubtless/screens/doubt/usecases/PostDoubtUseCase;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
        public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
            private final com.doubtless.doubtless.screens.doubt.usecases.PostDoubtUseCase postDoubtUseCase = null;
            
            public Factory(@org.jetbrains.annotations.NotNull
            com.doubtless.doubtless.screens.doubt.usecases.PostDoubtUseCase postDoubtUseCase) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull
            java.lang.Class<T> modelClass) {
                return null;
            }
        }
    }
}