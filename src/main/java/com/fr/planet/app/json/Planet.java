package com.fr.planet.app.json;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

@JsonAutoDetect
public class Planet {
    int id;
    String name;
    List<Satellite> satellites;

    public Planet(int id, String name, List<Satellite> satellites) {
        this.id = id;
        this.name = name;
        this.satellites = satellites;
    }
}
