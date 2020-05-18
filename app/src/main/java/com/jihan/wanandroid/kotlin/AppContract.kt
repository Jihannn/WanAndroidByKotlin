package com.jihan.wanandroid.kotlin

import com.jihan.wanandroid.base.IBasePresenter
import com.jihan.wanandroid.base.IBaseView

/**
 * @Author Jihan
 * @Date 2020/5/18 15:23
 * @Description
 */
interface AppContract {
    interface IPresenter<T> : IBasePresenter<IView> {
        fun doSomething()
    }

    interface IView : IBaseView {

    }
}