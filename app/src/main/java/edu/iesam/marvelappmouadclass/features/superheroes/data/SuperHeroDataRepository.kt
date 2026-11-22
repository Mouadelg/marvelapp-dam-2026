package edu.iesam.marvelappmouadclass.features.superheroes.data

import edu.iesam.marvelappmouadclass.features.superheroes.data.local.xml.SuperHeroXmlLocalDataSource
import edu.iesam.marvelappmouadclass.features.superheroes.domain.SuperHero
import edu.iesam.marvelappmouadclass.features.superheroes.domain.SuperHeroRepository

/**
 * Clase encargada de gestionar la fuente de datos: xml, base de datos, API, etc.
 */
class SuperHeroDataRepository(private val xmlLocalDataSource: SuperHeroXmlLocalDataSource) :
    SuperHeroRepository {

    override fun getAll(): List<SuperHero> {
        return xmlLocalDataSource.findAll()
    }
}