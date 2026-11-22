package edu.iesam.marvelappmouadclass.features.superheroes.domain

import kotlinx.serialization.Serializable

@Serializable
data class SuperHero(
    val id : String,
    val name: String,
    val slug: String,
    val urlImage: String
)