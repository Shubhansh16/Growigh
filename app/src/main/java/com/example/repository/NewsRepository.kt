package com.example.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.api.NewsService
import com.example.models.NewsList

class NewsRepository(private val newsService: NewsService) {
    private val newsLiveData= MutableLiveData<NewsList>()
    var pageNum=1
    val news: LiveData<NewsList>
        get() = newsLiveData

    suspend fun getNews(){
        val result=newsService.getNews(pageNum)
        if(result?.body()!=null){
            newsLiveData.postValue(result.body())
        }
    }
}