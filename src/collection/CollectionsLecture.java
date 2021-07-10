package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CollectionsLecture {
    public static void main(String[] args) {
//        ArrayList<String> stringArr = new ArrayList<>(), stringArrCopy = new ArrayList<>();
//
//        stringArr.add("BabaBooee");
//        System.out.println("Array Size: " + stringArr.size());
//        System.out.println(stringArr);
//        System.out.println(stringArr.hashCode());
//
//        stringArr.add("BabaBooee2");
//        System.out.println("Array Size: " + stringArr.size());
//        System.out.println(stringArr);
//        //**THIS IS OVERRIDED HASHCODE FROM ARRAYLIST CLASS**
//        System.out.println(stringArr.hashCode());
//
//        //USE THIS FOR TRUE HASHCODE
//        System.out.println(System.identityHashCode(stringArr));
//
//
//        stringArr.remove(1);
//
//        System.out.println(stringArr.hashCode());
//
//        ArrayList<String> stringArrCoffee = stringArr;
//        System.out.println(stringArrCoffee);
//        System.out.println(stringArrCoffee.hashCode());
//
//        //**using .equals
//        System.out.println(stringArr.equals(stringArrCoffee)); //returns booloan
//
//        //Using ArrayList with Custom Made object types
//        //Example
////        ArrayList<Movie> movieList = new ArrayList<Movie>();
//        //and now you can use arraylist methods with object type Movie
//
//        printListDetails();

        HashMap<Integer, String> myHashMap = new HashMap<>();

        for (int i = 0; i < 11 ; i+=5) {
            myHashMap.put(i, "This is a value");
        }

        System.out.println(myHashMap.values());
        String[] values = myHashMap.values().toArray(new String[0]);


    }

    /**
     * Does Stuff
     */
//    public static void printListDetails () {
//
//    }
}