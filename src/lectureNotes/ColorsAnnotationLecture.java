package lectureNotes;

class Red {
    public void show(){
        System.out.println("I am red");
    }

    public void showMyFavColorOfTheRainbow() {

    }
}

class Orange extends Red{
    public void show(){
        System.out.println("I am orange");
    }
    @Override //This is basically a comment for compiler and to also check that the mthod below is doing what it's supposed to do
    public void showMyFavColorOfTheRainbow() {

    }
}

public class ColorsAnnotationLecture {
    public static void main(String[] args) {
        Red redObj = new Red();
        Orange orangeObj = new Orange();

        redObj.show();
        orangeObj.show();
    }
}