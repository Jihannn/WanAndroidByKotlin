package com.jihan.wanandroid.kotlin.net

import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * @Author Jihan
 * @Date 2020/5/18 17:08
 * @Description
 */
class ApiService {

    @GET("/article/list/{page}/json")
    fun getHomeList(@Path("page") pageNo: Int): Observable<BaseResponse<ArticleEntity>>
}