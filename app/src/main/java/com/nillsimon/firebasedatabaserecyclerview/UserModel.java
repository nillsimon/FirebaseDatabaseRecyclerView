package com.nillsimon.firebasedatabaserecyclerview;

public class UserModel {
    String firstName, lastName, job, key;
    int age;

    public UserModel() {
    }

    public UserModel(String firstName, String lastName, String job, int age, String key) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.job = job;
        this.age = age;
        this.key = key;
    }
}
