package com.santini.catalogly.presentation.product_list

import com.santini.catalogly.domain.model.Product

data class ProductListState(
    val isLoading: Boolean = false,
    val products: List<Product> = emptyList(),
    val error: String = ""
)
