// ProductAdapter.kt
package com.craftbazaar.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.craftbazaar.databinding.ItemProductBinding
import com.craftbazaar.model.Product

class ProductAdapter(
    private val products: List<Product>,
    private val onClick: (Product) -> Unit
) : RecyclerView.Adapter<ProductAdapter.VH>() {

    inner class VH(val binding: ItemProductBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val binding = ItemProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return VH(binding)
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        val product = products[position]
        with(holder.binding) {
            tvTitle.text = product.title
            tvPrice.text = "₹${product.price}"
            ratingBar.rating = product.rating.toFloat()
            Glide.with(root.context).load(product.image).into(ivProduct)
            root.setOnClickListener { onClick(product) }
        }
    }

    override fun getItemCount() = products.size
}
