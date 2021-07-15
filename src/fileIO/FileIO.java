package fileIO;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

//Our Application File with main method AKA the one that runs the code
public class FileIO {
    public static void main(String[] args) {
        init();
    }

    //purely to orchestrate everything else
    public static void init() {

        Path path = FileDirectoryUtil.getPath("src", "fileIO", "files");
        //Try to create a directory
        FileDirectoryUtil.tryCreateDirectory(path);

        //Try to create a File
        path = Paths.get(path.toString(), "test.txt");
        FileDirectoryUtil.tryCreateFile(path);

        //print out final location of file
        System.out.println(path.toAbsolutePath());

        //Tries to print file contents before we write
        IOUtil.tryPrintContents(path);

        //Trying to write to the file
        IOUtil.tryWriteToFile(getContent(), path );

        //Tries to print the content of a file
       IOUtil.tryPrintContents(path);
    }

    public static List<String> getContent(){
        List<String> contentToWrite = new ArrayList<>();
        contentToWrite.add("this is a new line");
        contentToWrite.add("This is another one");
        contentToWrite.add("Another one");

        return contentToWrite;
    }



}