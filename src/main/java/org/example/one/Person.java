package org.example.one;
/*
Person p1 = new Person();
p1.setName("Eldar");
p1.setGender(Gender.MALE);


Person p2 = new Person();
p2.setName("Greta");
p2.setGender(Gender.FEMALE);
 */
public class Person {
    private String name;
    private String surname;

    private Gender gender;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
