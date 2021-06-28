import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class StringsLecture {
    public static void main(String[] args) {
        //        warmup:
//        TODO: create a new "Strings-Lecture" java class file (or wherever
//         you like to keep notes/lecture exercises. Copy given
//         code, that is your starting point. Using Scanner prompt a
//         user (in this case it's you, you're the user) to type in
//         their first name. Save the input into a String variable. If
//         your name matches randomName, print "woah! you guessed:
//         enter-randomName-here! How did you know enter-yourName-here
//         is my name?!". if randomName does
//         not
//         match your name exactly, print "Way off my friend! My name
//         isn't randomName-here. It's yourName-here.".
        Scanner sc = new Scanner(System.in);
        String[] studentsArr =
                {"Amado", "Christian", "Christopher", "Corey", "Demetrio",
                        "Diamond", "Erik", "Grady", "Jesse", "Joshua",
                        "Juan", "Mitchell", "Moses", "Nathan", "Prachi",
                        "Raul", "Ricardo", "Richard", "Robert", "Sam",
                        "Sean", "Stephen", "Tiffanny", "Wagner", "Laura",
                        "Casey", "Dorian", "Tristan", "Jordy"};
        int randomNum = (int) (Math.random() * 28);
        String randomName = studentsArr[randomNum];
        /* your code goes here */
        System.out.println(randomName);
        System.out.println(Arrays.toString(studentsArr));
        boolean isName = true;

//        do {
//            System.out.println("Enter A Name");
//            String typedName = sc.next();
//
//            System.out.println(typedName);
//            if (randomName.equalsIgnoreCase(typedName)){
//                System.out.println("Woah you guessed: " + typedName + "! how did you know " + randomName + " was my name?");
//                isName = false;
//            } else {
//                System.out.println("Way off my friend, My name isn't " + typedName + ", it's " + randomName);
//            }
//        } while (isName);
        //=================================================================================

        //different String Comparison Methods

        //.startsWith() is case sensitive so "this" compared to "This" will be false
        //Can chain a string literal with a .toUpperCase or lowerCase to use .startsWith() easier

        String string1 = "String one";
        System.out.println(string1.toUpperCase().startsWith("string".toUpperCase()));

        //        TODO: create a String variable that holds this sentence: "Red
//         Orange Blue Yellow Green Purple". Prompt the user to type in
//         their favorite color, if their fave color is the same as the
//         first word in the String, then print out "my fave color:
//         userColor is the first one". If their fave color is last, then print out "my fave color:userColor is last"
//        Scanner scColors = new Scanner(System.in);
//        String colorString = "Red Orange Blue Yellow Green Purple";
//
//        System.out.println("Please type a color:");
//        String typedColor = scColors.nextLine();
//
//        boolean isFirstColor = colorString.toUpperCase().startsWith(typedColor.toUpperCase());
//        boolean isLastColor = colorString.toUpperCase().endsWith(typedColor.toUpperCase());
//
//        if (isFirstColor){
//            System.out.println("My fav color: " + typedColor + " is the first one");
//        } else if (isLastColor){
//            System.out.println("My fav color: " + typedColor + " is the last one");
//        } else {
//            System.out.println("Color: " + typedColor + " was not first or last of string");
//        }
    //+++++++++ MORE STRING MANIPULATION +++++++++++++++++
        // charAt(): returns a specified character given an index number
        //Ex
//        String randomWord = "hemoglobin";
//        String randomSentence = "seventy percent of the oxygen on Earth is provided by algae";
//        //Need to save the return in the appropriate data type (in this case int )
//        System.out.println(randomWord.charAt(4)); // Prints out 'g' from word
//
//        //indexOf() returns the index of a given char, will return -1 if index not found
//        System.out.println(randomSentence.indexOf("x")); // will print out '5'
//
//        //lastIndexOf() starts from end of string and provides the last iteration of the given char
//        System.out.println(randomSentence.lastIndexOf("Earth")); // Will return int 34

        //length() will give you the length of the string like in JS

        //replace(); get to replace something within a string, will return a copy of the string with the replacement
        //EX
        String before = "giggles";
        System.out.println(before);
        String after = before.replace('i', 'o');
        System.out.println(after);

        //substring() return substring of  the original string at points in which you told it to extract from
        //EX
        String danceArms = "Where are you supposed to put your arms when" + " you dance? It's like the universal " + "question";

        int indexArms = danceArms.indexOf("arms");
        int indexQuestion = danceArms.indexOf("I");

        String newSentence  = danceArms.substring(indexArms, indexQuestion);
        System.out.println(newSentence);

        //toUpperCase() and toLowerCase() are easy

        // trim(); will remove extra white space before and after string
        //EX
        String trimTest = "         test        ";
        System.out.println(trimTest.trim());

    }
}