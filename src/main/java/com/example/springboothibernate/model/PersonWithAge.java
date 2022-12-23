package com.example.springboothibernate.model;

public class PersonWithAge extends Person{
    private int age;

    public PersonWithAge(Person person){
        setName(person.getName());
        setBirth(person.getBirth());
        setId(person.getId());
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
