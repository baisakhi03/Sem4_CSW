//Q5. Developing a Simple College Management System in Java
//Create a Java program for managing colleges and students. The provided classes model the
//relationship between colleges and students.
//The College class represents a college with attributes collegeName and collegeLoc. The
//Student class represents a student with attributes studentId, studentName, and a reference
//        to a College object. Enhance the Student class by adding a constructor that assigns a student
//        ID, name, and college information. Additionally, add a method named displayStudentInfo()
//that prints the student's ID, name, and the college information in which they are enrolled.
//In the Main class, instantiate at least two College objects and at least two Student objects.
//Enroll each student in one of the colleges. Then, display the information of all colleges and all
//students using the appropriate methods.
package sem_4_Assignments.assignment_1;

public class collegeMain {
    public static void main(String[] args) {
        college c1 = new college("Iter","Jagamara");
        college c2 = new college("Kiit","Patia");
        student s1 = new student(c1.getCollegeName(), c1.getCollegeLoc(), "12345678","Ayushmaan");
        student s2 = new student(c2.getCollegeName(), c2.getCollegeLoc(), "12345678","Ayushmaan");
        s1.display();
        s2.display();
    }
}
class college{
    private String collegeName;
    private String collegeLoc;
    college(String collegeName,String collegeLoc){
        this.collegeName = collegeName;
        this.collegeLoc = collegeLoc;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getCollegeLoc() {
        return collegeLoc;
    }

    public void setCollegeLoc(String collegeLoc) {
        this.collegeLoc = collegeLoc;
    }
}
class student extends college{
    private String studentId;
    private String studentName;
    student(String collegeName, String collegeLoc,String studentId,String studentName) {
        super(collegeName, collegeLoc);
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    void display(){
        System.out.println(super.getCollegeName()+" "+super.getCollegeLoc()+" "+studentId+" "+studentName);
    }
}