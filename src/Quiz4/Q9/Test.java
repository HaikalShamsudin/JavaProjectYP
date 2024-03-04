package Quiz4.Q9;

public class Test {  //UNDESTANDING LOGICAL OPERATOR - QUESTION 9
    public static void main(String[] args) {
        for (int x = 10, y = 11, z= 12; y > x && z > y; y++, z -=2) {
            System.out.println(x + y + z);
        }
    }
}

//the ouput will be 33

//for loop with logical operator
// 1st condition --> in this case, variable dah declare x = 10, y = 11, z = 12
// 2nd condition --> y > x && z > y. Bermakna dia compare antara dua statement ni,
//                                   && bermaksud jika salah satu statement salah, akan return false.
//                                   dalam kes ini, statement dua2 ni betul. so return true 
// 3rd condition --> y++ , z - = 2.  Statement ini menyatakan bahawa nilai y meningkat tambah 1. jadi nilai y = 12
//                                   and then z dah update kepada tolak 2. jadi nilai z = 10
// so bila compare balik dalam logical operator (y > x && z > y),  salah satu statement salah, so return false.
//                                               true     false
// so ia akan print true statement shj iaitu System.out.println(x + y + z) = 33    

//let say kalau ada increament pada z, dan statement logical operator akan return TRUE. loop ini akan berjalan tanpa henti