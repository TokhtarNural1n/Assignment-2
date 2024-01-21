import Models.worker;
import Models.Person;
import Models.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person e1 = new worker("Sanzhar", "Beisek", "Developer", 540);
        Person e2 = new worker("Asyl", "Markov", "Manager", 200);
        Person e3 = new worker("Oleg", "Star", "Chemist", 50000);
        Person e4 = new worker("Tolebi", "Adil", "Pirate", 1450);
        Person e5 = new worker("Bauyr", "Amanzhol", "Astronaut", 5500);

        Person s1 = new Student("Marat", "Rakhman", 3.91);
        Person s2 = new Student("Ali", "Damir", 3.17);
        Person s3 = new Student("Dias", "Beibit", .02);
        Person s4 = new Student("Qasym", "Amanzhol", 34.54);
        Person s5 = new Student("Samat", "Sabyr", 5.83);

        List<Person> persons = new ArrayList<>();
        persons.add(e1);
        persons.add(e2);
        persons.add(e3);
        persons.add(e4);
        persons.add(e5);
        persons.add(s1);
        persons.add(s2);
        persons.add(s3);
        persons.add(s4);
        persons.add(s5);

        // Sort persons based on Comparable implementation in Person class
        Collections.sort(persons);
        printData(persons);
    }

    static void printData(Iterable<Person> persons) {
        for (Person person : persons) {
            System.out.println(person.printData());
        }
    }
}
