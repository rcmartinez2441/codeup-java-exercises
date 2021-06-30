package oop;

public class ObjectOrientedProgramming {
    public static void main(String[] args) {
        //tell me about a person
        //I want every person to have the same characteristics/ behaviours unique to each person

        //gonna make a new person
        Person person = new Person();

        person.setName("Raul");
        System.out.println(person.getName());

        System.out.println(person.getEntertainment("Play Video Games"));
    }
}
