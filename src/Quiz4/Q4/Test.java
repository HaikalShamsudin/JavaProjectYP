package Quiz4.Q4;

public class Test {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder ("B");
                //kat sini nilai sb = BA
        sb.append(sb.append ("A")); //LINE 8
        // (("BA")   ("B        A"))     - BACA DARI KANAN KE KIRI
        System.out.println(sb);

    }
}

//ANSWER = BABA 

// Explanation - in this case, append bermaksud menambah.
// dalam LINE 8, menunjukkan bahawa sb.append(sb.append("A")) BERMAKSUD sb.append(("BA")).
// so bila dia append lagi sekali, sb.append (("BA")) MENJADIKAN sb = (("BA")("BA"))
// so bila print sb, akan dapat BABA