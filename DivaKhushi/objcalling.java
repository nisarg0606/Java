package DivaKhushi;

public class objcalling {
    public String name;
    public int id;
    void getdata(String name, int id)
    {
        this.id = id;
        this.name = name;
    }
    
    void display()
    {
        System.out.println("The name you entered is: " + name);
        System.out.println("The id you entered is: " + id);
    }
    public static void main(String[] args) {
        objcalling obj = new objcalling();
        obj.getdata("Khushi", 1);
        obj.display();
        objcalling newobj = new objcalling();
        newobj.display();
    }
}
