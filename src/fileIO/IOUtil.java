package fileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

//Will read and Write to
public class IOUtil {
    //getting a file and reading from it
    public static List<String> readFromFile (Path path) throws IOException {
        return Files.readAllLines(path);
    }
}