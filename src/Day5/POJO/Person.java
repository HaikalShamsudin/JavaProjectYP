package Day5.POJO;

public class Person {

    //POJO (Plain Old Java Object) - for JAVA SE - FOR DATABASE
    //DECLARE variable
    String name;
    int age;
    String email;

    //CONSTRUCTOR
    public Person(String name, int age, String email){
        this.name = name;
        this.age = age;
        this.email = email;
    }

    //METHOD getter (read value) 
    public String setName() {
        return name;
    }

    public int setAge() {
        return age;
    }

    public String setEmail() {
        return email;
    }

    //METHOD setter (update value)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public static void main(String[] args) {

        //CREATE OBJECT
        Person person = new Person("John Doe", 30, "John@gmail.com");

        System.out.println("Name:" + person.getName());
        System.out.println("Age:" + person.getAge());
        System.out.println("Email:" + person.getEmail());
    }
}

// A POJO (Plain Old Java Object) class in Java is a simple Java class that only contains private fields,
// along with public getter and setter methods to access and modify those fields. POJO classes are used
// to represent data objects in the application. They are appropriate when you need to model data with
// attributes but do not require any specific functionality or behavior beyond accessing and modifying
// those attributes.
