package com.doubtless.doubtless.screens.doubt.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000e\u001a\u00020\u000fR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0011"}, d2 = {"Lcom/doubtless/doubtless/screens/doubt/view/HomeMainScreenViewModel;", "Landroidx/lifecycle/ViewModel;", "fetchFilterTagsUseCase", "Lcom/doubtless/doubtless/screens/doubt/usecases/FetchFilterTagsUseCase;", "(Lcom/doubtless/doubtless/screens/doubt/usecases/FetchFilterTagsUseCase;)V", "_tags", "Landroidx/lifecycle/MutableLiveData;", "", "", "startTags", "tags", "Landroidx/lifecycle/LiveData;", "getTags", "()Landroidx/lifecycle/LiveData;", "fetchTags", "Lkotlinx/coroutines/Job;", "Companion", "app_debug"})
public final class HomeMainScreenViewModel extends androidx.lifecycle.ViewModel {
    private final com.doubtless.doubtless.screens.doubt.usecases.FetchFilterTagsUseCase fetchFilterTagsUseCase = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> _tags = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<java.lang.String>> tags = null;
    private final java.util.List<java.lang.String> startTags = null;
    @org.jetbrains.annotations.NotNull
    public static final com.doubtless.doubtless.screens.doubt.view.HomeMainScreenViewModel.Companion Companion = null;
    
    public HomeMainScreenViewModel(@org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.doubt.usecases.FetchFilterTagsUseCase fetchFilterTagsUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<java.lang.String>> getTags() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job fetchTags() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/doubtless/doubtless/screens/doubt/view/HomeMainScreenViewModel$Companion;", "", "()V", "Factory", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u0002H\u0006\"\b\b\u0000\u0010\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\tH\u0016\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/doubtless/doubtless/screens/doubt/view/HomeMainScreenViewModel$Companion$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "fetchFilterTagsUseCase", "Lcom/doubtless/doubtless/screens/doubt/usecases/FetchFilterTagsUseCase;", "(Lcom/doubtless/doubtless/screens/doubt/usecases/FetchFilterTagsUseCase;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
        public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
            private final com.doubtless.doubtless.screens.doubt.usecases.FetchFilterTagsUseCase fetchFilterTagsUseCase = null;
            
            public Factory(@org.jetbrains.annotations.NotNull
            com.doubtless.doubtless.screens.doubt.usecases.FetchFilterTagsUseCase fetchFilterTagsUseCase) {
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