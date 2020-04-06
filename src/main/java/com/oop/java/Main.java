package com.oop.java;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Tlou",12,"male", new String[] {"Going beastmode in Fortnite", "Designing", "Pizza", "Cars","Beers"});
        String intro = person.hello();
        System.out.println(intro);


    }
}
