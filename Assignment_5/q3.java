public class Q3 {

    private String n;

    public Q3(String n) {
        this.n= n;
    }

    public void finalize() {
    System.out.println("Object " + name + " has been garbage collected.");
    }

    public static void main(String[] args) {
        Q3 ob = new Q3("Example");
        ob = null;
        System.gc();
    }
}
