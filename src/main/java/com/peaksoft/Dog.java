package com.peaksoft;

public class Dog implements Animal{
    private String name;
    private String poroda;
    private int age;
    private String color;


    @Override
    public void animalPlus() {
        System.out.println("Dog have been added!");
    }

    @Override
    public void animalMinus() {
        System.out.println("Dog have been deleted!");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", poroda='" + poroda + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
