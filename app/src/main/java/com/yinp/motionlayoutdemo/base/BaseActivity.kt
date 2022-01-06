package com.yinp.motionlayoutdemo.base

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.FragmentActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<VB : ViewBinding> : FragmentActivity(), View.OnClickListener {
    protected lateinit var bd: VB
    protected lateinit var mContext: Context
    protected lateinit var mActivity: Activity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bd = getBinding()
        setContentView(bd.root)
        mContext = this
        mActivity = this

        initViews()
    }

    /**
     * 初始化点击事件
     */
    protected fun initClick(vararg views: View) {
        for (element in views) {
            element.setOnClickListener(this)
        }
    }

    override fun onClick(v: View?) {

    }

    abstract fun initViews()

    /**
     * 获取布局
     */
    protected abstract fun getBinding(): VB

}