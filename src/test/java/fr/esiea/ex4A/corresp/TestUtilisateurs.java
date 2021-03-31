package fr.esiea.ex4A.corresp;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class TestUtilisateurs {


    @ParameterizedTest
    @ValueSource(strings = {"{\"userEmail\":\"test@mail.fr\",\"userName\":\"camille\",\"userTweeter\":\"camillalamilla\",\"userCountry\":\"FR\",\"userSex\":\"F\",\"userSexPref\":\"M\"}"
    })
    void user_from_Json_test(String json){
        try {
            Utilisateurs user = new ObjectMapper().readValue(json, Utilisateurs.class);
            System.out.println(user.toString());
            Assertions.assertTrue(json.contains(user.userCountry));
            Assertions.assertTrue(json.contains(user.userEmail));
            Assertions.assertTrue(json.contains(user.userName));
            Assertions.assertTrue(json.contains(user.userTweeter));
            Assertions.assertTrue(json.contains(user.userSex.name()));
            Assertions.assertTrue(json.contains(user.userSexPref.name()));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            Assertions.fail();
        }
    }
}
