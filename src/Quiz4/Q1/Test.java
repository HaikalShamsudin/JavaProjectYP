package Quiz4.Q1;

public class Test {  //QUESTION 5 (PARENT CLASS)
    public static void main(String[] args) {
        
        // X p = new X(); //output akan dapat A sebab kat sini kita create object class X
        // p.A();
        X obj = new Y();  //output A- sebab kat sini kita create object class Y
        obj.A();
        // obj.B();    
        // obj.C();
    }
}                                               // ABSTRACT EXERCISE - ia menunjukkan error pada obj.B dan obj.C
                                                // apa apa yang ada pada KELAS Y, tidak boleh di akses oleh KELAS X.
class X {                                       // WHY? - Kerana KELAS X ialah parent class kepasa KELAS Y. 
                                                // So, bila kita run di MAIN, even kita dah create object X pun 
    public void A() {                           // kita tetap tak dpt akses apa ada di dalam B.
        System.out.println("A");
    }
    
}

class Y extends X {
    
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