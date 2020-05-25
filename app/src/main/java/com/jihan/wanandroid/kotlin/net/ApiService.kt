package com.jihan.wanandroid.kotlin.net

import com.jihan.wanandroid.base.BaseResponse
import com.jihan.wanandroid.kotlin.module.article.data.WxArticle
import retrofit2.Response
import retrofit2.http.GET

/**
 * @Author Jihan
 * @Date 2020/5/18 17:08
 * @Description
 */
interface ApiService {
    @GET("/wxarticle/chapters/json")
    suspend fun loadWxArticle(): BaseResponse<List<WxArticle>>
}