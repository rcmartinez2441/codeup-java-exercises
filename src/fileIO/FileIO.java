package fileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileIO {
    public static void main(String[] args) {
//        System.out.println(getFilePath("src","fileIO","test.txt").toAbsolutePath());
//        System.out.println("Does Path Exist");
//        System.out.println(
//                doesPathExist(
//                        getFilePath("src", "fileIO"/*, "test.txt"*/)
//                )
//        );

        tryCreatDirectory(getFilePath("src", "fileIO", "test.txt"));
    }

    public static Path getFilePath(String fileName) {
        return Paths.get(fileName);
    }

    public static Path getFilePath(String parentDirectory, String fileName) {
        return Paths.get(parentDirectory, fileName);
    }

    public static Path getFilePath(String parentDirectory, String childDirectory, String fileName) {
        return Paths.get(parentDirectory, childDirectory, fileName);
    }

    public static boolean doesPathExist(Path path) {
        return Files.exists(path);
        //Our Files directory READ the path and checked if the it exists or not
    }

    //this method will create a directory
    public static void tryCreatDirectory(Path pathToCreate) {
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





}