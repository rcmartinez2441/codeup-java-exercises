package fileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


//Job is to try to get paths and try to create Directories and Files
public class FileDirectoryUtil {
    public static Path getPath(String fileName) {
        return Paths.get(fileName);
    }

    public static Path getPath(String parentDirectory, String fileName) {
        return Paths.get(parentDirectory, fileName);
    }

    public static Path getPath(String parentDirectory, String childDirectory, String fileName) {
        return Paths.get(parentDirectory, childDirectory, fileName);
    }

    public static boolean doesPathExist(Path path) {
        return Files.exists(path);
        //Our Files directory READ the path and checked if the it exists or not
    }

    //this method will create a directory
    public static void tryCreateDirectory(Path pathToCreate) {
        if (!doesPathExist(pathToCreate)) {
            try {
                Files.createDirectory(pathToCreate);
            } catch (IOException e){
                System.out.println("Could Not Create Directory at: ");
                System.out.println(pathToCreate.toAbsolutePath());
            }
        } else {
            System.out.println("The path at " + pathToCreate.toAbsolutePath() + " already exists");
        }
    }

    public static void tryCreateFile (Path path){
        if(!doesPathExist(path)){
            try {
                Files.createFile(path);
            }catch (IOException e){
                System.out.println("Could Not Create File at: ");
                System.out.println(path.toAbsolutePath());
            }
        } else {
            System.out.println("File at " + path.toAbsolutePath() + "Already Exists");
        }
    }
}