package Day8one.Interface.Q7;

public class Main {
    
    public static void main(String[] args) {

        
        //create an array
        SortableShape[] shapes = 
        {new Rectangle(4.5, 3.5), 
        new Circle(2.5, 3.142),
        new Triangle(2.8, 4.5)};
        
        //sort the area of shape
        ShapeSorter.sort(shapes);

        System.out.println("Sorted shape:");
                                    //this shape calling an array
        for (SortableShape shape : shapes){
            System.out.println("Area:" + shape.area());
        }

    }
    
    
}
