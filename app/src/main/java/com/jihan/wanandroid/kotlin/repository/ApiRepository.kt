package com.jihan.wanandroid.kotlin.repository

import com.jihan.wanandroid.base.BaseRepository
import com.jihan.wanandroid.kotlin.net.ApiService
import com.jihan.wanandroid.net.RetrofitFactory

/**
 * @Author Jihan
 * @Date 2020/5/22 14:41
 * @Description
 */
open class ApiRepository : BaseRepository() {
    protected val apiService:ApiService by lazy{
        RetrofitFactory.instance.create(ApiService::class.java)
    }
}