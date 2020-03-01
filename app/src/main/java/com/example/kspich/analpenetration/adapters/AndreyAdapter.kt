package com.example.kspich.analpenetration.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

import com.example.kspich.analpenetration.R

class AndreyAdapter(val values: MutableList<Int>) : RecyclerView.Adapter<AndreyAdapter.ViewHolder>(){

    override fun getItemCount() = values.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imageView?.setImageResource(values[position])
    }

    init {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_pictures, parent, false)
        return ViewHolder(view)
    }

    class ViewHolder(image: View) : RecyclerView.ViewHolder(image)
    {
        var imageView: ImageView? = null
        init {
            imageView = image.findViewById(R.id.pic)
        }
    }

}