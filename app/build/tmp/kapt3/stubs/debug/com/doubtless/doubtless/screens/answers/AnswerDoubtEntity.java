package com.doubtless.doubtless.screens.answers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 !2\u00020\u0001:\u0001!B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tH\u00c6\u0003JC\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\""}, d2 = {"Lcom/doubtless/doubtless/screens/answers/AnswerDoubtEntity;", "", "type", "", "doubt", "Lcom/doubtless/doubtless/screens/doubt/DoubtData;", "answer", "Lcom/doubtless/doubtless/screens/answers/AnswerData;", "answerVotingUseCase", "Lcom/doubtless/doubtless/screens/doubt/usecases/VotingUseCase;", "doubtVotingUseCase", "(ILcom/doubtless/doubtless/screens/doubt/DoubtData;Lcom/doubtless/doubtless/screens/answers/AnswerData;Lcom/doubtless/doubtless/screens/doubt/usecases/VotingUseCase;Lcom/doubtless/doubtless/screens/doubt/usecases/VotingUseCase;)V", "getAnswer", "()Lcom/doubtless/doubtless/screens/answers/AnswerData;", "getAnswerVotingUseCase", "()Lcom/doubtless/doubtless/screens/doubt/usecases/VotingUseCase;", "getDoubt", "()Lcom/doubtless/doubtless/screens/doubt/DoubtData;", "getDoubtVotingUseCase", "getType", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "app_debug"})
public final class AnswerDoubtEntity {
    private final int type = 0;
    @org.jetbrains.annotations.Nullable
    private final com.doubtless.doubtless.screens.doubt.DoubtData doubt = null;
    @org.jetbrains.annotations.Nullable
    private final com.doubtless.doubtless.screens.answers.AnswerData answer = null;
    @org.jetbrains.annotations.Nullable
    private final com.doubtless.doubtless.screens.doubt.usecases.VotingUseCase answerVotingUseCase = null;
    @org.jetbrains.annotations.Nullable
    private final com.doubtless.doubtless.screens.doubt.usecases.VotingUseCase doubtVotingUseCase = null;
    @org.jetbrains.annotations.NotNull
    public static final com.doubtless.doubtless.screens.answers.AnswerDoubtEntity.Companion Companion = null;
    public static final int TYPE_DOUBT = 1;
    public static final int TYPE_ANSWER_ENTER = 2;
    public static final int TYPE_ANSWER = 3;
    
    @org.jetbrains.annotations.NotNull
    public final com.doubtless.doubtless.screens.answers.AnswerDoubtEntity copy(int type, @org.jetbrains.annotations.Nullable
    com.doubtless.doubtless.screens.doubt.DoubtData doubt, @org.jetbrains.annotations.Nullable
    com.doubtless.doubtless.screens.answers.AnswerData answer, @org.jetbrains.annotations.Nullable
    com.doubtless.doubtless.screens.doubt.usecases.VotingUseCase answerVotingUseCase, @org.jetbrains.annotations.Nullable
    com.doubtless.doubtless.screens.doubt.usecases.VotingUseCase doubtVotingUseCase) {
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
    
    public AnswerDoubtEntity(int type, @org.jetbrains.annotations.Nullable
    com.doubtless.doubtless.screens.doubt.DoubtData doubt, @org.jetbrains.annotations.Nullable
    com.doubtless.doubtless.screens.answers.AnswerData answer, @org.jetbrains.annotations.Nullable
    com.doubtless.doubtless.screens.doubt.usecases.VotingUseCase answerVotingUseCase, @org.jetbrains.annotations.Nullable
    com.doubtless.doubtless.screens.doubt.usecases.VotingUseCase doubtVotingUseCase) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getType() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.doubtless.doubtless.screens.doubt.DoubtData component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.doubtless.doubtless.screens.doubt.DoubtData getDoubt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.doubtless.doubtless.screens.answers.AnswerData component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.doubtless.doubtless.screens.answers.AnswerData getAnswer() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.doubtless.doubtless.screens.doubt.usecases.VotingUseCase component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.doubtless.doubtless.screens.doubt.usecases.VotingUseCase getAnswerVotingUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.doubtless.doubtless.screens.doubt.usecases.VotingUseCase component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.doubtless.doubtless.screens.doubt.usecases.VotingUseCase getDoubtVotingUseCase() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/doubtless/doubtless/screens/answers/AnswerDoubtEntity$Companion;", "", "()V", "TYPE_ANSWER", "", "TYPE_ANSWER_ENTER", "TYPE_DOUBT", "getEnterAnswerEntity", "Lcom/doubtless/doubtless/screens/answers/AnswerDoubtEntity;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.doubtless.doubtless.screens.answers.AnswerDoubtEntity getEnterAnswerEntity() {
            return null;
        }
    }
}