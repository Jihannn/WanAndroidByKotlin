package com.jihan.wanandroid.kotlin

import com.jihan.wanandroid.base.BaseActivity

/**
 * @Author Jihan
 * @Date 2020/5/18 15:07
 * @Description
 */
class AppActivity : BaseActivity<AppContract.IPresenter<AppContract.IView>>(), AppContract.IView {
    override fun createPresenter(): AppContract.IPresenter<AppContract.IView>? {
        return AppPresenter(this)
    }

    override fun getLayoutId(): Int {
        return -1
    }
}