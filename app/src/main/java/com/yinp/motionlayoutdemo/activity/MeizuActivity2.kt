package com.yinp.motionlayoutdemo.activity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.yinp.motionlayoutdemo.adapter.ComViewHolder
import com.yinp.motionlayoutdemo.adapter.CommonAdapter
import com.yinp.motionlayoutdemo.base.BaseActivity
import com.yinp.motionlayoutdemo.databinding.ActivityMeizu2Binding
import com.yinp.motionlayoutdemo.databinding.ItemMeizu2Binding

class MeizuActivity2 : BaseActivity<ActivityMeizu2Binding>() {


    lateinit var adapter: CommonAdapter<String>
    val list = mutableListOf("a", "b", "c", "d", "e", "f")
    private fun initRecycler() {
        adapter = object : CommonAdapter<String>(this, list) {
            override fun setComViewHolder(
                view: View?,
                viewType: Int,
                parent: ViewGroup?
            ): ComViewHolder {
                return ViewHolder(
                    ItemMeizu2Binding.inflate(
                        LayoutInflater.from(parent?.context),
                        parent,
                        false
                    )
                )
            }

            override fun onBindItem(holder: RecyclerView.ViewHolder?, position: Int, item: String) {
                val vw = holder as? ViewHolder
//                vw?.binding?.tvItemOne?.text = item
            }
        }
        bd.rvList2.layoutManager = LinearLayoutManager(mContext, RecyclerView.HORIZONTAL, false)
        bd.rvList2.adapter = adapter
    }

    internal class ViewHolder(val binding: ItemMeizu2Binding) : ComViewHolder(binding.root)

    override fun initViews() {
        initRecycler()
    }

    override fun getBinding() = ActivityMeizu2Binding.inflate(layoutInflater)
}