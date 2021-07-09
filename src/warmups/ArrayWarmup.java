package warmups;

import java.util.Arrays;
import java.util.Scanner;

public  class ArrayWarmup {
    private String[] vacationSpots = new String[] {};
    private Scanner scanner = new Scanner(System.in);


    public ArrayWarmup() {
        addVacationSpot(scanner);
    }
    public String listFavoriteVacSpots () {
        String vacationFormatting = "All Your Current Vacation Spots: \n" + "=============================\n";
        for (String thisSpot : vacationSpots){
            vacationFormatting += thisSpot + "\n"
                    + "---------------------------\n";
        }
        return vacationFormatting;
    }

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
            System.out.println( listFavoriteVacSpots() );
        }
    }
}
// TODO: Create a method which will return a String[] containing the user's favorite vacation spots
//  -> Each time the user inputs a new vacation spot, reset the array to be one element longer in length
//  -> Then, add the old elements
//  -> Finally, add the new element
//  -> When the user decides to finish inputting spots, return the String[].
//  -> sout out the returned value!