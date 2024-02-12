package Day4.ArrayListMethods;

public class SequentialSearchArray {
    
    public static void main(String[] args) {
        
    
    int [] a = {3 , 6, 9};
    int k = 6;
    int i = 0;  //pakai while loop sbb dah initiate

    while (i<a.length && a[i]!= k) {
        i++;
    }

    if (i >= a.length) {
        i = -1;
    }
    
    System.out.printf("k is at %d, if i is not -1", i);
}
}
