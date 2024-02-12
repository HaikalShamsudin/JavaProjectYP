package SelfStudy.Level1.Q1;

/*Assign and print the roll number, phone number and address of two students
having names "Sam" and "John" respectively by creating two objects of class 'Student'. */

public class CollegeStudent {
    
    //declare the variable
    String nama;
    int roll_number;
    int phone_number;
    String address;

    //create constructor untuk initialize the value
    public CollegeStudent (String nama, int roll_number, int phone_number, String address){
        this.nama = nama;
        this.roll_number = roll_number;
        this.phone_number = phone_number;
        this.address = address;
    }

    public static void main(String[] args) {
        
        //create the object
        CollegeStudent student1 = new CollegeStudent("Ali", 1, 1234567890, "Johor");
        CollegeStudent student2 = new CollegeStudent("Abu", 2, 987654321, "Perak");

        System.out.printf("Student 1:" + student1.nama + student1.roll_number + student1.phone_number + student1.address);
        System.out.printf("Student 2:" + student2.nama + student2.roll_number + student2.phone_number + student2.address);
        
    }
}
