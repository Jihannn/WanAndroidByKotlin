package com.jihan.wanandroid.kotlin.module.article.data

import com.squareup.moshi.JsonClass

/**
 * @Author Jihan
 * @Date 2020/5/22 14:31
 * @Description
 */
@JsonClass(generateAdapter = true)
data class WxArticle(var courseId:Int,
                     var id:Int,
                     var name:String,
                     var order:Long,
                     var parentChapterId:Int,
                     var userControlSetTop:Boolean,
                     var visible:Int)