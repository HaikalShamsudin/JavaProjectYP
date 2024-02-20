package SelfStudy;

public interface Rideable {
    void ride (String name);

}

class Animal {}

class Horse extends Animal implements Rideable {
    public void ride (String name) {
        System.out.println(name.toUpperCase() + "IS RIDING THE HORSE") ;
    }
}






    
