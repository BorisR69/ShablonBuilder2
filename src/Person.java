import java.util.Objects;

public class Person {
    protected final String firstName;
    protected final String surName;
    protected int age = 0;
    protected String address = null;

    public Person(String firstName, String surName) {
        this.firstName = firstName;
        this.surName = surName;
    }

    public Person(String firstName, String surName, int age) {
        this.firstName = firstName;
        this.surName = surName;
        this.age = age;
    }

    public Person (String firstName, String surName, int age, String address){
        this.firstName = firstName;
        this.surName = surName;
        this.age = age;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
    public boolean hasAge() {
        if (age > 0){
            return true;
        } else
            return false;
    }
    public boolean hasAddress() {
        if (address.isEmpty()){
            return false;
        } else
            return true;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void happyBirthday() {
        this.age = age + 1;
    }

    @Override
    public String toString() {
        return "Имя: " + firstName + "\nФамилия: " + surName + "\nВозраст: " + age +
                "\nАдрес: " + address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age && firstName.equals(person.firstName) && surName.equals(person.surName)
                && address.equals(person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, surName, age, address);
    }

    Person(PersonBuilder personBuilder) {
        firstName = personBuilder.firstName;
        surName = personBuilder.surName;
        age = personBuilder.age;
        address = personBuilder.address;
    }
}
