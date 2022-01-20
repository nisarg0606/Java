package DivaKhushi;
class Person
{
    int id;
    String name;
    Person(int ids, String names)
    {
        this.id = ids;
        this.name = names;
    }
}


class Emp extends Person
{
    float salary;
    Emp(int id, String name, float salary)
    {
        super(id, name);//reusing the parent constructor
        this.salary = salary;
    }

    void display()
    {
        System.out.println("The id of the Employee is: " + id);
        System.out.println("The name of the Employee is: " + name);
        System.out.println("The salary of the Employee is: " + salary);
    }
}
public class SuperKeywordRealExample {
    public static void main(String[] args) {
        Emp obj = new Emp(1, "Khushi", 70000);
        obj.display();
    }
}
