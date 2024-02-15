package Day5.Singleton;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    
    private static Logger instance = null;

    //contructor - to initialize the value
    private Logger() {

    }

    public static Logger getInstance() {

        if  (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    //METHOD 
    public void log(String message) {
        //create object
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-ddHH:mm:ss");
        String formattedTime = currentTime.format(formatter);
        System.out.println("[" + formattedTime + "]" + message);
    }

}

// A Singleton class in Java is a class that allows only one instance of itself to be created
// and provides a way to access that instance from anywhere in the program. Singleton classes
// are appropriate when you want to ensure that there's only one instance of a class throughout
// the entire application, such as logging, configuration settings, database connections, etc.
