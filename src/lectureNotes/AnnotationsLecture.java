package lectureNotes;

import java.util.ArrayList;
import java.util.List;

public class AnnotationsLecture {

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        int randomNum = (int) (Math.random()*10);
    }

    @SuppressWarnings("unchecked")
    public List<String> languages (){
        return new ArrayList<>();
    }

    //@Override
}