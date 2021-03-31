package fr.esiea.ex4A.corresp;
import com.fasterxml.jackson.annotation.JsonProperty;
import fr.esiea.ex4A.corresp.Sexes;



public class Utilisateurs {

    public final String userEmail;
    public final String userName;
    public final String userTweeter;
    public final String userCountry;
    public final Sexes userSex;
    public final Sexes userSexPref;


        public Utilisateurs(@JsonProperty("userEmail") String userEmail, @JsonProperty("userName") String userName,
                    @JsonProperty("userTweeter") String userTweeter, @JsonProperty("userCountry") String userCountry,
                    @JsonProperty("userSex") Sexes userSex, @JsonProperty("userSexPref") Sexes userSexPref) {
            this.userEmail = userEmail;
            this.userName = userName;
            this.userTweeter = userTweeter;
            this.userCountry = userCountry;
            this.userSex = userSex;
            this.userSexPref = userSexPref;
        }

        @Override
        public String toString() {
            return "Utilisateurs{" +
                "userEmail='" + userEmail + '\'' +
                ", userName='" + userName + '\'' +
                ", userTweeter='" + userTweeter + '\'' +
                ", userCountry='" + userCountry + '\'' +
                ", userSex=" + userSex +
                ", userSexPref=" + userSexPref +
                '}';
        }
}
