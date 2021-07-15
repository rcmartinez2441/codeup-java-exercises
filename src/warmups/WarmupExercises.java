package warmups;

import java.util.Arrays;
import java.util.Scanner;

public  class WarmupExercises {
    private String[] vacationSpots = new String[] {};
    private Scanner scanner = new Scanner(System.in);


//    public WarmupExercises() {
//        addVacationSpot(scanner);
//    }
//    public String listFavoriteVacSpots () {
//        String vacationFormatting = "All Your Current Vacation Spots: \n" + "=============================\n";
//        for (String thisSpot : vacationSpots){
//            vacationFormatting += thisSpot + "\n"
//                    + "---------------------------\n";
//        }
//        return vacationFormatting;
//    }
    public WarmupExercises() {

    }

    // TODO: Create a method which will return a String[] containing the user's favorite vacation spots
//  -> Each time the user inputs a new vacation spot, reset the array to be one element longer in length
//  -> Then, add the old elements
//  -> Finally, add the new element
//  -> When the user decides to finish inputting spots, return the String[].
//  -> sout out the returned value!

    public void addVacationSpot (Scanner scanner) {
        System.out.println("Add a Vacation Spot (Type 'quit' to stop adding): ");
        String userInput = scanner.nextLine().toUpperCase();
        if (!userInput.startsWith("Q")){
            String[] updateCopy = Arrays.copyOf(vacationSpots, vacationSpots.length + 1);
            updateCopy[vacationSpots.length] = userInput;
            vacationSpots = updateCopy;
            addVacationSpot(scanner);
        } else {
            System.out.println("Thanks for your Input");
//            System.out.println( listFavoriteVacSpots() );
        }
    }

    //warmup: write a method that accepts a string and returns a String array that splits at the spaces - you can write this within any main method\

    public String[] stringToArray (String string){
        String[] array = string.split(" ");
        System.out.println(Arrays.toString(array));
        return array;
    }

    //07/15/21 - Warmup
    // //WARM UP
    // TODO Given this string: `String str = "Oberon is the
    //  best cohort ever!"`, print out the character from that
    //  string using a random number generator, that generates
    //  a number between 0 and 50. Using a try/catch block, handle
    //  any errors (Exceptions) that may occur by printing out the
    //  message.


    public void printRandomCharacter (String string){
        int randomNumber = (int) Math.floor(Math.random()*51);
        System.out.println( string );
        System.out.println( randomNumber );
        try {
            System.out.println( string.charAt(randomNumber) );
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("Random Number out of Range");
            for(StackTraceElement line : e.getStackTrace()){
                System.out.println(line);
            }
            printRandomCharacter(string);
        }
    }
}

