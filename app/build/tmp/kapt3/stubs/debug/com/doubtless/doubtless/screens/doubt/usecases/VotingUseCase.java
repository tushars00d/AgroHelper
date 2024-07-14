package com.doubtless.doubtless.screens.doubt.usecases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00182\u00020\u0001:\u0002\u0018\u0019B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fJ\u0011\u0010\u0013\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0011\u0010\u0016\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0011\u0010\u0017\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/doubtless/doubtless/screens/doubt/usecases/VotingUseCase;", "", "firestore", "Lcom/google/firebase/firestore/FirebaseFirestore;", "user", "Lcom/doubtless/doubtless/screens/auth/User;", "isForAnswer", "", "answerData", "Lcom/doubtless/doubtless/screens/answers/AnswerData;", "doubtData", "Lcom/doubtless/doubtless/screens/doubt/DoubtData;", "(Lcom/google/firebase/firestore/FirebaseFirestore;Lcom/doubtless/doubtless/screens/auth/User;ZLcom/doubtless/doubtless/screens/answers/AnswerData;Lcom/doubtless/doubtless/screens/doubt/DoubtData;)V", "currentState", "", "docRef", "Lcom/google/firebase/firestore/DocumentReference;", "lock", "Lkotlinx/coroutines/sync/Mutex;", "downVoteDoubt", "Lcom/doubtless/doubtless/screens/doubt/usecases/VotingUseCase$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserCurrentState", "upvoteDoubt", "Companion", "Result", "app_debug"})
public final class VotingUseCase {
    private final com.google.firebase.firestore.FirebaseFirestore firestore = null;
    private final com.doubtless.doubtless.screens.auth.User user = null;
    private final boolean isForAnswer = false;
    private final com.doubtless.doubtless.screens.answers.AnswerData answerData = null;
    private final com.doubtless.doubtless.screens.doubt.DoubtData doubtData = null;
    @org.jetbrains.annotations.NotNull
    public static final com.doubtless.doubtless.screens.doubt.usecases.VotingUseCase.Companion Companion = null;
    public static final int UPVOTED = 1;
    public static final int DOWNVOTED = 2;
    public static final int NONE = 3;
    public static final int NOT_SET = 4;
    private int currentState = 4;
    private final com.google.firebase.firestore.DocumentReference docRef = null;
    private final kotlinx.coroutines.sync.Mutex lock = null;
    
    public VotingUseCase(@org.jetbrains.annotations.NotNull
    com.google.firebase.firestore.FirebaseFirestore firestore, @org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.auth.User user, boolean isForAnswer, @org.jetbrains.annotations.Nullable
    com.doubtless.doubtless.screens.answers.AnswerData answerData, @org.jetbrains.annotations.Nullable
    com.doubtless.doubtless.screens.doubt.DoubtData doubtData) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getUserCurrentState(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object upvoteDoubt(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.doubtless.doubtless.screens.doubt.usecases.VotingUseCase.Result> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object downVoteDoubt(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.doubtless.doubtless.screens.doubt.usecases.VotingUseCase.Result> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lcom/doubtless/doubtless/screens/doubt/usecases/VotingUseCase$Result;", "", "()V", "DownVoted", "Error", "UndoneDownVote", "UndoneUpVote", "UpVoted", "Lcom/doubtless/doubtless/screens/doubt/usecases/VotingUseCase$Result$DownVoted;", "Lcom/doubtless/doubtless/screens/doubt/usecases/VotingUseCase$Result$Error;", "Lcom/doubtless/doubtless/screens/doubt/usecases/VotingUseCase$Result$UndoneDownVote;", "Lcom/doubtless/doubtless/screens/doubt/usecases/VotingUseCase$Result$UndoneUpVote;", "Lcom/doubtless/doubtless/screens/doubt/usecases/VotingUseCase$Result$UpVoted;", "app_debug"})
    public static abstract class Result {
        
        private Result() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/doubtless/doubtless/screens/doubt/usecases/VotingUseCase$Result$UpVoted;", "Lcom/doubtless/doubtless/screens/doubt/usecases/VotingUseCase$Result;", "()V", "app_debug"})
        public static final class UpVoted extends com.doubtless.doubtless.screens.doubt.usecases.VotingUseCase.Result {
            
            public UpVoted() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/doubtless/doubtless/screens/doubt/usecases/VotingUseCase$Result$UndoneUpVote;", "Lcom/doubtless/doubtless/screens/doubt/usecases/VotingUseCase$Result;", "()V", "app_debug"})
        public static final class UndoneUpVote extends com.doubtless.doubtless.screens.doubt.usecases.VotingUseCase.Result {
            
            public UndoneUpVote() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/doubtless/doubtless/screens/doubt/usecases/VotingUseCase$Result$DownVoted;", "Lcom/doubtless/doubtless/screens/doubt/usecases/VotingUseCase$Result;", "()V", "app_debug"})
        public static final class DownVoted extends com.doubtless.doubtless.screens.doubt.usecases.VotingUseCase.Result {
            
            public DownVoted() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/doubtless/doubtless/screens/doubt/usecases/VotingUseCase$Result$UndoneDownVote;", "Lcom/doubtless/doubtless/screens/doubt/usecases/VotingUseCase$Result;", "()V", "app_debug"})
        public static final class UndoneDownVote extends com.doubtless.doubtless.screens.doubt.usecases.VotingUseCase.Result {
            
            public UndoneDownVote() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/doubtless/doubtless/screens/doubt/usecases/VotingUseCase$Result$Error;", "Lcom/doubtless/doubtless/screens/doubt/usecases/VotingUseCase$Result;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "app_debug"})
        public static final class Error extends com.doubtless.doubtless.screens.doubt.usecases.VotingUseCase.Result {
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
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/doubtless/doubtless/screens/doubt/usecases/VotingUseCase$Companion;", "", "()V", "DOWNVOTED", "", "NONE", "NOT_SET", "UPVOTED", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}