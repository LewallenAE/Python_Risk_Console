package Collections_and_Data_Structures;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.List;

class Jedi {
    private String name;
    private int midichlorians;

    public Jedi(String name, int midichlorians) {
        this.name = name;
        this.midichlorians = midichlorians;
    }

    public String getName() {
        return name;
    }

    public int getMidichlorians() {
        return midichlorians;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jedi jedi = (Jedi) o;
        return midichlorians == jedi.midichlorians;
    }

    @Override
    public int hashCode() {
        return Objects.hash(midichlorians);
    }

    @Override
    public String toString() {
        return "Jedis {" +
                "name:  " + name +
                ", Midichlorians: " + midichlorians +
                "}";
    }
}

public class ChallengeCustomObject {
    public static void main(String[] args) {

    Set<Jedi> jedis = new HashSet<>();

    Jedi jedi0 = new Jedi("Darth Maul", 10_000);
    Jedi jedi1 = new Jedi("Luke Skywalker", 30_000);
    Jedi jedi2 = new Jedi("Anakin Skywalker", 25_000);
    Jedi jedi3 = new Jedi("Obi-Wan Kenobi", 23_000);
    Jedi jedi4 = new Jedi("Qui-Gon Jin", 19_000);
    Jedi jedi5 = new Jedi("Ashoka", 19_000);

    for(Jedi j : List.of(jedi0, jedi1, jedi2, jedi3, jedi4, jedi5)) {
        jedis.add(j);
    }


    System.out.println(jedis);

    }


}


