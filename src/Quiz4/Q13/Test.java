package Quiz4.Q13;


interface Rideable {   //QUESTION 13
    void ride (String name);  
}

class Animal {}

class Horse extends Animal implements Rideable {

    @Override
    public void ride(String name) {
        System.out.println(name.toUpperCase() + "IS RIDING THE HORSE");
    }
    
}

public class Test {
    public static void main(String[] args) {
        Animal horse = new Horse();
        /* INSERT */

        // explain bahasa = Horse dia casted dengan horse, so dia ada dapat method ride tu even horse class (Animal) takda method tu.
        // ((Horse)horse).ride("Emma");  - This option compiles successfully because it explicitly casts horse to Horse type, and then calls the ride method.
                                            // The actual object type is Horse, and it will print "EMMA IS RIDING THE HORSE" on the console.

        // explain bahasa = akan menyebabkan error, sebab object horse tu dari class animal. dlm class animal takda method ride
        // horse.ride("EMMA"); - This option causes a compilation error because the variable horse is of type Animal, and the Animal class does not have a ride method.
        
        // explain bahasa = berjaya run. sebab Rideable casted dalam horse, which is akan calling method ride() ke dalam object horse.
        // ((Rideable)horse).ride("emma"); - This option compiles successfully because it explicitly casts horse to Rideable, 
                                                //which is the interface implemented by Horse. It will print "EMMA IS RIDING THE HORSE" on the console.

        // explain bahasa = akan menyebabkan error, sebab dalam horse, tetap tak dpt method ride sebab horse dalam class animal (takde method),                                       
        // (Horse)horse.ride("EMMA"); - This option causes a compilation error for the same reason as option 2; Animal type does not have a ride method.
        
        // explain bahasa = berjaya run, 
        //(Rideable)(Horse)horse.ride("EMMA"); // - This option compiles successfully. It first casts horse to Horse type, then casts the result to Rideable,
                                                    // and finally calls the ride method. It will print "EMMA IS RIDING THE HORSE" on the console.

        // (Rideable)horse.ride("emma"); - This option causes a compilation error because the Animal type does not have a ride method.
        
        // ((Rideable)(Horse)horse).ride("EMMA"); - This option compiles successfully. It first casts horse to Horse type, then casts the result to Rideable,
                                                    // and finally calls the ride method. It will print "EMMA IS RIDING THE HORSE" on the console.

        // ((Horse)(Rideable)horse).ride("emma"); - This option causes a compilation error because Rideable type does not have a ride method with the argument "emma".
        
        // (Horse)(Rideable)horse.ride("EMMA"); - This option causes a compilation error because Rideable type does not have a ride method with the argument "EMMA".

    }
}
