package edu.iesam.marvelappmouadclass.features.superheroes.domain

interface SuperHeroRepository {
    fun getAll(): List<SuperHero>

    fun update(superHero: SuperHero)
}