package com.jihan.wanandroid.base

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import androidx.fragment.app.Fragment

/**
 * @Author Jihan
 * @Date 2020/5/18 16:09
 * @Description
 */
abstract class BaseFragment<P : IBasePresenter<*>> : Fragment(), IBaseView {
    var mPresenter: P? = null

    override fun onInflate(context: Context, attrs: AttributeSet, savedInstanceState: Bundle?) {
        super.onInflate(context, attrs, savedInstanceState)
    }

    abstract fun createPresenter():P?
}