package DivaKhushi;


class Students{
    int rollno;
    String name;
    static String school="Anand";
    Students(int r, String name)
    {
        rollno = r;
        this.name = name;
    }

    void display()
    {
        System.out.println("The roll number of the student is: "+ rollno);
        System.out.println("The name of the name is: "+ name);
        System.out.println("The school is: "+ school);
    }

    static void display1()
    {
        System.out.println("The school is: "+ school);
    }

}

class Counter{
    static int count = 0;
    Counter()
    {
        count++;//count = count + 1;
        System.out.println(count);
    }
}
public class StaticKeyword {
    public static void main(String[] args) {
        Students students = new Students(1, "Khushi");
        Students s1 = new Students(2, "Diva");
        System.out.println(students);
        students.display();
        s1.display();

        Counter count = new Counter();
        Counter count1 = new Counter();
        Counter count2 = new Counter();


        Students.display1();
    }
}
