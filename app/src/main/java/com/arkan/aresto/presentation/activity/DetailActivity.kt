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