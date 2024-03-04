package Quiz4.Q6;

public class Test {
    public static void main(String[] args) {
        boolean status = true;
        System.out.println(status = false|| status = true | status = false); // true | (status = false)
        System.out.println(status); //LINE 7
    }
}

//ANSWER = Compilation error

//explanation
// in this case, it not compare properly 
// we can make like this to run the comparison --> (status = false) || (status = true) | (status = false) , tambah kurungan ().
// In line 7, bila kita dpt run, kenapa status jadi false? sebab awalnya declare status = true. 
// & then last declaration status tu dalam comparison ialah false.

//            || comparison ni akan lihat belah kiria dulu. kalau ada true, auto true. 
//             | comparison ni akan lihat dua2 terus. 
//         
//              | , || find true
         