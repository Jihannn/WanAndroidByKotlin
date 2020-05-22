package com.jihan.wanandroid.kotlin.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.jihan.wanandroid.base.BaseResponse
import com.jihan.wanandroid.kotlin.data.WxArticle
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit

/**
 * @Author Jihan
 * @Date 2020/5/22 14:34
 * @Description
 */
class ArticleRepository : ApiRepository() {
    companion object {
        val TAG = ArticleRepository::class.simpleName
    }

    fun getList(data: MutableLiveData<*>) {
        apiService.loadWxArticle().enqueue(object : Callback<BaseResponse<List<WxArticle>>> {
            override fun onFailure(call: Call<BaseResponse<List<WxArticle>>>, t: Throwable) {
                Log.i(TAG, "failures: $t" )
            }

            override fun onResponse(
                call: Call<BaseResponse<List<WxArticle>>>,
                response: Response<BaseResponse<List<WxArticle>>>
            ) {
                Log.i(TAG, response.body().toString())
                if (response.isSuccessful) {
                    data.value = response.body()
                }
            }
        })
    }
}