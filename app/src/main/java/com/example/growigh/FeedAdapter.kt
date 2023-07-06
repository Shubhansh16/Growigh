package com.example.growigh

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class FeedAdapter(private val dataList: ArrayList<DataClass>):RecyclerView.Adapter<FeedAdapter.ViewHolderClass>() {

    class ViewHolderClass(itemView: View): RecyclerView.ViewHolder(itemView) {

        val rvImage:ImageView= itemView.findViewById(R.id.memes)
        val rvTitle:TextView=itemView.findViewById(R.id.title)
        val rvDesc:TextView=itemView.findViewById(R.id.description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderClass {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return ViewHolderClass(itemView)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: ViewHolderClass, position: Int) {
        val currentItem = dataList[position]
        holder.rvImage.setImageResource(currentItem.dataImage)
        holder.rvTitle.text=currentItem.dataTitle
        holder.rvDesc.text=currentItem.dataDesc
    }
}