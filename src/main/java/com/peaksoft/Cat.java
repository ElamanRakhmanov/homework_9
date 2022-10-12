package com.peaksoft;

public class Cat implements Animal{
    private String name;
    private String poroda;
    private int age;
    private String color;

//    public Cat(String name, String poroda, int age, String color) {
//        this.name = name;
//        this.poroda = poroda;
//        this.age = age;
//        this.color = color;
//    }

    @Override
    public void animalPlus() {
        System.out.println("Cat have been added!");
    }

    @Override
    public void animalMinus() {
        System.out.println("Cat have been deleted!");
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
        return "Cat{" +
                "name='" + name + '\'' +
                ", poroda='" + poroda + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
