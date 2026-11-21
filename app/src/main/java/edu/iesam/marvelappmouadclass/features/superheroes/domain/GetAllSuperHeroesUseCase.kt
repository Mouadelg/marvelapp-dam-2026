package edu.iesam.marvelappmouadclass.features.superheroes.domain

class GetAllSuperHeroesUseCase(
    private val superHeroRepository: SuperHeroRepository
){
    operator fun invoke(): List<SuperHero>{
        return superHeroRepository.getAll()
    }
}