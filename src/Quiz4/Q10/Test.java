package Quiz4.Q10;

public class Test { //QUESTION 70
    public static void main(String[] args) {
        String arr1 [], arr2, arr3 = null; //LINE 1 this line is an array/index
        arr1 = new String [2];
        arr1[0] = "A";
        arr1[1] = "B";
        arr2 = arr3 = arr1; //LINE 2
        log (arr2);  //LINE 3 
    }

    private static void log (String... vals) {
        for (String s: vals) 
            System.out.println(s);
    }
}

//ANSWER = LINE 3 will compile error

// arr2 already define as String (In line 1)
// so when line 2 state that arr2 = arr3 = arr1, 
// will error because its compare between arr2 (String data type) and arr3 (array type)

//NOTE : The log method is named similarly to the commonly used logging method in Java
//       but in this specific example, it's a custom method for printing array elements to the console.
//       It's not a standard logging utility.