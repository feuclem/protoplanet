package com.fr.planet.app;

import com.fr.planet.PlanetsTraining;
import com.fr.planet.app.json.JsonPlanetRepository;
import com.fr.planet.app.json.Planet;
import com.fr.planet.app.json.Satellite;
import com.fr.planet.app.proto.ProtoPlanetRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.protobuf.ProtobufHttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.filter.CharacterEncodingFilter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    RestTemplate restTemplate(ProtobufHttpMessageConverter hmc) {
        return new RestTemplate(Collections.singletonList(hmc));
    }

    @Bean
    ProtobufHttpMessageConverter protobufHttpMessageConverter() {
        return new ProtobufHttpMessageConverter();
    }

    @Bean
    public CharacterEncodingFilter characterEncodingFilter() {
        final CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        characterEncodingFilter.setForceEncoding(true);
        return characterEncodingFilter;
    }

    @Bean
    public ProtoPlanetRepository createProtoPlanetRepository() {
        List<PlanetsTraining.Planet> planets = new ArrayList<>();

        List<Integer> range = IntStream.range(0, 10000).boxed().collect(Collectors.toList());
        range.forEach(integer -> {
            PlanetsTraining.Satellite satellite = PlanetsTraining.Satellite.newBuilder().setId(1).setName("Satellite number " + integer).build();
            PlanetsTraining.Planet planet = PlanetsTraining.Planet.newBuilder().setId(integer).setName("Planet number " + integer).addSatellite(satellite).build();
            planets.add(planet);
        });

        return new ProtoPlanetRepository(PlanetsTraining.Planets.newBuilder().addAllPlanet(planets).build());
    }

    @Bean
    public JsonPlanetRepository createJsonPlanetRepository() {
        List<Planet> planets = new ArrayList<>();

        List<Integer> range = IntStream.range(0, 10000).boxed().collect(Collectors.toList());
        range.forEach(integer -> {
            Satellite satellite = new Satellite(1, "Satellite number " + integer);
            Planet planet = new Planet(integer, "Planet number " + integer, Collections.singletonList(satellite));
            planets.add(planet);
        });

        return new JsonPlanetRepository(planets);
    }
}
