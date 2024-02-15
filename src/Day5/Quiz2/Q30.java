package Day5.Quiz2;

public class Q30 {
    public static void main(String[] args) {
        
        //declare the variable
        char c = 'Z';
        long l = 100_001;
        int i = 9_2;
        float f = 2.02f;
        double d = 10_0.35d;

        l = c + i;
        f = c * l * i * f;
        f = l + i + c;
        i = (int)d;
        f = (long)d;
    }
}
