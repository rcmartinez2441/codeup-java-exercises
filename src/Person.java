public class Person {
    private String name;

    public static void main(String[] args) {
        //The class should have a constructor that accepts a `String` value and sets
        //the person's name to the passed string.
        //Create a `main` method on the class that creates a new `Person` object and
        //tests the above methods.
        Person person = new Person("Raul");
        System.out.println(person.getName());

        //**1. Understanding References**
        //The following code blocks make use of the Person class from the previous exercise. For each code block, think about what the code will output, then copy the code into IntelliJ and run it to see if it matches your expectations.
        //** Example One ***
        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName())); //True - is comparing values and the values are the same
        System.out.println(person1 == person2); // Will always equate to false since it compares Object vs Object not values

        //*** Example Two ***
//        Person person1 = new Person("John");
//        Person person2 = person1; //Setting right hand to 'new Person("John")
//        System.out.println(person1 == person2); //false since its still comparing to different objects

        //*** Example Three ***
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName()); // "John"
//        System.out.println(person2.getName()); // "John"
//        person2.setName("Jane"); //Sets name
//        System.out.println(person1.getName()); //"John"
//        System.out.println(person2.getName()); //"Jane"
    }

    public Person(String name) {
        setName(name);
    }

    // 1. Object Basics
    public String getName() {
        //TODO: return the person's name
        return name;
    }

    public void setName(String name) {
        //TODO: change the name property to the passed value
        this.name = name;
    }

    public void sayHello() {
        //TODO: print a message to the console using the person's name
        System.out.println("Hello " + this.name);
    }


}