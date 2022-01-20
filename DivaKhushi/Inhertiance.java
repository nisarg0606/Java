package DivaKhushi;

class Dog
{
    String name;
    int age;
    // Dog(String name, int age)
    // {
    //     this.name = name;
    //     this.age = age;
    // }
    void getDataofDog(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    void Dogbark()
    {
        System.out.println("Woof");
    }
    void displayparent()
    {
        System.out.println("The name of the dog is: "+ name);
        System.out.println("The age of the dog is: "+ age);
    }
}

class BabyDog extends Dog{ 
    void getData(String name, int age)
    {
        // super.getDataofDog(name, age);
        this.name = name;
        this.age = age;
    }
    void display()
    {
        System.out.println("The name of the  Baby dog is: "+ name);
        System.out.println("The age of the Baby dog is: "+ age);
    }
}
public class Inhertiance {
    public static void main(String[] args) {
        BabyDog bd = new BabyDog();
        bd.getData("Brownie", 5);
        // bd.Dogbark();
        bd.display();
        bd.getDataofDog("Jermeny", 10);
        bd.Dogbark();
        bd.displayparent();
    }
}
