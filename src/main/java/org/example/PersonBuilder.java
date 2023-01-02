package org.example;


public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String city;

    public String getName() {
        if (name == null) {
            throw new IllegalStateException("Field name is empty!");
        }else {
            return name;
        }
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname()  {
        if (surname == null) {
            throw new IllegalStateException("Field surname is empty!");
        } else {
            return surname;
        }
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public int getAge() {
        return age;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("Incorrect age!");
        }

        this.age = age;
        return this;
    }

    public String getCity() {
        return city;
    }

    public PersonBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public Person build() {
        if (name == null) {
            throw new IllegalStateException("Name can't be null");
        }
        if (surname == null) {
            throw new IllegalStateException("Surname can't be null");
        }
        Person person;
        if (age != -1) {
            person = new Person(name, surname, age);
        } else {
            person = new Person(name, surname);
        }
        if (city != null) {
            person.setCity(city);
        }
        return person;
    }
}
