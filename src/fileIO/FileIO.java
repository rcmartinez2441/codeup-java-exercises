package fileIO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileIO {
    public static void main(String[] args) {
        init();
    }

    public static void init () {

        Path path = FileDirectoryUtil.getPath("src", "fileIO", "files");
        //Try to create a directory
        FileDirectoryUtil.tryCreateDirectory(path);

        //Try to create a File
        path = Paths.get(path.toString(), "test.txt");
        FileDirectoryUtil.tryCreateFile(path);

        //print out final location of file
        System.out.println(path.toAbsolutePath());
    }






}