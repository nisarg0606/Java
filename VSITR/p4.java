package VSITR;

class Triangle {
    double base;
    double height;

    Triangle(int b, int h) {
        base = b;
        height = h;
    }

    void area(Triangle t) {
        double areaOfTriangle = 0.5 * base * height;
        System.out.println("Area of Triangle : " + areaOfTriangle);
    }
}

class p4 {
    public static void main(String args[]) {
        Triangle t1 = new Triangle(10, 20);
        t1.area(t1);
    }
}