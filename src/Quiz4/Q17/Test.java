package Quiz4.Q17;

public class Test {         //Exception Question
    private static void test() throws Exception {
        throw new Exception();
    }

    public static void main(String[] args) {
        try {
            test();
        } 
        //     catch (Exception e) {                    
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }
        finally {
            System.out.println("GAME ON");
        }
    }
}

// ANSWER - COMPILATION ERROR

/*
 * Method test() throws Exception (checked) and it declares to throw it, so no
 * issues with method test().
 * 
 * But main(String []) method neither provides catch handler nor throws clause
 * and hence main(String []) method causes compilation error.
 * 
 * Handle or Declare rule should be followed for checked exception if you are
 * not re-throwing it.
 */