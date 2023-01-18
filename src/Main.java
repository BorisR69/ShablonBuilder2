public class Main {
    public static void main(String[] args) {
        Person person = new PersonBuilder()
                .addFirstName("Ivan")
                .addSurName("Popov")
                .addAge(40)
                .addAddress("Oxford")
                .build();
        System.out.println(person);
        person.setAddress("Moscow");
        person.happyBirthday();

        Person son = person.newChildBuilder().addFirstName("Andy").addAge(8).build();
        System.out.println("У " + person + " есть сын " + son);

        try {
            // Возраст недопустимый
            new PersonBuilder().addFirstName("Andy").addSurName("Long").addAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        try {
            // Не хватает обяхательных полей
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }
}