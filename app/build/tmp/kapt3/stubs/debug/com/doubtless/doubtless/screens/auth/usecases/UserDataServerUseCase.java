package com.doubtless.doubtless.screens.auth.usecases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/doubtless/doubtless/screens/auth/usecases/UserDataServerUseCase;", "", "firestore", "Lcom/google/firebase/firestore/FirebaseFirestore;", "gson", "Lcom/google/gson/Gson;", "(Lcom/google/firebase/firestore/FirebaseFirestore;Lcom/google/gson/Gson;)V", "storeUserOnServerIfNewSync", "Lcom/doubtless/doubtless/screens/auth/usecases/UserDataServerUseCase$Result;", "user", "Lcom/doubtless/doubtless/screens/auth/User;", "Result", "app_debug"})
public final class UserDataServerUseCase {
    private final com.google.firebase.firestore.FirebaseFirestore firestore = null;
    private final com.google.gson.Gson gson = null;
    
    public UserDataServerUseCase(@org.jetbrains.annotations.NotNull
    com.google.firebase.firestore.FirebaseFirestore firestore, @org.jetbrains.annotations.NotNull
    com.google.gson.Gson gson) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @androidx.annotation.WorkerThread
    public final com.doubtless.doubtless.screens.auth.usecases.UserDataServerUseCase.Result storeUserOnServerIfNewSync(@org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.auth.User user) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/doubtless/doubtless/screens/auth/usecases/UserDataServerUseCase$Result;", "", "()V", "Error", "NewUser", "OldUseWithNoOnboardingData", "OldUser", "Lcom/doubtless/doubtless/screens/auth/usecases/UserDataServerUseCase$Result$Error;", "Lcom/doubtless/doubtless/screens/auth/usecases/UserDataServerUseCase$Result$NewUser;", "Lcom/doubtless/doubtless/screens/auth/usecases/UserDataServerUseCase$Result$OldUseWithNoOnboardingData;", "Lcom/doubtless/doubtless/screens/auth/usecases/UserDataServerUseCase$Result$OldUser;", "app_debug"})
    public static abstract class Result {
        
        private Result() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/doubtless/doubtless/screens/auth/usecases/UserDataServerUseCase$Result$NewUser;", "Lcom/doubtless/doubtless/screens/auth/usecases/UserDataServerUseCase$Result;", "newUser", "Lcom/doubtless/doubtless/screens/auth/User;", "(Lcom/doubtless/doubtless/screens/auth/User;)V", "getNewUser", "()Lcom/doubtless/doubtless/screens/auth/User;", "app_debug"})
        public static final class NewUser extends com.doubtless.doubtless.screens.auth.usecases.UserDataServerUseCase.Result {
            @org.jetbrains.annotations.NotNull
            private final com.doubtless.doubtless.screens.auth.User newUser = null;
            
            public NewUser(@org.jetbrains.annotations.NotNull
            com.doubtless.doubtless.screens.auth.User newUser) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.doubtless.doubtless.screens.auth.User getNewUser() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/doubtless/doubtless/screens/auth/usecases/UserDataServerUseCase$Result$OldUser;", "Lcom/doubtless/doubtless/screens/auth/usecases/UserDataServerUseCase$Result;", "oldUser", "Lcom/doubtless/doubtless/screens/auth/User;", "(Lcom/doubtless/doubtless/screens/auth/User;)V", "getOldUser", "()Lcom/doubtless/doubtless/screens/auth/User;", "app_debug"})
        public static final class OldUser extends com.doubtless.doubtless.screens.auth.usecases.UserDataServerUseCase.Result {
            @org.jetbrains.annotations.NotNull
            private final com.doubtless.doubtless.screens.auth.User oldUser = null;
            
            public OldUser(@org.jetbrains.annotations.NotNull
            com.doubtless.doubtless.screens.auth.User oldUser) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.doubtless.doubtless.screens.auth.User getOldUser() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/doubtless/doubtless/screens/auth/usecases/UserDataServerUseCase$Result$OldUseWithNoOnboardingData;", "Lcom/doubtless/doubtless/screens/auth/usecases/UserDataServerUseCase$Result;", "oldUser", "Lcom/doubtless/doubtless/screens/auth/User;", "(Lcom/doubtless/doubtless/screens/auth/User;)V", "getOldUser", "()Lcom/doubtless/doubtless/screens/auth/User;", "app_debug"})
        public static final class OldUseWithNoOnboardingData extends com.doubtless.doubtless.screens.auth.usecases.UserDataServerUseCase.Result {
            @org.jetbrains.annotations.NotNull
            private final com.doubtless.doubtless.screens.auth.User oldUser = null;
            
            public OldUseWithNoOnboardingData(@org.jetbrains.annotations.NotNull
            com.doubtless.doubtless.screens.auth.User oldUser) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.doubtless.doubtless.screens.auth.User getOldUser() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/doubtless/doubtless/screens/auth/usecases/UserDataServerUseCase$Result$Error;", "Lcom/doubtless/doubtless/screens/auth/usecases/UserDataServerUseCase$Result;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "app_debug"})
        public static final class Error extends com.doubtless.doubtless.screens.auth.usecases.UserDataServerUseCase.Result {
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