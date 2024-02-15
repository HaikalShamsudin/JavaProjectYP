package Day8one.Interface.Q1;

abstract class AbstractShape implements Shape {

    //declare the variable
    private String color;
    private boolean filled;
    
    //contructor for AbstractShape
    public AbstractShape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    //getter method for color
    public String getColor() {
        return color;
    }

    public boolean getFilled() {
        return filled;
    }


}
