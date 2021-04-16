package VSITR;

class Doctor {
    String name;
    Doctor(String name) {
        this.name = name;
    }
}

class Surgeon extends Doctor {
    String specialization;
    int charge_per_hour;

    Surgeon(String name, String specialization, int charge_per_hour) {
        super(name);
        this.specialization = specialization;
        this.charge_per_hour = charge_per_hour;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Specialization : " + specialization);
        System.out.println("Charges_per_hour : " + charge_per_hour);
    }
}

class Physician extends Doctor {
    String speciality;
    int fees_per_hour;

    Physician(String name, String Speciality, int fees_per_hour) {
        super(name);
        this.speciality = Speciality;
        this.fees_per_hour = fees_per_hour;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Speciality : " + speciality);
        System.out.println("fees_per_hour : " + fees_per_hour);
    }
}

public class inheritance {
    public static void main(String[] args) {
        Surgeon s1 = new Surgeon("Dr.Ashit Modi", "Gynaecologist", 2000);
        Surgeon s2 = new Surgeon("Dr.Paresh Shah", "Paediatrician", 1500);
        Physician p1 = new Physician("Dr.Japan Dave", "Heart", 4000);
        Physician p2 = new Physician("Dr.Ekta Patel", "orthopaedic", 2500);
        s1.display();
        s2.display();
        p1.display();
        p2.display();
    }
}