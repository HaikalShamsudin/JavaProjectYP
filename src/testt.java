import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class testt {
    
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Ask the user to input their first name
        System.out.print("Enter your first name: ");
        String firstName = reader.readLine();

        // Ask the user to input their last name
        System.out.print("Enter your last name: ");
        String lastName = reader.readLine();

        // Greet the user by their names
        try {
            greetUser(firstName, lastName);
        } catch (Exception e) {
            System.out.println("An error occurred while greeting the user: " + e.getMessage());
        } finally {
            // Close the BufferedReader to prevent resource leak
            reader.close();
        }
    }

    public static void greetUser(String firstName, String lastName) throws Exception {
        if (firstName.isEmpty() || lastName.isEmpty()) {
            throw new Exception("First name and last name cannot be empty.");
        }

        System.out.println("Hello, " + firstName + " " + lastName + "! Welcome!");
    }
}

