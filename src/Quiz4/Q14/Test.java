package Quiz4.Q14;

interface Blogger {
    default void blog() throws Exception {
        System.out.println("GENERIC");
    }
}

class TravelBlogger implements Blogger {
    public void blog() {
        System.out.println("TRAVEL");
    }
}

public class Test {
    public static void main(String[] args) {
        Blogger blogger = new TravelBlogger(); // LINE 1
        ((TravelBlogger)blogger).blog();        // LINE 2  - makna kat sini, kalau kita buat blogger.blog(), tak boleh.
    }                                           //          sebab tak boleh handle Exception dkt class Blogger
}                                               //          so either casting TravelBlogger atau buang throws Exception dkt Blogger

//ANSWER = Travel is printed

// Explanation - 1. default methods were added in Java 8 and TravelBlogger class correctly overrides the
//                  default method blog() of Blogger interface. Blogger interface compiles successfully.
//               2. At LINE 1, 'blogger' is of Blogger type (supertype) and it refers to an instance of
//                  TravelBlogger class (subtype), this is polymorphism and allowed in Java. Line n1 compiles
//                  successfully.
//               3. At LINE 2, blog() method is being invoked on typecasting 'blogger' to TravelBlogger and as
//                  TravelBlogger class doesn't declare to throw any checked exception, hence Line n2
//                  compiles successfully.
//               4. As instance is of TravelBlogger type, therefore on execution, 
//                  Line n2 invokes blog() method of TravelBlogger instance, which prints TRAVEL on to the console.
