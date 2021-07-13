package lectureNotes;


public class Products {
    //define property name

    //Annotating a Property
    @Persistent
    protected String name = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}