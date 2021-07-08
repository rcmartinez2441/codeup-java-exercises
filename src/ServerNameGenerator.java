import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args) {

        //2. Server Name Generator
        // We are going to build a server name generator. Create a class inside of src named ServerNameGenerator, and follow the specs below.
        //Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
        //Create a method that will return a random element from an array of strings.
        //Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.

        String[] nouns = {"Apple", "Baseball", "Chicken", "Cookie",
                "Window", "Spring", "Star", "Leaf", "Bridge", "Cake"};
        String[] adjectives = {"Gentle", "Brave", "Jolly", "Amused",
                "Acidic", "Charming", "Horrific", "Crooked", "Cynical", "Icy"};
        String serverName1 = random(adjectives);
        String serverName2 = random(nouns);
        System.out.println("Here is your server name:");
        System.out.println(serverName1 + "-" + serverName2);
    }
    public static String random(String[] str){
        Random random = new Random();
        int randomItem = random.nextInt(str.length);
        return str[randomItem];
    }
}