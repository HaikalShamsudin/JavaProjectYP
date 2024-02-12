package Day5.Exercise1;

public class Main {
    public static void main(String[] args) {
        System.out.println("adding a & b:" + MathUtils.Addition(10, 5));
        System.out.println("subtract a & b:" + MathUtils.Subtraction(15, 8));

        int num = 17;

        if (MathUtils.IsEven(num)){
            System.out.println(num + "Is Even");
        } else {
            System.out.println(num + "Is Odd");
        }
    }
}

// Static classes in Java are similar to static classes in C#, they cannot be instantiated,
// and they can only contain static members. They are appropriate for utility classes that
// contain methods applicable to a specific domain but don't require instance-specific data.
// Static classes are also useful when you want to group related methods together without the
// need for creating instances of the class.
