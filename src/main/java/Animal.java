import java.time.LocalDate;
import java.util.Objects;

public class Animal {
    private String name;
    private int yearOfBirth;
    private TypeOfAnimal typeOfAnimal;
    private static final int CURRENT_YEAR= 2022;

    public Animal(String name, int yearOfBirth, TypeOfAnimal typeOfAnimal) {
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

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
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
    
    public int animalsAge(int CURRENT_YEAR, int yearOfBirth){
        int age = CURRENT_YEAR - yearOfBirth;
        return age;
    }
}
