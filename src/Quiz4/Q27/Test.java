package Quiz4.Q27;

//QUESTION 27

class Base {
    int id = 1000; // Line n1

    // (Step 3: Before start executing the statement inside the base, the compiler
    // addes super() which will invokes the constructor of the Object class. As the
    // Object class constructor finished exeuting, then the control goes back to the
    // Base() constructor. Before start executing the remaining statements inside
    // the constructor, the instance variable assignment statement were executed
    // first. Then, the control will run the remaining statement inside the
    // constructor and call the Base() method. Due to Base() method were override by
    // the subclass Derived, the control goes to Base() method inside the Derived
    // class)
    Base() {
        // Uncomment this
        // Base(); // Line n2 (Step 6: After executing all the statement inside the constructor,
                   // the control goes back to Derived constructor)

        // Comment this
        base();
    }

    // Uncomment this
    // void Base() { // Line n3
    //     System.out.println(++id); // Line n4
    // }
    
    //Comment this
    void base() { // Line n3
        System.out.println(++id); // Line n4
    }
}

class Derived extends Base {
    int id = 2000; // Line n5

    
    // Line n6 (Step 2: Due to this is a sub class of Base and there is no super(),
    // So the compiler add super() to the constructor. Then, the control goes to
    // Base() constructor)
    Derived() { // Step 7: Before it start executing remaining statement inside the constructor,
                // the control exexute the variable assignment statement. This means id were
                // assigning with 2000.
    }

    // Uncomment this
    // Step 4: The Base() method were executed and will display id value. But
    // because of the id variable of Derived class hides the id variable of Base
    // class, the value of id is 0. This is because of the id value of Derived class
    // were not yet executed yet by Derived Class, therefore the id variable were
    // executed and stores value of 0
    // void Base() { // Line n7
    //     System.out.println(--id); // Line n8 (Step 5: The id value were decremented by 1, and display it. Then,
    //                               // the control goes back to Line 2)
    // }
    
    // Comment this
    void base() { // Line n7
        System.out.println(--id);
    }
}

public class Test {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Base base = new Derived(); // Line n9 (Step 1: Initialize object as instance of Derived)
    }
}
