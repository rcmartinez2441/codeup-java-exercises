import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers); // will print out hashcode
        System.out.println(Arrays.toString(numbers)); // Will print out a String Array with contents

        Person person1 = new Person("Raul");
        Person person2 = new Person("Amado");
        Person person3 = new Person("Roberto");

        String[] personArray = {person1.getName(), person2.getName(), person3.getName()};
        System.out.println(Arrays.toString(personArray));

        Person person4 = new Person("Stephen");
        String[] newArray = addPerson(personArray, person4);
        System.out.println(Arrays.toString(newArray));

    }

    public static String[] addPerson(String[] peoples, Person newPerson) {
        String[] newArray = Arrays.copyOf(peoples, peoples.length + 1);
        newArray[peoples.length] = newPerson.getName();
        return newArray;
    }

    //2. Server Name Generator
    // We are going to build a server name generator. Create a class inside of src named ServerNameGenerator, and follow the specs below.
    //Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
    //Create a method that will return a random element from an array of strings.
    //Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.




}