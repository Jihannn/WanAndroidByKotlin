package com.jihan.wanandroid.base

/**
 * @Author Jihan
 * @Date 2020/5/22 14:37
 * @Description
 */
data class BaseResponse<T>(var data: T, var errorCode: Int, var errorMsg: String = "")