package com.jihan.wanandroid.base

/**
 * @Author Jihan
 * @Date 2020/5/18 15:04
 * @Description
 */
abstract class BasePresenter<V : IBaseView>(view: V) : IBasePresenter<V> {
    protected var mView: V? = view
}