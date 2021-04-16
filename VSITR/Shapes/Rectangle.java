package VSITR.Shapes;
public class Rectangle implements Property {
    public void color() {
        System.out.println("Implementing Color method....");
    }

    public void dimension() {
        System.out.println("Implementing Dimension method....");
    }
    public void color2() {
        
    }

    public static void main(String[] args) {
        Rectangle rObject = new Rectangle();
        System.out.println("\nCalling color Method by creating object of Rectangle....");
        rObject.color();
        System.out.println("\nCalling dimension Method by creating object of Rectangle....");
        rObject.dimension();
    }
}