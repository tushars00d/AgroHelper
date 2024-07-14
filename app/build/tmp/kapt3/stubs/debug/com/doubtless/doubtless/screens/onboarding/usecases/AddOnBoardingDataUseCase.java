package com.doubtless.doubtless.screens.onboarding.usecases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/doubtless/doubtless/screens/onboarding/usecases/AddOnBoardingDataUseCase;", "", "firestore", "Lcom/google/firebase/firestore/FirebaseFirestore;", "user", "Lcom/doubtless/doubtless/screens/auth/User;", "(Lcom/google/firebase/firestore/FirebaseFirestore;Lcom/doubtless/doubtless/screens/auth/User;)V", "add", "Lcom/doubtless/doubtless/screens/onboarding/usecases/AddOnBoardingDataUseCase$Result;", "userAttributes", "Lcom/doubtless/doubtless/screens/auth/UserAttributes;", "(Lcom/doubtless/doubtless/screens/auth/UserAttributes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Result", "app_debug"})
public final class AddOnBoardingDataUseCase {
    private final com.google.firebase.firestore.FirebaseFirestore firestore = null;
    private final com.doubtless.doubtless.screens.auth.User user = null;
    
    public AddOnBoardingDataUseCase(@org.jetbrains.annotations.NotNull
    com.google.firebase.firestore.FirebaseFirestore firestore, @org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.auth.User user) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object add(@org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.auth.UserAttributes userAttributes, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.doubtless.doubtless.screens.onboarding.usecases.AddOnBoardingDataUseCase.Result> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/doubtless/doubtless/screens/onboarding/usecases/AddOnBoardingDataUseCase$Result;", "", "()V", "Error", "Success", "Lcom/doubtless/doubtless/screens/onboarding/usecases/AddOnBoardingDataUseCase$Result$Error;", "Lcom/doubtless/doubtless/screens/onboarding/usecases/AddOnBoardingDataUseCase$Result$Success;", "app_debug"})
    public static abstract class Result {
        
        private Result() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/doubtless/doubtless/screens/onboarding/usecases/AddOnBoardingDataUseCase$Result$Success;", "Lcom/doubtless/doubtless/screens/onboarding/usecases/AddOnBoardingDataUseCase$Result;", "()V", "app_debug"})
        public static final class Success extends com.doubtless.doubtless.screens.onboarding.usecases.AddOnBoardingDataUseCase.Result {
            
            public Success() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/doubtless/doubtless/screens/onboarding/usecases/AddOnBoardingDataUseCase$Result$Error;", "Lcom/doubtless/doubtless/screens/onboarding/usecases/AddOnBoardingDataUseCase$Result;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "app_debug"})
        public static final class Error extends com.doubtless.doubtless.screens.onboarding.usecases.AddOnBoardingDataUseCase.Result {
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