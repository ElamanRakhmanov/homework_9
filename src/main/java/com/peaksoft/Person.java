package com.peaksoft;

public class Person {

    private Animal animal;

    private String name;

    private int age;



    public String getName() {
        return name + " loves";
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "animal=" + animal +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
