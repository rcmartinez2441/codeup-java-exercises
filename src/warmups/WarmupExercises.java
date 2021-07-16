package warmups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WarmupExercises {
    private String[] vacationSpots = new String[]{};
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

    public void addVacationSpot(Scanner scanner) {
        System.out.println("Add a Vacation Spot (Type 'quit' to stop adding): ");
        String userInput = scanner.nextLine().toUpperCase();
        if (!userInput.startsWith("Q")) {
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

    public String[] stringToArray(String string) {
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


    public void printRandomCharacter(String string) {
        int randomNumber = (int) Math.floor(Math.random() * 51);
        System.out.println(string);
        System.out.println(randomNumber);
        try {
            System.out.println(string.charAt(randomNumber));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Random Number out of Range");
            for (StackTraceElement line : e.getStackTrace()) {
                System.out.println(line);
            }
            printRandomCharacter(string);
        }
    }

    //Write a method named getTwentyPrimes() that returns a string containing the first 20 prime numbers, each separated by a comma. Output: "1, 2, 3, 5, 7, 11, 13, 17, 19"... until we have a total count of 20 primes in the string.
    public void getTwentyPrimes() {
        System.out.println("test");
        List<Integer> primes = new ArrayList<>();
        for (int i = 0; primes.size() < 20; i++) {
            if (!(i % 2 == 0)) {
                primes.add(i);
            }
        }

        String allPrimes = "";
        for (Integer prime : primes) {
            if (primes.get(primes.size()-1).equals(prime)) {
                allPrimes += prime;
            } else {
                allPrimes += prime + ", ";
            }
        }

        System.out.println(allPrimes);
    }
}

