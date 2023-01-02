package org.example;

import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected  int age = -1;
    protected  String city;


    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

   public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public boolean hasAge() {
        return age != -1;
    }

    public boolean hasAddress(){
        return city != null;
    }

    public String getName(String name) {
            return name;
    }
    public String getSurname(String surname) {
            return surname;
    }

    public OptionalInt getAge (int age) {
        return hasAge() ? OptionalInt.of(age): OptionalInt.empty();
    }
    public String getAddress(String city) {
        return city;
    }

    public int happyBirthday() {
       if (hasAge()) {
           age++;
       } else {age = 0;
       }
       return age;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(this.surname)
                .setCity(this.city);
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("person:\n\t"
                + "name:\t" + name + "\n\t"
                + "surname:\t" + surname + "\n\t");

        if (!hasAge()){
            sb.append("age:\tunknown\n\t");
        }else {
            sb.append( "age:\t" + age + "\n\t");
        }

        if(!hasAddress()) {
            sb.append("city:\tunknown\n");
        }else {
            sb.append("city:\t" + city+ "\n");

        }
        return sb.toString();
    }
}
