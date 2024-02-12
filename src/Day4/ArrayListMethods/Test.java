package Day4.ArrayListMethods;

public class Test {
       
    int[] a = {0, 2, 3, 4};

    public int test(int v) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == v) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Test testInstance = new Test();
        int result = testInstance.test(2);
        System.out.println("Index: " + result);
    }
}

