package Quiz4.Q5;

public class Test {  //QUESTION 5 (PARENT CLASS)        ANSWER = Compile error in class Test
    public static void main(String[] args) {
        
        // X p = new X(); //output akan dapat A sebab kat sini kita create object class X dan instance X()
        // p.A();
        X obj = new Y();  //output A- sebab kat sini kita create object class Y
        obj.A();
        // obj.B();    //LINE 3
        // obj.C();    //LINE 4
    }
}                                               // ABSTRACT EXERCISE - ia menunjukkan error pada obj.B dan obj.C
                                                // apa apa yang ada pada KELAS Y, tidak boleh di akses oleh KELAS X.
class X {                                       // WHY? - Kerana KELAS X ialah parent class kepada KELAS Y. 
                                                // So, bila kita run di MAIN, even kita dah create object class X pun 
    public void A() {                           // kita tetap tak dpt akses apa ada di dalam class Y.
        System.out.println("A");               //melainkan ada create new instance Y obj = new Y()
    }
    
}

class Y extends X {
    
    @Override //this will automatically override because class Y (child) calling the method in class X (parent)
    public void A() {
        System.out.println("A-");
    }

    public void B() {
        System.out.println("B-");
    }

    public void C() {
        System.out.println("C-");
    }
}