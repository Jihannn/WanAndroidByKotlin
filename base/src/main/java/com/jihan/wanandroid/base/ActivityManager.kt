package com.jihan.wanandroid.base

import android.app.Activity
import java.util.*

/**
 * @Author Jihan
 * @Date 2020/5/9 10:08
 * @Description
 */
class ActivityManager private constructor() {
    private val stack = Stack<Activity>()

    companion object {
        val instance by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
            ActivityManager()
        }
    }

    fun add(activity: Activity) {
        stack.push(activity)
    }

    fun remove(activity: Activity) {
        if (stack.isNotEmpty()) {
            stack.remove(activity)
        }
    }

    fun getTop(): Activity? {
        if (stack.isNotEmpty()) {
            return stack.peek()
        }
        return null
    }

    fun finish() {
        stack.clear()
    }
}