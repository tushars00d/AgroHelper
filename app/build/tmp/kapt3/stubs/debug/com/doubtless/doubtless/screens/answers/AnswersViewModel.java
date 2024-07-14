package com.doubtless.doubtless.screens.answers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001d\u001eB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/doubtless/doubtless/screens/answers/AnswersViewModel;", "Landroidx/lifecycle/ViewModel;", "fetchAnswerUseCase", "Lcom/doubtless/doubtless/screens/answers/usecases/FetchAnswerUseCase;", "publishAnswerUseCase", "Lcom/doubtless/doubtless/screens/answers/usecases/PublishAnswerUseCase;", "userManager", "Lcom/doubtless/doubtless/screens/auth/usecases/UserManager;", "doubtData", "Lcom/doubtless/doubtless/screens/doubt/DoubtData;", "(Lcom/doubtless/doubtless/screens/answers/usecases/FetchAnswerUseCase;Lcom/doubtless/doubtless/screens/answers/usecases/PublishAnswerUseCase;Lcom/doubtless/doubtless/screens/auth/usecases/UserManager;Lcom/doubtless/doubtless/screens/doubt/DoubtData;)V", "_answerDoubtEntities", "Landroidx/lifecycle/MutableLiveData;", "Lcom/doubtless/doubtless/screens/answers/AnswersViewModel$Result;", "_publishAnswerStatus", "Lcom/doubtless/doubtless/screens/answers/usecases/PublishAnswerUseCase$Result;", "answerDoubtEntities", "Landroidx/lifecycle/LiveData;", "getAnswerDoubtEntities", "()Landroidx/lifecycle/LiveData;", "publishAnswerStatus", "getPublishAnswerStatus", "fetchAnswers", "Lkotlinx/coroutines/Job;", "notifyAnswersConsumed", "", "publishAnswer", "publishAnswerRequest", "Lcom/doubtless/doubtless/screens/answers/PublishAnswerRequest;", "Companion", "Result", "app_debug"})
public final class AnswersViewModel extends androidx.lifecycle.ViewModel {
    private final com.doubtless.doubtless.screens.answers.usecases.FetchAnswerUseCase fetchAnswerUseCase = null;
    private final com.doubtless.doubtless.screens.answers.usecases.PublishAnswerUseCase publishAnswerUseCase = null;
    private final com.doubtless.doubtless.screens.auth.usecases.UserManager userManager = null;
    private final com.doubtless.doubtless.screens.doubt.DoubtData doubtData = null;
    private final androidx.lifecycle.MutableLiveData<com.doubtless.doubtless.screens.answers.AnswersViewModel.Result> _answerDoubtEntities = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.doubtless.doubtless.screens.answers.AnswersViewModel.Result> answerDoubtEntities = null;
    private final androidx.lifecycle.MutableLiveData<com.doubtless.doubtless.screens.answers.usecases.PublishAnswerUseCase.Result> _publishAnswerStatus = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.doubtless.doubtless.screens.answers.usecases.PublishAnswerUseCase.Result> publishAnswerStatus = null;
    @org.jetbrains.annotations.NotNull
    public static final com.doubtless.doubtless.screens.answers.AnswersViewModel.Companion Companion = null;
    
    public AnswersViewModel(@org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.answers.usecases.FetchAnswerUseCase fetchAnswerUseCase, @org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.answers.usecases.PublishAnswerUseCase publishAnswerUseCase, @org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.auth.usecases.UserManager userManager, @org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.doubt.DoubtData doubtData) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.doubtless.doubtless.screens.answers.AnswersViewModel.Result> getAnswerDoubtEntities() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.doubtless.doubtless.screens.answers.usecases.PublishAnswerUseCase.Result> getPublishAnswerStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job fetchAnswers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job publishAnswer(@org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.answers.PublishAnswerRequest publishAnswerRequest) {
        return null;
    }
    
