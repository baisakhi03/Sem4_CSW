//. Design a Java class called Rectangle with private attributes length and width. Include a
//constructor to initialize these attributes, as well as setter and getter methods for each attribute.
//Additionally, implement methods to calculate the area and perimeter of the rectangle. Write a
//main method to create an object of the Rectangle class, set values for its attributes, and display
//the area and perimeter.
package sem_4_Assignments.assignment_1;

public class shape {
    public static void main(String[] args) {
        rectangle r = new rectangle(0,0);
        r.setLength(12);
        r.setWidth(20);
        System.out.println(r.getLength()+" "+r.getWidth());
        System.out.println(r.area()+" "+r.perimeter());
    }
}
class rectangle{
    private double length;
    private double width;
    rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    double area(){
        return length*width;
    }
    double perimeter(){
        return 2*(length+width);
    }
}