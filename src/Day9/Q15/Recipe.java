package Day9.Q15;

public class Recipe {
    
    private String name;
    private String details;

    //contructor
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
