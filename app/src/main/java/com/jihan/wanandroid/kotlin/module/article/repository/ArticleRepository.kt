package com.jihan.wanandroid.kotlin.module.article.repository

import androidx.lifecycle.MutableLiveData
import com.jihan.wanandroid.base.BaseResponse
import com.jihan.wanandroid.base.BaseResponseJsonAdapter
import com.jihan.wanandroid.kotlin.module.article.data.WxArticle
import com.jihan.wanandroid.kotlin.repository.ApiRepository
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

/**
 * @Author Jihan
 * @Date 2020/5/22 14:34
 * @Description
 */
class ArticleRepository : ApiRepository() {
    companion object {
        val TAG = ArticleRepository::class.simpleName
    }

    suspend fun getList(data: MutableLiveData<List<WxArticle>>) {
        val resp = withContext(Dispatchers.IO) {
            apiService.loadWxArticle()
        }
        resp.run {
            if (this.errorCode == 0) {
                data.value = this.data
            }
        }
    }
}