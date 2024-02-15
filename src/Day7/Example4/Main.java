package Day7.Example4;

import java.io.IOException;
import java.util.Scanner;


public class Main {
    
    static String filename = "photo.txt";

    public static void main(String[] args) throws IOException {
        
        //READFILE & PRINT THE FILE
        ReadFile readFile = new ReadFile(filename);
        readFile.printFile();

        //COUNTWORDS
        CountWords countwords = new CountWords(filename);
        int count = countwords.countWords();
        System.out.println("Length of words:" + count);

        //COPY FILES
        CopyFiles copyFiles = new CopyFiles(filename);
        copyFiles.copyFiles(filename, filename);

        //WRITE FILES
        WriteFile writeFile = new WriteFile(filename);
        writeFile.write("Hello There");

        //APPENDING FILES
        Scanner scanner = new Scanner(System.in);

        
       AppendingFiles appendingFiles = new AppendingFiles(filename);
       appendingFiles.appendToFiles(filename, filename);
    }
}
