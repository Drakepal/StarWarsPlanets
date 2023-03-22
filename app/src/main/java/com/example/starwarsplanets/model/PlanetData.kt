package com.example.starwarsplanets.model

class PlanetData {
    var planetName: String? = null
    var planetType: String? = null
    var planetImage: String? = null
    var planetDescription: String? = null
    constructor(){}

    constructor(
        planetName: String?,
        planetType: String?,
        planetImage: String?,
        planetDescription: String?
    ) {
        this.planetName = planetName
        this.planetType = planetType
        this.planetImage = planetImage
        this.planetDescription = planetDescription
    }
}