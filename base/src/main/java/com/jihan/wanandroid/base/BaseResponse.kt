package com.jihan.wanandroid.base

import com.squareup.moshi.JsonClass

/**
 * @Author Jihan
 * @Date 2020/5/22 14:37
 * @Description
 */
@JsonClass(generateAdapter = true)
data class BaseResponse<T>(var data: T, var errorCode: Int, var errorMsg: String = "")