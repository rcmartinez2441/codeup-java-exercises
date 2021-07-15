package lectureNotes;

//BY extending exception, it will be avail to other files
public class WrongIndentationTypeException extends Exception {
    public WrongIndentationTypeException(String message) {
        super(message);
    }
}