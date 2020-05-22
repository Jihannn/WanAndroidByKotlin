package com.jihan.wanandroid.kotlin.data

/**
 * @Author Jihan
 * @Date 2020/5/22 14:31
 * @Description
 */
data class WxArticle(var courseId:Int,
                     var id:Int,
                     var name:String,
                     var order:Long,
                     var parentChapterId:Int,
                     var userControlSetTop:Boolean,
                     var visible:Int)