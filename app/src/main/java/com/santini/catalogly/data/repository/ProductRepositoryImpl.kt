package com.santini.catalogly.data.repository

import com.santini.catalogly.domain.model.Product
import com.santini.catalogly.domain.repository.ProductRepository
import com.santini.catalogly.domain.util.Resource
import kotlinx.coroutines.delay // Fundamental para el delay
import javax.inject.Inject

class ProductRepositoryImpl @Inject constructor() : ProductRepository {

    override suspend fun getProducts(): Resource<List<Product>> {
        return try {
            delay(2000)
            val mockProducts = listOf(
                Product(
                    id = "1",
                    name = "Café de Especialidad",
                    description = "Granos seleccionados de Colombia.",
                    price = 150000,
                    imageUrl = "https://imgs.search.brave.com/5gXBkLpDi-AZLB7FSUE51CgEQFtdNjQeI2jmTluryL0/rs:fit:500:0:1:0/g:ce/aHR0cHM6Ly9zdGF0/aWMudmVjdGVlenku/Y29tL3N5c3RlbS9y/ZXNvdXJjZXMvdGh1/bWJuYWlscy8wNTYv/NjU3LzMyNC9zbWFs/bC9hLXN0ZWFtaW5n/LWN1cC1vZi1jb2Zm/ZWUtcmVzdHMtb24t/YS1ydXN0aWMtd29v/ZGVuLXRhYmxlLWlu/dml0aW5nLXJlbGF4/YXRpb24tYW5kLXdh/cm0tbW9tZW50cy1w/aG90by5KUEc"
                ),
                Product(
                    id = "2",
                    name = "Molinillo Manual",
                    description = "Molienda cerámica ajustable.",
                    price = 450000,
                    imageUrl = "https://imgs.search.brave.com/s_lgOPIpS50hb1xU94ogIgIgbXlBc7PY1hhLDjzRcEk/rs:fit:860:0:0:0/g:ce/aHR0cHM6Ly9odHRw/Mi5tbHN0YXRpYy5j/b20vRF9RX05QXzJY/XzgxODIwMC1NTEEx/MDIwNzc2ODc2Mjhf/MTIyMDI1LUUud2Vi/cA"
                ),
                Product(
                    id = "3",
                    name = "Café de Especialidad",
                    description = "Granos seleccionados de Colombia.",
                    price = 150000,
                    imageUrl = "https://imgs.search.brave.com/5gXBkLpDi-AZLB7FSUE51CgEQFtdNjQeI2jmTluryL0/rs:fit:500:0:1:0/g:ce/aHR0cHM6Ly9zdGF0/aWMudmVjdGVlenku/Y29tL3N5c3RlbS9y/ZXNvdXJjZXMvdGh1/bWJuYWlscy8wNTYv/NjU3LzMyNC9zbWFs/bC9hLXN0ZWFtaW5n/LWN1cC1vZi1jb2Zm/ZWUtcmVzdHMtb24t/YS1ydXN0aWMtd29v/ZGVuLXRhYmxlLWlu/dml0aW5nLXJlbGF4/YXRpb24tYW5kLXdh/cm0tbW9tZW50cy1w/aG90by5KUEc"
                ),
                Product(
                    id = "4",
                    name = "Molinillo Manual",
                    description = "Molienda cerámica ajustable.",
                    price = 450000,
                    imageUrl = "https://imgs.search.brave.com/s_lgOPIpS50hb1xU94ogIgIgbXlBc7PY1hhLDjzRcEk/rs:fit:860:0:0:0/g:ce/aHR0cHM6Ly9odHRw/Mi5tbHN0YXRpYy5j/b20vRF9RX05QXzJY/XzgxODIwMC1NTEEx/MDIwNzc2ODc2Mjhf/MTIyMDI1LUUud2Vi/cA"
                ),

                Product(
                    id = "5",
                    name = "Café de Especialidad",
                    description = "Granos seleccionados de Colombia.",
                    price = 150000,
                    imageUrl = "https://imgs.search.brave.com/5gXBkLpDi-AZLB7FSUE51CgEQFtdNjQeI2jmTluryL0/rs:fit:500:0:1:0/g:ce/aHR0cHM6Ly9zdGF0/aWMudmVjdGVlenku/Y29tL3N5c3RlbS9y/ZXNvdXJjZXMvdGh1/bWJuYWlscy8wNTYv/NjU3LzMyNC9zbWFs/bC9hLXN0ZWFtaW5n/LWN1cC1vZi1jb2Zm/ZWUtcmVzdHMtb24t/YS1ydXN0aWMtd29v/ZGVuLXRhYmxlLWlu/dml0aW5nLXJlbGF4/YXRpb24tYW5kLXdh/cm0tbW9tZW50cy1w/aG90by5KUEc"
                ),
                Product(
                    id = "6",
                    name = "Molinillo Manual",
                    description = "Molienda cerámica ajustable.",
                    price = 450000,
                    imageUrl = "https://imgs.search.brave.com/s_lgOPIpS50hb1xU94ogIgIgbXlBc7PY1hhLDjzRcEk/rs:fit:860:0:0:0/g:ce/aHR0cHM6Ly9odHRw/Mi5tbHN0YXRpYy5j/b20vRF9RX05QXzJY/XzgxODIwMC1NTEEx/MDIwNzc2ODc2Mjhf/MTIyMDI1LUUud2Vi/cA"
                ),

                Product(
                    id = "7",
                    name = "Café de Especialidad",
                    description = "Granos seleccionados de Colombia.",
                    price = 150000,
                    imageUrl = "https://imgs.search.brave.com/5gXBkLpDi-AZLB7FSUE51CgEQFtdNjQeI2jmTluryL0/rs:fit:500:0:1:0/g:ce/aHR0cHM6Ly9zdGF0/aWMudmVjdGVlenku/Y29tL3N5c3RlbS9y/ZXNvdXJjZXMvdGh1/bWJuYWlscy8wNTYv/NjU3LzMyNC9zbWFs/bC9hLXN0ZWFtaW5n/LWN1cC1vZi1jb2Zm/ZWUtcmVzdHMtb24t/YS1ydXN0aWMtd29v/ZGVuLXRhYmxlLWlu/dml0aW5nLXJlbGF4/YXRpb24tYW5kLXdh/cm0tbW9tZW50cy1w/aG90by5KUEc"
                ),
                Product(
                    id = "8",
                    name = "Molinillo Manual",
                    description = "Molienda cerámica ajustable.",
                    price = 450000,
                    imageUrl = "https://imgs.search.brave.com/s_lgOPIpS50hb1xU94ogIgIgbXlBc7PY1hhLDjzRcEk/rs:fit:860:0:0:0/g:ce/aHR0cHM6Ly9odHRw/Mi5tbHN0YXRpYy5j/b20vRF9RX05QXzJY/XzgxODIwMC1NTEEx/MDIwNzc2ODc2Mjhf/MTIyMDI1LUUud2Vi/cA"
                ),

                Product(
                    id = "9",
                    name = "Café de Especialidad",
                    description = "Granos seleccionados de Colombia.",
                    price = 150000,
                    imageUrl = "https://imgs.search.brave.com/5gXBkLpDi-AZLB7FSUE51CgEQFtdNjQeI2jmTluryL0/rs:fit:500:0:1:0/g:ce/aHR0cHM6Ly9zdGF0/aWMudmVjdGVlenku/Y29tL3N5c3RlbS9y/ZXNvdXJjZXMvdGh1/bWJuYWlscy8wNTYv/NjU3LzMyNC9zbWFs/bC9hLXN0ZWFtaW5n/LWN1cC1vZi1jb2Zm/ZWUtcmVzdHMtb24t/YS1ydXN0aWMtd29v/ZGVuLXRhYmxlLWlu/dml0aW5nLXJlbGF4/YXRpb24tYW5kLXdh/cm0tbW9tZW50cy1w/aG90by5KUEc"
                ),
                Product(
                    id = "10",
                    name = "Molinillo Manual",
                    description = "Molienda cerámica ajustable.",
                    price = 450000,
                    imageUrl = "https://imgs.search.brave.com/s_lgOPIpS50hb1xU94ogIgIgbXlBc7PY1hhLDjzRcEk/rs:fit:860:0:0:0/g:ce/aHR0cHM6Ly9odHRw/Mi5tbHN0YXRpYy5j/b20vRF9RX05QXzJY/XzgxODIwMC1NTEEx/MDIwNzc2ODc2Mjhf/MTIyMDI1LUUud2Vi/cA"
                ),

                Product(
                    id = "11",
                    name = "Café de Especialidad",
                    description = "Granos seleccionados de Colombia.",
                    price = 150000,
                    imageUrl = "https://imgs.search.brave.com/5gXBkLpDi-AZLB7FSUE51CgEQFtdNjQeI2jmTluryL0/rs:fit:500:0:1:0/g:ce/aHR0cHM6Ly9zdGF0/aWMudmVjdGVlenku/Y29tL3N5c3RlbS9y/ZXNvdXJjZXMvdGh1/bWJuYWlscy8wNTYv/NjU3LzMyNC9zbWFs/bC9hLXN0ZWFtaW5n/LWN1cC1vZi1jb2Zm/ZWUtcmVzdHMtb24t/YS1ydXN0aWMtd29v/ZGVuLXRhYmxlLWlu/dml0aW5nLXJlbGF4/YXRpb24tYW5kLXdh/cm0tbW9tZW50cy1w/aG90by5KUEc"
                ),
                Product(
                    id = "12",
                    name = "Molinillo Manual",
                    description = "Molienda cerámica ajustable.",
                    price = 450000,
                    imageUrl = "https://imgs.search.brave.com/s_lgOPIpS50hb1xU94ogIgIgbXlBc7PY1hhLDjzRcEk/rs:fit:860:0:0:0/g:ce/aHR0cHM6Ly9odHRw/Mi5tbHN0YXRpYy5j/b20vRF9RX05QXzJY/XzgxODIwMC1NTEEx/MDIwNzc2ODc2Mjhf/MTIyMDI1LUUud2Vi/cA"
                ),

                Product(
                    id = "13",
                    name = "Café de Especialidad",
                    description = "Granos seleccionados de Colombia.",
                    price = 150000,
                    imageUrl = "https://imgs.search.brave.com/5gXBkLpDi-AZLB7FSUE51CgEQFtdNjQeI2jmTluryL0/rs:fit:500:0:1:0/g:ce/aHR0cHM6Ly9zdGF0/aWMudmVjdGVlenku/Y29tL3N5c3RlbS9y/ZXNvdXJjZXMvdGh1/bWJuYWlscy8wNTYv/NjU3LzMyNC9zbWFs/bC9hLXN0ZWFtaW5n/LWN1cC1vZi1jb2Zm/ZWUtcmVzdHMtb24t/YS1ydXN0aWMtd29v/ZGVuLXRhYmxlLWlu/dml0aW5nLXJlbGF4/YXRpb24tYW5kLXdh/cm0tbW9tZW50cy1w/aG90by5KUEc"
                ),
                Product(
                    id = "14",
                    name = "Molinillo Manual",
                    description = "Molienda cerámica ajustable.",
                    price = 450000,
                    imageUrl = "https://imgs.search.brave.com/s_lgOPIpS50hb1xU94ogIgIgbXlBc7PY1hhLDjzRcEk/rs:fit:860:0:0:0/g:ce/aHR0cHM6Ly9odHRw/Mi5tbHN0YXRpYy5j/b20vRF9RX05QXzJY/XzgxODIwMC1NTEEx/MDIwNzc2ODc2Mjhf/MTIyMDI1LUUud2Vi/cA"
                ),

                Product(
                    id = "15",
                    name = "Café de Especialidad",
                    description = "Granos seleccionados de Colombia.",
                    price = 150000,
                    imageUrl = "https://imgs.search.brave.com/5gXBkLpDi-AZLB7FSUE51CgEQFtdNjQeI2jmTluryL0/rs:fit:500:0:1:0/g:ce/aHR0cHM6Ly9zdGF0/aWMudmVjdGVlenku/Y29tL3N5c3RlbS9y/ZXNvdXJjZXMvdGh1/bWJuYWlscy8wNTYv/NjU3LzMyNC9zbWFs/bC9hLXN0ZWFtaW5n/LWN1cC1vZi1jb2Zm/ZWUtcmVzdHMtb24t/YS1ydXN0aWMtd29v/ZGVuLXRhYmxlLWlu/dml0aW5nLXJlbGF4/YXRpb24tYW5kLXdh/cm0tbW9tZW50cy1w/aG90by5KUEc"
                ),
                Product(
                    id = "16",
                    name = "Molinillo Manual",
                    description = "Molienda cerámica ajustable.",
                    price = 450000,
                    imageUrl = "https://imgs.search.brave.com/s_lgOPIpS50hb1xU94ogIgIgbXlBc7PY1hhLDjzRcEk/rs:fit:860:0:0:0/g:ce/aHR0cHM6Ly9odHRw/Mi5tbHN0YXRpYy5j/b20vRF9RX05QXzJY/XzgxODIwMC1NTEEx/MDIwNzc2ODc2Mjhf/MTIyMDI1LUUud2Vi/cA"
                ),


                )
            // Agregamos el return con el Success
            Resource.Success(mockProducts)

        } catch (e: Exception) {
            Resource.Error("Ocurrió un error inesperado: ${e.localizedMessage}")
        }
    }
}