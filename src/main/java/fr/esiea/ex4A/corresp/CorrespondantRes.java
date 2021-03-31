package fr.esiea.ex4A.corresp;
import fr.esiea.ex4A.corresp.CorrespondantRes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CorrespondantRes extends ArrayList<Correspondant> {

    public CorrespondantRes(List<Correspondant> correspondant){
        super();
        this.addAll(correspondant);
    }

    public CorrespondantRes(Correspondant... correspondant){
        super();
        this.addAll(Arrays.asList(correspondant));
    }
}
