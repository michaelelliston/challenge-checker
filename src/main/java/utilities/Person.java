package utilities;

import java.util.Objects;

public class Person {

    private final String firstName;
    private final String lastName;
    private final int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Person other = (Person) obj;

        return this.age == other.age &&
                Objects.equals(this.getFirstName(), other.getFirstName()) &&
                Objects.equals(this.getLastName(), other.getLastName());
    }
}
