package com.jihan.wanandroid.kotlin.module.article.view

import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.jihan.wanandroid.base.BaseLifecycleActivity
import com.jihan.wanandroid.kotlin.R
import com.jihan.wanandroid.kotlin.module.article.viewmodel.ArticleViewModel
import kotlinx.android.synthetic.main.activity_wxarticle.*

/**
 * @Author Jihan
 * @Date 2020/5/22 14:45
 * @Description
 */
class WxArticleActivity : BaseLifecycleActivity<ArticleViewModel>() {
    override fun getLayoutId(): Int = R.layout.activity_wxarticle

    override fun initView() {
        super.initView()
        btn_update.setOnClickListener {
            mViewModel.getArticleList()
        }
    }
    override fun initDataObserver() {
        mViewModel.mArticleData.observe(this, Observer { list ->
            var names = ""
            list.forEach { article ->
                names += article.name + "\n"
            }
            tv_title.text = names
        })
    }
}