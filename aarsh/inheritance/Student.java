package aarsh.inheritance;

import aarsh.ScannerMethods;

/*
 * Design a class “Student” with students name and ID, which is
inherited by class “Arts”, “Commerce” and “Engineering”. “Engineering
again is inherited by “Computer”, “Civil” and “Automobile”. All classes have
data member “number of students”. Set data with dynamic
constructor. Compare which branch have least number of students
 */
/*
 * Properties of Constructor:
 * 1> It should be same as class name
 * 2> It is initialized when object of the class is created
 * 3> It is mainly used to initilize variables
 */
public class Student {
    String name;
    int id;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}

class Arts extends Student {
    int numberOfStudents;
    String names[] = new String[numberOfStudents];
    int ids[] = new int[numberOfStudents];
    Arts() {
        System.out.print("Enter number of students for arts ");
        numberOfStudents = ScannerMethods.ScanInteger();

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter id and name for student " + (i + 1) + ": ");
            
        }
    }

    int getNumberOfArtsStudents() {
        return numberOfStudents;
    }

    void display() {
        System.out.println("Name of student is: " + name);
        System.out.println("Id of student is: " + id);
        System.out.println("Number of Seats in arts: " + numberOfStudents);
    }
}

class Commerce extends Student {
    int numberOfStudents;

    Commerce() {
        System.out.print("Enter number of students for Commerce: ");
        numberOfStudents = ScannerMethods.ScanInteger();
    }

    int getNumberOfCommerceStudents() {
        return numberOfStudents;
    }

    void display() {
        System.out.println("Total number of Commerce students are: " + numberOfStudents);
    }
}

class Engineering extends Student {
    int numberOfStudents = 0;

    Engineering() {
    }

    Engineering(int num) {
        numberOfStudents += num;
    }

    int getNumberOfEngineeringStudents() {
        return numberOfStudents;
    }

    void display() {
        System.out.println("Total number of Engineering students are: " + numberOfStudents);
    }
}

class Computer extends Engineering {
    int numberOfStudents;

    Computer() {
        System.out.print("Enter number of students for Computer Engineering: ");
        numberOfStudents = ScannerMethods.ScanInteger();
    }

    int getNumberOfComputerStudents() {
        return numberOfStudents;
    }

    void display() {
        System.out.println("Total number of Computer Engineering students are: " + numberOfStudents);
    }
}

class Civil extends Engineering {
    int numberOfStudents;

    Civil() {
        System.out.print("Enter number of students for Civil Engineering: ");
        numberOfStudents = ScannerMethods.ScanInteger();
    }

    int getNumberOfCivilStudents() {
        return numberOfStudents;
    }

    void display() {
        System.out.println("Total number of Civil Engineering students are: " + numberOfStudents);
    }
}

class Automobile extends Engineering {
    int numberOfStudents;

    Automobile() {
        System.out.print("Enter number of students for Automobile Engineering: ");
        numberOfStudents = ScannerMethods.ScanInteger();
    }

    int getNumberOfAutomobileStudents() {
        return numberOfStudents;
    }

    void display() {
        System.out.println("Total number of Automobile Engineering students are: " + numberOfStudents);
    }
}

class World {
    public static void main(String[] args) {
        Arts arts = new Arts();
        Commerce commerce = new Commerce();
        Computer computer = new Computer();
        Civil civil = new Civil();
        Automobile automobile = new Automobile();
        arts.display();
        commerce.display();
        computer.display();
        civil.display();
        automobile.display();
    }
}