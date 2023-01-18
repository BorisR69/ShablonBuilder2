public class PersonBuilder {
    String firstName;
    String surName;
    int age;
    String address;

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
        if (firstName == null) {
            throw new IllegalStateException("firstName must be != null!");
        } else if (surName == null) {
            throw new IllegalStateException("surName must be != null!");
        }else if (age < 0) {
            throw new IllegalArgumentException("Age must be > 0!");
        }
        return new Person(this);
    }
}
