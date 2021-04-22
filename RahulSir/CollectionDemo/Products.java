package RahulSir.CollectionDemo;
import java.util.Scanner;
public class Products {
    private int id;
    private String name;
    private float price;
    Scanner sc = new Scanner(System.in);
    public Products() {
        
    }
    public Products(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public void scan() {
        System.out.print("Enter id: ");
        id = sc.nextInt();   
        sc.nextLine();
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter Price: ");
        price = sc.nextFloat();
    }
    public void update() {
        sc.nextLine();
        System.out.println("Enter new name: ");
        name = sc.nextLine();
        System.out.println("Enter new price: ");
        price = sc.nextFloat();
    }
}