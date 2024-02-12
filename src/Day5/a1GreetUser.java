package Day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a1GreetUser {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));   //instantiate 
        System.out.println("Enter your first name:"); // user input
        String firstName = reader.readLine(); 
        System.out.println("Enter your last name");
        String lastName = reader.readLine();

        try {
            greetUser (firstName, lastName);
        } catch (Exception e) {
            System.out.println("Invalid Input:" + e.getMessage());
        }  
    }

    //the function
    public static void greetUser (String firstName, String lastName) throws Exception {
        if (firstName.isEmpty() || lastName.isEmpty()){
            throw new Exception ("First name and last name cannot be empty."); 
        }
        System.out.println("Hello" + " " + firstName + " " + lastName +  " " + "to the club!");
    }
}
