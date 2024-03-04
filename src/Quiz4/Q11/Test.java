package Quiz4.Q11;


interface Perishable1 {
    default int maxDays() {
        return 1;
    }
}

interface Perishable2 extends Perishable1 {  //so method dalam perishable2 jadi kat perishable1
    default int maxDays() {   
        return 2;
    }
}

class Milk implements Perishable2, Perishable1 {} //Perishable jadi berganda, sebab sama dengan Perishable2.
                                                    // so takda effect kalau letak Perishable1

public class Test {
    public static void main(String[] args) {
        Perishable1 obj = new Milk();
        System.out.println(obj.maxDays());
    }
}

//ANSWER = Compiles successfully and output is 2