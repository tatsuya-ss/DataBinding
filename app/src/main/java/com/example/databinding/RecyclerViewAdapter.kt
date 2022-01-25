package com.example.databinding

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.databinding.databinding.RecyclerViewRowItemBinding

class RecyclerViewAdapter(var list: List<Food>): RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    class ViewHolder(binding: RecyclerViewRowItemBinding): RecyclerView.ViewHolder(binding.root) {
        val binding: RecyclerViewRowItemBinding = binding
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding: RecyclerViewRowItemBinding = RecyclerViewRowItemBinding
                .inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.data = list[position]
    }

    override fun getItemCount(): Int {
        return list.size
    }

}

class FoodViewModel {
    var foods = listOf<Food>(
            Food("魚"),
            Food("野菜"),
            Food("パン"),
            Food("ラーメン")
            )
}

class Food(
        val food: String
)

