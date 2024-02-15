package Day7.Example4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile extends ReadFileHandler{
    
    //constructor
    public WriteFile(String fileName) {
        super(fileName);
    }

    public String write(String input) {
        String response = "";
    

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(super.getFileName()))) {
            writer.write(input);

            //handle and display any errors
        } catch (IOException e) { 
            System.err.println("An error occurred: " + e.getMessage());
        }
        return response; 
    }
    
}

    
