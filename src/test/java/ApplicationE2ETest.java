import com.fr.planet.PlanetsTraining;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ApplicationE2ETest {

    @Test
    public void testNumbers() {
        var json = given().get("http://localhost:8080/json/numbers");
        json.then().assertThat().statusCode(200);
        var jsonTime = json.getTime();

        var proto = given().get("http://localhost:8080/proto/numbers");
        proto.then().assertThat().statusCode(200);
        var protoTime = proto.getTime();

        assertThatTrue(jsonTime, protoTime);
    }

    @Test
    public void testList() {
        var json = given().get("http://localhost:8080/json/planets");
        json.then().assertThat().statusCode(200);
        var jsonTime = json.getTime();

        var proto = given().get("http://localhost:8080/proto/planets");
        proto.then().assertThat().statusCode(200);
        var protoTime = proto.getTime();

        assertThatTrue(jsonTime, protoTime);
    }

    @Test
    public void testRequestBody() {
        var payload = """
        [
            {
                "id": 1,
                "name": "terre",
                "satellites": [
                    {
                        "id": 1,
                        "name": "Lune"
                    }
                ]
            }
        ]
        """;
        var json = given()
                .body(payload)
                .contentType(ContentType.JSON)
                .post("http://localhost:8080/json/planets");
        json.then().assertThat().statusCode(204);
        var jsonTime = json.getTime();

        List<PlanetsTraining.Planet> planets = new ArrayList<>();

        List<Integer> range = IntStream.range(0, 10000).boxed().collect(Collectors.toList());
        range.forEach(integer -> {
            PlanetsTraining.Satellite satellite = PlanetsTraining.Satellite.newBuilder().setId(1).setName("Satellite number " + integer).build();
            PlanetsTraining.Planet planet = PlanetsTraining.Planet.newBuilder().setId(integer).setName("Planet number " + integer).addSatellite(satellite).build();
            planets.add(planet);
        });

        var protoPayload = PlanetsTraining.Planets.newBuilder().addAllPlanet(planets).build();

        var proto = given()
                .body(protoPayload.toByteArray())
                .contentType("application/x-protobuf")
                .post("http://localhost:8080/proto/planets");
        proto.then().assertThat().statusCode(204);
        var protoTime = proto.getTime();

        assertThatTrue(jsonTime, protoTime);
    }

    private void assertThatTrue(Long jsonTime, Long protoTime) {
        log(jsonTime);
        log(protoTime);
        assertTrue(jsonTime > protoTime);
    }

    private void log(Long ms) {
        System.out.println("Request with json => " + ms);
    }
}