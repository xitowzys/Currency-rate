package com.example.mvvm.screens.second

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvm.databinding.ItemMoneyLayoutBinding
import com.example.mvvm.model.Currency
import com.example.mvvm.screens.start.StartViewHolder

class SecondAdapter: RecyclerView.Adapter<SecondViewHolder>() {

    var listSecond = emptyList<Currency>()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SecondViewHolder {
        val layoutInflater =
            LayoutInflater.from(parent.context)

        val binding = ItemMoneyLayoutBinding.inflate(layoutInflater)

        return SecondViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SecondViewHolder, position: Int) {
//        holder.itemView.item_name.text = listStart[position].ccy
        holder.currency = listSecond[position]
    }

    override fun getItemCount(): Int {
        return listSecond.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<Currency>) {
        listSecond = list
        notifyDataSetChanged()
    }

}