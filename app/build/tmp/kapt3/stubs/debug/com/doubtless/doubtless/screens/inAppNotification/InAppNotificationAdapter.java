package com.doubtless.doubtless.screens.inAppNotification;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\nH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u0016J\u0014\u0010\u0017\u001a\u00020\u00112\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\fR\u000e\u0010\t\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/doubtless/doubtless/screens/inAppNotification/InAppNotificationAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "notifications", "", "Lcom/doubtless/doubtless/screens/inAppNotification/model/InAppNotificationEntity;", "interactionListener", "Lcom/doubtless/doubtless/screens/inAppNotification/InAppNotificationAdapter$InteractionListener;", "(Ljava/util/List;Lcom/doubtless/doubtless/screens/inAppNotification/InAppNotificationAdapter$InteractionListener;)V", "TYPE_POST_ANSWER", "", "data", "", "getItemCount", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setNewNotifications", "newNotifications", "InteractionListener", "app_debug"})
public final class InAppNotificationAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final java.util.List<com.doubtless.doubtless.screens.inAppNotification.model.InAppNotificationEntity> notifications = null;
    private final com.doubtless.doubtless.screens.inAppNotification.InAppNotificationAdapter.InteractionListener interactionListener = null;
    private final int TYPE_POST_ANSWER = 1;
    private final java.util.List<com.doubtless.doubtless.screens.inAppNotification.model.InAppNotificationEntity> data = null;
    
    public InAppNotificationAdapter(@org.jetbrains.annotations.NotNull
    java.util.List<com.doubtless.doubtless.screens.inAppNotification.model.InAppNotificationEntity> notifications, @org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.inAppNotification.InAppNotificationAdapter.InteractionListener interactionListener) {
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
    
    @java.lang.Override
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    public final void setNewNotifications(@org.jetbrains.annotations.NotNull
    java.util.List<com.doubtless.doubtless.screens.inAppNotification.model.InAppNotificationEntity> newNotifications) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/doubtless/doubtless/screens/inAppNotification/InAppNotificationAdapter$InteractionListener;", "", "onPostAnswerNotifClicked", "", "doubtId", "", "app_debug"})
    public static abstract interface InteractionListener {
        
        public abstract void onPostAnswerNotifClicked(@org.jetbrains.annotations.NotNull
        java.lang.String doubtId);
    }
}