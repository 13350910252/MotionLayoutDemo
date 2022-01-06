package com.yinp.motionlayoutdemo.jiandan

import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.widget.Toast
import androidx.constraintlayout.motion.widget.MotionLayout
import com.yinp.motionlayoutdemo.base.BaseActivity
import com.yinp.motionlayoutdemo.databinding.ActivityEazyOneBinding

class EazyOneActivity : BaseActivity<ActivityEazyOneBinding>() {
    override fun initViews() {
        bd.viewOne.setOnClickListener {
            Toast.makeText(mContext, "ceshi", Toast.LENGTH_LONG).show()
        }
//        bd.viewTwo.setOnClickListener {
//            Toast.makeText(mContext, "ceshi", Toast.LENGTH_LONG).show()
//        }
        bd.viewTwo.setOnTouchListener { v, event ->
            Log.d("abcd", "viewTwo:OnTouchListener ")
            true
        }
//        bd.viewsss.addTransitionListener(object : MotionLayout.TransitionListener {
//            override fun onTransitionStarted(
//                motionLayout: MotionLayout?,
//                startId: Int,
//                endId: Int
//            ) {
//                Log.d("abcd", "onTransitionStarted: ")
//            }
//
//            override fun onTransitionChange(
//                motionLayout: MotionLayout?,
//                startId: Int,
//                endId: Int,
//                progress: Float
//            ) {
//                Log.d("abcd", "onTransitionChange: ")
//            }
//
//            override fun onTransitionCompleted(motionLayout: MotionLayout?, currentId: Int) {
//                Log.d("abcd", "onTransitionCompleted: ")
//            }
//
//            override fun onTransitionTrigger(
//                motionLayout: MotionLayout?,
//                triggerId: Int,
//                positive: Boolean,
//                progress: Float
//            ) {
//                Log.d("abcd", "onTransitionTrigger: ")
//            }
//
//        })
    }

    override fun getBinding() = ActivityEazyOneBinding.inflate(layoutInflater)
}