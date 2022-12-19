package org.example;

import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected  int age;
    protected  String city;


    public Person(String name, String surname, int age, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
    }

    public boolean hasAge() {
        return age != 0;
    }
    public boolean hasAddress(){
        return city != null;
    }
    public String getName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Field name is empty!");
        }else {
            return name;
        }
    }
    public String getSurname(String surname) {
        if (surname == null) {
            throw new IllegalArgumentException("Field surname is empty!");
        } else {
            return surname;
        }
    }
    public OptionalInt getAge (int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
            throw new IllegalArgumentException("Incorrect age!");
        } else {
            return OptionalInt.of(age);
        }
    }
    public String getAddress(String city) {
        return city;
    }
    public void setAddress(String city) {

    }
    public int happyBirthday() {
       if (age!=0) {
           this.age = age + 1;
       } else {age = 0;
       }
       return age;
    }
    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(this.surname)
                .setAddress(this.city);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("person:\n\t"
                + "name:\t" + name + "\n\t"
                + "surname:\t" + surname + "\n\t");

        if (!hasAge()){
            sb.append("age:\tunknown\n\t");
        }else {
            sb.append( "age:\t" + getAge(age) + "\n\t");
        }

        if(!hasAddress()) {
            sb.append("city:\tunknown\n");
        }else {
            sb.append("city:\t" + city+ "\n");

        }
        return sb.toString();
    }
}
