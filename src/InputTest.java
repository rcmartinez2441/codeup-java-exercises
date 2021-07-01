import util.Input;
public class InputTest {
    public static void main(String[] args) {
        Input inputJava = new Input(); //Creates a new scanner when a new instance is called

        //Using getString();
        String getString = inputJava.getString("Enter a String");
        System.out.println( getString );

        Boolean yesNo = inputJava.yesNo();
        System.out.println(yesNo);

        //getInt
        inputJava.getInt(1,10);
    }
}