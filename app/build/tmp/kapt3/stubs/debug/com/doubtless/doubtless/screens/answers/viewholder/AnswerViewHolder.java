package com.doubtless.doubtless.screens.answers.viewholder;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001cB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0018\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0019H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/doubtless/doubtless/screens/answers/viewholder/AnswerViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "interactionListener", "Lcom/doubtless/doubtless/screens/answers/viewholder/AnswerViewHolder$InteractionListener;", "(Landroid/view/View;Lcom/doubtless/doubtless/screens/answers/viewholder/AnswerViewHolder$InteractionListener;)V", "authorName", "Landroid/widget/TextView;", "description", "downVote", "Landroid/widget/CheckBox;", "ivDp", "Landroid/widget/ImageView;", "time", "tvCollege", "tvVotes", "tvYear", "upVote", "userBadge", "setData", "", "answerData", "Lcom/doubtless/doubtless/screens/answers/AnswerData;", "answerVotingUseCase", "Lcom/doubtless/doubtless/screens/doubt/usecases/VotingUseCase;", "setVotesUi", "votingUseCase", "InteractionListener", "app_debug"})
public final class AnswerViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    private final com.doubtless.doubtless.screens.answers.viewholder.AnswerViewHolder.InteractionListener interactionListener = null;
    private final android.widget.TextView authorName = null;
    private final android.widget.TextView time = null;
    private final android.widget.TextView description = null;
    private final android.widget.ImageView ivDp = null;
    private final android.widget.TextView tvYear = null;
    private final android.widget.TextView tvVotes = null;
    private final android.widget.CheckBox upVote = null;
    private final android.widget.CheckBox downVote = null;
    private final android.widget.TextView tvCollege = null;
    private final android.widget.ImageView userBadge = null;
    
    public AnswerViewHolder(@org.jetbrains.annotations.NotNull
    android.view.View itemView, @org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.answers.viewholder.AnswerViewHolder.InteractionListener interactionListener) {
        super(null);
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.answers.AnswerData answerData, @org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.doubt.usecases.VotingUseCase answerVotingUseCase) {
    }
    
    private final void setVotesUi(com.doubtless.doubtless.screens.answers.AnswerData answerData, com.doubtless.doubtless.screens.doubt.usecases.VotingUseCase votingUseCase) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\u000b"}, d2 = {"Lcom/doubtless/doubtless/screens/answers/viewholder/AnswerViewHolder$InteractionListener;", "", "onAnswerClicked", "", "answerData", "Lcom/doubtless/doubtless/screens/answers/AnswerData;", "position", "", "onUserImageClicked", "userId", "", "app_debug"})
    public static abstract interface InteractionListener {
        
        public abstract void onUserImageClicked(@org.jetbrains.annotations.NotNull
        java.lang.String userId);
        
        public abstract void onAnswerClicked(@org.jetbrains.annotations.NotNull
        com.doubtless.doubtless.screens.answers.AnswerData answerData, int position);
    }
}