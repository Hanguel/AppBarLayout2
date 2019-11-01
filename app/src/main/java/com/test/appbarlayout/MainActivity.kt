package com.test.appbarlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.test.appbarlayout.data.RecyclerData
import com.test.appbarlayout.recyclerAdapter.RecyclerViewAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var data = arrayListOf<RecyclerData>()

        for (i in 0 until 10) {
            data.add(RecyclerData("TEST"))
        }

        rv_recyclerView.layoutManager = LinearLayoutManager(this)
        var recyclerAdapter = RecyclerViewAdapter(data)
        rv_recyclerView.adapter = recyclerAdapter
    }
}
