package Day5.InnerClass;

public class Outer {
    
    class Inner {
        private String name;

        //Constructor
        public Inner (String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner("BOOK");
        System.out.println("Inner Name:" + inner.getName());
    }
    
}
