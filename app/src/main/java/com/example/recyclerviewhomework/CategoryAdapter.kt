package com.example.recyclerviewhomework

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CategoryAdapter(var mContext: Context, var categoryList: List<Category>) :
    RecyclerView.Adapter<CategoryAdapter.CardViewHolder>() {

    inner class CardViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var imageViewCategory: ImageView = view.findViewById(R.id.imageViewCategory)
        var textViewCategory: TextView = view.findViewById(R.id.textViewCategory)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view = LayoutInflater.from(mContext).inflate(R.layout.row_item, parent, false)
        return CardViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val category = categoryList[position]
        holder.imageViewCategory.setImageResource(
            mContext.resources.getIdentifier(
                category.categoryImage,
                "drawable",
                mContext.packageName
            )
        )
        holder.textViewCategory.text = category.categoryTitle
    }

    override fun getItemCount(): Int {
        return categoryList.size
    }
}