package SelfStudy;

public class Method {
    public static void main(String[] args) {
        
        String namaBuah = "Durian";

        if (namaBuah == "rambutan") {
        kebaikkanBuahIni();
        kekuranganBuahIni();
        } else {
            buahTakTahu();
        }

        int i = 0;
        while (true) {
            i++;
            kebaikkanBuahIni();

            if (i == 2) {
                kekuranganBuahIni();
                buahTakTahu();
                break;
            }
        }
        kebaikkanBuahIni();
    }

    //ini adalah method
    static void kebaikkanBuahIni() {
        System.out.println("Buah ini sedap");
    }

    static void kekuranganBuahIni() {
        System.out.println("Buah ini mahal");
    }

    static void buahTakTahu(){
        System.out.println("Buah ini saya tak tahu");
    }
}

