package com.yinp.motionlayoutdemo

import android.content.Intent
import android.util.Log
import android.view.View
import com.yinp.motionlayoutdemo.activity.*
import com.yinp.motionlayoutdemo.base.BaseActivity
import com.yinp.motionlayoutdemo.databinding.ActivityMainBinding
import com.yinp.motionlayoutdemo.jiandan.EazyOneActivity

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override fun initViews() {
        Log.d("abcd", ": bbbb")
        initClick(bd.btnOne, bd.btnTwo, bd.btnThree, bd.btnFour, bd.btnFive, bd.btn1, bd.btn2)
    }

    override fun onClick(v: View?) {
        when (v) {
            bd.btn1 -> startActivity(Intent(this, EazyOneActivity::class.java))
            bd.btnOne -> startActivity(
                Intent(
                    this@MainActivity,
                    AnimationAdapterActivity::class.java
                )
            )
            bd.btnTwo -> startActivity(Intent(this@MainActivity, ViewMoveActivity::class.java))
            bd.btnThree -> startActivity(Intent(this@MainActivity, MeizuActivity::class.java))
            bd.btnFour -> startActivity(Intent(this@MainActivity, CardMotionActivity::class.java))
            bd.btnFive -> startActivity(Intent(this@MainActivity, CarMotionActivity::class.java))
            bd.btn2 -> startActivity(Intent(this, TwoActivity::class.java))
        }
    }

    override fun getBinding() = ActivityMainBinding.inflate(layoutInflater)
}