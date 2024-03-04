package Quiz4.Q65;


interface I1 {
    
    public static void print (String str) {  //we need to remove STATIC in order to create an instance of new C1 (Line 19) 
        System.out.println("I1:" + str.toUpperCase());  // or replace the STATIC with DEFAULT to get method in C1
    }
}

class C1 implements I1 {
     public void print (String str) {
        System.out.println("C1" + str.toLowerCase());
    }
}

public class Test {
    public static void main(String[] args) {
        I1 obj = new C1();
        obj.print("Java"); //this obj.print cannot be performed

        // I1.print("Java"); // can add this method if we want to use static in interface I1, to get method in I1
    }
}

// Answer = class Test cause compilation error

//the STATIC method in I1 does not need to create the instance obj in class Test.
// we can just calling the class by state I1.print ("Java") 