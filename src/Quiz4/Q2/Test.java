package Quiz4.Q2;

public class Test { //QUESTION 1 (Understanding Operator)
                                                                //nested loop
    public static void main(String[] args) {                // 1st iteration loop one i = 0
        int ctr = 100;                                      //  1st iteration loop two j = 0
        one: for (int i = 0; i < 10; i++) {                 //  1st iteration loop three, ctr = 101
            two: for (int j = 0; j < 7; j++) {              //  - sebab nilai i sama dengan j jadi 'true' (ada increament pada i)   
                three: while (true) {                       //  2nd iteration loop one i = 1   
                    ctr++;                                  //  1st iteration loop two j = 0
                    if (i>j) {                              //  so, i lebih besar dari j jadi 'true' (ada increament), and then break (stop)
                        break one;                          // ctr jadi 102
                    } else if (i == j) {
                        break two;
                    } else {
                        break three;
                    }
                }
            }
        }
        System.out.println(ctr);
    }
}
