package com.jihan.wanandroid.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * @Author Jihan
 * @Date 2020/5/8 16:59
 * @Description
 */

abstract class BaseActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val layoutId = getLayoutId()
        if(layoutId != -1){
            setContentView(layoutId)
        }
        ActivityManager.instance.add(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        ActivityManager.instance.remove(this)
    }

    abstract fun getLayoutId() : Int
}