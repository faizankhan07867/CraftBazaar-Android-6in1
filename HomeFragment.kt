// HomeFragment.kt
package com.craftbazaar.ui.home

import android.os.Bundle
imports androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.craftbazaar.databinding.FragmentHomeBinding
import com.craftbazaar.adapter.ProductAdapter
import com.craftbazaar.model.Product

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        
        // Dummy data (API se bhi le sakta hai)
        val products = listOf(
            Product(1, "Terracotta Vase", 899.0, "https://images.unsplash.com/photo-1578500494127-0103eabd24b4", 4.5),
            Product(2, "Macrame Hanging", 1299.0, "https://images.unsplash.com/photo-1600585154340-be6161a56a0c", 4.8),
            Product(3, "Soy Candle", 449.0, "https://images.unsplash.com/photo-1603001979583-4a05d33b1e64", 4.9)
        )

        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(context, 2)
            adapter = ProductAdapter(products) { product ->
                // Click → Detail screen
                findNavController().navigate(R.id.action_home_to_detail)
            }
        }
        return binding.root
    }
}
