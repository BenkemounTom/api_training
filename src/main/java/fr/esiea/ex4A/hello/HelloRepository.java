package fr.esiea.ex4A.hello;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Locale;
import java.util.Random;

@Repository
class HelloRepository {
    final List<String> names = List.of(
            "Jaguabyss",
            "Coyolax",
            "Gazena",
            "Chickig",
            "Gladiabat",
            "Gladiafly",
            "Steeleen",
            "Marsharak",
            "Berriot",
            "Penguine"
    );
    private final Random random = new Random();

    HelloData randomHello() {
        return new HelloData(names.get(random.nextInt(names.size())));
    }

    HelloData getHelloFor(String name) {
        int letterIndex = name.toLowerCase(Locale.ROOT).charAt(0) - 'a';
        return new HelloData((name + " ").repeat(1 + letterIndex).trim());
    }
}
