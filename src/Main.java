public class Main {
    public static void main(String[] args) {
        Person person = new PersonBuilder()
                .addFirstName("Ivan")
                .addSurName("Popov")
                .addAge(40)
                .addAddress("Oxford")
                .build();
        System.out.println(person);
    }
}