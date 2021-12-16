package DivaKhushi;

class Student{
    public int rollno;
    public String name;
    Student(int rno, String name){
        rollno = rno;
        this.name = name;
    }
}
public class arrayofstudents {
    public static void main(String[] args) {
        Student[] arr; // declaring an array of objects
        arr = new Student[5]; // allocating memory to the array
        arr[0] = new Student(1, "khushi");
        arr[1] = new Student(2, "Diva");
        arr[2] = new Student(3, "Nisarg");
        arr[3] = new Student(4, "Dhiraj Sir");
        arr[4] = new Student(5, "Shyam");

        for (int i = 0; i < arr.length; i++) {
            System.out.println("The Roll no of element at " + i + " is "+arr[i].rollno + " and the name of the student is " + arr[i].name);
        }
    }
}
