package com.example.kspich.analpenetration.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.kspich.analpenetration.R

class HistoryAdapter(val values: MutableList<String>) : RecyclerView.Adapter<HistoryAdapter.ViewHolder>(){

    override fun getItemCount() = values.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView?.text = values[position]
    }

    init {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.view_history, parent, false)
        return ViewHolder(view)
    }

    class ViewHolder(text: View) : RecyclerView.ViewHolder(text)
    {
        var textView: TextView? = null

        init {
            textView = text.findViewById(R.id.historyText)
        }
    }

}