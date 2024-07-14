package com.doubtless.doubtless.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\u0011\u0012\u0013B1\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u00a2\u0006\u0002\u0010\tR\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u0082\u0001\u0003\u0014\u0015\u0016\u00a8\u0006\u0017"}, d2 = {"Lcom/doubtless/doubtless/utils/Resource;", "T", "", "data", "message", "", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Exception;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getError", "()Ljava/lang/Exception;", "getMessage", "()Ljava/lang/String;", "Error", "Loading", "Success", "Lcom/doubtless/doubtless/utils/Resource$Error;", "Lcom/doubtless/doubtless/utils/Resource$Loading;", "Lcom/doubtless/doubtless/utils/Resource$Success;", "app_debug"})
public abstract class Resource<T extends java.lang.Object> {
    @org.jetbrains.annotations.Nullable
    private final T data = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String message = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Exception error = null;
    
    private Resource(T data, java.lang.String message, java.lang.Exception error) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final T getData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Exception getError() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/doubtless/doubtless/utils/Resource$Success;", "T", "Lcom/doubtless/doubtless/utils/Resource;", "data", "(Ljava/lang/Object;)V", "app_debug"})
    public static final class Success<T extends java.lang.Object> extends com.doubtless.doubtless.utils.Resource<T> {
        
        public Success(T data) {
            super(null, null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/doubtless/doubtless/utils/Resource$Loading;", "T", "Lcom/doubtless/doubtless/utils/Resource;", "()V", "app_debug"})
    public static final class Loading<T extends java.lang.Object> extends com.doubtless.doubtless.utils.Resource<T> {
        
        public Loading() {
            super(null, null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B/\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0001\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/doubtless/doubtless/utils/Resource$Error;", "T", "Lcom/doubtless/doubtless/utils/Resource;", "message", "", "data", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Exception;)V", "app_debug"})
    public static final class Error<T extends java.lang.Object> extends com.doubtless.doubtless.utils.Resource<T> {
        
        public Error() {
            super(null, null, null);
        }
        
        public Error(@org.jetbrains.annotations.Nullable
        java.lang.String message, @org.jetbrains.annotations.Nullable
        T data, @org.jetbrains.annotations.Nullable
        java.lang.Exception error) {
            super(null, null, null);
        }
    }
}