package com.doubtless.doubtless.screens.search;

import java.lang.System;

@androidx.annotation.Keep
@kotlinx.android.parcel.Parcelize
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b-\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010\u00a2\u0006\u0002\u0010\u0011J\u000b\u00100\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\u000eH\u00c6\u0003J\u0011\u00102\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010H\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010:\u001a\u00020\fH\u00c6\u0003J\u008f\u0001\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010H\u00c6\u0001J\t\u0010<\u001a\u00020\u000eH\u00d6\u0001J\u0013\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010@H\u00d6\u0003J\t\u0010A\u001a\u00020\u000eH\u00d6\u0001J\u0006\u0010B\u001a\u00020CJ\u0006\u0010D\u001a\u00020EJ\t\u0010F\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020\u000eH\u00d6\u0001R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\fX\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\r\u001a\u00020\u000eX\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0013\"\u0004\b)\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0013\"\u0004\b+\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0013\"\u0004\b-\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0013\"\u0004\b/\u0010\u0015\u00a8\u0006L"}, d2 = {"Lcom/doubtless/doubtless/screens/search/SearchResult;", "Landroid/os/Parcelable;", "id", "", "userName", "userId", "userPhotoUrl", "heading", "description", "college", "year", "netVotes", "", "no_answers", "", "tags", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FILjava/util/List;)V", "getCollege", "()Ljava/lang/String;", "setCollege", "(Ljava/lang/String;)V", "getDescription", "setDescription", "getHeading", "setHeading", "getId", "setId", "getNetVotes", "()F", "setNetVotes", "(F)V", "getNo_answers", "()I", "setNo_answers", "(I)V", "getTags", "()Ljava/util/List;", "setTags", "(Ljava/util/List;)V", "getUserId", "setUserId", "getUserName", "setUserName", "getUserPhotoUrl", "setUserPhotoUrl", "getYear", "setYear", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toDoubtData", "Lcom/doubtless/doubtless/screens/doubt/DoubtData;", "toGenericEntity", "Lcom/doubtless/doubtless/screens/home/entities/FeedEntity;", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class SearchResult implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "doubt_id")
    private java.lang.String id;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "author_name")
    private java.lang.String userName;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "author_id")
    private java.lang.String userId;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "author_photo_url")
    private java.lang.String userPhotoUrl;
    @org.jetbrains.annotations.Nullable
    private java.lang.String heading;
    @org.jetbrains.annotations.Nullable
    private java.lang.String description;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "author_college")
    private java.lang.String college;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "author_year")
    private java.lang.String year;
    @com.google.gson.annotations.SerializedName(value = "net_votes")
    private float netVotes;
    @com.google.gson.annotations.SerializedName(value = "count_answers")
    private int no_answers;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "tags")
    private java.util.List<java.lang.String> tags;
    public static final android.os.Parcelable.Creator<com.doubtless.doubtless.screens.search.SearchResult> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.doubtless.doubtless.screens.search.SearchResult copy(@org.jetbrains.annotations.Nullable
    java.lang.String id, @org.jetbrains.annotations.Nullable
    java.lang.String userName, @org.jetbrains.annotations.Nullable
    java.lang.String userId, @org.jetbrains.annotations.Nullable
    java.lang.String userPhotoUrl, @org.jetbrains.annotations.Nullable
    java.lang.String heading, @org.jetbrains.annotations.Nullable
    java.lang.String description, @org.jetbrains.annotations.Nullable
    java.lang.String college, @org.jetbrains.annotations.Nullable
    java.lang.String year, float netVotes, int no_answers, @org.jetbrains.annotations.Nullable
    java.util.List<java.lang.String> tags) {
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
    
    public SearchResult() {
        super();
    }
    
    public SearchResult(@org.jetbrains.annotations.Nullable
    java.lang.String id, @org.jetbrains.annotations.Nullable
    java.lang.String userName, @org.jetbrains.annotations.Nullable
    java.lang.String userId, @org.jetbrains.annotations.Nullable
    java.lang.String userPhotoUrl, @org.jetbrains.annotations.Nullable
    java.lang.String heading, @org.jetbrains.annotations.Nullable
    java.lang.String description, @org.jetbrains.annotations.Nullable
    java.lang.String college, @org.jetbrains.annotations.Nullable
    java.lang.String year, float netVotes, int no_answers, @org.jetbrains.annotations.Nullable
    java.util.List<java.lang.String> tags) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @com.google.firebase.firestore.PropertyName(value = "doubt_id")
    public final java.lang.String getId() {
        return null;
    }
    
    @com.google.firebase.firestore.PropertyName(value = "doubt_id")
    public final void setId(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @com.google.firebase.firestore.PropertyName(value = "author_name")
    public final java.lang.String getUserName() {
        return null;
    }
    
    @com.google.firebase.firestore.PropertyName(value = "author_name")
    public final void setUserName(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @com.google.firebase.firestore.PropertyName(value = "author_id")
    public final java.lang.String getUserId() {
        return null;
    }
    
    @com.google.firebase.firestore.PropertyName(value = "author_id")
    public final void setUserId(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @com.google.firebase.firestore.PropertyName(value = "author_photo_url")
    public final java.lang.String getUserPhotoUrl() {
        return null;
    }
    
    @com.google.firebase.firestore.PropertyName(value = "author_photo_url")
    public final void setUserPhotoUrl(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getHeading() {
        return null;
    }
    
    public final void setHeading(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @com.google.firebase.firestore.PropertyName(value = "author_college")
    public final java.lang.String getCollege() {
        return null;
    }
    
    @com.google.firebase.firestore.PropertyName(value = "author_college")
    public final void setCollege(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @com.google.firebase.firestore.PropertyName(value = "author_year")
    public final java.lang.String getYear() {
        return null;
    }
    
    @com.google.firebase.firestore.PropertyName(value = "author_year")
    public final void setYear(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    public final float component9() {
        return 0.0F;
    }
    
    @com.google.firebase.firestore.PropertyName(value = "net_votes")
    public final float getNetVotes() {
        return 0.0F;
    }
    
    @com.google.firebase.firestore.PropertyName(value = "net_votes")
    public final void setNetVotes(float p0) {
    }
    
    public final int component10() {
        return 0;
    }
    
    @com.google.firebase.firestore.PropertyName(value = "count_answers")
    public final int getNo_answers() {
        return 0;
    }
    
    @com.google.firebase.firestore.PropertyName(value = "count_answers")
    public final void setNo_answers(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @com.google.firebase.firestore.PropertyName(value = "tags")
    public final java.util.List<java.lang.String> getTags() {
        return null;
    }
    
    @com.google.firebase.firestore.PropertyName(value = "tags")
    public final void setTags(@org.jetbrains.annotations.Nullable
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.doubtless.doubtless.screens.home.entities.FeedEntity toGenericEntity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.doubtless.doubtless.screens.doubt.DoubtData toDoubtData() {
        return null;
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
    public static final class Creator implements android.os.Parcelable.Creator<com.doubtless.doubtless.screens.search.SearchResult> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.doubtless.doubtless.screens.search.SearchResult createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.doubtless.doubtless.screens.search.SearchResult[] newArray(int size) {
            return null;
        }
    }
}