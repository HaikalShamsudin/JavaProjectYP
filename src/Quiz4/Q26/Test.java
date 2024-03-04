package Quiz4.Q26;

public class Test { //QUESTION 26 - CONCAT
    
    public static void main(String[] args) {
        String text = "ONE";
        System.out.println(text.concat(text.concat("ELEVEN ")).trim());
                              //ONE          //ONE ELEVEN         //

    }   // ANSWER = ONE ONE ELEVEN
}

//maksud concat ialah menggabungkan. lebih kurang sama macam operator +
//trim method removes leading and trailing. no leading so its not effect
