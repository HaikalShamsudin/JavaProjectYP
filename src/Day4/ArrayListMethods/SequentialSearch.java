package Day4.ArrayListMethods;

public class SequentialSearch {
    
    public static void main(String[] args) {
        
        String[] a = new String [] {"honda", "toyota", "proton"} ;  // question : search k in an array a
        String k = "toyota"; // for k is found 
    
        int index = 0;

        while (index < a.length) {
            if (a[index].equals(k)) {
                break;
            }

        index++;

        }

        if (index >= a.length) {

            index = -1;
            System.out.printf("k is not found, index is %d, index", index); 
        } else {
            System.out.printf("k is found at index %d,", index); 
        }
    }

}
