package Collections_and_Data_Structures;

import java.util.TreeSet;
import java.util.Set;
import java.util.List;
import java.util.Comparator;

class RickandMorty {

    private String alpha;
    private int beta;
    private boolean gamma;


    public RickandMorty(String toast, int potato, boolean elevator) {

        this.alpha = toast;
        this.beta = potato;
        this.gamma = elevator;
    }

        public String getAlpha() {
            return alpha;
        }

        public int getBeta() {
            return beta;
        }

        public boolean isGamma() {
            return gamma;
        }

        @Override
                public String toString() {
                    return "ConfusionMasterFun{" +
                            "alpha = " + alpha +
                            ", beta = " + beta +
                            ", gamma = " + gamma +
                            "}";

        }


    }




public class ConfusionMasterFun {
    public static void main(String[] args) {

        Set<RickandMorty> rickAndMorty = new TreeSet<>(Comparator.comparing(RickandMorty::getBeta));

        RickandMorty rick0 = new RickandMorty("Morty", 15, true);
        RickandMorty rick1 = new RickandMorty("Rick", 65, true);
        RickandMorty rick2 = new RickandMorty("Beth", 40, true);
        RickandMorty rick3 = new RickandMorty("Jerry", 45, false);
        RickandMorty rick4 = new RickandMorty("Summer", 19, true);
        RickandMorty rick5 = new RickandMorty("Toast of Doom", 10000, true);

        for (RickandMorty s : List.of(rick0, rick1, rick2, rick3, rick4, rick5)) {
            rickAndMorty.add(s);
        }


        // iterates through rickAndMorty and prints on separate lines
        for (RickandMorty y : rickAndMorty) {
            System.out.println(y);
        }
        // Print rickAndMorty on the same line
        System.out.println(rickAndMorty);




    }

}


