package com.example.kspich.analpenetration.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.kspich.analpenetration.R

class InfoAdapter(val values1: MutableList<String>, val values2: MutableList<String>) : RecyclerView.Adapter<InfoAdapter.ViewHolder>(){

    override fun getItemCount() = values1.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView1?.text = values1[position]
        holder.textView2?.text = values2[position]
    }

    init {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.view_info, parent, false)
        return ViewHolder(view)
    }

    class ViewHolder(text: View) : RecyclerView.ViewHolder(text)
    {
        var textView1: TextView? = null
        var textView2: TextView? = null

        init {
            textView1 = text.findViewById(R.id.textInfo)
            textView2 = text.findViewById(R.id.infoText)
        }
    }

}