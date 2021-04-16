package OCJP;
class Employee1{
    float salary = 40000;
}
class SingleInheritance extends Employee1{
    int bonus = 10000;
    public static void main(String[] args) {
        SingleInheritance i = new SingleInheritance();
        System.out.println("Programmer salary is: "+i.salary);
        System.out.println("Bonus of programmer is: "+i.bonus);
    }
}