package Quiz4.Q10;

public class Test { //QUESTION 10
    int i1 = 10;  //this is instance variable
    static int i2 = 20;

    private void change1(int val) {
        i1 = ++val; //line 1
        i2 = val++; //line 2
    }

    private static void change2(int val) {
        i1 = --val; //line 3
        i2 = val--; //line 4
    }

    public static void main(String[] args) {
        change1 (5); //line 5
        change2 (5); //line 6
        System.out.println(i1 + i2); 
    }
}

// In Line 3 (i1 = --val;), there is an error because change2 is a static method,
// and static methods cannot directly access instance variables (i1).
// You would need to make i1 static if you want to access it in a static method.

// in line 5 we cannot make a static reference to the static method (in method change1)
// in println statement also cause error because cannot take and instance variable i1

//