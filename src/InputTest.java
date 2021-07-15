import util.Input;
public class InputTest {
    public static void main(String[] args) {
        Input inputJava = new Input(); //Creates a new scanner when a new instance is called

        //Using getString();
        String getString = inputJava.getString();
        System.out.println( getString );

        Boolean yesNo = inputJava.yesNo("Yes / No?");
        System.out.println(yesNo);

        //getInt()
        inputJava.setMinMaxInt(1,10);
        inputJava.getInt();
//        inputJava.getInt("Type In An Integer");

        //getDouble()
        inputJava.setMinMaxDouble(2,30);
        inputJava.getDouble();
//        inputJava.getDouble("Type In A Double"); testing

    }
}