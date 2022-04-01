import java.time.LocalDate;
import java.util.List;

public class Zoo {
   private String name;
   private LocalDate yearOfEstablishment;
   List<Animal> animals;

    public Zoo(String name, LocalDate yearOfEstablishment, List<Animal> animals) {
        this.name = name;
        this.yearOfEstablishment = yearOfEstablishment;
        this.animals = animals;
    }
}
