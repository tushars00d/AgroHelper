package com.doubtless.doubtless.screens.dashboard.usecases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0003\u001b\u001c\u001dB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0019\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0017R\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001e"}, d2 = {"Lcom/doubtless/doubtless/screens/dashboard/usecases/FetchUserProfileFeedUseCase;", "", "fetchUserFeedByDateUseCase", "Lcom/doubtless/doubtless/screens/dashboard/usecases/FetchUserFeedByDateUseCase;", "firestore", "Lcom/google/firebase/firestore/FirebaseFirestore;", "(Lcom/doubtless/doubtless/screens/dashboard/usecases/FetchUserFeedByDateUseCase;Lcom/google/firebase/firestore/FirebaseFirestore;)V", "FEED_ENDED", "", "NOT_SET", "collectionCount", "docFetched", "lastDoubtData", "Lcom/doubtless/doubtless/screens/doubt/DoubtData;", "fetchCollectionCountIfNotDoneAlready", "Lcom/doubtless/doubtless/screens/dashboard/usecases/FetchUserProfileFeedUseCase$Result;", "request", "Lcom/doubtless/doubtless/screens/dashboard/usecases/FetchUserProfileFeedUseCase$FetchUserFeedRequest;", "fetchFeedSync", "(Lcom/doubtless/doubtless/screens/dashboard/usecases/FetchUserProfileFeedUseCase$FetchUserFeedRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchUserDetails", "Lcom/doubtless/doubtless/screens/dashboard/usecases/FetchUserProfileFeedUseCase$UserDetailsResult;", "notifyDistinctDocsFetched", "", "docsFetched", "", "notifyEffectiveFeedEnded", "FetchUserFeedRequest", "Result", "UserDetailsResult", "app_debug"})
public final class FetchUserProfileFeedUseCase {
    private final com.doubtless.doubtless.screens.dashboard.usecases.FetchUserFeedByDateUseCase fetchUserFeedByDateUseCase = null;
    private final com.google.firebase.firestore.FirebaseFirestore firestore = null;
    private com.doubtless.doubtless.screens.doubt.DoubtData lastDoubtData;
    private final long NOT_SET = -1L;
    private final long FEED_ENDED = 0L;
    private long collectionCount;
    private long docFetched = 0L;
    
    public FetchUserProfileFeedUseCase(@org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.dashboard.usecases.FetchUserFeedByDateUseCase fetchUserFeedByDateUseCase, @org.jetbrains.annotations.NotNull
    com.google.firebase.firestore.FirebaseFirestore firestore) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object fetchUserDetails(@org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.dashboard.usecases.FetchUserProfileFeedUseCase.FetchUserFeedRequest request, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.doubtless.doubtless.screens.dashboard.usecases.FetchUserProfileFeedUseCase.UserDetailsResult> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object fetchFeedSync(@org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.dashboard.usecases.FetchUserProfileFeedUseCase.FetchUserFeedRequest request, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.doubtless.doubtless.screens.dashboard.usecases.FetchUserProfileFeedUseCase.Result> continuation) {
        return null;
    }
    
    private final com.doubtless.doubtless.screens.dashboard.usecases.FetchUserProfileFeedUseCase.Result fetchCollectionCountIfNotDoneAlready(com.doubtless.doubtless.screens.dashboard.usecases.FetchUserProfileFeedUseCase.FetchUserFeedRequest request) {
        return null;
    }
    
    public final void notifyDistinctDocsFetched(int docsFetched) {
    }
    
    public final void notifyEffectiveFeedEnded() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lcom/doubtless/doubtless/screens/dashboard/usecases/FetchUserProfileFeedUseCase$FetchUserFeedRequest;", "", "user", "Lcom/doubtless/doubtless/screens/auth/User;", "pageSize", "", "fetchFromPage1", "", "(Lcom/doubtless/doubtless/screens/auth/User;IZ)V", "getFetchFromPage1", "()Z", "getPageSize", "()I", "getUser", "()Lcom/doubtless/doubtless/screens/auth/User;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "app_debug"})
    public static final class FetchUserFeedRequest {
        @org.jetbrains.annotations.NotNull
        private final com.doubtless.doubtless.screens.auth.User user = null;
        private final int pageSize = 0;
        private final boolean fetchFromPage1 = false;
        
        @org.jetbrains.annotations.NotNull
        public final com.doubtless.doubtless.screens.dashboard.usecases.FetchUserProfileFeedUseCase.FetchUserFeedRequest copy(@org.jetbrains.annotations.NotNull
        com.doubtless.doubtless.screens.auth.User user, int pageSize, boolean fetchFromPage1) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public FetchUserFeedRequest(@org.jetbrains.annotations.NotNull
        com.doubtless.doubtless.screens.auth.User user, int pageSize, boolean fetchFromPage1) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.doubtless.doubtless.screens.auth.User component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.doubtless.doubtless.screens.auth.User getUser() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int getPageSize() {
            return 0;
        }
        
        public final boolean component3() {
            return false;
        }
        
        public final boolean getFetchFromPage1() {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/doubtless/doubtless/screens/dashboard/usecases/FetchUserProfileFeedUseCase$Result;", "", "()V", "Error", "ListEnded", "Success", "Lcom/doubtless/doubtless/screens/dashboard/usecases/FetchUserProfileFeedUseCase$Result$Error;", "Lcom/doubtless/doubtless/screens/dashboard/usecases/FetchUserProfileFeedUseCase$Result$ListEnded;", "Lcom/doubtless/doubtless/screens/dashboard/usecases/FetchUserProfileFeedUseCase$Result$Success;", "app_debug"})
    public static abstract class Result {
        
        private Result() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/doubtless/doubtless/screens/dashboard/usecases/FetchUserProfileFeedUseCase$Result$Success;", "Lcom/doubtless/doubtless/screens/dashboard/usecases/FetchUserProfileFeedUseCase$Result;", "data", "", "Lcom/doubtless/doubtless/screens/doubt/DoubtData;", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "app_debug"})
        public static final class Success extends com.doubtless.doubtless.screens.dashboard.usecases.FetchUserProfileFeedUseCase.Result {
            @org.jetbrains.annotations.NotNull
            private final java.util.List<com.doubtless.doubtless.screens.doubt.DoubtData> data = null;
            
            public Success(@org.jetbrains.annotations.NotNull
            java.util.List<com.doubtless.doubtless.screens.doubt.DoubtData> data) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.util.List<com.doubtless.doubtless.screens.doubt.DoubtData> getData() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/doubtless/doubtless/screens/dashboard/usecases/FetchUserProfileFeedUseCase$Result$ListEnded;", "Lcom/doubtless/doubtless/screens/dashboard/usecases/FetchUserProfileFeedUseCase$Result;", "()V", "app_debug"})
        public static final class ListEnded extends com.doubtless.doubtless.screens.dashboard.usecases.FetchUserProfileFeedUseCase.Result {
            
            public ListEnded() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/doubtless/doubtless/screens/dashboard/usecases/FetchUserProfileFeedUseCase$Result$Error;", "Lcom/doubtless/doubtless/screens/dashboard/usecases/FetchUserProfileFeedUseCase$Result;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "app_debug"})
        public static final class Error extends com.doubtless.doubtless.screens.dashboard.usecases.FetchUserProfileFeedUseCase.Result {
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
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/doubtless/doubtless/screens/dashboard/usecases/FetchUserProfileFeedUseCase$UserDetailsResult;", "", "()V", "Error", "Success", "Lcom/doubtless/doubtless/screens/dashboard/usecases/FetchUserProfileFeedUseCase$UserDetailsResult$Error;", "Lcom/doubtless/doubtless/screens/dashboard/usecases/FetchUserProfileFeedUseCase$UserDetailsResult$Success;", "app_debug"})
    public static abstract class UserDetailsResult {
        
        private UserDetailsResult() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/doubtless/doubtless/screens/dashboard/usecases/FetchUserProfileFeedUseCase$UserDetailsResult$Success;", "Lcom/doubtless/doubtless/screens/dashboard/usecases/FetchUserProfileFeedUseCase$UserDetailsResult;", "user", "Lcom/doubtless/doubtless/screens/auth/User;", "(Lcom/doubtless/doubtless/screens/auth/User;)V", "getUser", "()Lcom/doubtless/doubtless/screens/auth/User;", "app_debug"})
        public static final class Success extends com.doubtless.doubtless.screens.dashboard.usecases.FetchUserProfileFeedUseCase.UserDetailsResult {
            @org.jetbrains.annotations.NotNull
            private final com.doubtless.doubtless.screens.auth.User user = null;
            
            public Success(@org.jetbrains.annotations.NotNull
            com.doubtless.doubtless.screens.auth.User user) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.doubtless.doubtless.screens.auth.User getUser() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/doubtless/doubtless/screens/dashboard/usecases/FetchUserProfileFeedUseCase$UserDetailsResult$Error;", "Lcom/doubtless/doubtless/screens/dashboard/usecases/FetchUserProfileFeedUseCase$UserDetailsResult;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "app_debug"})
        public static final class Error extends com.doubtless.doubtless.screens.dashboard.usecases.FetchUserProfileFeedUseCase.UserDetailsResult {
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