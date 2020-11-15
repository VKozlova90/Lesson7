package com.company;

import java.util.Objects;

public class Person {
    private final String firstName;
    private final String lastName;
    private final String gender;

    public Person(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }

        if(!(obj instanceof Person)){
            return false;
        }

        Person person = (Person) obj;
        return firstName.equals(person.firstName) && lastName.equals(person.firstName)
                && gender.equals(person.gender);

    }

    @Override
    public int hashCode() {
        return (2 * firstName.hashCode()) + (3 * lastName.hashCode()) + (5 * gender.hashCode());
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                '}';
    }
}
