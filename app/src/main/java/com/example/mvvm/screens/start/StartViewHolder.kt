package com.example.mvvm.screens.start

import android.view.View
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvm.databinding.ItemMoneyLayoutBinding
import com.example.mvvm.model.Currency

class StartViewHolder(private val binding: ItemMoneyLayoutBinding): RecyclerView.ViewHolder(binding.root) {

    var currency: Currency? = null
    set(value: Currency?) {
        value ?: return
        binding.itemBuy.text = "${value.buy}"
        binding.itemName.text = "${value.ccy}"
        binding.itemSale.text = "${value.sale}"

        field = value
    }

}