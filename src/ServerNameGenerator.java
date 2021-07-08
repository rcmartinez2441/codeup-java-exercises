import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args) {
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