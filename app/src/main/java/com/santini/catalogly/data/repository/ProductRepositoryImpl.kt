package com.santini.catalogly.data.repository

import com.santini.catalogly.domain.model.Product
import com.santini.catalogly.domain.repository.ProductRepository
import com.santini.catalogly.domain.util.Resource
import kotlinx.coroutines.delay // Fundamental para el delay

class ProductRepositoryImpl : ProductRepository {

    override suspend fun getProducts(): Resource<List<Product>> {
        return try {
            delay(2000)
            val mockProducts = listOf(
                Product(
                    id = "1",
                    name = "Café de Especialidad",
                    description = "Granos seleccionados de Colombia.",
                    price = 150000,
                    imageUrl = "https://example.com/cafe.jpg"
                ),
                Product(
                    id = "2",
                    name = "Molinillo Manual",
                    description = "Molienda cerámica ajustable.",
                    price = 450000,
                    imageUrl = "https://example.com/molinillo.jpg"
                )
            )
            // Agregamos el return con el Success
            Resource.Success(mockProducts)

        } catch (e: Exception) {
            Resource.Error("Ocurrió un error inesperado: ${e.localizedMessage}")
        }
    }
}