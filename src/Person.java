import java.util.Objects;

public class Person {
    protected final String firstName;
    protected final String surName;
    protected int age;
    protected String address;

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
    public boolean hasAge() { // Проверка заполнения поля возраст
        if (age > 0){
            return true;
        } else
            return false;
    }
    public boolean hasAddress() { // Проверка заполнения поля адрес
        if (address == null){
            return false;
        } else
            return true;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void happyBirthday() { // Увеличение возраста на 1 год
        if (age > 0) {
            this.age = age + 1;
        }
    }

    @Override
    public String toString() {
        return firstName + " " + surName + " " + age + " лет" +
                " проживает в  " + address;
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

    public Person(PersonBuilder personBuilder) { // строитель класса Person
        firstName = personBuilder.firstName;
        surName = personBuilder.surName;
        age = personBuilder.age;
        address = personBuilder.address;
    }

    public PersonBuilder newChildBuilder() { // полузаполненный билдер для ребёнка,
        return new PersonBuilder().addSurName(getSurName()).addAddress(getAddress());
    }
}
