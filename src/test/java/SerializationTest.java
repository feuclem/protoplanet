import com.fasterxml.jackson.databind.ObjectMapper;
import com.fr.planet.NumbersTraining;
import com.fr.planet.PlanetsTraining;
import com.fr.planet.app.json.Planet;
import com.fr.planet.app.json.Satellite;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SerializationTest {

    @Test
    public void testInteger() throws IOException {
        List<Integer> numbers = IntStream.range(0, 1000).boxed().collect(Collectors.toList());
        NumbersTraining.Numbers protoNumbers = NumbersTraining.Numbers.newBuilder().addAllNumber(numbers).build();

        var byteMapperForJackson = new ByteArrayOutputStream();
        var byteMapperForProto = new ByteArrayOutputStream();
        var mapper = new ObjectMapper();

        var jacksonBegin = System.currentTimeMillis();
        mapper.writeValue(byteMapperForJackson, numbers);
        var jacksonEnd = System.currentTimeMillis();

        var protoBegin = System.currentTimeMillis();
        protoNumbers.writeTo(byteMapperForProto);
        var protoEnd = System.currentTimeMillis();

        long timeElapseForJackson = jacksonEnd - jacksonBegin;
        System.out.println(timeElapseForJackson);
        long timeElapseForProto = protoEnd - protoBegin;
        System.out.println(timeElapseForProto);

        assertTrue(timeElapseForJackson > timeElapseForProto);
    }

    @Test
    public void testObject() throws IOException {
        List<Integer> range = IntStream.range(0, 1000).boxed().collect(Collectors.toList());
        List<Planet> planets = range.stream().map(integer -> {
            Satellite satellite = new Satellite(1, "Satellite number " + integer);
            return new Planet(integer, "Planet number " + integer, Collections.singletonList(satellite));
        }).collect(Collectors.toList());
        List<PlanetsTraining.Planet> protoPlanetList = range.stream().map(integer -> {
            PlanetsTraining.Satellite satellite = PlanetsTraining.Satellite.newBuilder().setId(1).setName("Satellite number " + integer).build();
            return PlanetsTraining.Planet.newBuilder().setId(integer).setName("Planet number " + integer).addSatellite(satellite).build();
        }).collect(Collectors.toList());
        var protoPlanets = PlanetsTraining.Planets.newBuilder().addAllPlanet(protoPlanetList).build();

        var byteMapperForJackson = new ByteArrayOutputStream();
        var byteMapperForProto = new ByteArrayOutputStream();
        var mapper = new ObjectMapper();

        var jacksonBegin = System.currentTimeMillis();
        mapper.writeValue(byteMapperForJackson, planets);
        var jacksonEnd = System.currentTimeMillis();

        var protoBegin = System.currentTimeMillis();
        protoPlanets.writeTo(byteMapperForProto);
        var protoEnd = System.currentTimeMillis();

        long timeElapseForJackson = jacksonEnd - jacksonBegin;
        System.out.println(timeElapseForJackson);
        long timeElapseForProto = protoEnd - protoBegin;
        System.out.println(timeElapseForProto);

        assertTrue(timeElapseForJackson > timeElapseForProto);
    }
}
