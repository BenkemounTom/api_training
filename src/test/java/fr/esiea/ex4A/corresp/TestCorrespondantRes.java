package fr.esiea.ex4A.corresp;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class TestCorrespondantRes {

        @ParameterizedTest
        @ValueSource(strings = {"""
            Nom1,Twitter1
            Benke,tommmmm
            Kilian ,Mbappe
            """, """
            Donald,Trump
            cristiano,Ronaldo
            Bigflo,Oli
            """
        })
        void matchesresponse_filling_list_test(String NomNTwitter) {
            List<Correspondant> identifiants = Arrays.stream(NomNTwitter.split("\n")).map(s -> {
                String[] kv = s.split(",");
                return new Correspondant(kv[0], kv[1]);
            }).collect(Collectors.toList());

            CorrespondantRes matches = new CorrespondantRes(identifiants);

            matches.forEach(m -> assertTrue(identifiants.contains(m)));

        }

        @ParameterizedTest
        @CsvSource({
            "Donald,Trump,cristiano,Ronaldo,Bigflo,Oli"
        })
        void matchesresponse_mult_val_test(String Nom1, String Twitter1, String Nom2, String Twitter2, String Nom3, String Twitter3) {
            List<Correspondant> identifiants = Arrays.asList(new Correspondant(Nom1, Twitter1),
                new Correspondant(Nom2, Twitter2),
                new Correspondant(Nom3, Twitter3));
            CorrespondantRes matches = new CorrespondantRes(identifiants.get(0),
                identifiants.get(1),
                identifiants.get(2));

            matches.forEach(m -> assertTrue(identifiants.contains(m)));
        }
    }



