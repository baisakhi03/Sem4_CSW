public class Q1 {
 private String n;

    public Q1(String n) {
        this.n = n;
    }

    public void show() {
     new Q1("Object").display();
    }

    public void display() {
     new Q1("InnerObject");
    }

    @Override
    protected void finalize() throws Throwable {
    System.out.println("Object " + name + " is being garbage collected.");
    }

    public static void main(String[] args) {
     new Q1("MainObject").show();
     System.gc();
    }
}
