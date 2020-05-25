package com.jihan.wanandroid.utils

import android.content.Context
import android.content.SharedPreferences
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 * @Author Jihan
 * @Date 2020/5/25 15:09
 * @Description
 */
class SpUtils<T>(private val keyName: String, private val default: T) :
    ReadWriteProperty<Any?, T> {
    companion object {
        lateinit var mSharePreference: SharedPreferences
        fun init(context: Context) {
            mSharePreference = context.applicationContext.getSharedPreferences(
                context.packageName,
                Context.MODE_PRIVATE
            )
        }
    }

    override fun getValue(thisRef: Any?, property: KProperty<*>): T = getSpValue(keyName, default)

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: T) = setSpValue(keyName, value)

    private fun getSpValue(key: String, default: T): T {
        return mSharePreference.run {
            when (default) {
                is Long -> getLong(key, default)
                is Boolean -> getBoolean(key, default)
                is Float -> getFloat(key, default)
                is Int -> getInt(key, default)
                is String -> getString(key, default)
                else -> throw IllegalArgumentException("This type can't be get from Preferences")
            }
        } as T
    }

    private fun setSpValue(key: String, value: T) {
        return mSharePreference.edit().run {
            when (value) {
                is Long -> putLong(key, value)
                is Boolean -> putBoolean(key, value)
                is Float -> putFloat(key, value)
                is Int -> putInt(key, value)
                is String -> putString(key, value)
                else -> throw IllegalArgumentException("This type can't be put in Preferences")
            }.apply()
        }
    }
}