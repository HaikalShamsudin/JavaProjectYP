package Day5.Assignment.Encapsulation;

public class Student {
    
    //DECLARE VARIABLE
    private String name;
    private int age;
    private int rollNumber;

    //getter method
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;

    }
    public int getRollNumber() {
        return rollNumber;
    }
        
        
    //setter method
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public static void main(String[] args) {
        //CREATE OBJECT
        Student student = new Student();

        //Setting value using SETTER method
        student.setName("Abu");
        student.setAge(23);
        student.setRollNumber(100);

        //Retrieving values using GETTER method
        System.out.println("Name:" + student.getName());
        System.out.println("Age:" + student.getAge());
        System.out.println("Roll Number:" + student.getRollNumber());
    }

}
