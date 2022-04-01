import java.time.LocalDate;
import java.util.Objects;

public class Animal {
    private String name;
    private LocalDate yearOfBirth;
    private TypeOfAnimal typeOfAnimal;
    private static final LocalDate currentYear = LocalDate.now();


    public Animal(String name, LocalDate yearOfBirth, TypeOfAnimal typeOfAnimal) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.typeOfAnimal = typeOfAnimal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(LocalDate yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public TypeOfAnimal getTypeOfAnimal() {
        return typeOfAnimal;
    }

    public void setTypeOfAnimal(TypeOfAnimal typeOfAnimal) {
        this.typeOfAnimal = typeOfAnimal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return yearOfBirth == animal.yearOfBirth && Objects.equals(name, animal.name) && typeOfAnimal == animal.typeOfAnimal;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfBirth, typeOfAnimal);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + getName() + '\'' +
                ", yearOfBirth=" + getYearOfBirth() +
                ", typeOfAnimal=" + getTypeOfAnimal() +
                '}';
    }
    
    public int animalsAge(int yearOfBirth){
       int age = currentYear.getYear() - yearOfBirth;
        return age;
    }
}
