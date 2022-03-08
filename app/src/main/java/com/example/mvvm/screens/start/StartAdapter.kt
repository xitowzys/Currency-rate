package com.example.mvvm.screens.start

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvm.databinding.ItemMoneyLayoutBinding
import com.example.mvvm.model.Currency

class StartAdapter : RecyclerView.Adapter<StartViewHolder>() {

    var listStart = emptyList<Currency>()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): StartViewHolder {
        val layoutInflater =
            LayoutInflater.from(parent.context)

        val binding = ItemMoneyLayoutBinding.inflate(layoutInflater)

        return StartViewHolder(binding)
    }

    override fun onBindViewHolder(holder: StartViewHolder, position: Int) {
//        holder.itemView.item_name.text = listStart[position].ccy
        holder.currency = listStart[position]
    }

    override fun getItemCount(): Int {
        return listStart.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<Currency>) {
        listStart = list
        notifyDataSetChanged()
    }
}