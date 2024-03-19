package com.arkan.aresto.data.adapter

import androidx.recyclerview.widget.RecyclerView
import com.arkan.aresto.base.ViewHolderBinder
import com.arkan.aresto.data.model.Product
import com.arkan.aresto.data.utils.toIndonesianFormat
import com.arkan.aresto.databinding.ItemProductListBinding

class ProductListViewHolder(
    private val binding: ItemProductListBinding,
    private val listener: OnItemCLickedListener<Product>
) : RecyclerView.ViewHolder(binding.root), ViewHolderBinder<Product> {
    override fun bind(item: Product) {
        item.let {
            binding.ivProductImage.setImageResource(it.image)
            binding.tvProductName.text = it.name
            binding.tvProductPrice.text = item.price.toIndonesianFormat()
            itemView.setOnClickListener {
                listener.onItemClicked(item)
            }
        }
    }
}