package Quiz4.Q39;

public class Test { //QUESTION 39
    
    public static void main(String[] args) {
        outer: for (int i = 0; i < 3; System.out.println(i)) {
            i++;
            inner: for (int j = 0; j < 3; System.out.println(j)) {
                if (i > ++j) {
                    break outer;
                }
                
            }
            
        }
    }
}
