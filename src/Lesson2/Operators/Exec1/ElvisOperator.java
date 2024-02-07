package Lesson2.Operators.Exec1;

public class ElvisOperator {
    
    public static void main(String[] args) {
        
        int intA = 12;
        int intB = 14;

        int highest = (intA > intB) ? (intA < 15) ? 15 : 20 : intB;

        System.out.println(highest);
    }
}
