package com.doubtless.doubtless.screens.doubt.view.viewholder;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001&B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\u0018\u0010\"\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/doubtless/doubtless/screens/doubt/view/viewholder/DoubtPreviewViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "showVotingLayout", "", "interactionListener", "Lcom/doubtless/doubtless/screens/doubt/view/viewholder/DoubtPreviewViewHolder$InteractionListener;", "(Landroid/view/View;ZLcom/doubtless/doubtless/screens/doubt/view/viewholder/DoubtPreviewViewHolder$InteractionListener;)V", "analyticsTracker", "Lcom/doubtless/doubtless/analytics/AnalyticsTracker;", "description", "Landroid/widget/TextView;", "downvotes", "Landroid/widget/CheckBox;", "heading", "ivContent", "Landroid/widget/ImageView;", "ivDp", "llMentorsDp", "Landroid/widget/LinearLayout;", "time", "tvAnswers", "tvCollege", "tvNetVotes", "tvTags", "tvYear", "upvotes", "userBadge", "userName", "setData", "", "doubtData", "Lcom/doubtless/doubtless/screens/doubt/DoubtData;", "setVotesUi", "votingUseCase", "Lcom/doubtless/doubtless/screens/doubt/usecases/VotingUseCase;", "setupMentorsWhoInteractedDpUi", "InteractionListener", "app_debug"})
public final class DoubtPreviewViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    private final boolean showVotingLayout = false;
    private final com.doubtless.doubtless.screens.doubt.view.viewholder.DoubtPreviewViewHolder.InteractionListener interactionListener = null;
    private final android.widget.TextView userName = null;
    private final android.widget.TextView time = null;
    private final android.widget.TextView heading = null;
    private final android.widget.TextView description = null;
    private final android.widget.ImageView ivDp = null;
    private final android.widget.TextView tvNetVotes = null;
    private final android.widget.CheckBox upvotes = null;
    private final android.widget.CheckBox downvotes = null;
    private final android.widget.TextView tvAnswers = null;
    private final android.widget.TextView tvTags = null;
    private final android.widget.TextView tvCollege = null;
    private final android.widget.TextView tvYear = null;
    private final android.widget.ImageView userBadge = null;
    private final android.widget.LinearLayout llMentorsDp = null;
    private final android.widget.ImageView ivContent = null;
    private final com.doubtless.doubtless.analytics.AnalyticsTracker analyticsTracker = null;
    
    public DoubtPreviewViewHolder(@org.jetbrains.annotations.NotNull
    android.view.View view, boolean showVotingLayout, @org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.doubt.view.viewholder.DoubtPreviewViewHolder.InteractionListener interactionListener) {
        super(null);
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.doubt.DoubtData doubtData) {
    }
    
    private final void setupMentorsWhoInteractedDpUi(com.doubtless.doubtless.screens.doubt.DoubtData doubtData) {
    }
    
    private final void setVotesUi(com.doubtless.doubtless.screens.doubt.DoubtData doubtData, com.doubtless.doubtless.screens.doubt.usecases.VotingUseCase votingUseCase) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\u000b"}, d2 = {"Lcom/doubtless/doubtless/screens/doubt/view/viewholder/DoubtPreviewViewHolder$InteractionListener;", "", "onDoubtClicked", "", "doubtData", "Lcom/doubtless/doubtless/screens/doubt/DoubtData;", "position", "", "onUserImageClicked", "userId", "", "app_debug"})
    public static abstract interface InteractionListener {
        
        public abstract void onDoubtClicked(@org.jetbrains.annotations.NotNull
        com.doubtless.doubtless.screens.doubt.DoubtData doubtData, int position);
        
        public abstract void onUserImageClicked(@org.jetbrains.annotations.NotNull
        java.lang.String userId);
    }
}