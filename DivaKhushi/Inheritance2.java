package DivaKhushi;

class Food {
    String item;
    int ingrdients;

    void getData1(String item, int ingrdients) {
        this.item = item;
        this.ingrdients = ingrdients;
    }

    void display1() {
        System.out.println("The item is " + item);
        System.out.println("The number of ingrdients used are: " + ingrdients);
    }

}

class salad extends Food {
    int ingrdients;
    String item;

    void getData2(String item, int ingrdients) {
        this.item = item;
        this.ingrdients = ingrdients;
    }

    void display2() {
        System.out.println("The item is : " + item);
        System.out.println("The ingrdients used are : " + ingrdients);

    }
}

class lemonade extends salad {
    int ingrdients;
    String item;

    void getData3(String item, int ingrdients) {
        this.ingrdients = ingrdients;
        this.item = item;
    }

    void display3() {
        System.out.println("The item is: " + item);
        System.out.println("The ingrdients are : " + ingrdients);
    }
}

public class Inheritance2 {
    public static void main(String[] args) {
        lemonade ln = new lemonade();
        ln.getData3("Lemonade", 4);
        ln.display3();
        ln.getData2("Salad", 10);
        ln.display2();
        ln.getData1("food", 14);

    }
}
