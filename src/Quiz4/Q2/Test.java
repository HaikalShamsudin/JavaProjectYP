package Quiz4.Q2;

class Base {
    String msg = "INHALE";
}

class Derived extends Base {
    Object msg = "EXHALE";
}

public class Test {
    public static void main(String[] args) {
        
        Base obj1 = new Base(); //LINE 14
        Base obj2 = new Derived(); //LINE 15
        Derived obj3 = (Derived) obj2; //LINE 16 //toString() method is invoked

        String text = obj1.msg + "-" + obj2.msg + "-" + obj3.msg;
        System.out.println(text); 
    }
}

// Answer = INHALE-INHALE-EXHALE

// Explanation - Base Class (Parent class) , Derived Class (Sub Class)
// LINE 14 - creating obj1 from class Base, and created instance of Base(). the msg = INHALE
// LINE 15 - creating obj2 from class Base, and create instance of Derived().
// Because of Derived Class extend with parent class Base, obj2 will get the method from Base Class. the msg = INHALE
// LINE 16 - creating obj3 from class Derived, and class Derived was casting in obj2, means that it will get method from Derived class

// So when we print the obj1.msg + obj2.msg + obj3.msg , we will get INHALE (Base class) + INHALE (Base class) + EXHALE (Derived class)