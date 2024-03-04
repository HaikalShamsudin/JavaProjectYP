package Quiz4.Q68;

public class Test { //QUESTION 9 - PARENT CLASS (ABSTRACT)
    public static void main(String[] args) {
        Paper paper = new RuledPaper(); //LINE 3
        System.out.println(paper.getType()); //LINE 4 // it show that it is cannot calling from RuledPaper class
    }
    
}

class Paper {
    static String getType() {
        return "GENERIC"; //LINE 1
    }
}

class RuledPaper extends Paper {
    String getType() { //LINE 2     // This line will cause error, because instance method subclass cannot
        return "RULED";             // override the STATIC method in superclass (parent class)
    }
}
//ANSWER = Compilation error in RuledPaper class