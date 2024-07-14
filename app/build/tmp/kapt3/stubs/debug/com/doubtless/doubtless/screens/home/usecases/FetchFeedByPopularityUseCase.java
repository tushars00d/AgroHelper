package com.doubtless.doubtless.screens.home.usecases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0013B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/doubtless/doubtless/screens/home/usecases/FetchFeedByPopularityUseCase;", "", "fetchInteractedMentorDataForDoubt", "Lcom/doubtless/doubtless/screens/doubt/usecases/FetchInteractedMentorDataForDoubt;", "firestore", "Lcom/google/firebase/firestore/FirebaseFirestore;", "(Lcom/doubtless/doubtless/screens/doubt/usecases/FetchInteractedMentorDataForDoubt;Lcom/google/firebase/firestore/FirebaseFirestore;)V", "lastDoubtData", "Lcom/doubtless/doubtless/screens/doubt/DoubtData;", "getDoubtDataList", "", "result", "Lcom/google/firebase/firestore/QuerySnapshot;", "(Lcom/google/firebase/firestore/QuerySnapshot;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFeedData", "Lcom/doubtless/doubtless/screens/home/usecases/FetchFeedByPopularityUseCase$Result;", "request", "Lcom/doubtless/doubtless/screens/home/usecases/FetchHomeFeedUseCase$FetchHomeFeedRequest;", "(Lcom/doubtless/doubtless/screens/home/usecases/FetchHomeFeedUseCase$FetchHomeFeedRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Result", "app_debug"})
public final class FetchFeedByPopularityUseCase {
    private final com.doubtless.doubtless.screens.doubt.usecases.FetchInteractedMentorDataForDoubt fetchInteractedMentorDataForDoubt = null;
    private final com.google.firebase.firestore.FirebaseFirestore firestore = null;
    private com.doubtless.doubtless.screens.doubt.DoubtData lastDoubtData;
    
    public FetchFeedByPopularityUseCase(@org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.doubt.usecases.FetchInteractedMentorDataForDoubt fetchInteractedMentorDataForDoubt, @org.jetbrains.annotations.NotNull
    com.google.firebase.firestore.FirebaseFirestore firestore) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getFeedData(@org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.home.usecases.FetchHomeFeedUseCase.FetchHomeFeedRequest request, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.doubtless.doubtless.screens.home.usecases.FetchFeedByPopularityUseCase.Result> continuation) {
        return null;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    private final java.lang.Object getDoubtDataList(com.google.firebase.firestore.QuerySnapshot result, kotlin.coroutines.Continuation<? super java.util.List<com.doubtless.doubtless.screens.doubt.DoubtData>> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/doubtless/doubtless/screens/home/usecases/FetchFeedByPopularityUseCase$Result;", "", "()V", "Error", "Success", "Lcom/doubtless/doubtless/screens/home/usecases/FetchFeedByPopularityUseCase$Result$Error;", "Lcom/doubtless/doubtless/screens/home/usecases/FetchFeedByPopularityUseCase$Result$Success;", "app_debug"})
    public static abstract class Result {
        
        private Result() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/doubtless/doubtless/screens/home/usecases/FetchFeedByPopularityUseCase$Result$Success;", "Lcom/doubtless/doubtless/screens/home/usecases/FetchFeedByPopularityUseCase$Result;", "data", "", "Lcom/doubtless/doubtless/screens/doubt/DoubtData;", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "app_debug"})
        public static final class Success extends com.doubtless.doubtless.screens.home.usecases.FetchFeedByPopularityUseCase.Result {
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
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/doubtless/doubtless/screens/home/usecases/FetchFeedByPopularityUseCase$Result$Error;", "Lcom/doubtless/doubtless/screens/home/usecases/FetchFeedByPopularityUseCase$Result;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "app_debug"})
        public static final class Error extends com.doubtless.doubtless.screens.home.usecases.FetchFeedByPopularityUseCase.Result {
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