package Basic;

public class Rectangle {     // class
    
    // public void, private -------- function 

    public static void main(String[] args) {    // body  //apa yg kita akan print
        
        int width = 5;     // variable
        int height = 7;    // variable

        int w = width;      //variable
        int h = height;     //variable
        
        int perimeter = (2*(w+h));                              //method
        System.out.println("Perimeter:" + perimeter);           //execute

        int area = (w*h);                               //method
        System.out.println("Area:" + area);             //execute
    }
}

