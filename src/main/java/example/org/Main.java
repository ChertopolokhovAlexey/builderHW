package example.org;

public class Main {
    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder();
        Person dad = personBuilder
                .setName("Alex")
                .setSurname("Fiksik")
                .setAge(32)
                .setAddress("Murmansk")
                .build();
        Person son = dad.newChildBuilder()
                .setName("Nolik")
                .build();
        System.out.println(dad.getName(dad.name) + " " + dad.getSurname(dad.surname)
                + " from " + dad.getAddress(dad.city)
                + " has son " + son.getName(son.name));
        System.out.println(dad);
        System.out.println(son);
        System.out.println("Now you is " + dad.happyBirthday() + " years old");
    }
}
