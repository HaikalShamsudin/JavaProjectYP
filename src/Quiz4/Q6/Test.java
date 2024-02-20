package Quiz4.Q6;

import java.sql.SQLException;

public class Test { //QUESTION 28 - SQL EXCEPTION
    private static void getData() throws SQLException {
        try {
            throw new SQLException();
        } catch (Exception e) {
            e = new SQLException();  //THIS LINE - If you don't initialize variable e inside catch block using `e = new SQLException();`
            throw e;                               // and simply throw e, then code would compile successfully 
        }                                           // as compiler is certain that 'e' would refer to an instance of SQLException only.
    }

    public static void main(String[] args) {
        try {
            getData();
        } catch (SQLException e) {
            System.out.println("SQL");
        }
    }
}

//ANSWER = method getData() causes compilation error

