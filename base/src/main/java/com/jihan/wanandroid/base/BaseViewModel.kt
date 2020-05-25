package com.jihan.wanandroid.base

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.jihan.wanandroid.utils.getClass

/**
 * @Author Jihan
 * @Date 2020/5/25 9:58
 * @Description
 */
open class BaseViewModel<T : BaseRepository> : ViewModel() {
    val mRepository: T by lazy {
        getClass<T>(this).newInstance()
    }
}