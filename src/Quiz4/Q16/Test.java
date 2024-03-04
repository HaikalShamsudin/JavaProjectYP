package Quiz4.Q16;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

// Given code of Test.java file,Which of the following options can replace 
// /*INSERT*/ such that on executing Test class all the list elements are displayed in the output?
// Select 4 options.

public class Test { //QUESTION 16
    public static void main(String[] args) {
        List <String> words = new ArrayList<>();
        words.add("A");
        words.add("an");
        words.add("the");
        words.add("when");
        words.add("what");
        words.add("where");
        words.add("whether");

        processStringArray(words, /*INSERT*/);


    }

    private static void processStringArray(List<String> list, Predicate <String> predicate) {
        for (String str : list) {
            if (predicate.test(str)) {
                System.out.println(str);
            }
        }
    }
}

// ANSWER 
// p -> !!!!true 
// This lambda expression always evaluates to true because it negates the negation of the negation 
// of the negation of true. However, it's unnecessarily complicated and not recommended for clarity.

// p -> p.length() >= 1 
// This lambda expression checks if the length of the string is greater than or equal to 1. This effectively
// filters out empty strings and prints all other non-empty strings in the list.

// p -> true 
// This lambda expression always evaluates to true, which means it will print all elements in the list, regardless 
// of their content. This is a straightforward way to achieve the desired output.

// (String p) -> p.length() < 100 
// This lambda expression checks if the length of the string is less than 100. Since the strings in your list are relatively 
// short, this condition will always be true, and all elements will be printed.