package Day10.Q15;

public class Recipe { //CLASS MODEL
    
    private String name;
    private String details;

    //constructor for class Recipe
    public Recipe (String name, String details) {
        this.name = name;
        this.details = details;
    }

    public String getName() {
        return name;
    }

    public String getDetails() {
        return details;
    } 

    @Override
    public String toString() {
        return String.format("%s %s", name, details);
    }

}
