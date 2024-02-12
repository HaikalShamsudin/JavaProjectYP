package Basic;

public class Quickstart {                   //firstclass , tak perlu bracket
    public static void main(String[] args) {         // main method
        System.out.println("Holla!" + " "+ args [0] + " " + args [1]);
        
          //class     //object
        SecondClass secondClass = new SecondClass();  //instantiate 2nd class (line 18)
        secondClass.second();  // non-static method
        SecondClass.third();   // static method
        if (args[1].equals("2024")) {
            SecondClass.third();

        bola();
        }
    }

    //calling second method
    public static void bola() {                // calling in line 15  //we use static method       #letak bracket and braces
        System.out.println("bola putih");
    }
}

// try tambah 2nd class
 class SecondClass{                    //second class

    public void second() {
        System.out.println("Dua Dalam Kelas");              //how to call/print this line? check line 8 & 9
    }

    static void third() {
        System.out.println("Tiga Dalam Kelas");             //how to call? check line 10 11
    }



}