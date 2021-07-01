import util.Input;
public class InputTest {
    public static void main(String[] args) {
        Input inputJava = new Input(); //Creates a new scanner when a new instance is called

        //Using getString();
        String getString = inputJava.getString("Enter a String");
        System.out.println( getString );

        Boolean yesNo = inputJava.yesNo("Yes / No?");
        System.out.println(yesNo);

        //getInt()
        inputJava.minInt = 1;
        inputJava.maxInt = 10;
        inputJava.getInt(inputJava.minInt,inputJava.maxInt);
        inputJava.getInt("Type In An Integer");

        //getDouble()
        inputJava.minDouble = 1;
        inputJava.maxDouble = 10;
        inputJava.getDouble(inputJava.minDouble, inputJava.maxDouble, "Type a Number Between %s and %s\n");
        inputJava.getDouble("Type In A Double");

    }
}