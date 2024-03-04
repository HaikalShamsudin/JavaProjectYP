package Quiz4.Q23;

public class Test { // RUNTIME EXCEPTION
    public static void main(String[] args) {
        System.out.println(new RuntimeException()); //LINE 1
        System.out.println(new RuntimeException("HELLO")); //LINE 2
        System.out.println(new RuntimeException(new RuntimeException("HELLO"))); //LINE 3
    }
}

// Given code of Test.java file, Does above code compile successfully?
// ANSWER = YES

/* Throwable is the root class of the exception hierarchy and it contains some useful constructors:

1. public Throwable() {...} : No-argument constructor
2. public Throwable(String message) {...} : Pass the detail message
3. public Throwable(String message, Throwable cause) {...} : Pass the detail message and the cause
4. public Throwable(Throwable cause) {...} : Pass the cause

Exception and RuntimeException classes also provide similar constructors.
Hence all 3 statements Line n1, Line n2 and Line n3 compile successfully.
Throwable class also contains methods, which are inherited by all the subclasses (Exception, RuntimeException etc.)
1. public String getMessage() {...} : Returns the detail message (E.g. detail message set by 2nd and 3rd constructor)
2. public String toString() {} :
Returns a short description of this throwable. The result is the concatenation of:
the name of the class of this object
": " (a colon and a space)
the result of invoking this object's getLocalizedMessage() method
If getLocalizedMessage returns null, then just the class name is returned.
Because of the toString() method,
Line n1 prints "java.lang.RuntimeException".
Line n2 prints "java.lang.RuntimeException: HELLO"
Line n3 prints "java.lang.Exception: java.lang.RuntimeException: HELLO" */