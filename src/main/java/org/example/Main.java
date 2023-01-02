package org.example;

public class Main {
    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder();
        Person dad = personBuilder
                .setName("Alex")
                .setSurname("Fiksik")
                .setAge(32)
                .setCity("Murmansk")
                .build();
        Person son = dad.newChildBuilder()
                .setName("Nolik")
                .build();
        System.out.println(dad.getName() + " " + dad.getSurname(dad.surname)
                + " from " + dad.getAddress(dad.city)
                + " has son " + son.getName());
        System.out.println(dad);
        System.out.println(son);
        System.out.println("Happy Birthday!!! Now you is " + dad.happyBirthday() + " years old");
    }
}
