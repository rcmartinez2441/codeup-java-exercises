import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        double pi = 3.14156;

        String newPi = String.format("%.2f", pi);
    //Write some Java code that uses the variable pi to output the following:
    // The value of pi is approximately 3.14.
//        System.out.println("The value of pi is approximately: " + newPi);
        System.out.format("The value of pi is approximately: %s \n", newPi);

//        1. Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
//             1.a What happens if you input something that is not an integer? - it will give you an exception
//        System.out.println("Enter and Integer:");
//        int userInput = scnr.nextInt();
//
//        System.out.println("Your Number:" + userInput);

//        2. Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
        System.out.println("Enter Three Words:");
//        String word1 = scnr.next();
//        String word2 = scnr.next();
//        String word3 = scnr.next();

//        System.out.printf("word1: %s, word2: %s, word3: %s", word1, word2, word3);
//          2.a What happens if you enter less than 3 words? //It will go to the next line and wait for an input from user for third token
//          2.b What happens if you enter more than 3 words?
//        3. Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
//          3.a do you capture all the words?
//        4. Rewrite the above example using the nextLine method
        String userInput = scnr.nextLine();
        System.out.println(userInput);

        scnr.useDelimiter("\n");
//      Prompt the user to enter values of length and width of a classroom at Codeup.
        System.out.println("Enter Length");
        float userLength = scnr.nextFloat(); //Another way to retrieve a prese Int from a .next() that returns a string+-

        System.out.println("Enter Width");
        float userWidth = scnr.nextFloat();

//      1. Use the nextLine method to get user input and parse the resulting string to a numeric type.
        float userArea = userLength * userWidth;
        float userPerimeter = (userLength + userWidth) * 2;

//      Assume that the rooms are perfect rectangles.
//      Assume that the user will enter valid numeric data for length and width.
        System.out.printf("Area is: %s \n", userArea);

//      2. Display the area and perimeter of that classroom.
//          The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.
        System.out.printf("Perimeter is: %s\n", userPerimeter);

        //***BONUS***
        //In your perimeter/area calculator: - Accept decimal entries. - Calculate the volume of the rooms in addition to the area and perimeter.
        System.out.println("Enter Height");
        float userHeight = scnr.nextFloat();

        float volume = userLength * userWidth * userHeight;
        System.out.printf("Volume is: %s\n", volume);


    }
}