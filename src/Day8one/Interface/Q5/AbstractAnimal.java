package Day8one.Interface.Q5;

abstract class AbstractAnimal implements Animal {

    private String name;
    private int age;

    //contructor
    public AbstractAnimal(String name, int age){
        this.name = name;
        this.age = age;
    }

    //getter method for name
    public String getName() {
        return name;
    }

     //getter method for age
     public int getAge() {
        return age;
    }
}

