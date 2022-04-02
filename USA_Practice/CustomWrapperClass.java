package USA_Practice;

public class CustomWrapperClass {
    private int eId;
    private String eName;
    private float eSalary;

    public void seteId(int eid) {
        this.eId = eid;
    }

    public int getEid() {
        return eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public float geteSalary() {
        return eSalary;
    }

    public void seteSalary(float eSalary) {
        this.eSalary = eSalary;
    }

    @Override
    public String toString() {
        return "CustomWrapperClass [eId=" + eId + ", eName=" + eName + ", eSalary=" + eSalary + "]";
    }

    private int i;

    CustomWrapperClass(int i) {
        this.i = i;
    }

    String Display() {
        return Integer.toString(i);
    }
    // @Override
    // public String toString()
    // {
    // return eid;
    // }

    public static void main(String[] args) {
        CustomWrapperClass customWrapperClass = new CustomWrapperClass(10);
        customWrapperClass.eId = 1;
        customWrapperClass.eName = "Reyaansh";
        customWrapperClass.eSalary = 5000000.45f;
        System.out.println(customWrapperClass.toString());
        System.out.println(customWrapperClass.Display());

    }

}
