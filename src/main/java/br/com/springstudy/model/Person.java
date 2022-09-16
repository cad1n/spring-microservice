package br.com.springstudy.model;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable {

    private final long serialVersionUID = 1L;

    private long id;
    private String firstName;
    private String lastName;
    private String address;
    private String gender;

    public Person() {

    }

    public Person(long id, String firstName, String lastName, String address, String gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.gender = gender;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return
                serialVersionUID == person.serialVersionUID &&
                        id == person.id
                        && firstName.equals(person.firstName)
                        && lastName.equals(person.lastName)
                        && address.equals(person.address)
                        && gender.equals(person.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialVersionUID, id, firstName, lastName, address, gender);
    }
}
