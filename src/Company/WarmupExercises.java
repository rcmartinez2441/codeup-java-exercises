package Company;

public class WarmupExercises {

    public static void main(String[] args) {
        System.out.println(capitalizationCheck("This Is A String"));
    }

    public static int capitalizationCheck (String string){
        int counter = 0;
        for(int i = 0; i < string.length(); i++){
            if (Character.isUpperCase(string.charAt(i))){
                counter++;
            }
        }
        return counter;
    }
}