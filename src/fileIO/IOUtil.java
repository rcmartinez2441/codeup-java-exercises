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

    public static void printFileContents (List<String> contents){
        for(String line : contents){
            System.out.println(line);
        }
    }

    public static void tryPrintContents (Path path){
        try {
            IOUtil.printFileContents(IOUtil.readFromFile(path));
        } catch (IOException e) {
            System.out.println("Unable to Read Contents of File at: " + path.toAbsolutePath());
        }
    }
}