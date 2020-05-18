package com.jihan.wanandroid.kotlin

import com.jihan.wanandroid.base.BasePresenter
import com.jihan.wanandroid.kotlin.net.ApiService
import com.jihan.wanandroid.net.RetrofitFactory

/**
 * @Author Jihan
 * @Date 2020/5/18 15:08
 * @Description
 */
class AppPresenter(view : AppContract.IView) :
    BasePresenter<AppContract.IView>(view),
    AppContract.IPresenter<AppContract.IView>{
    override fun doSomething() {
        RetrofitFactory.instance
            .create(ApiService::class.java)
            .
    }

}