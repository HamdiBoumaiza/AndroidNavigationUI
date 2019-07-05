package com.hamdi.helloartisan.fragments.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hamdi.helloartisan.R
import java.util.*


class RecyclerAdapter(
    private val testList: ArrayList<String>,
    private var itemClickListener: ItemClickListener
) :
    RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    override fun getItemCount(): Int {
        return testList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_home, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindViewHolder(testList[position])
        holder.tvName.setOnClickListener { itemClickListener.onItemClicked(testList[position]) }
    }

    interface ItemClickListener {
        fun onItemClicked(text: String)
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvName: TextView = view.findViewById(R.id.item)

        fun bindViewHolder(text: String) {
            tvName.text = text
        }
    }
}