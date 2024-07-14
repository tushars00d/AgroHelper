package com.doubtless.doubtless.screens.auth;

import java.lang.System;

@kotlinx.android.parcel.Parcelize
@androidx.annotation.Keep
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0001;Be\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\rJ\u000b\u0010$\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010 J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\fH\u00c6\u0003Jn\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00c6\u0001\u00a2\u0006\u0002\u0010-J\t\u0010.\u001a\u00020/H\u00d6\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103H\u00d6\u0003J\t\u00104\u001a\u00020/H\u00d6\u0001J\t\u00105\u001a\u00020\u0003H\u00d6\u0001J\u0019\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020/H\u00d6\u0001R\u0015\u0010\n\u001a\u0004\u0018\u00010\u00038\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000f\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0012R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000f\"\u0004\b\u001c\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000f\"\u0004\b\u001e\u0010\u0012R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"\u00a8\u0006<"}, d2 = {"Lcom/doubtless/doubtless/screens/auth/User;", "Landroid/os/Parcelable;", "id", "", "name", "email", "phoneNumber", "photoUrl", "xpCount", "", "document_id", "local_user_attr", "Lcom/doubtless/doubtless/screens/auth/UserAttributes;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/doubtless/doubtless/screens/auth/UserAttributes;)V", "getDocument_id", "()Ljava/lang/String;", "getEmail", "setEmail", "(Ljava/lang/String;)V", "getId", "setId", "getLocal_user_attr", "()Lcom/doubtless/doubtless/screens/auth/UserAttributes;", "setLocal_user_attr", "(Lcom/doubtless/doubtless/screens/auth/UserAttributes;)V", "getName", "setName", "getPhoneNumber", "setPhoneNumber", "getPhotoUrl", "setPhotoUrl", "getXpCount", "()Ljava/lang/Long;", "setXpCount", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/doubtless/doubtless/screens/auth/UserAttributes;)Lcom/doubtless/doubtless/screens/auth/User;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "app_debug"})
@com.google.firebase.firestore.IgnoreExtraProperties
public final class User implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "id")
    private java.lang.String id;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "name")
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "email")
    private java.lang.String email;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "phoneNumber")
    private java.lang.String phoneNumber;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "photoUrl")
    private java.lang.String photoUrl;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "xpCount")
    private java.lang.Long xpCount;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String document_id = null;
    @org.jetbrains.annotations.Nullable
    private com.doubtless.doubtless.screens.auth.UserAttributes local_user_attr;
    @org.jetbrains.annotations.NotNull
    public static final com.doubtless.doubtless.screens.auth.User.Companion Companion = null;
    public static final android.os.Parcelable.Creator<com.doubtless.doubtless.screens.auth.User> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.doubtless.doubtless.screens.auth.User copy(@org.jetbrains.annotations.Nullable
    java.lang.String id, @org.jetbrains.annotations.Nullable
    java.lang.String name, @org.jetbrains.annotations.Nullable
    java.lang.String email, @org.jetbrains.annotations.Nullable
    java.lang.String phoneNumber, @org.jetbrains.annotations.Nullable
    java.lang.String photoUrl, @org.jetbrains.annotations.Nullable
    java.lang.Long xpCount, @org.jetbrains.annotations.Nullable
    java.lang.String document_id, @org.jetbrains.annotations.Nullable
    com.doubtless.doubtless.screens.auth.UserAttributes local_user_attr) {
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
    
    public User() {
        super();
    }
    
    public User(@org.jetbrains.annotations.Nullable
    java.lang.String id, @org.jetbrains.annotations.Nullable
    java.lang.String name, @org.jetbrains.annotations.Nullable
    java.lang.String email, @org.jetbrains.annotations.Nullable
    java.lang.String phoneNumber, @org.jetbrains.annotations.Nullable
    java.lang.String photoUrl, @org.jetbrains.annotations.Nullable
    java.lang.Long xpCount, @org.jetbrains.annotations.Nullable
    java.lang.String document_id, @org.jetbrains.annotations.Nullable
    com.doubtless.doubtless.screens.auth.UserAttributes local_user_attr) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @com.google.firebase.firestore.PropertyName(value = "id")
    public final java.lang.String getId() {
        return null;
    }
    
    @com.google.firebase.firestore.PropertyName(value = "id")
    public final void setId(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @com.google.firebase.firestore.PropertyName(value = "name")
    public final java.lang.String getName() {
        return null;
    }
    
    @com.google.firebase.firestore.PropertyName(value = "name")
    public final void setName(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @com.google.firebase.firestore.PropertyName(value = "email")
    public final java.lang.String getEmail() {
        return null;
    }
    
    @com.google.firebase.firestore.PropertyName(value = "email")
    public final void setEmail(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @com.google.firebase.firestore.PropertyName(value = "phoneNumber")
    public final java.lang.String getPhoneNumber() {
        return null;
    }
    
    @com.google.firebase.firestore.PropertyName(value = "phoneNumber")
    public final void setPhoneNumber(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @com.google.firebase.firestore.PropertyName(value = "photoUrl")
    public final java.lang.String getPhotoUrl() {
        return null;
    }
    
    @com.google.firebase.firestore.PropertyName(value = "photoUrl")
    public final void setPhotoUrl(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @com.google.firebase.firestore.PropertyName(value = "xpCount")
    public final java.lang.Long getXpCount() {
        return null;
    }
    
    @com.google.firebase.firestore.PropertyName(value = "xpCount")
    public final void setXpCount(@org.jetbrains.annotations.Nullable
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @com.google.firebase.firestore.Exclude
    public final java.lang.String getDocument_id() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.doubtless.doubtless.screens.auth.UserAttributes component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @com.google.firebase.firestore.Exclude
    public final com.doubtless.doubtless.screens.auth.UserAttributes getLocal_user_attr() {
        return null;
    }
    
    public final void setLocal_user_attr(@org.jetbrains.annotations.Nullable
    com.doubtless.doubtless.screens.auth.UserAttributes p0) {
    }
    
    @java.lang.Override
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override
    public void writeToParcel(@org.jetbrains.annotations.NotNull
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.doubtless.doubtless.screens.auth.User> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.doubtless.doubtless.screens.auth.User createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.doubtless.doubtless.screens.auth.User[] newArray(int size) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/doubtless/doubtless/screens/auth/User$Companion;", "", "()V", "parse", "Lcom/doubtless/doubtless/screens/auth/User;", "documentSnapshot", "Lcom/google/firebase/firestore/DocumentSnapshot;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.doubtless.doubtless.screens.auth.User parse(@org.jetbrains.annotations.Nullable
        com.google.firebase.firestore.DocumentSnapshot documentSnapshot) {
            return null;
        }
    }
}