package com.jp_funda.qiitaclient.view.search

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jp_funda.qiitaclient.model.Article
import com.jp_funda.qiitaclient.repository.ArticleRepository
import kotlinx.coroutines.launch

class SearchViewModel : ViewModel() {
    private val repository = ArticleRepository()

    private val _articles = MutableLiveData<List<Article>>()
    val articles: LiveData<List<Article>> = _articles

    fun searchArticles(query: String) {
        viewModelScope.launch {
            val result = repository.searchArticles(query)
            _articles.postValue(result ?: listOf())
        }
    }
}