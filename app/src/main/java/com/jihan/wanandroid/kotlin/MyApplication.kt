package com.jihan.wanandroid.kotlin

import android.app.Application
import com.jihan.wanandroid.utils.SpUtils

/**
 * @Author Jihan
 * @Date 2020/5/25 15:19
 * @Description
 */
class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        SpUtils.init(this)
    }
}