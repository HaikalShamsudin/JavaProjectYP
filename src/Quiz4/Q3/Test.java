package Quiz4.Q3;


class Currency {
    String notation = "-";

    String getNotation() {
        return notation;
    }
}

class USDollar extends Currency {
    String notation = "$";

    String getNotation () {
        return notation;
    }
}

class Euro extends Currency {
    protected String notation = "E";

    protected String getNotation() {
        return notation;
    }
}

public class Test {
    public static void main(String[] args) {
        Currency c1 = new USDollar(); //LINE 30
        System.out.println(c1.notation + ":" + c1.getNotation()); //LINE 31
        
        Currency c2 = new Euro(); //LINE 33
        System.out.println(c2.notation + ":" + c2.getNotation()); //LINE 34
    }
    
}

//ANSWER =   -:$ -:E

// Explanation = Currency is the parent class of USDollar and Euro. 
// LINE 30, we create object c1 in class Currency, and the instance of USDollar()
// so, when we print c1.notation, it will take the variable in class Currency (parent class). kerana kita create object c1 tadi di dalam class Currency.
// and then, when we calling c1.getNotation, kita akan panggil method dari USDollar().
// ini kerana, method dalam USDollar sudah di override sebab nama sama iaitu getNotation() method.
// So dia akan ambil method dalam USDollar iaitu return notation = $
// LINE 30, akan berlaku sama macam di atas.
        

 


       