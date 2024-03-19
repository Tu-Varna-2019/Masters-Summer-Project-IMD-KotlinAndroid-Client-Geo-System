package com.tuvarna.geo.viewmodel.ui

sealed class UiState {
  object Empty : UiState()

  object Loading : UiState()

  data class Success(val message: String) : UiState()

  data class Error(val message: String) : UiState()
}