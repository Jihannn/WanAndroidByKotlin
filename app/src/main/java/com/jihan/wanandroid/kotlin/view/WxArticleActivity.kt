package com.jihan.wanandroid.kotlin.view

import android.os.Bundle
import android.widget.BaseAdapter
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.jihan.wanandroid.base.BaseActivity
import com.jihan.wanandroid.kotlin.R
import com.jihan.wanandroid.kotlin.data.WxArticle
import com.jihan.wanandroid.kotlin.viewmodel.ArticleViewModel
import kotlinx.android.synthetic.main.activity_wxarticle.*

/**
 * @Author Jihan
 * @Date 2020/5/22 14:45
 * @Description
 */
class WxArticleActivity : BaseActivity() {
    private lateinit var mViewModel: ArticleViewModel
    override fun getLayoutId(): Int {
        return R.layout.activity_wxarticle
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewModel = ViewModelProvider(this).get(ArticleViewModel::class.java)
        val observer = Observer<List<WxArticle>> { list ->
            var names = ""
            list.forEach { article ->
                names += article.name + "\n"
            }
            tv_title.text = names
        }
        mViewModel.mArticleData.observe(this, observer)
        btn_update.setOnClickListener {
            mViewModel.getArticleList()
        }
    }
}