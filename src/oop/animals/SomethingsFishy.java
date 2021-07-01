package oop.animals;

public class SomethingsFishy {
    public static void main(String[] args) {
        //if you dont know what the type will be, us VAR
        var marineAnimal = new AquaMammal("Blue Whale"); //allows us to look directly at what is being assigned

        System.out.println(marineAnimal.getName());

//        marineAnimal.setMaxTimeSubmerged(); //Will give you an error and cant reach it because AquaMammal is a subclass of SuperClass Marine Animal, MarineAnimal does not have access to AquaMammal methods only visa versa  and this is because will created MarineAnimal TYPE object and not an AquaAnimal type object
        marineAnimal.setMaxTimeSubmerged(30); // can do this now because we switch definition (type)
        System.out.println(marineAnimal.getMaxTimeSubmerged());
    }
}