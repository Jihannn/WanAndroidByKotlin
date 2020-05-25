package com.jihan.wanandroid.kotlin.module.article.viewmodel

import android.app.Application
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.jihan.wanandroid.base.BaseResponse
import com.jihan.wanandroid.base.BaseViewModel
import com.jihan.wanandroid.kotlin.module.article.data.WxArticle
import com.jihan.wanandroid.kotlin.module.article.repository.ArticleRepository
import kotlinx.coroutines.launch

/**
 * @Author Jihan
 * @Date 2020/5/22 14:35
 * @Description
 */
class ArticleViewModel : BaseViewModel<ArticleRepository>() {
    val mArticleData: MutableLiveData<List<WxArticle>> = MutableLiveData()

    fun getArticleList() {
        viewModelScope.launch {
            mRepository.getList(mArticleData)
        }
    }
}