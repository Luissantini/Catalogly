package com.santini.catalogly.domain.repository

import com.santini.catalogly.domain.model.Product
import com.santini.catalogly.domain.util.Resource

interface ProductRepository {

    suspend fun getProducts(): Resource<List<Product>>
}