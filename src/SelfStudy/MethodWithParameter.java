package SelfStudy;

public class MethodWithParameter {
    public static void main(String[] args) {
        
        staffDetails("Abu", 1019, 24);
        staffDetails("Bakar", 1018, 27);
        staffDetails("Ali", 1015, 26);

    }

    //method
    static void staffDetails(String name, int id, int age){

        System.out.println("Staff name:" + name + " " + "ID:" + id + " " +"Age:" + age);
    }
}
