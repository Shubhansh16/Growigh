package com.example.api

import com.example.models.NewsList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsService {

    @GET("v2/top-headlines?country=us&apiKey=35f43e2f984142a59f671d92adfceb24")
    suspend fun getNews(@Query("page") page: Int): Response<NewsList>

}