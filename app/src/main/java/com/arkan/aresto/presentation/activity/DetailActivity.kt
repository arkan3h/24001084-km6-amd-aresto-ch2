package com.arkan.aresto.presentation.activity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.arkan.aresto.R
import com.arkan.aresto.data.model.Product
import com.arkan.aresto.data.utils.toIndonesianFormat
import com.arkan.aresto.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    companion object {
        const val EXTRAS_ITEM_ACT = "EXTRAS_ITEM_ACT"
    }

    private val binding: ActivityDetailBinding by lazy {
        ActivityDetailBinding.inflate(layoutInflater)
    }
    private var productQty: Int = 1
    private var totalPrice: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        getIntentData()
        backNavigation()
        addToCart()
    }

    private fun addToCart() {
        binding.layoutAddToCart.tvQtyProduct.text = productQty.toString()
        addQtyProduct()
        removeQtyProduct()
        totalPrice()
    }

    private fun addQtyProduct() {
        binding.layoutAddToCart.btnPlusCart.setOnClickListener {
            productQty += 1
            addToCart()
        }
    }

    private fun removeQtyProduct() {
        binding.layoutAddToCart.btnMinusCart.setOnClickListener {
            productQty -= 1
            if (productQty > 0) {
                addToCart()
            } else {
                productQty = 1
            }
        }
    }

    private fun totalPrice() {
        intent.extras?.getParcelable<Product>(EXTRAS_ITEM_ACT)?.let {
            totalPrice = it.price * productQty
            binding.layoutAddToCart.btnAddToCart.text = buildString {
                append("Tambahkan ke Keranjang - ")
                append(totalPrice.toIndonesianFormat())
            }
        }
    }

    private fun backNavigation() {
        binding.btnProfileBack.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
    }

    private fun getIntentData() {
        intent.extras?.getParcelable<Product>(EXTRAS_ITEM_ACT)?.let {
            binding.ivProductImage.setImageResource(it.image)
            binding.tvProductName.text = it.name
            binding.tvProductPrice.text = it.price.toIndonesianFormat()
            binding.tvProductDesc.text = it.desc
            binding.layoutLocation.tvProductAddress.text = it.address
        }
    }
}