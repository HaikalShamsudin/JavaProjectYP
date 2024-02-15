package Day8one.Interface.Example;

abstract class AbstractAnimal implements Animal {
    private String color;

    // Constructor for AbstractAnimal
    public AbstractAnimal(String color) {
        this.color = color;
    }

    // Getter method for color
    public String getColor() {
        return color;
    }
}
