package com.fr.planet.app.proto;

import com.fr.planet.PlanetsTraining.Planets;

public class ProtoPlanetRepository {

    private final Planets planets;

    public ProtoPlanetRepository(Planets planets) {
        this.planets = planets;
    }

    public Planets getPlanets() {
        return planets;
    }
}