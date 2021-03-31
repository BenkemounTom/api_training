package fr.esiea.ex4A.corresp;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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