    public final void notifyAnswersConsumed() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/doubtless/doubtless/screens/answers/AnswersViewModel$Result;", "", "()V", "Error", "Loading", "Success", "Lcom/doubtless/doubtless/screens/answers/AnswersViewModel$Result$Error;", "Lcom/doubtless/doubtless/screens/answers/AnswersViewModel$Result$Loading;", "Lcom/doubtless/doubtless/screens/answers/AnswersViewModel$Result$Success;", "app_debug"})
    public static abstract class Result {
        
        private Result() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/doubtless/doubtless/screens/answers/AnswersViewModel$Result$Success;", "Lcom/doubtless/doubtless/screens/answers/AnswersViewModel$Result;", "data", "", "Lcom/doubtless/doubtless/screens/answers/AnswerDoubtEntity;", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "app_debug"})
        public static final class Success extends com.doubtless.doubtless.screens.answers.AnswersViewModel.Result {
            @org.jetbrains.annotations.NotNull
            private final java.util.List<com.doubtless.doubtless.screens.answers.AnswerDoubtEntity> data = null;
            
            public Success(@org.jetbrains.annotations.NotNull
            java.util.List<com.doubtless.doubtless.screens.answers.AnswerDoubtEntity> data) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.util.List<com.doubtless.doubtless.screens.answers.AnswerDoubtEntity> getData() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/doubtless/doubtless/screens/answers/AnswersViewModel$Result$Loading;", "Lcom/doubtless/doubtless/screens/answers/AnswersViewModel$Result;", "()V", "app_debug"})
        public static final class Loading extends com.doubtless.doubtless.screens.answers.AnswersViewModel.Result {
            @org.jetbrains.annotations.NotNull
            public static final com.doubtless.doubtless.screens.answers.AnswersViewModel.Result.Loading INSTANCE = null;
            
            private Loading() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/doubtless/doubtless/screens/answers/AnswersViewModel$Result$Error;", "Lcom/doubtless/doubtless/screens/answers/AnswersViewModel$Result;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "app_debug"})
        public static final class Error extends com.doubtless.doubtless.screens.answers.AnswersViewModel.Result {
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
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/doubtless/doubtless/screens/answers/AnswersViewModel$Companion;", "", "()V", "Factory", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ%\u0010\u000b\u001a\u0002H\f\"\b\b\u0000\u0010\f*\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\f0\u000fH\u0016\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/doubtless/doubtless/screens/answers/AnswersViewModel$Companion$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "fetchAnswerUseCase", "Lcom/doubtless/doubtless/screens/answers/usecases/FetchAnswerUseCase;", "publishAnswerUseCase", "Lcom/doubtless/doubtless/screens/answers/usecases/PublishAnswerUseCase;", "userManager", "Lcom/doubtless/doubtless/screens/auth/usecases/UserManager;", "doubtData", "Lcom/doubtless/doubtless/screens/doubt/DoubtData;", "(Lcom/doubtless/doubtless/screens/answers/usecases/FetchAnswerUseCase;Lcom/doubtless/doubtless/screens/answers/usecases/PublishAnswerUseCase;Lcom/doubtless/doubtless/screens/auth/usecases/UserManager;Lcom/doubtless/doubtless/screens/doubt/DoubtData;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
        public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
            private final com.doubtless.doubtless.screens.answers.usecases.FetchAnswerUseCase fetchAnswerUseCase = null;
            private final com.doubtless.doubtless.screens.answers.usecases.PublishAnswerUseCase publishAnswerUseCase = null;
            private final com.doubtless.doubtless.screens.auth.usecases.UserManager userManager = null;
            private final com.doubtless.doubtless.screens.doubt.DoubtData doubtData = null;
            
            public Factory(@org.jetbrains.annotations.NotNull
            com.doubtless.doubtless.screens.answers.usecases.FetchAnswerUseCase fetchAnswerUseCase, @org.jetbrains.annotations.NotNull
            com.doubtless.doubtless.screens.answers.usecases.PublishAnswerUseCase publishAnswerUseCase, @org.jetbrains.annotations.NotNull
            com.doubtless.doubtless.screens.auth.usecases.UserManager userManager, @org.jetbrains.annotations.NotNull
            com.doubtless.doubtless.screens.doubt.DoubtData doubtData) {
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