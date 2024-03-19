package com.arkan.aresto.data.model

import android.os.Parcelable
import androidx.annotation.DrawableRes
import kotlinx.parcelize.Parcelize
import java.util.UUID

@Parcelize
data class Category(
    val id: String = UUID.randomUUID().toString(),
    @DrawableRes
    var image: Int,
    var name: String
) : Parcelable
