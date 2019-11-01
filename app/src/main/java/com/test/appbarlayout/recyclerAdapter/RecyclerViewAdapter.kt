package com.test.appbarlayout.recyclerAdapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.test.appbarlayout.R
import com.test.appbarlayout.data.RecyclerData
import kotlinx.android.synthetic.main.item_card_view.view.*


class RecyclerViewAdapter(private val data: ArrayList<RecyclerData>) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
    private val TAG = "RecylerAdapter"
    private lateinit var mContext: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        mContext = parent.context
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_card_view, parent, false))
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        data[position].let { item ->
            with(holder.itemView) {
                tv_cardView_text.text = "${data[position].text} $position"
            }
        }
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        init {
        }
    }
}