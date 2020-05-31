package com.timson.kotlindemo.ui.main.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.timson.kotlindemo.R
import com.timson.kotlindemo.data.model.Meals
import kotlinx.android.synthetic.main.item_layout.view.*

class MainAdapter(private val mealsData: ArrayList<Meals>) :
    RecyclerView.Adapter<MainAdapter.DataViewHolder>() {

    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(meals: Meals) {
            itemView.apply {
                textViewMeal.text = meals.strMeal
                Glide.with(imageViewAvatar.context)
                    .load(meals.strMealThumb)
                    .into(imageViewAvatar)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder =
        DataViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        )

    override fun getItemCount(): Int = mealsData.size

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.bind(mealsData[position])
    }

    fun addMeals(mealsData: List<Meals>) {
        this.mealsData.apply {
            clear()
            addAll(mealsData)
        }
    }
}