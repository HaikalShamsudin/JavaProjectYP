package Day5.POJO;

public class Person {
    
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

    //METHOD getter and setter 
    public String setName() {
        return name;
    }

    public int setAge() {
        return age;
    }

    public String setEmail() {
        return email;
    }
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
