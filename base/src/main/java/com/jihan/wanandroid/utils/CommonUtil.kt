package com.jihan.wanandroid.utils

import java.lang.reflect.ParameterizedType

/**
 * @Author Jihan
 * @Date 2020/5/25 10:20
 * @Description
 */
fun <T> getClass(t: Any): Class<T> {
    return (t.javaClass.genericSuperclass as ParameterizedType).actualTypeArguments[0] as Class<T>
}