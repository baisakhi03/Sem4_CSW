// Q1. Write a Java code snippet that comprises a Car class and a CarTester class. The Car class
// should define private fields for make and model, along with a parameterized constructor and
// getter/setter methods for these attributes. In the CarTester class, instantiate two instances of
// the Car class: myCar1 with a specified make and model, and myCar2 with null values. After
// instantiation, the CarTester class should retrieve and print the initial make and model of both
// cars. Then, it should set new values for myCar2 using setter methods and print the updated
// make and model.
package sem_4_Assignments.assignment_1;

/**
 * carTester
 */
public class carTester {

    public static void main(String[] args) {
        car myCar1 = new car("audi", "A3");
        car myCar2 = new car(null, null);
        myCar2.setMake("benz");
        myCar2.setModel("q7");
        System.out.println(myCar1.getMake()+" "+myCar1.getModel());
        System.out.println(myCar2.getMake()+" "+myCar2.getModel());
    }
}
class car{

    private String make;
    private String model;
    car(String make,String model){
        this.make = make;
        this.model = model;
    }
    void setMake(String make){
        this.make = make;
    }
    String getMake(){
        return make;
    }
    void setModel(String model){
        this.model = model;
    }
    String getModel(){
        return model;
    }
}