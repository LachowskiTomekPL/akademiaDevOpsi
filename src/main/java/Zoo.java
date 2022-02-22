import java.util.List;

public class Zoo {
   private String name;
   private int yearOfEstablishment;
   List<Animal> animals;

    public Zoo(String name, int yearOfEstablishment, List<Animal> animals) {
        this.name = name;
        this.yearOfEstablishment = yearOfEstablishment;
        this.animals = animals;
    }
}
