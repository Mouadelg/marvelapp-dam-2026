package edu.iesam.marvelappmouadclass.features.superheroes.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import edu.iesam.marvelappmouadclass.features.superheroes.domain.GetAllSuperHeroesUseCase
import edu.iesam.marvelappmouadclass.features.superheroes.domain.SuperHero

class SuperHeroListViewModel(
    private val getAllSuperHeroesUseCase: GetAllSuperHeroesUseCase
) : ViewModel() {
    private val _uiState = MutableLiveData<UiState>()
    val uiState: LiveData<UiState> = _uiState

    fun loadSuperHeroes() {
        //1. Mostramos el loading
        _uiState.value = UiState(isLoading = true)

        //2. Mostramos Datos
        _uiState.value = UiState(
            superHeroes = getAllSuperHeroesUseCase.invoke()
        )

    }

    data class UiState(
        val isLoading: Boolean = false,
        val hasError: Boolean = false,
        val superHeroes: List<SuperHero>? = null,
        val superHero: SuperHero? = null
    )

    companion object {
        fun factory(
            getAllSuperHeroesUseCase: GetAllSuperHeroesUseCase,
        ) = viewModelFactory {
            initializer { SuperHeroListViewModel(getAllSuperHeroesUseCase) }
        }
    }
}