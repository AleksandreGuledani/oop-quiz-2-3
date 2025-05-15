package oop.q3;

public class Student {
    String name;
    String surname;
    String country;
    String info;

    public Student(String name, String surname, String country, String info) {
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.info = info;
    }

    // Getters for potential internal use
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCountry() {
        return country;
    }

    public String getInfo() {
        return info;
    }
}
