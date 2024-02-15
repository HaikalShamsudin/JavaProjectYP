package Day7.Example4;


import java.io.FileWriter;
import java.io.IOException;


//Appending to a File:
// Implement a program that appends a string entered by the user 
//to an existing text file.

public class AppendingFiles extends ReadFileHandler{

    //constructor
    public AppendingFiles (String fileName){
        super(fileName);
    }
    //method
    public void appendToFiles(String fileName, String contentToAppend) throws IOException {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(contentToAppend + "\n");
        } catch(IOException e) {
            System.out.println("Error in reading the file" + e.getMessage());
        }
        System.out.println("String appended to file succesfully!");

    }
    

}
