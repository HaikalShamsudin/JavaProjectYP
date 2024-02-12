package Day4.ArrayListMethods;

import java.util.Arrays;

public class RandomArray {
    
    public static void main(String[] args) {
        
        // instantiate the variable
        int length = 5;
        int min = 0;
        int max = 100;
        //instantiate the index
        int [] randomsNumber = getRandomIntArray(length,min,max);
        System.out.println(Arrays.toString(randomsNumber));
    }

    //new class 1 (object)
    public static int [] getRandomIntArray (int length, int min, int max) {
    int[] a = new int[length];

    //loop method
    for (int i=0; i<length; i++) {
        a[i] = (int) Math.round(Math.random() * (max - min)+ min);
        // math.round will coverts decimal value to a higher/lower value, which are nearest
        // funtion of Math.random generate the fraction
        // the default number will be 0 to 100
    }
    return a;  //recall from the method
    }
}
