package com.example.recyclerviewproblemsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler.apply {
            layoutManager = GridLayoutManager(context, 4)
            adapter = DummyAdapter()
        }
    }
}

class DummyAdapter(val size: Int = 30) : RecyclerView.Adapter<DummyViewHolder>() {
    override fun getItemCount() = size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DummyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return DummyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: DummyViewHolder, position: Int) {}
}

class DummyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

