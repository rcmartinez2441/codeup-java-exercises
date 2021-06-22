import java.util.Scanner;
public class JavaCurriculumAndLecture {

    public static void main(String[] args) {

        //***** CONSOLE IO *****

//        System.out.println("Test"); //Print Line, put a new line character per
//        System.out.print("Test2 \n"); //does NOT add a new line character, stays in same line
//        String name = "Raul";
//        System.out.printf("Test 3, my name is %s \n", name); //Does not print in new line 'Print the formatted string'
//
//        String mySentences = String.format("my Name is %s", name); // same as line 11
//        System.out.println(mySentences);
//
//        //Print out a sentence using 'printf' or String.format()
////        String role = "Student";
////        String school = "Codeup";
////        System.out.printf("Hello, my name is %s and I am a %s at %s", name, role, school );

        // Lecture Example
//        float currencyInPennies = 1000.00f;
//
//        System.out.printf("I'll sell you swamp land for $%.2f", currencyInPennies); //'%.2f' means to change it float with 2 decimal points

        //***USING SCANNER TO GET INPUT ***
        Scanner scanMan = new Scanner(System.in); //needs to know where to point and we tell it to use System.in to find where to found
        //System.in - it's default input stream is the console
//
//        System.out.println("What is your first and last Name?:");
//        String userInput = scanMan.next();
        //Listen for the next thing they type, usually in a new line
//        String firstName = scanMan.next(); // Will listen and return us a string. only first Token will be recorded
//        String lastName = scanMan.next();
//        System.out.printf("You Entered: %s %s\n", firstName, lastName);

//        /* TODO: use the scanner to take in the name of the month you were born and print it back out
//            - remember to first prompt the user for the input */
//
//        System.out.println("What Month were you born in?");
//        String month = scanMan.next();
//
//        System.out.println("What day?");
//        String day = scanMan.next();
//
//        System.out.println("Year?");
//        String year = scanMan.next();
//
//        System.out.printf("%s, %s %s", month, day, year);

        //Other methods besides .next() including nextInt(); can put string before and after but will only take int
//        System.out.print("Enter a Number:");
//        int myNum = scanMan.nextInt();
//        System.out.println(myNum);

        //.nextLine()
//        String myString = scanMan.nextLine(); //When you enter a new line (by hitting enter/return) will take the entire input and store it into myString
//        System.out.println(myString);

        //using while loop and boolean method .hasNext()
        while (scanMan.hasNext()){ //
            String word = scanMan.next();
            System.out.println(word);
        }
    }
}