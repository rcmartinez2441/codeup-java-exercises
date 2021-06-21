public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World");

        //*** Syntax, Types and Variables Exercises ***

        //Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
        int myFavoriteNumber = 69;
        System.out.println(myFavoriteNumber);

        //Create a String variable named myString and assign a string value to it, then print the variable out to the console.
        String myString = "Shapoopy";
        System.out.println(myString);

        //1. Change your code to assign a character value to myString. What do you notice?
        /*myString = 'a';*/  //Wont allow you to switch from String to Char

        //2. Change your code to assign the value 3.14159 to myString. What happens?
//        myString = 3.14159; //Required type is looking for string and you are providing a type 'double'

        //3. Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
        long myNumber;
//        System.out.println(myNumber); // ERROR: variable myNumber might not have been initialized

        //4. Change your code to assign the value 3.14 to myNumber. What do you notice?
//        myNumber = 3.14; //long is asking for type 'long' but 3.14 is being considered a 'double'

        //5. Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
        myNumber = 123L;
        System.out.println(myNumber); // Logs '123' after putting 'L'

        //6. Change your code to assign the value 123 to myNumber.
        myNumber = 123;
        System.out.println(myNumber); //Still Returns '123'

        //7. Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
        //'long' expects INTEGERS so looks like anything but, it will not like

        //8. Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
//        float myNumber = 3.14; //Says that myNumber has already been defined as a variable
        //Can possibly use casting for implicit and explicit casting
        float myNumberAlpha = myNumber; //implicit casting
        float myNumberBeta = (float) myNumber; //explicit casting
        System.out.println(myNumberAlpha);
        System.out.println(myNumberBeta);


        //9. Copy and paste the following code blocks one at a time and execute them
        int x = 5;
        System.out.println(x++);
        System.out.println(x);

        int y = 5;
        System.out.println(++y);
        System.out.println(y);

        //10. What is the difference between the above code blocks? Explain why the code outputs what it does.
            //pre-increment vs post-increment - first log is logging current value of x then plus 1s on next log
            // post-increment - ++y is incrementing by 1 first then logging the answer, then line 56 log current value

        //11.Try to create a variable named class. What happens?
//            var class; // class is a reserved word and cannot be used as var name

        //12. Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?
        String theNumberThree = "three";
        System.out.println(theNumberThree); //output is 'three'

        Object o = theNumberThree;
        System.out.println(o); //output is 'three'

//        int three1 = (int) o;
//        System.out.println(three1); // 'ava.lang.String incompatible with java.lang.Integer' looks like it cannot switch string to integer

        //12.a  Copy and paste the code above and then run it. Does the result match with your expectation?
        //12.b  How is the above example different from the code block below?
//        int three = (int) "three"; //Says 'inconvertible' because cannot convert string to int
//        System.out.println(three);

        //12.c What are the two different types of errors we are observing?
            //'Exception in thread "main" java.lang.ClassCastException: java.lang.String incompatible with java.lang.Integer'
            //'java: incompatible types: java.lang.String cannot be converted to int'

        //13. Rewrite the following expressions using the relevant shorthand assignment operators:
        int x1 = 4;
//        x = x + 5;
        x1 += 5;
        System.out.println(x1); //Will log 9

        int x2 = 3;
        int y2 = 4;
//        y = y * x;
        y2 *= x2;
        System.out.println(y2);

        int x3 = 10;
        int y3 = 2;
//        x = x / y;
        x3 /= y3;
        System.out.println(x3);
//        y = y - x;
        y3 -= x3;
        System.out.println(y3);

        //14. What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?
        byte byteTest = 127; //max byte value

        byteTest += 10;
        System.out.println(byteTest); //logs -119 : once it reaches max value, it will still keep it under the same data type starting from the first min value (-128)
        // Same thing will aply for other data types if you are adding or subtracting and expect the same data type.

        short shortTest = -32768; //min short value
        shortTest -= 1; //logs 32767 which is the max-value since it cannot go below -32768, it will loop back to max-value of short
        System.out.println(shortTest);
        //Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.
    }

}
