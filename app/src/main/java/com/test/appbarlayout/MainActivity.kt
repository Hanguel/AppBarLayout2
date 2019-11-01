package com.test.appbarlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.test.appbarlayout.data.RecyclerData
import com.test.appbarlayout.recyclerAdapter.RecyclerViewAdapter
import kotlinx.android.synthetic.main.activity_main.*

/**
 * AppBar가 collapse되기 위해서는 스크롤이 되는 뷰가 필요함 (recyclerview, listview 등등...)
 * 1.recyclerview에 layout_behavior에 scroll behavior를 등록한다.
 * 2. CollapsingToolbarLayout의 layout_scrollFlags 에 scroll이 있으므로 리사이클러뷰를 스크롤하면 appbar가 그것에 반응한다. //exitUntilCollapsed -> appbar가 완전히 사라지는것이 아닌 정해둔 최소높이에 도달하면 변화x
 * 3. CollapsingToolbarLayout 안의 imageView에 layout_collapseMode 속성에 parallax 줌으로써 appbar의 배경색이 스크롤에 따라 변한다.
 * */

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
