package com.doubtless.doubtless.screens.dashboard.viewholder;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/doubtless/doubtless/screens/dashboard/viewholder/UserProfileViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "interactionListener", "Lcom/doubtless/doubtless/screens/dashboard/viewholder/UserProfileViewHolder$InteractionListener;", "otherUser", "", "(Landroid/view/View;Lcom/doubtless/doubtless/screens/dashboard/viewholder/UserProfileViewHolder$InteractionListener;Z)V", "deleteAccount", "Landroid/widget/TextView;", "signOutButton", "Lcom/doubtless/doubtless/theming/buttons/SecondaryButton;", "submitFeedback", "tvBio", "userEmail", "userImage", "Landroid/widget/ImageView;", "userName", "setData", "", "user", "Lcom/doubtless/doubtless/screens/auth/User;", "InteractionListener", "app_debug"})
public final class UserProfileViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    private final com.doubtless.doubtless.screens.dashboard.viewholder.UserProfileViewHolder.InteractionListener interactionListener = null;
    private final boolean otherUser = false;
    private final android.widget.ImageView userImage = null;
    private final android.widget.TextView userName = null;
    private final android.widget.TextView userEmail = null;
    private final com.doubtless.doubtless.theming.buttons.SecondaryButton signOutButton = null;
    private final android.widget.TextView submitFeedback = null;
    private final android.widget.TextView deleteAccount = null;
    private final android.widget.TextView tvBio = null;
    
    public UserProfileViewHolder(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.dashboard.viewholder.UserProfileViewHolder.InteractionListener interactionListener, boolean otherUser) {
        super(null);
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.auth.User user) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lcom/doubtless/doubtless/screens/dashboard/viewholder/UserProfileViewHolder$InteractionListener;", "", "onDeleteAccountClicked", "", "onSignOutClicked", "onSubmitFeedbackClicked", "app_debug"})
    public static abstract interface InteractionListener {
        
        public abstract void onDeleteAccountClicked();
        
        public abstract void onSignOutClicked();
        
        public abstract void onSubmitFeedbackClicked();
    }
}