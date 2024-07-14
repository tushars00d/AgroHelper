package com.doubtless.doubtless.localDatabase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/doubtless/doubtless/localDatabase/Converters;", "", "()V", "gson", "Lcom/google/gson/Gson;", "longToTimestamp", "Lcom/google/firebase/Timestamp;", "value", "", "timestampToLong", "timestamp", "app_debug"})
public final class Converters {
    private final com.google.gson.Gson gson = null;
    
    public Converters() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.TypeConverter
    public final com.google.firebase.Timestamp longToTimestamp(long value) {
        return null;
    }
    
    @androidx.room.TypeConverter
    public final long timestampToLong(@org.jetbrains.annotations.NotNull
    com.google.firebase.Timestamp timestamp) {
        return 0L;
    }
}