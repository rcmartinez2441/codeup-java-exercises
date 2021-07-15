package fileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

//Will read from a file and currently prints what it shows will also write to the file as well
public class IOUtil {
    //getting a file and reading from it
    public static List<String> readFromFile(Path path) throws IOException {
        return Files.readAllLines(path);
    }

    public static void printFileContents(List<String> contents) {
        for (String line : contents) {
            System.out.println(line);
        }
    }

    public static void tryPrintContents(Path path) {
        try {
            IOUtil.printFileContents(IOUtil.readFromFile(path));
        } catch (IOException e) {
            System.out.println("Unable to Read Contents of File at: " + path.toAbsolutePath());
        }
    }

    //write a method that will write TO file
    //Does not care about what the content or where its writing to
    public static void tryWriteToFile(List<String> content, Path path) {
        try {
            Files.write(path, content, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Could not Wrtie to File at: " +path.toAbsolutePath());
        }
    }
}