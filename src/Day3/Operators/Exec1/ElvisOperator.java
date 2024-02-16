package Day3.Operators.Exec1;

public class ElvisOperator {
    
    public static void main(String[] args) {
        
        int intA = 12;  //declare variable
        int intB = 14;  //declare variable

        int highest = (intA > intB) ? (intA < 15) ? 15 : 20 : intB;

        System.out.println(highest);
    }
}
