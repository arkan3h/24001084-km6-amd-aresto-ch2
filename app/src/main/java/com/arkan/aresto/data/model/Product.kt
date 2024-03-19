package com.arkan.aresto.data.model

import androidx.annotation.DrawableRes
import java.util.UUID

data class Product(
    val id: String = UUID.randomUUID().toString(),
    @DrawableRes
    var image: Int,
    var name: String,
    val price: Double,
    var desc: String,
    var address: String,
    var addressUrl: String
)
