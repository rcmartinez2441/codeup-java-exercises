package collection;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLecture {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int[] intArray = getIntArray() ; // this will initialize empty array
//        intArray = Arrays.stream(intArray).map( (i) -> {return i * 2;} ).toArray();
//        System.out.println(Arrays.toString(intArray));
//
//        System.out.println("Enter Array Length");
//        System.out.println(Arrays.toString(setIntArray(new int[scanner.nextInt()], scanner)));

        String[] person1Names = getNameArray();

        String[] person2Names = getNameArray();

        //STATIC ARRAY METHODS

        // ** Arrays.equals ( array1, array2 ) boolean
        System.out.println(Arrays.equals(person1Names, person2Names));

        //Arrays.copy (a1, length )
        person1Names = Arrays.copyOf(person1Names, person1Names.length);
        System.out.println(Arrays.toString(person1Names));


        //Arrays.sort()
        int[] intArr = getIntArray();
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));
    }

    public static int[] getIntArray () {
        return new int[] {3,1,2};
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
    public static String[] getNameArray () {
        System.out.println("Enter Full Name Seperated by Spaces");
        return scanner.nextLine().split(" ");
    }


}