package VSITR;

class car {
    private String model, color, brand;

    void setdata(String m, String c, String b) {
        model = m;
        color = c;
        brand = b;
    }

    void displayCarinfo() {
        System.out.println("Model : " + model);
        System.out.println("Color : " + color);
        System.out.println("Brand : " + brand);
    }
}

public class car_info {
    public static void main(String[] args) {
        car car_1 = new car();
        car car_2 = new car();
        car car_3 = new car();
        car_1.setdata("City", "White", "Honda");
        car_2.setdata("Desire", "Red", "Maruti");
        car_3.setdata("XUV500", "Maroon", "Mahindra");
        System.out.println("car 1 info :");
        car_1.displayCarinfo();
        System.out.println("car 2 info :");
        car_2.displayCarinfo();
        System.out.println("car 3 info :");
        car_3.displayCarinfo();
    }
}