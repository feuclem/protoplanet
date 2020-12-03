package com.fr.planet.app.json;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
public class JsonPlanetController {

    final JsonPlanetRepository jsonPlanetRepository;

    public JsonPlanetController(JsonPlanetRepository jsonPlanetRepository) {
        this.jsonPlanetRepository = jsonPlanetRepository;
    }

    @GetMapping("/json/planets")
    List<Planet> getAll() {
        return jsonPlanetRepository.getPlanets();
    }

    @PostMapping(value = "/json/planets", consumes = APPLICATION_JSON_VALUE)
    ResponseEntity returns(@RequestBody List<Planet> planets) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
