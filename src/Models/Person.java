package Models;

import interf.Payable;

public abstract class Person implements Payable, Comparable<Person> {
    private static int idCounter = 1;
    private final int id;
    private String name;
    private String surname;

    public Person() {
        id = idCounter++;
        name = "Name";
        surname = "Surname";
    }

    public Person(String name, String surname) {
        id = idCounter++;
        this.name = name;
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return id + ". " + name + " " + surname;
    }

    public abstract String getPosition();


    public String printData() {
        return toString() + " earns " + getPaymentAmount() + " tenge.";
    }

    @Override
    public int compareTo(Person person) {
        return Integer.compare(this.id, person.id);
    }
}

