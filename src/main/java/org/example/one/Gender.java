package org.example.one;

public enum Gender {


    MALE("Muški"), FEMALE("Ženski");

    private String name;

    private Gender(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
