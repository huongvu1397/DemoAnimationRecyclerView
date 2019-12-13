package com.excalibur.demorecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var list = ArrayList<TempObject>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        list.add(TempObject(""))
        list.add(TempObject(""))
        list.add(TempObject(""))
        list.add(TempObject(""))
        list.add(TempObject(""))
        list.add(TempObject(""))
        list.add(TempObject(""))
        list.add(TempObject(""))
        list.add(TempObject(""))
        list.add(TempObject(""))
        list.add(TempObject(""))
        list.add(TempObject(""))
        list.add(TempObject(""))
        list.add(TempObject(""))
        list.add(TempObject(""))
        val adapter = Adapter()
        adapter.list = list
        recyclerView.adapter = adapter
    }
}
