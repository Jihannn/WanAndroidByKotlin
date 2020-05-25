package com.jihan.wanandroid.base

import androidx.lifecycle.ViewModelProvider
import com.jihan.wanandroid.utils.getClass

/**
 * @Author Jihan
 * @Date 2020/5/25 10:43
 * @Description
 */
abstract class BaseLifecycleActivity<VM : BaseViewModel<*>> : BaseActivity() {
    lateinit var mViewModel: VM

    override fun initView() {
        mViewModel = ViewModelProvider(this).get(getClass<VM>(this))
        initDataObserver()
    }

    abstract fun initDataObserver()
}