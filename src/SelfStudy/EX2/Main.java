package SelfStudy.EX2;

public class Main {


    public static void main(String[] args) {
        
        Calculator calculator = new Calculator();
        int addresult = calculator.addNumber(10, 4);
        System.out.println("Result of add:" + addresult);

        int noaddresult = calculator.multiplyNumber(10, 5);
        System.out.println("result for multiply:" + noaddresult);
    }
}
