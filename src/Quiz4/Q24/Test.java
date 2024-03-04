package Quiz4.Q24;

public class Test { // EXCEPTION QUESTION, NEED TO UNDERSTAND!!!! - QUESTION 24

    // Given the code of Test.java file, line 14 cause compilation error.
    // Which of the following changes enables to code to print
    // output = LENGTH SHOULD BE GREATER THAN 0

    //ANSWER = Replace Line 14 with 'catch(RuntimeException e) {'
    // OR = Replace Line 14 with 'catch(IllegalArgumentException e) {'


    public static void convert(String s)
            throws IllegalArgumentException, RuntimeException, Exception {
        if (s.length() == 0) {
            throw new RuntimeException("LENGTH SHOULD BE GREATER THAN 0");
        }
    }
    
    public static void main(String[] args) {
        try {
            convert ("");
        } 
        catch (IllegalArgumentException | RuntimeException | Exception e) { //LINE 14
            // catch (RuntimeException e) {
            //this is where compilation error will occur
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// dalam main method, LINE 14. kita try catch multiple Exception dalam single catch block using | (INI TAK BOLEH)
// this is where compilation error will occur. dalam multi catch block, exception yg ditangkap (catch)
// mestilah exclusive dan bukan sub class antara satu sama lain.
// dalam LINE 14, 'RunTimeException' ialah sub class dalam 'Exception'. So, catch both dalam satu block tidak dibenarkan.
