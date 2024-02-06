package Handler;

public class StringHandler {
    private int x;
    private int[] a = {1,2,3};

    public void IntegerHandler(int x, int [] a) {
        this.x = x;
        this.a = a;
    }

    private int getVolume() {
        return a[0] * a[1] * a[2];
    }

    public int getTotalVolume() {
        return x * getVolume();
    }

    public int getX() {
        return x;
    }
}
