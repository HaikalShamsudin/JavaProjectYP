package Quiz4.Q20;

import java.util.List;
import java.util.ArrayList;

public class Test { //QUESTION 20 - ARRAYLIST 
    public static void main(String[] args) {
        List <String> list;
        list = new ArrayList<> ();
        list.add("A");
        list.add("E");
        list.add("I");
        list.add("O");
        list.add("U");
        list.addAll(list.subList(0,4)); //line ni, list.Addall akan duplicate sublist value (0,4) ke dalam list asal
        System.out.println(list); //then bila print (list), akan print semua
    }
}

// ANSWER = [A,E,I,O,U,A,E,I,O]

// the method list.addAll will adds all the elements from the sublist to the original list.
// this case, it will duplicate "A", "E", "I", "O"