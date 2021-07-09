package movies;

import util.Input;

import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {
    private static final String[] optionsList = {"0", "1", "2", "3", "4", "5", "6"};
    private static Movie[] allMovies = MoviesArray.findAll();
//    private static String[] viewingCategories = {quitSelection(), allMovies(),     allAnimatedMovies(), allDramaMovies(), allHorrorMovies(), allSciFiMovies()};
    //Movie List
    //We are going to build an application that keeps track of movies and displays them by category.
    //Inside of src, create a directory named movies. Create all of the classes described below in this directory.
    //Create a class named Movie. It should have private fields for name and category, and a constructor that sets both of these. Create methods to access these properties and change them (getters and setters).
    //Download the MoviesArray file and save it as MoviesArray.java inside of movies. This class has a static method named findAll that will return an array of Movie objects.


    //Create a class named MoviesApplication that has a main method.
    //Give the user a list of options for viewing all the movies or viewing movies by category.
    //Use your Input class to get input from the user, and display information based on their choice. (Remember to import your Input class)
    //If a category is selected, only movies from that category should be displayed.
    //Your application should continue to run until the user chooses to exit.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Input inputClass = new Input();
        provideOptions(scanner, inputClass);

    }

    public static void provideOptions(Scanner scanner, Input inputClass) {
        System.out.println("Wha Would You Like to Do?");
        System.out.println(
                        "0 - Exit \n" +
                        "1 - View All Movies\n" +
                        "2 - View All Animated Movies\n" +
                        "3 - View All Drama Movies\n" +
                        "4 - View All Horror Movies\n" +
                        "5 - View All Sci-Fi Movies\n" +
                        "6 - Add A New Movie\n"
        );
        System.out.println("Enter Your Choice: ");

        checkOptionSelected(inputClass.userInput(), scanner, inputClass);


    }

    public static void checkOptionSelected(String optionChosen, Scanner scanner, Input inputClass) {
        boolean invalidOption = true;
        for (String option : optionsList) {
            if (option.equalsIgnoreCase(optionChosen)) {
                invalidOption = false;
                doOption(Integer.parseInt(optionChosen), scanner, inputClass);
            }
        }
        if (invalidOption) {
            System.out.println("Not A Valid Option, Try Again");
            provideOptions(scanner, inputClass);
        }
    }

    public static void doOption(int number, Scanner scanner, Input input) {
//        Movie[] allMovies = MoviesArray.findAll();
        switch (number) {
            case 1:
                System.out.println(movieListFormatting(allMovies));
                break;
            case 2:
                System.out.println(movieListFormatting("animated", allMovies));
                break;
            case 3:
                System.out.println(movieListFormatting("drama", allMovies));
                break;
            case 4:
                System.out.println(movieListFormatting("horror", allMovies));
                break;
            case 5:
                System.out.println(movieListFormatting("scifi", allMovies));
                break;
            case 6:
                addNewMovie(scanner, input);
                break;
            default:
                System.out.println(quitSelection());
                break;
        }

        boolean tryAgain = input.yesNo("Want to Enter a New Option? Y/N");
        if (tryAgain) {
            provideOptions(scanner, input);
        } else {
            System.out.println(quitSelection());
        }
    }

    public static String quitSelection() {
        return "Okay Thank You";
    }


    public static String movieListFormatting(Movie[] allMovies) {
        String stringOfAllMovies = "";
        for (Movie movie : allMovies) {
            stringOfAllMovies +=
                    "Movie: " + movie.getName()
                            + "\n Genre: " + movie.getCategory() + "\n"
                            + "===================================\n";
        }
        return stringOfAllMovies;
    }

    public static String movieListFormatting(String genre, Movie[] allMovies) {
        String stringOfCategoryMovies = "";
        for (Movie movie : allMovies) {
            if (movie.getCategory().equalsIgnoreCase(genre)) {
                stringOfCategoryMovies +=
                        "Movie: " + movie.getName()
                                + "\n Genre: " + movie.getCategory() + "\n"
                                + "===================================\n";
            }
        }
        return stringOfCategoryMovies;
    }

    public static void addNewMovie (Scanner scanner, Input input) {
        Movie [] allMoviesIncludingNew = Arrays.copyOf(allMovies, allMovies.length + 1);
        System.out.println("Enter Movie Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter Main Genre: ");
        String genre = scanner.nextLine();

        allMoviesIncludingNew[allMovies.length] = new Movie(name, genre);
        allMovies = allMoviesIncludingNew;
    }
}

