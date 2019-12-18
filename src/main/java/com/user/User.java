package com.user;

import org.springframework.data.annotation.Id;

public class User {
    @Id
    String id;
    String name, nationality;
    int age;
    boolean man;

    public User(String id, String name, int age, boolean man, String nationality) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.man = man;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMan() {
        return man;
    }

    public void setMan(boolean man) {
        this.man = man;
    }
}
