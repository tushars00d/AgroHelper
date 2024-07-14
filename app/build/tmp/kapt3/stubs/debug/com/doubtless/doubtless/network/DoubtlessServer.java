package com.doubtless.doubtless.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J/\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ5\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0001\u0010\u000e\u001a\u00020\u000f2\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J+\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0001\u0010\u0014\u001a\u00020\t2\b\b\u0003\u0010\u0015\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/doubtless/doubtless/network/DoubtlessServer;", "", "publishAnswer", "Lcom/doubtless/doubtless/screens/answers/PublishAnswerResponse;", "publishAnswerReq", "Lcom/doubtless/doubtless/screens/answers/PublishAnswerRequest;", "debug", "", "appVersion", "", "(Lcom/doubtless/doubtless/screens/answers/PublishAnswerRequest;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "publishDoubt", "Lretrofit2/Response;", "", "publishDoubtRequest", "Lcom/doubtless/doubtless/screens/doubt/PublishDoubtRequest;", "(Lcom/doubtless/doubtless/screens/doubt/PublishDoubtRequest;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchDoubts", "", "Lcom/doubtless/doubtless/screens/search/SearchResult;", "query", "contentType", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface DoubtlessServer {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.POST(value = "doubts")
    public abstract java.lang.Object publishDoubt(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.doubtless.doubtless.screens.doubt.PublishDoubtRequest publishDoubtRequest, @retrofit2.http.Header(value = "is_debug")
    boolean debug, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "app_version")
    java.lang.String appVersion, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<kotlin.Unit>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.POST(value = "doubts/answer")
    public abstract java.lang.Object publishAnswer(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.doubtless.doubtless.screens.answers.PublishAnswerRequest publishAnswerReq, @retrofit2.http.Header(value = "is_debug")
    boolean debug, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "app_version")
    java.lang.String appVersion, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.doubtless.doubtless.screens.answers.PublishAnswerResponse> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.POST(value = "search")
    public abstract java.lang.Object searchDoubts(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    java.lang.String query, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String contentType, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.doubtless.doubtless.screens.search.SearchResult>> continuation);
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 3)
    public final class DefaultImpls {
    }
}