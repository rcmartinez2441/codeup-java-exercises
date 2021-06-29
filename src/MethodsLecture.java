import java.util.Locale;
import java.util.Scanner;
public class MethodsLecture {
    public static void main(String[] args) {
        //***LEARNING METHODS***
//        System.out.println(greeting(24));
//        System.out.println(nbaTeams("The Spurs"));


//        System.out.println(profile("raul", "martinez"));
//        System.out.println(profile(26));
//        System.out.println(profile("Better to live a life of what ifs than a life of oh wells"));

        createScanner();
    }
    //Syntax
    //'public' - whether or not this method will be visible for other classes
    // 'static' - its going to be available for this class but an INSTANCE of a class
    // 'void' - its the expected return type of the method (can also be String, int, etc...)
    // 'main' - name of method
    // (dataType  params ) - parameters go in the parenthesis with the data type defined.

//    public static int greeting(int age) {
//        System.out.println(age);
//        return age;
//    }
//    //    TODO: create a new method that accepts the name of a basketball
//    //     team (ex: the spurs) and returns a String that says
//    //     "[basketballTeam] is the best team.". Invoke that method within
//    //     your main method (remember to pass in the name of the basketball
//    //     team). print out the result of the new method.
//
//    public static String nbaTeams (String team) {
//        numberOfChars(team);
//        return team + " is the best Team";
//    }
//
//    //    TODO: create a new method that accepts the string created from the
//    //     first method and returns the number of characters in that string.
//    public static void numberOfChars (String input){
//        System.out.println("String length is: " + input.length());
//
//    }

    //***METHOD OVERLOAD***
    // defining multiple methods with the same name, but with different parameter type, parameter order, or number of parameters.
    //depending on dataType passed in argument, it run the correct 'greeting' method accordingly
//    public static void greeting () {
//        System.out.println("no parameter");
//    }
//    //vs
//    public static void greeting(String param){
//        System.out.println("String Parameter: " + param);
//    }
//    //vs
//    public static void greeting(String param, String param2){ //Expects two params to execute, with only one argument, the previous greeting with one param with execute
//        System.out.println("2 Parameter Method Initiated");
//    }

    //    TODO: invoke a method that accepts (and returns) the following:
    //        - accepts: your first name and your last name. returns: A
    //        string that reads: "Hello Laura Ruiz-Roehrs (replace with your
    //        first and last)";
    //       - accepts: your age. returns: "that's crazy! you don't look
    //        100 years old!"
    //      -accepts: your favorite quote. returns: "your fave quote"

//    public static String profile (String first, String last){
//        return "Hello " + first + " " + last;
//    }
//
//    public static String profile (int age){
//        return "That's crazy, you dont look like " + age;
//    }
//    public static String profile(String quote){
//        return quote;
//    }

    //** 06/29/21 ***
    // Warm-Up
    //    WARMUP
//    TODO: prompt a user to tell us about themselves (age, name, if
//     they have any pets (true/false). Using method overloading, create
//     methods that will return the first fact they told us about
//     themselves. ex: I can input: 18 -- Laura -- false in which case I
//     expect you to return: 18. but if I tell you my name first: Laura --
//     false -- 18. I expect you to return "Laura" ... etc.
    public static void createScanner () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tell us about yourself? In no particular order: Age, Name, Any Pets? (true/false)");
        String userInput1 = scanner.next();
        checkInput(userInput1);
    }

    public static void checkInput (String input) {
        int test = Integer.valueOf(input);
        System.out.println(test);
//        if (input.equalsIgnoreCase("TRUE") || input.equalsIgnoreCase("FALSE") ){
//            boolean inputType = Boolean.parseBoolean(input);
//            aboutMe(inputType);
//        } else if ( Double.isNaN(input) ){
//            int userType = Integer.parseInt(input);
//            aboutMe(userType);
//        } else {
//            aboutMe(input);
//        }
    }

    public static String aboutMe (String name){
        System.out.println("Name: " + name);
        return name;
    }

    public static int aboutMe (int age){
        System.out.println("Age:" + age);
        return age;
    }

    public static boolean aboutMe (boolean pets){
        System.out.println("Pets: " + pets);
        return pets;
    }



    //Passing by value, is like passing copy of an object, we are going to grab the value and not change the  original value
    // passing by reference you are passing the original value and changing the origina value
}