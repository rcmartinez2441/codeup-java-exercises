package oop.animals;

public class SomethingsFishy {
    public static void main(String[] args) {
        MarineAnimal marineAnimal = new AquaMammal("Blue Whale");

        System.out.println(marineAnimal.getName());

//        marineAnimal.setMaxTimeSubmerged(); //Will give you an error and cant reach it because AquaMammal is a subclass of SuperClass Marine Animal, MarineAnimal does not have access to AquaMammal methods only visa versa  and this is because will created MarineAnimal TYPE object and not an AquaAnimal type object
    }
}