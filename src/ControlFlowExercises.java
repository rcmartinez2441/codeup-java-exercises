import java.util.Locale;
import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
        //While Loop
//        int i = 5;
//        while (i <= 15){
//            System.out.print(i + " ");
//            i++;
//        }

        //Do While Loop
        //Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.

//        int count = 0;
//        do {
//            System.out.println(count);
//            count+=2;
//        } while (count < 100);
//
//        //Alter your loop to count backwards by 5's from 100 to -10.
//        do {
//            System.out.println(count);
//            count-=5;
//        } while (count >= -10);
//
//        //Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//        int powerBase = 2;
//        do {
//            System.out.println(powerBase);
//            powerBase = (int) Math.pow(powerBase,2);
//        }while (powerBase <= 1000000);

        //Refactor the previous two exercises to use a for loop instead.
        // A.
//        for(int i = 5; i <= 15; i++){
//            System.out.println(i);
//        }
//
//        //B1.
//        int b1 = 0;
//        for (int i = 0; i <= 100; i+=2){
//            System.out.println(i);
//            b1 = i;
//        }
//        for(int i = b1; i >= -10; i-=5){
//            System.out.println(i);
//        }
//
//        //B2.
//        int b2 = 2;
//        for (int i = 0; i <= 1000000; i ++){
//            System.out.println(b2);
//            b2 = (int) Math.pow(b2,2);
//            if (b2 >= 1000000){
//                break;
//            }
//        }

        //*** 2. FIZZBUZZ ****
        //One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
        //A) Write a program that prints the numbers from 1 to 100.
        //B) For multiples of three: print “Fizz” instead of the number.
        //C) For the multiples of five: print “Buzz”.
        //D) For numbers which are multiples of both three and five: print “FizzBuzz”.
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("Fizzbuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

        //***3. Table of Powers
        // Prompt the user to enter an integer.
        // Display a table of squares and cubes from 1 to the value entered.
        //Ask if the user wants to continue.
        //Assume that the user will enter valid data.
        //Only continue if the user agrees to.
        /*
        What number would you like to go up to? 5
                Here is your table!

                number | squared | cubed
                ------ | ------- | -----
                1      | 1       | 1
                2      | 4       | 8
                3      | 9       | 27
                4      | 16      | 64
                5      | 25      | 125
         */

        Scanner scanner = new Scanner(System.in);
//        boolean keepPlaying = true;

//        while (keepPlaying){
        /*            System.out.println("What number would you like to go up to?");
//            int userTableNumber = scanner.nextInt();
//            System.out.println(userTableNumber);
//
//            System.out.println("Here is your table!");
//
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//            for (int i = 1; i <= userTableNumber; i++) {
//                int squared = i * i;
//                int cubed = squared * i;
//                if (squared < 10) {
//                    System.out.printf("%s      | %s       | %s\n", i, squared, cubed);
//                } else if (squared > 10 && squared < 100) {
//                    System.out.printf("%s      | %s      | %s\n", i, squared, cubed);
//                } else {
//                    System.out.printf("%s     | %s     | %s\n", i, squared, cubed);
//                }
//            }
//            scanner.nextLine();
//            System.out.println("Keep PLaying? Y/N");
//            String userKeepPlaying = scanner.nextLine().toUpperCase();
//            if (userKeepPlaying.equals("N")){
//                keepPlaying = false;
//            } else if (userKeepPlaying.equals("Y")) {
//                System.out.println("Lets Continue!");
//            } else {
//                System.out.println("That's not a valid response, ending game");
//                break;
//            }
//
//        } */

        //Convert Given Number Grades into Letters
        boolean continueGradePrompt = true;
         while (continueGradePrompt){
             System.out.println("Enter a Number to Convert to Grade");
             int userGradeNumber = scanner.nextInt();
             System.out.println("Your Number: " + userGradeNumber);
             if ( userGradeNumber <= 59){
                 System.out.println("Your Grade is F");
             } else if (userGradeNumber <= 66) {
                 System.out.println("Your Grade is D");
             } else if (userGradeNumber <= 79) {
                 System.out.println("Your Grade is C");
             } else if (userGradeNumber <= 87) {
                 System.out.println("Your Grade is B");
             } else if (userGradeNumber <= 100) {
                 System.out.println("Your Grade is A");
             }
             scanner.nextLine();
             while (continueGradePrompt) {
                 System.out.println("Continue? Y/N");
                 String userContinue = scanner.nextLine().toUpperCase();
                 if(userContinue.equals("Y")) {
                     break;
                 } else if (userContinue.equals("N")){
                     System.out.println("Thanks for playing");
                     continueGradePrompt = false;
                     break;
                 } else {
                     System.out.println("Not a Valid Entry");
                 }
             }
         }
    }
}