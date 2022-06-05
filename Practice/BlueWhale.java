package Practice;

interface Mammals {
    default void show() {
        System.out.print("Mammal");
    }
}

interface MarineAnimals {
    default void show() {
        System.out.print("Marine Animal");
    }
}

public class BlueWhale implements Mammals, MarineAnimals {
    public void show() {
        System.out.print("I am both ");
        Mammals.super.show();
        System.out.print(" and ");
        MarineAnimals.super.show();

    }
    public static void main(String[] args) {
        BlueWhale obj = new BlueWhale();
        obj.show();

    }
}