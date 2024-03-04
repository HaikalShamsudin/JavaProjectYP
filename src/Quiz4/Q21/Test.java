package Quiz4.Q21;

public class Test { //QUESTION 21 - ARRAY!!!
    public static void main(String[] args) {
        int elements = 0;
        Object [] arr = {"A", "E", "I", new Object(), "O", "U"}; //LINE 1
        for (Object obj : arr) { //LINE 2 this line, shows the obj as type of object and iterate the arr array/index
            if (obj instanceof String) { // this line show it will skip the iteration if the current element is not a String
                continue;
            } else { System.out.println();
                break; //break ni, lepas jumpa break PASTI akan keluar dari dalam loop.
            }
            elements ++ ; //LINE 3 this line takkan excecute sebab samada loop continue atau break, dia takkan reach line ini.
        }
        System.out.println(elements);
    }
}
