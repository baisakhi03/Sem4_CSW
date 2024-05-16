public class Q4 {
private String n;
  public Q4(String n) {
        this.n= n;
    }

    public void finalize() {
        System.out.println("Object " + name + " has been garbage collected.");
    }

    public static void main(String[] args) {
    new Q4("Anonymous Obj");
    System.gc();
    }
}
