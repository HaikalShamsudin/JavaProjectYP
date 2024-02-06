package AnotherClass;

public class AnotherClass {
    public static void main(String[] args) {
        System.out.println("Hello, World!" + args[0] + "" + args[1]);
        second();
        SecondClass sc = new SecondClass();  //instantiate
        sc.second();
        SecondClass.third();
        sc.display(90);
        System.out.println(sc.getName());
    }
    public static void second() {
        System.out.println("secondddddd");
    }
}

class SecondClass {
    void second() {
        System.out.println("Second from another class");
    }

    static void third() {
        System.out.println("Third");
    }

    void display(int a) {
        System.out.println(a);
    }

    String getName() {
        return "Daus"; //passing argument
    }
}
