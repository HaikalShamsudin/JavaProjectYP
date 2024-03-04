package Quiz4.Q8;

public class Test {
    public static void main(String[] args) {
        int score = 30;
        char grade = 'F';

        if (50 <= score && score < 60)
        grade = 'D';
        if (60 <= score && score  < 70)
        grade = 'C';
        if (70 <= score && score  < 80)
        grade = 'B';
        if (score >= 80)
        grade = 'A';

        System.out.println(grade);

    }
}

// ANSWER = COMPILATION ERROR

// Explanation - Relational operators (<, >, <= and >=) are at same level and left to right associative,
//               hence given expression can be grouped as: (50 <= score) < 60

// otherwise, we can put logical operator like this

//                       if (50 <= score && score < 60)
//                          grade = 'D';
//                       if (60 <= score && score  < 70)
//                          grade = 'C';
//                       if (70 <= score && score  < 80)
//                          grade = 'B';
//                       if (score >= 80)
//                          rade = 'A';
