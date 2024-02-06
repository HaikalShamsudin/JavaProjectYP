package Assignment1;

public class Assignment1 {
    
        public static void main(String[] args) {
            
            // Passing the argument to the main method.
    
            System.out.println("It have:" + args.length + "arguments");
    
            // using 'for' loop
            for(int i = 0;i<args.length;i++) {
            System.out.println((i + 1) + ". " + args[i]);
        }
          // declare type
          int integerNumber = 10;
          double doubleNumber = 3.14;
          boolean boolValue = true;
          char charValue = 'A';
          String stringValue = "Holla!";
  
          //display
          System.out.printf("Integer Number: %d\n",integerNumber);
          System.out.printf("Double Number: %f\n",doubleNumber);
          System.out.printf("Bool Value: %b\n",boolValue);
          System.out.printf("Char Value: %c\n",charValue);
          System.out.printf("String Value: %s\n",stringValue);
      }
}