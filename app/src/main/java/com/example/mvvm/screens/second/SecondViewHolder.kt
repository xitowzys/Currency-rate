package com.example.mvvm.screens.second

import androidx.recyclerview.widget.RecyclerView
import com.example.mvvm.databinding.ItemMoneyLayoutBinding
import com.example.mvvm.model.Currency

class SecondViewHolder (private val binding: ItemMoneyLayoutBinding): RecyclerView.ViewHolder(binding.root) {
    var currency: Currency? = null
        set(value: Currency?) {
            value ?: return
            binding.itemBuy.text = "${value.buy}"
            binding.itemName.text = "${value.ccy}"
            binding.itemSale.text = "${value.sale}"

            field = value
        }
}
