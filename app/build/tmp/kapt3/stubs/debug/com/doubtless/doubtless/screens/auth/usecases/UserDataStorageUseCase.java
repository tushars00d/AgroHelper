package com.doubtless.doubtless.screens.auth.usecases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\nR\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/doubtless/doubtless/screens/auth/usecases/UserDataStorageUseCase;", "", "sharedPreferences", "Landroid/content/SharedPreferences;", "gson", "Lcom/google/gson/Gson;", "(Landroid/content/SharedPreferences;Lcom/google/gson/Gson;)V", "USER_KEY", "", "getUserData", "Lcom/doubtless/doubtless/screens/auth/User;", "onLogout", "", "setUserData", "user", "app_debug"})
public final class UserDataStorageUseCase {
    private final android.content.SharedPreferences sharedPreferences = null;
    private final com.google.gson.Gson gson = null;
    private final java.lang.String USER_KEY = "user_key";
    
    public UserDataStorageUseCase(@org.jetbrains.annotations.NotNull
    android.content.SharedPreferences sharedPreferences, @org.jetbrains.annotations.NotNull
    com.google.gson.Gson gson) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.doubtless.doubtless.screens.auth.User getUserData() {
        return null;
    }
    
    public final void setUserData(@org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.auth.User user) {
    }
    
    public final void onLogout() {
    }
}