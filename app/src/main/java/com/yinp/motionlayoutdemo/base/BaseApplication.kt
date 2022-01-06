package com.yinp.motionlayoutdemo.base

import android.app.Activity
import android.app.Application
import android.content.Context
import android.os.Process

/**
 * @author   :yinpeng
 * date      :2021/10/9
 * package   :com.yinp.proappkotlin
 * describe  :
 */
open class BaseApplication : Application() {
    protected var mAppContext: Context? = null

    companion object {
        private val TYPE_DEBUG = "type_debug"
        private val TYPE_RELEASE = "type_release"
        private val TYPE = TYPE_DEBUG
    }

    override fun onCreate() {
        super.onCreate()
        mAppContext = this
    }

}