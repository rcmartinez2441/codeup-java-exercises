package oop;

//anyone who can access the OOP package, have access all public classes
public class Person {

    //First Piece is a FIELDS - objects and primities that help describe the characteristics of a class
    //Fields is just data
    //In most OOP, fields are private, every field we make, will have an accesss modifyer
    // cannot access these field directly
    // cannot do like 'Person person = new Person();' --> person.name (cannot do that)
    //Private means only members of the same class are allowed to access it
    private String name;
    private int age;
    private String height;
    private String nationality;
    private String purpose;
    private static final boolean hasSkin = true;

    //You want to do static when certain things are irrespective of any instance
    //It doesnt matter of what person


    // 2nd Piece is a CONSTRUCTOR = constructors will allow you to use private fields
    //I can inject my values
    public Person(String name, int age, String height, String nationality) {
        // user can now call Person with arguments for name, age,... etc
        //will inject fields using 'this'
        //Assign 'this' persons
        this.name = name;
        this.age = age;
        this.height = height;
        this.nationality = nationality;

    }

    //Last Piece is PROPERTIES:METHODS are properties NOT field - where we define behaviour
    // if your Constructor 'public Person() {}' has no params, you will need properties to attempt to access any private fields (to get and set the fields)
    public Person() {

    }

    //***Setting Up Getters and Setters automatically***
    //Right Click -> Generate -> Getters & Setters --> select all private fields you want
    public String getName() { // Public method is allowed to access private field 'name'
        return name;
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

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public static boolean isHasSkin() {
        return hasSkin; // since its a final static field, it is not related to one instance but static for the class (if the field wasn't static, it would be 'this.hasSkin')
        //In OOP.Java, since it is a static variable, you would call this method using CLASS name and not var name. ex: "Person.isHasSkin(); instead of person.isHasSkin();
    }

    //**Sometimes you will have to write specific code that is not a Getter or Setter
    //Ex
    public String getEntertainment (String entertainment){
        return this.name + " is going to go " + entertainment;
        //'Casey is going to ride a rollercoaster
    }

    public String getPurpose () {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

}
