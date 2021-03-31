package fr.esiea.ex4A.corresp;

import fr.esiea.ex4A.corresp.Correspondant;
import fr.esiea.ex4A.corresp.Utilisateurs;
import fr.esiea.ex4A.corresp.CorrespondantRes;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class CorrespondantControlle {

        @PostMapping(path = "api/inscription")
        void registerUser(@RequestBody Utilisateurs user) {
            System.out.println(user);
        }

        @GetMapping(path = "api/matches", produces = MediaType.APPLICATION_JSON_VALUE)
        List<Correspondant> getMatches(String name, String country) {

            return new CorrespondantRes(new Correspondant("math", "mathis"),
                new Correspondant("tom", "tommy"),
                new Correspondant("harry", "potter"));
        }


    }

