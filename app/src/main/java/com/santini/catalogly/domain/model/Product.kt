package com.santini.catalogly.domain.model

data class Product(
    val id: String,
    val name: String,
    val description: String,
    val price: Long,
    val imageUrl: String,
    val isFavorite: Boolean = false
)