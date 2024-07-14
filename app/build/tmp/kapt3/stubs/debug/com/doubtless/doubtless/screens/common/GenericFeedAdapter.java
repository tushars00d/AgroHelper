package com.doubtless.doubtless.screens.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB3\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\u0014\u0010\u000e\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010J\u0006\u0010\u0011\u001a\u00020\bJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0016J\u0018\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0013H\u0016J\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0013H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/doubtless/doubtless/screens/common/GenericFeedAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "genericFeedEntities", "", "Lcom/doubtless/doubtless/screens/home/entities/FeedEntity;", "onLastItemReached", "Lkotlin/Function0;", "", "interactionListener", "Lcom/doubtless/doubtless/screens/common/GenericFeedAdapter$InteractionListener;", "user", "Lcom/doubtless/doubtless/screens/auth/User;", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;Lcom/doubtless/doubtless/screens/common/GenericFeedAdapter$InteractionListener;Lcom/doubtless/doubtless/screens/auth/User;)V", "appendDoubts", "doubts", "", "clearCurrentList", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "InteractionListener", "app_debug"})
public final class GenericFeedAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final java.util.List<com.doubtless.doubtless.screens.home.entities.FeedEntity> genericFeedEntities = null;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onLastItemReached = null;
    private final com.doubtless.doubtless.screens.common.GenericFeedAdapter.InteractionListener interactionListener = null;
    private final com.doubtless.doubtless.screens.auth.User user = null;
    
    public GenericFeedAdapter(@org.jetbrains.annotations.NotNull
    java.util.List<com.doubtless.doubtless.screens.home.entities.FeedEntity> genericFeedEntities, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onLastItemReached, @org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.common.GenericFeedAdapter.InteractionListener interactionListener, @org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.auth.User user) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    public final void clearCurrentList() {
    }
    
    public final void appendDoubts(@org.jetbrains.annotations.NotNull
    java.util.List<com.doubtless.doubtless.screens.home.entities.FeedEntity> doubts) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public int getItemViewType(int position) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\fH&\u00a8\u0006\r"}, d2 = {"Lcom/doubtless/doubtless/screens/common/GenericFeedAdapter$InteractionListener;", "", "onDeleteAccountClicked", "", "onDoubtClicked", "doubtData", "Lcom/doubtless/doubtless/screens/doubt/DoubtData;", "position", "", "onSignOutClicked", "onSubmitFeedbackClicked", "onUserImageClicked", "", "app_debug"})
    public static abstract interface InteractionListener {
        
        public abstract void onUserImageClicked(@org.jetbrains.annotations.NotNull
        java.lang.String doubtData);
        
        public abstract void onDoubtClicked(@org.jetbrains.annotations.NotNull
        com.doubtless.doubtless.screens.doubt.DoubtData doubtData, int position);
        
        public abstract void onSignOutClicked();
        
        public abstract void onSubmitFeedbackClicked();
        
        public abstract void onDeleteAccountClicked();
    }
}