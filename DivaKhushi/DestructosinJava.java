package DivaKhushi;

public class DestructosinJava {
    public static void main(String[] args) {
        DestructosinJava obj = new DestructosinJava();
        obj.finalize();
        obj = null;
        System.gc();
        System.out.println("gc is called");
    }

    protected void finalize() {
        System.out.println("Destructor is called and object is destroyed by garbage Collector");
    }
}