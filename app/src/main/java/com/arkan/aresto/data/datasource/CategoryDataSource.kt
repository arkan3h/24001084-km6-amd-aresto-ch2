package com.arkan.aresto.data.datasource

import com.arkan.aresto.R
import com.arkan.aresto.data.model.Category


interface CategoryDataSource {
        fun getCategoryList() : List<Category>
    }

    class CategoryDataSourceImpl() : CategoryDataSource {
        override fun getCategoryList(): List<Category> {
            return mutableListOf(
                Category(
                    image = R.drawable.img_category_rice,
                    name = "Nasi"
                ),
                Category(
                    image = R.drawable.img_category_noodle,
                    name = "Mie"
                ),
                Category(
                    image = R.drawable.img_category_snack,
                    name = "Snack"
                ),
                Category(
                    image = R.drawable.img_category_drink,
                    name = "Minuman"
                ),
            )
        }
    }
