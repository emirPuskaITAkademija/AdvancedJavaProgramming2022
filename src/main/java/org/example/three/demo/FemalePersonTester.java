package org.example.three.demo;

import org.example.one.Gender;
import org.example.two.collection.Person;

public class FemalePersonTester implements PersonTester{
    @Override
    public boolean test(Person person) {
        boolean test = person.getGender().equals(Gender.FEMALE);
        return test;
    }
}
