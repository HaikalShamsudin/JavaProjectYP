package Day7.Example1;

//To deserialize the object, you can use an ObjectInputStream to read the object 
//from the file or input stream:

import java.io.*;
    
public class DeserializationExample {
  public static void main(String[] args) {
    Employee employee = null;

    try (FileInputStream fis = new FileInputStream("employee.ser");
         ObjectInputStream ois = new ObjectInputStream(fis)) {
      employee = (Employee) ois.readObject();
      System.out.println("Employee object deserialized successfully");
      System.out.println("Name: " + employee.name);
      System.out.println("Age: " + employee.age);
      System.out.println("Address: " + employee.address);
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}

