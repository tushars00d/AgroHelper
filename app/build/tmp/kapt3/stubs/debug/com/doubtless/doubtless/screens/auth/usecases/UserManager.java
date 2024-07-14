package com.doubtless.doubtless.screens.auth.usecases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0015B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\b\u0010\f\u001a\u0004\u0018\u00010\nJ\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u0014\u001a\u00020\u0013R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/doubtless/doubtless/screens/auth/usecases/UserManager;", "", "firebaseAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "userDataServerUseCase", "Lcom/doubtless/doubtless/screens/auth/usecases/UserDataServerUseCase;", "userDataStorageUseCase", "Lcom/doubtless/doubtless/screens/auth/usecases/UserDataStorageUseCase;", "(Lcom/google/firebase/auth/FirebaseAuth;Lcom/doubtless/doubtless/screens/auth/usecases/UserDataServerUseCase;Lcom/doubtless/doubtless/screens/auth/usecases/UserDataStorageUseCase;)V", "cachedUserData", "Lcom/doubtless/doubtless/screens/auth/User;", "getCachedUserData", "getLoggedInUser", "onUserLogoutSync", "Lcom/doubtless/doubtless/screens/auth/usecases/UserManager$Result;", "registerAndGetIfNewUserSync", "serverUser", "Lcom/google/firebase/auth/FirebaseUser;", "setNewCachedUserData", "", "storeCachedUserData", "Result", "app_debug"})
public final class UserManager {
    private final com.google.firebase.auth.FirebaseAuth firebaseAuth = null;
    private final com.doubtless.doubtless.screens.auth.usecases.UserDataServerUseCase userDataServerUseCase = null;
    private final com.doubtless.doubtless.screens.auth.usecases.UserDataStorageUseCase userDataStorageUseCase = null;
    private com.doubtless.doubtless.screens.auth.User cachedUserData;
    
    public UserManager(@org.jetbrains.annotations.NotNull
    com.google.firebase.auth.FirebaseAuth firebaseAuth, @org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.auth.usecases.UserDataServerUseCase userDataServerUseCase, @org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.auth.usecases.UserDataStorageUseCase userDataStorageUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.doubtless.doubtless.screens.auth.User getCachedUserData() {
        return null;
    }
    
    public final void setNewCachedUserData(@org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.auth.User cachedUserData) {
    }
    
    public final void storeCachedUserData() {
    }
    
    /**
     * if null then user is not logged in
     */
    @org.jetbrains.annotations.Nullable
    public final com.doubtless.doubtless.screens.auth.User getLoggedInUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @androidx.annotation.WorkerThread
    public final com.doubtless.doubtless.screens.auth.usecases.UserManager.Result registerAndGetIfNewUserSync(@org.jetbrains.annotations.NotNull
    com.google.firebase.auth.FirebaseUser serverUser) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.doubtless.doubtless.screens.auth.usecases.UserManager.Result onUserLogoutSync() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\t\n\u000bB)\b\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\b\u0082\u0001\u0003\f\r\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/doubtless/doubtless/screens/auth/usecases/UserManager$Result;", "", "user", "Lcom/doubtless/doubtless/screens/auth/User;", "isNewUser", "", "error", "", "(Lcom/doubtless/doubtless/screens/auth/User;Ljava/lang/Boolean;Ljava/lang/String;)V", "Error", "LoggedOut", "Success", "Lcom/doubtless/doubtless/screens/auth/usecases/UserManager$Result$Error;", "Lcom/doubtless/doubtless/screens/auth/usecases/UserManager$Result$LoggedOut;", "Lcom/doubtless/doubtless/screens/auth/usecases/UserManager$Result$Success;", "app_debug"})
    public static abstract class Result {
        
        private Result(com.doubtless.doubtless.screens.auth.User user, java.lang.Boolean isNewUser, java.lang.String error) {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/doubtless/doubtless/screens/auth/usecases/UserManager$Result$Success;", "Lcom/doubtless/doubtless/screens/auth/usecases/UserManager$Result;", "user", "Lcom/doubtless/doubtless/screens/auth/User;", "isNewUser", "", "isOldUserWithNoOnboarding", "(Lcom/doubtless/doubtless/screens/auth/User;ZZ)V", "()Z", "getUser", "()Lcom/doubtless/doubtless/screens/auth/User;", "app_debug"})
        public static final class Success extends com.doubtless.doubtless.screens.auth.usecases.UserManager.Result {
            @org.jetbrains.annotations.NotNull
            private final com.doubtless.doubtless.screens.auth.User user = null;
            private final boolean isNewUser = false;
            private final boolean isOldUserWithNoOnboarding = false;
            
            public Success(@org.jetbrains.annotations.NotNull
            com.doubtless.doubtless.screens.auth.User user, boolean isNewUser, boolean isOldUserWithNoOnboarding) {
                super(null, null, null);
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.doubtless.doubtless.screens.auth.User getUser() {
                return null;
            }
            
            public final boolean isNewUser() {
                return false;
            }
            
            public final boolean isOldUserWithNoOnboarding() {
                return false;
            }
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/doubtless/doubtless/screens/auth/usecases/UserManager$Result$Error;", "Lcom/doubtless/doubtless/screens/auth/usecases/UserManager$Result;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "app_debug"})
        public static final class Error extends com.doubtless.doubtless.screens.auth.usecases.UserManager.Result {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String message = null;
            
            public Error(@org.jetbrains.annotations.NotNull
            java.lang.String message) {
                super(null, null, null);
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getMessage() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/doubtless/doubtless/screens/auth/usecases/UserManager$Result$LoggedOut;", "Lcom/doubtless/doubtless/screens/auth/usecases/UserManager$Result;", "()V", "app_debug"})
        public static final class LoggedOut extends com.doubtless.doubtless.screens.auth.usecases.UserManager.Result {
            
            public LoggedOut() {
                super(null, null, null);
            }
        }
    }
}