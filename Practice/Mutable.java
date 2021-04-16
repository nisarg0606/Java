package Practice;
public class Mutable {
    private String s;
    Mutable(String s)
    {
        this.s = s;
    }
    public String getName()
    {
        return s;
    }
    public void setName(String courseName) {
        this.s = courseName;
    }
    public static void main(String[] args) {
        Mutable obj = new Mutable("Nisarg");
        System.out.println(obj.getName());
        obj.setName("Shah");
        System.out.println(obj.getName());
    }
}