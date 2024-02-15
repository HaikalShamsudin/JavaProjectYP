package Day7.Example4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//Copying Files:
//Develop a program that copies the content of one text file to another. 
//Prompt the user to enter the file names.

public class CopyFiles extends ReadFileHandler {

    //constructor
    public CopyFiles(String fileName) {
        super(fileName);
    }
    //METHOD
    public String readFileContent(String fileName) throws FileNotFoundException, IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            } 
        } catch(IOException e) {
            System.out.println("Error in reading the file" + e.getMessage());
        }return content.toString();
    }
    public void copyFiles (String sourceFileName, String destinationFileName) throws IOException {
        String fileContent = readFileContent(sourceFileName);
        try (FileWriter writer = new FileWriter(destinationFileName)) {
            writer.write(fileContent);
        }
        System.out.println("File copied successfully");
    }
    
}
