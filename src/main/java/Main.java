import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        Animal newAnimal = new Animal("Lew",LocalDate.of(1990,03,20),TypeOfAnimal.AMPHIBIAN);
        int age= newAnimal.animalsAge(1990);
        System.out.println(age);
        //● Stwórz zmienne i przypisz do nich wartości :
        //○ val_integer typu integer z wartością 250
        //○ val_string typu String z wartością “Akademia jest super !”
        //○ val_double typu zmiennoprzecinkowej z wartością 1.234555
        //○ Wyświetl wszystkie zmienne na konsoli w postaci “Zmienna X ma wartosc Y”
        System.out.println("====================================Zadanie nr. 1"+"\n");
        int val_integer = 250;
        String val_string = "Akademia jest super";
        double val_double = 1.234555;
        System.out.println("Zmienna val_integer ma wartość: " + val_integer);
        System.out.println("Zmienna val_string ma wartość: " + val_string);
        System.out.println("Zmienna val_double ma wartość: " + val_double);

//Zadeklaruj tablice 10 liczb typu int i przeiteruj po niej od indexu 0 do 19 (od 1 do 20). W czasie iteracji sprawdź czy dana liczba jest parzysta
//(liczba%2==0), jeśli tak to wyświetla napis “Liczba X jest parzysta”, gdzie X to dana liczba, w przeciwnym wypadku wyświetl sama liczbe.
        System.out.println("====================================Zadanie nr. 2"+"\n");
        try {
            int[] table = new int[10];
            for (int i = 0; i < 19; i++) {
                table[i] = i;
                if (table[i] % 2 == 0) {
                    System.out.println("indeks: " + table[i] + " jest parzysty");
                } else {
                    System.out.println();
                    System.out.println("indeks: " + table[i] + " nie jest parzysta");
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Wyszedłeś poza zakres tablicy");
        }
        //Używając pętli while, zrób sumę liczb od 1 do 500 i ją wyświetl.
        System.out.println("====================================Zadanie nr. 3"+"\n");
        int licznik = 1;
        int count = 1;
        while (licznik < 500) {
            licznik++;
            count = count + licznik;
        }
        System.out.println(count);

        //Napisz program, który obliczy średnia liczb z tablicy int i na jej podstawie wystawi ocenę (char) (A >=4, B >=3 i <4, C < 3), następnie używając
        //switch wyświetla odpowiedni komunikat w zależności od oceny (A=Super, B=Srednio, C=Slabo, Domsylnie= cos nie tak…)
        System.out.println("====================================Zadanie nr. 4"+"\n");
        int[] table = {3, 3, 3, 3};

        char whatNote = averageCount(table);
        System.out.println("Ocena: "+ whatNote);
        switch (whatNote) {
            case 'A':
                System.out.println("Super");
                break;
            case 'B':
                System.out.println("Srednio");
                break;
            case 'C':
                System.out.println("Słabo");
                break;
            default:
                System.out.println("Coś nie tak...");
        }

        System.out.println("====================================Zadanie nr. 5"+"\n");
        double[] newMethod = {2.3, 3.4, -3.4, -4.5};
        System.out.println("Table before Math.abs method");
        for(double oldTable: newMethod){
            System.out.println(oldTable);
        }
        System.out.println("Table after Math.abs method");
        absMethod(newMethod);

        System.out.println("====================================Zadanie nr. 6"+"\n");

        String name = "Jan";
        String name1 = "Anna";
        String whatsNameIsNameHolder = manOrWoman(name);
        String whatsNameIsNameHolder1 = manOrWoman(name1);
        System.out.println("Holder of the " + name + " is a "+ whatsNameIsNameHolder);
        System.out.println("Holder of the " + name1 + " is a "+ whatsNameIsNameHolder1);

    }
    public static String manOrWoman(String name){
        enum Gender {MAN, WOMAN};
        String genderName;
        if(name.endsWith("a")){
            genderName=Gender.WOMAN.name();
        }else{
            genderName=Gender.MAN.name();
        }
          return genderName;
        };



    public static double[] absMethod(double[] absValue) {
        for (int i = 0; i < absValue.length; i++) {
            absValue[i] = Math.abs(absValue[i]);
            System.out.println(absValue[i]);
        }

        return absValue;
    }

    public static char averageCount(int[] table) {
        int averageSum = 0;
        char note = 'A';
        for (int i = 0; i < table.length; i++) {
            averageSum = averageSum + table[i];

        }
        int average = averageSum / table.length;
        if (average >= 4) {
            note = 'A';
        } else if (average >= 3 && average < 4) {
            note = 'B';
        } else if (average < 3) {
            note = 'C';
        } else {
            System.out.println("Ocena nie znana");
        }


        return note;

    }


}
