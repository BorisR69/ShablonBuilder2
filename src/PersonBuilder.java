public class PersonBuilder {
//    Person newPerson;
    String firstName;
    String surName;
    int age = 0;
    String address = null;

    public PersonBuilder addFirstName(String val) {
        firstName = val;
        return this;
    }

    public PersonBuilder addSurName(String val) {
        surName = val;
        return this;
    }

    public PersonBuilder addAge(int val) {
        age = val;
        return this;
    }

    public PersonBuilder addAddress(String val) {
        address = val;
        return this;
    }

    public Person build() {
        return new Person(this);
    }

//    private void Person (PersonBuilder personBuilder) {
//        firstName = personBuilder.firstName;
//        surName = personBuilder.surName;
//        age = personBuilder.age;
//        address = personBuilder.address;
//    }
}
