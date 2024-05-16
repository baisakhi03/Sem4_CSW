public class Q5 {
    private int Val;
    private double Value;

    public void initialize(int Val, double Value) {
        this.Val = Val;
        this.Value = Value;
    }

    public static void main(String[] args) {
        Runtime runtm = Runtime.getRuntime();
        Q5 ob1 = new Q5();
        Q5 ob2 = new Q5();
    
        ob1.initialize(20, 50);
        ob2.initialize(40,80);
        ob1 = null;
        ob2 = null;

        System.gc();
        
        long usedMemory = runtm.totalMemory() - runtm.freeMemory();
        long totalMemory = runtm.totalMemory();
        System.out.println("Memory used: " + usedMemory + " bytes");
        System.out.println("Total memory: " + totalMemory + " bytes");
    }
}
