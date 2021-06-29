public class MethodsLecture {
    public static void main(String[] args) {
        //***LEARNING METHODS***
//        System.out.println(greeting(24));
//        System.out.println(nbaTeams("The Spurs"));


        System.out.println(profile("raul", "martinez"));
        System.out.println(profile(26));
        System.out.println(profile("Better to live a life of what ifs than a life of oh wells"));
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

    public static String profile (String first, String last){
        return "Hello " + first + " " + last;
    }

    public static String profile (int age){
        return "That's crazy, you dont look like " + age;
    }
    public static String profile(String quote){
        return quote;
    }

}