package com.fr.planet.app.json;

import java.util.List;

public class JsonPlanetRepository {

    private final List<Planet> planets;

    public JsonPlanetRepository(List<Planet> planets) {
        this.planets = planets;
    }

    public List<Planet> getPlanets() {
        return planets;
    }
}
