package com.yinp.motionlayoutdemo.activity

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.helper.widget.Carousel
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.SimpleTarget
import com.bumptech.glide.request.transition.Transition
import com.yinp.motionlayoutdemo.R
import jp.wasabeef.glide.transformations.BlurTransformation

/**
 * @author   :yinpeng
 * date      :2021/12/28
 * package   :com.yinp.motionlayoutdemo
 * describe  :
 */
class AnimationAdapterActivity : AppCompatActivity() {
    var images = intArrayOf(
        R.drawable.dm1,
        R.drawable.dm2,
        R.drawable.dm3,
        R.drawable.dm4,
        R.drawable.dm4,
        R.drawable.dm5
    )

    var imageDrawable = Array<Drawable?>(5) { _ ->
        null
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_animation_adapter)


        val ivBackground = findViewById<ImageView>(R.id.ivBackground)
        val carsoul = findViewById<Carousel>(R.id.carousel)
        carsoul.setAdapter(object : Carousel.Adapter {
            override fun count(): Int {
                return 5
            }

            override fun populate(view: View?, index: Int) {
                Log.d("wangjie", "index: $index")
                Log.d("wangjie", "currentIndex: " + carsoul.currentIndex)
                if (view is ImageView) {
                    view.setImageResource(images[index])
                    // val targetIndex = (carsoul.currentIndex + 2) % 5
                    val drawable = imageDrawable.getOrNull(index)
                    if (drawable == null) {
                        Glide.with(this@AnimationAdapterActivity)
                            .load(images[index])
                            .apply(RequestOptions().transform(BlurTransformation(20)))
                            .into(object : SimpleTarget<Drawable>() {
                                override fun onResourceReady(
                                    resource: Drawable,
                                    transition: Transition<in Drawable>?
                                ) {
                                    ivBackground.setImageDrawable(resource)
                                    imageDrawable[index] = resource
                                }
                            })
                    } else {
                        ivBackground.setImageDrawable(drawable)
                    }
                }
            }

            override fun onNewItem(index: Int) {
                // called when an item is set
            }
        })
    }
}