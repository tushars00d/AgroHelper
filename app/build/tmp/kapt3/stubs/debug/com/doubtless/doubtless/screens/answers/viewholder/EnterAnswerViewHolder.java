package com.doubtless.doubtless.screens.answers.viewholder;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0013\u0014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/doubtless/doubtless/screens/answers/viewholder/EnterAnswerViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "interactionListener", "Lcom/doubtless/doubtless/screens/answers/viewholder/EnterAnswerViewHolder$InteractionListener;", "(Landroid/view/View;Lcom/doubtless/doubtless/screens/answers/viewholder/EnterAnswerViewHolder$InteractionListener;)V", "authorName", "Landroid/widget/TextView;", "btnPublish", "etAnswer", "Landroid/widget/EditText;", "ivDp", "Landroid/widget/ImageView;", "tvCollege", "setData", "", "user", "Lcom/doubtless/doubtless/screens/auth/User;", "InteractionListener", "PublishAnswerDTO", "app_debug"})
public final class EnterAnswerViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    private final com.doubtless.doubtless.screens.answers.viewholder.EnterAnswerViewHolder.InteractionListener interactionListener = null;
    private final android.widget.EditText etAnswer = null;
    private final android.view.View btnPublish = null;
    private final android.widget.TextView authorName = null;
    private final android.widget.ImageView ivDp = null;
    private final android.widget.TextView tvCollege = null;
    
    public EnterAnswerViewHolder(@org.jetbrains.annotations.NotNull
    android.view.View itemView, @org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.answers.viewholder.EnterAnswerViewHolder.InteractionListener interactionListener) {
        super(null);
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull
    com.doubtless.doubtless.screens.auth.User user) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lcom/doubtless/doubtless/screens/answers/viewholder/EnterAnswerViewHolder$PublishAnswerDTO;", "", "description", "", "(Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class PublishAnswerDTO {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String description = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.doubtless.doubtless.screens.answers.viewholder.EnterAnswerViewHolder.PublishAnswerDTO copy(@org.jetbrains.annotations.NotNull
        java.lang.String description) {
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
        
        public PublishAnswerDTO(@org.jetbrains.annotations.NotNull
        java.lang.String description) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getDescription() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/doubtless/doubtless/screens/answers/viewholder/EnterAnswerViewHolder$InteractionListener;", "", "onAnswerPublish", "", "publishAnswerDTO", "Lcom/doubtless/doubtless/screens/answers/viewholder/EnterAnswerViewHolder$PublishAnswerDTO;", "app_debug"})
    public static abstract interface InteractionListener {
        
        public abstract void onAnswerPublish(@org.jetbrains.annotations.NotNull
        com.doubtless.doubtless.screens.answers.viewholder.EnterAnswerViewHolder.PublishAnswerDTO publishAnswerDTO);
    }
}