  public class Q2 {
    private String n;

    public Q2(String n) {
        this.n= n;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object " + name + " is being garbage collected.");
    }

    public static void main(String[] args) {
        // Create two instances of ReassigningReference
        q2 ob1 = new Q2("Obj 1");
        q2 ob2 = new Q2("Obj 2");
        ob1 = ob2;

        System.gc();
    }
}
