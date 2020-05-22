package com.jihan.wanandroid.kotlin.net

import com.fasterxml.jackson.annotation.JsonInclude
import com.jihan.wanandroid.base.BaseResponse
import com.jihan.wanandroid.kotlin.data.WxArticle
import retrofit2.Call
import retrofit2.http.GET

/**
 * @Author Jihan
 * @Date 2020/5/18 17:08
 * @Description
 */
interface ApiService {
    @GET("/wxarticle/chapters/json")
    fun loadWxArticle(): Call<BaseResponse<List<WxArticle>>>
}