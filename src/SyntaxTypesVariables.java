
import java.util.Scanner;

public class SyntaxTypesVariables {

    public static void main(String[] args) {
//        //Using byte, is our smallest data type
//        byte firstNumber = 127; //Max Value for a byte is 127
//        System.out.println(firstNumber);
//
//        //What will happen to byt + 1?
//        System.out.println(firstNumber + 1); //Will log 128
//
//        //What is the type of (firstNumber + 1) now?
//        byte secondNumber = 10;
//        // firstNumber + secondNumber  will give you an Integer (Capitlized I for object type 'Integer')
////        System.out.println( ((Object)(firstNumber + 1)).getClass().getName() ); //logs java.lang.Integer
//
//        firstNumber += secondNumber; // What will it return?
//        System.out.println(firstNumber); // Will return -119 which is coming from -128, -127, -126.....-119
//
//        //**USING FLOAT AND SHORT
//        float floatNumber = 32.1f; //put 'f' to state that it is a valid float type
//
//        //trying to do a double =
//        float floatSecondNumber = 32.12f;
//
//        //*'double' is double precision floating point numbers
//        double doubleTypeNumber = 32.12;
//        System.out.println(doubleTypeNumber); // Will return 32.12
//        =================================================================================================

        //** WORKING WITH STRINGS **

       /* System.out.println("Hello"); //Strictly using double quotes, single quotes not allowed for string

        //Chars
        System.out.println((int) 'h'); // every character in Java has a character value (ASCII Values) they go from 0 - 127 like a byte

        String myName = "Casey"; //String is an object type so being an object it will have methods to it using dot notation
        System.out.println(myName.length());
        //Would have to use concatenation to combine string
        //**BOOLEANS **

        byte temp = 74;
        var isNiceDay = (temp >60) && (temp < 80);


        if (isNiceDay){
            System.out.println("Cool");
        }else {
            System.out.println("Whoops");
        }*/

        Scanner scannerVariable = new Scanner(System.in);

        System.out.print("Enter something");
        String userInput = scannerVariable.next();

        System.out.println("You entered: --> \"" + userInput + "\" <--");

    }

}
