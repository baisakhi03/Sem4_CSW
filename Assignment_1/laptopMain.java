//Write a Java code snippet comprising two classes: Laptop and Main. The Laptop class
//defines private fields model and price, alongside setter methods for each attribute.
//Additionally, it overrides the toString() method to return a string representation of the laptop's
//model and price. In the Main class, create an instance of Laptop, setting its model using the
//setter method. Then, print the laptop object using the toString() method. Describe the
//functionality of the toString() method in the Laptop class and explain how it is utilized in the
//        Main class.
package sem_4_Assignments.assignment_1;

public class laptopMain {
    public static void main(String[] args) {
        laptop l = new laptop(null,0);
        l.setModel("HP");
        l.setPrice(100000);
        System.out.println(l.getModel()+" "+l.getPrice());
        System.out.println(l);
    }
}
class laptop{
    private String model;
    private double price;
    laptop(String model,double price){
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String toString(){

        return price +" "+ model;
    }
}