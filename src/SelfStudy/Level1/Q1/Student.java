package SelfStudy.Level1.Q1;

/*Create a class named 'Student' with String variable 'name' 
and integer variable 'roll_no'. Assign the value of roll_no 
as '2' and that of name as "John" by creating an object of the class Student. */

public class Student {
    
    //declare variable
    String name;
    int roll_no;

    //create constructor to initialize the values
public Student (String name, int roll_no){
    this.name = name;
    this.roll_no = roll_no;
}
    public static void main(String[] args) {
        
        //creating object of class Student and initilize values
        Student student = new Student("John", 2);

        //access and print the values
        System.out.println("Studen name and roll:" + student.name + " " + student.roll_no);
    }
}
