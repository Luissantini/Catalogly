package com.santini.catalogly.presentation.viewModel

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.State
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.santini.catalogly.domain.repository.ProductRepository
import com.santini.catalogly.domain.util.Resource
import com.santini.catalogly.presentation.product_list.ProductListState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch

import javax.inject.Inject

@HiltViewModel
class ProductListViewModel @Inject constructor(
    private val repository: ProductRepository
) : ViewModel() {
    private val _state = mutableStateOf(ProductListState())
    val state: State <ProductListState> = _state

    init {
        getProducts()
    }

    private fun getProducts() {
        viewModelScope.launch {
            _state.value = _state.value.copy(isLoading = true)

            when (val result = repository.getProducts()) {
                is Resource.Success -> {
                    _state.value = _state.value.copy(
                        isLoading = false,
                        products = result.data ?: emptyList()
                    )
                }
                is Resource.Error -> {
                    _state.value = _state.value.copy(
                        isLoading = false,
                        error = result.message ?: "Tuvimos un error"
                    )
                }
            }
        }
    }
}