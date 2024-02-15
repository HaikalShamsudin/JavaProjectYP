package Day7.Example4;

import java.io.BufferedReader;
import java.io.IOException;

public class CountWords extends ReadFileHandler {

    //contructor
    public CountWords(String fileName) {
        super(fileName);
    }

    //method/function
    public int countWords() { //must return 
        int count = 0;

        try{
            ReadFile readFile = new ReadFile(super.getFileName());
            BufferedReader reader = readFile.readfileBuffer();

            String line;
            //loop
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\s+");
                count += words.length;
            }

        } catch(IOException e) {
            System.out.println("Error in reading the file" + e.getMessage());
        }
        return count;

    }

    
}
