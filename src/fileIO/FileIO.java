package fileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileIO {
    public static void main(String[] args) {
//        System.out.println(getPath("src","fileIO","test.txt").toAbsolutePath());
//        System.out.println("Does Path Exist");
//        System.out.println(
//                doesPathExist(
//                        getPath("src", "fileIO"/*, "test.txt"*/)
//                )
//        );
        Path path = getPath("src", "fileIO", "files");
        tryCreateDirectory(path);

        path = Paths.get(path.toString(), "test.txt");

        System.out.println(path.toAbsolutePath());

    }
    
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