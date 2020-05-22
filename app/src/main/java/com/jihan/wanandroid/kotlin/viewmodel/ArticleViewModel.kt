package com.jihan.wanandroid.kotlin.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jihan.wanandroid.kotlin.data.WxArticle
import com.jihan.wanandroid.kotlin.repository.ArticleRepository

/**
 * @Author Jihan
 * @Date 2020/5/22 14:35
 * @Description
 */
class ArticleViewModel : ViewModel() {
    val mArticleData : MutableLiveData<List<WxArticle>> = MutableLiveData()

    fun getArticleList(){
        val repository = ArticleRepository()
        repository.getList(mArticleData)
    }
}