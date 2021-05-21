package RahulSir.jdbcdemo;

public class StudentBean {
    private int rno;
    private String name;
    private String std;
    private Float SS;
    private Float Maths;
    private Float Science;
    private Float Total;

    public StudentBean(int rno, String name, String std, Float sS, Float maths, Float science, Float total) {
        this.rno = rno;
        this.name = name;
        this.std = std;
        SS = sS;
        Maths = maths;
        Science = science;
        Total = total;
    }

    public StudentBean(String name, String std, Float sS, Float maths, Float science, Float total) {
        this.name = name;
        this.std = std;
        SS = sS;
        Maths = maths;
        Science = science;
        Total = total;
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

    public String getStd() {
        return std;
    }

    public void setStd(String std) {
        this.std = std;
    }

    public Float getSS() {
        return SS;
    }

    public void setSS(Float sS) {
        SS = sS;
    }

    public Float getMaths() {
        return Maths;
    }

    public void setMaths(Float maths) {
        Maths = maths;
    }

    public Float getScience() {
        return Science;
    }

    public void setScience(Float science) {
        Science = science;
    }

    public Float getTotal() {
        return Total;
    }

    public void setTotal(Float total) {
        Total = total;
    }
}