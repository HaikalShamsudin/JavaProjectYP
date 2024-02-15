package Day7.Example4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFile extends ReadFileHandler {

    //constructor for readfile
    public ReadFile(String fileName) {
        super(fileName);
    }

    //METHOD/FUNCTION for print the file
    public void printFile() {
        //create an object
        ReadFile readFile = new ReadFile(super.getFileName());
        try(BufferedReader reader = readFile.readfileBuffer()) {

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error in reading the file" + e.getMessage());
        }
    }

    //METHOD 
    BufferedReader readfileBuffer() {
        BufferedReader reader = null;
        Path filePath = Paths.get(super.getFileName()) ;
        try {
            reader = new BufferedReader (new FileReader(filePath.toString()));
        } catch (IOException e) {
            System.out.println("Error in reading file" + e.getMessage());
        }
        return reader;
    }
        
}
