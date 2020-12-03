package com.fr.planet.app.proto;

import com.fr.planet.PlanetsTraining.Planets;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProtoPlanetController {

    final ProtoPlanetRepository protoPlanetRepository;

    public ProtoPlanetController(ProtoPlanetRepository protoPlanetRepository) {
        this.protoPlanetRepository = protoPlanetRepository;
    }

    @GetMapping(value = "/proto/planets", produces = "application/x-protobuf")
    Planets getAll() {
        return protoPlanetRepository.getPlanets();
    }

    @PostMapping(value = "/proto/planets", consumes = "application/x-protobuf")
    ResponseEntity returns(@RequestBody Planets planets) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
