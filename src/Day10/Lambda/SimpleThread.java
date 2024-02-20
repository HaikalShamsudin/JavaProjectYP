package Day10.Lambda;

//Simple Thread Creation: Write a Java program that creates a simple thread to print "Hello, World!" on the console.

public class SimpleThread extends Thread {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("Hello World");
        });

        thread.start();
    }
    
}
