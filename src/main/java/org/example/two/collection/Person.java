package org.example.two.collection;

import org.example.one.Gender;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;
    private String surname;
    private LocalDate birthday;
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

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        LocalDate now = LocalDate.now();
        Period period = birthday.until(now);
        return period.getYears();
    }

    @Override
    public String toString() {
        return name + "  " + surname + ", birthday: " + birthday + ", starost: " + getAge() + " , spol: " + gender;
    }
}
