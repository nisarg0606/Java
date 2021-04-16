package IODemo;

public class Student {
    private int rno;
    private String name;
    private int std;

    public Student() {
    }

    public Student(int rno, String name, int std) {
        this.rno = rno;
        this.name = name;
        this.std = std;
    }

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getstd() {
        return std;
    }

    public void setStd(int std) {
        this.std = std;
    }
}
