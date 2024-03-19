package com.arkan.aresto.data.datasource

import com.arkan.aresto.R
import com.arkan.aresto.data.model.Product

interface ProductDataSource {
    fun getProductList() : List<Product>
}

class ProductDataSourceImpl : ProductDataSource {
    override fun getProductList(): List<Product> {
        return mutableListOf(
            Product(
                image = R.drawable.img_grilled_chicken,
                name = "Ayam Bakar",
                price = 50000.00,
                desc = "Ayammmmmmmmmmmmmmmmmmmmmmmmmmmmmm Bakarrrrrrrrrrrrrrrrrrrrr",
                address = "Jl. BSD Green Office PArk Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
                addressUrl = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"
            ),
            Product(
                image = R.drawable.img_fried_chicken,
                name = "Ayam Goreng",
                price = 40000.00,
                desc = "Ayammmmmmmmmmmmmmmmmmmmmmmmmmmmmm Bakarrrrrrrrrrrrrrrrrrrrr",
                address = "Jl. BSD Green Office PArk Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
                addressUrl = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"
            ),
            Product(
                image = R.drawable.img_geprek_chicken,
                name = "Ayam Geprek",
                price = 40000.00,
                desc = "Ayammmmmmmmmmmmmmmmmmmmmmmmmmmmmm Bakarrrrrrrrrrrrrrrrrrrrr",
                address = "Jl. BSD Green Office PArk Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
                addressUrl = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"
            ),
            Product(
                image = R.drawable.img_chicken_guts_satay,
                name = "Sate Usus Ayam",
                price = 5000.00,
                desc = "Ayammmmmmmmmmmmmmmmmmmmmmmmmmmmmm Bakarrrrrrrrrrrrrrrrrrrrr",
                address = "Jl. BSD Green Office PArk Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
                addressUrl = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"
            ),
            Product(
                image = R.drawable.img_fried_rice,
                name = "Nasi Goreng",
                price = 20000.00,
                desc = "Ayammmmmmmmmmmmmmmmmmmmmmmmmmmmmm Bakarrrrrrrrrrrrrrrrrrrrr",
                address = "Jl. BSD Green Office PArk Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
                addressUrl = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"
            ),
            Product(
                image = R.drawable.img_fried_noodle,
                name = "Mie Goreng",
                price = 15000.00,
                desc = "Ayammmmmmmmmmmmmmmmmmmmmmmmmmmmmm Bakarrrrrrrrrrrrrrrrrrrrr",
                address = "Jl. BSD Green Office PArk Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
                addressUrl = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"
            ),
        )
    }
}