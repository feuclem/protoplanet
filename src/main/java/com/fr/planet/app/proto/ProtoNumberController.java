package com.fr.planet.app.proto;

import com.fr.planet.NumbersTraining;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
public class ProtoNumberController {

    @GetMapping(value = "/proto/numbers", produces = "application/x-protobuf")
    NumbersTraining.Numbers getNumbers() {
        List<Integer> range = IntStream.range(0, 10000).boxed().collect(Collectors.toList());
        return NumbersTraining.Numbers.newBuilder().addAllNumber(range).build();
    }
}
