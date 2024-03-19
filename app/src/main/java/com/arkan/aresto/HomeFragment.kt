package com.arkan.aresto

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.arkan.aresto.adapter.CategoryAdapter
import com.arkan.aresto.adapter.ProductAdapter
import com.arkan.aresto.databinding.FragmentHomeBinding
import com.arkan.aresto.model.Category
import com.arkan.aresto.model.Product

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private val categoryAdapter = CategoryAdapter()
    private val productAdapter = ProductAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setListCategory()
        setListProduct()
    }

    private fun setListCategory() {
        val dataCategory = listOf(
            Category(image = R.drawable.img_category_rice, name = "Nasi"),
            Category(image = R.drawable.img_category_noodle, name = "Mie"),
            Category(image = R.drawable.img_category_snack, name = "Snack"),
            Category(image = R.drawable.img_category_drink, name = "Minuman")
        )
        binding.rvCategory.apply {
            adapter = this@HomeFragment.categoryAdapter
        }
        categoryAdapter.submitData(dataCategory)
    }
    private fun setListProduct() {
        val dataProduct = listOf(
            Product(image = R.drawable.img_grilled_chicken, name = "Ayam Bakar", price = 50000.00),
            Product(image = R.drawable.img_fried_chicken, name = "Ayam Goreng", price = 40000.00),
            Product(image = R.drawable.img_geprek_chicken, name = "Ayam Geprek", price = 40000.00),
            Product(image = R.drawable.img_chicken_guts_satay, name = "Sate Usus Ayam", price = 5000.00),
            Product(image = R.drawable.img_fried_rice, name = "Nasi Goreng", price = 20000.00),
            Product(image = R.drawable.img_fried_noodle, name = "Mie Goreng", price = 15000.00),
        )
        binding.layoutProduct.rvProduct.apply {
            adapter = this@HomeFragment.productAdapter
        }
        productAdapter.submitData(dataProduct)
    }
}