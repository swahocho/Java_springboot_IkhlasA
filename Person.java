package com.ikhlas.exercises;

public class Person {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    String firstName;
    String lastName;
    int age;

    public boolean isTeen(int checkAge){
    boolean isItTeen;

    if (checkAge<=15)
    isItTeen= true;
    else isItTeen=false;
    return isItTeen;
    }

    public String getFullName (String fullname){
        return this.firstName+ this.lastName;
    }
}
