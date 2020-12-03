package com.fr.planet.app.json;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
public class JsonNumberController {

    @GetMapping("/json/numbers")
    List<Integer> getNumbers() {
        return IntStream.range(0, 100000).boxed().collect(Collectors.toList());
    }

}
