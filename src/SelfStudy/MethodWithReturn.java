package SelfStudy;

public class MethodWithReturn {
    public static void main(String[] args) {
        
        String staffPersonal = staffName("John");
        System.out.println(staffPersonal);

    }

    //ini adalah method
    static String staffName (String name) {
        return ("Staff name is:" + name);
    }

}
