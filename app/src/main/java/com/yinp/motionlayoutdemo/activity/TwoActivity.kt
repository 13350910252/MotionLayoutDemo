package com.yinp.motionlayoutdemo.activity

import android.util.Log
import android.view.View
import android.widget.ImageView
import androidx.constraintlayout.helper.widget.Carousel
import androidx.constraintlayout.motion.widget.MotionLayout
import com.yinp.motionlayoutdemo.R
import com.yinp.motionlayoutdemo.base.BaseActivity
import com.yinp.motionlayoutdemo.databinding.ActivityTwoBinding

class TwoActivity : BaseActivity<ActivityTwoBinding>() {
    var count: Int = 0
    override fun initViews() {
        bd.mlStart.addTransitionListener(object : MotionLayout.TransitionListener {
            override fun onTransitionStarted(
                motionLayout: MotionLayout?,
                startId: Int,
                endId: Int
            ) {
//                if (endId == 2131231141) {
//                    count++
//                    bd.mlCc.set
//                    bd.mlCc.setTransition(R.id.sssaaa)
//                    bd.mlCc.transitionToEnd()
//                }
            }

            override fun onTransitionChange(
                motionLayout: MotionLayout?,
                startId: Int,
                endId: Int,
                progress: Float
            ) {
//                Log.d("abcd", "onTransitionChange:aaa " + endId)
            }

            override fun onTransitionCompleted(motionLayout: MotionLayout?, currentId: Int) {
//                Log.d("abcd", "onTransitionTrigger:aaabbbb " + currentId)
//                if (count == 2) {
//                    count = 0
//                    bd.mlCc.setTransition(R.id.startaatwo)
//                }
            }

            override fun onTransitionTrigger(
                motionLayout: MotionLayout?,
                triggerId: Int,
                positive: Boolean,
                progress: Float
            ) {
            }

        })
        bd.mlCc.addTransitionListener(object : MotionLayout.TransitionListener {
            override fun onTransitionStarted(
                motionLayout: MotionLayout?,
                startId: Int,
                endId: Int
            ) {
            }

            override fun onTransitionChange(
                motionLayout: MotionLayout?,
                startId: Int,
                endId: Int,
                progress: Float
            ) {
                Log.d("abcd", "onTransitionChange:aaacccc " + endId)

//                Log.d("abcd", "onTransitionChange: " + motionLayout)
//                Log.d("abcd", "onTransitionChange: "+progress)
//                if (progress > 0.01)
                if (endId == R.id.startaatwo)
                    bd.mlStart.progress = progress

            }

            override fun onTransitionCompleted(motionLayout: MotionLayout?, currentId: Int) {
//                if (bd.mlStart.progress != 100f){
//                    bd.mlStart.progress = 100f
//                    bd.mlStart.transitionToEnd()
//                }
            }

            override fun onTransitionTrigger(
                motionLayout: MotionLayout?,
                triggerId: Int,
                positive: Boolean,
                progress: Float
            ) {
                Log.d("abcd", "onTransitionTrigger: " + positive)
            }

        })
        bd.carousel12.setAdapter(object : Carousel.Adapter {
            override fun count(): Int {
                return 5
            }

            override fun populate(view: View?, index: Int) {
                Log.d("wangjie", "index: $index")
                Log.d("wangjie", "currentIndex: " + bd.carousel12.currentIndex)
                if (view is ImageView) {
                    view.setImageResource(images[index])
                }
            }

            override fun onNewItem(index: Int) {
                // called when an item is set
            }
        })
    }

    override fun getBinding() = ActivityTwoBinding.inflate(layoutInflater)
    var images = intArrayOf(
        R.drawable.dm1,
        R.drawable.dm2,
        R.drawable.dm3,
        R.drawable.dm4,
        R.drawable.dm5
    )
}