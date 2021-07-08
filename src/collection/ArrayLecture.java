package collection;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLecture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int[] intArray = getIntArray() ; // this will initialize empty array
//        intArray = Arrays.stream(intArray).map( (i) -> {return i * 2;} ).toArray();
//        System.out.println(Arrays.toString(intArray));
//
//        System.out.println("Enter Array Length");
//        System.out.println(Arrays.toString(setIntArray(new int[scanner.nextInt()], scanner)));
        System.out.println( Arrays.toString( stringArray(scanner) ) );
    }

    public static int[] getIntArray () {
        return new int[] {1,2,3};
    }

    public static int[] getIntArray (int length){
        int[] intArray = new int[length];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i * 2;
        }
        return intArray;
    }
    
    public static int[] setIntArray (int[] intArray, Scanner scanner){
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Please Enter Integer");
            intArray[i] = scanner.nextInt();
        }
        return intArray;
    }

    //Make a method which returns a String array.
    //That string array will contain the user's names.
    //The user's names will be provided by command line input (scanner)
    //You will need some input trigger that tells a loop to stop
    //I recommend using a while loop that checks against a variable you set each time the user enters a name and presses 'return'
    //Finally, call that method in your main() and print out its returned value, as a string
    //Arrays.toString(yourArray);
    public static String[] stringArray (Scanner scanner) {
        System.out.println("Enter Full Name");
        return scanner.nextLine().split(" ");
    }
}