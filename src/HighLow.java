import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        //*** 5. Game Development 101 ***
        //You are going to build a high-low guessing game. Create a class named HighLow inside of src.
        //The specs for the game are:
        //Game picks a random number between 1 and 100.
        //Prompts user to guess the number.
        //All user inputs are validated.
        //If user's guess is less than the number, it outputs "HIGHER".
        //If user's guess is more than the number, it outputs "LOWER".
        //If a user guesses the number, the game should declare "GOOD GUESS!"
        Scanner scanner = new Scanner(System.in);
        highLowGame(randomNumGenerator(), scanner, 0);
    }

    public static int randomNumGenerator() {
        return (int) Math.floor((Math.random() * 100) + 1);
    }

    public static void highLowGame(int randomNumber, Scanner scanner, int numberOfGuesses) {
        System.out.println("Guess The Number between 1 - 100 (Ten Attempts)");
        int userGuess = scanner.nextInt();
        numberOfGuesses++;
        System.out.println("Number of Guesses: " + numberOfGuesses);
        playGame(randomNumber, userGuess, scanner, numberOfGuesses);
    }

    public static int playGame(int randomNumber, int guessedNumber, Scanner scanner, int counter) {
        System.out.printf("Your Number: %s\n", guessedNumber);
        if (guessedNumber > randomNumber) {
            System.out.println("LOWER");
            if (counter == 10){
                System.out.println("RAN OUT OF GUESSES");
                return counter;
            } else {
                highLowGame(randomNumber, scanner, counter);
            }
        } else if (guessedNumber < randomNumber) {
            System.out.println("HIGHER");
            if (counter == 10){
                System.out.println("RAN OUT OF GUESSES");
                return counter;
            } else {
                highLowGame(randomNumber, scanner, counter);
            }
        } else if (guessedNumber == randomNumber) {
            System.out.println("GOOD GUESS");
            System.out.println("Random Number Was: " + randomNumber);
        }
        return counter;
    }

//    public static boolean playAgain
}