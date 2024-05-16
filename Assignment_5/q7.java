class Student {
    String n;

    public Student(String n) {
        this.n = n;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(name + " object is being garbage collected");
        super.finalize();
    }
}

public class q7 {
    public static void main(String[] args) {
        Student s = new Student("Jimin");
        s = null; 
        System.gc(); 
    }
}
