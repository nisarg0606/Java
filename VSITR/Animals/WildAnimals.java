package VSITR.Animals;

public class WildAnimals implements Animal {
    public void eat(){
        System.out.println("Implementing Eat method...");
    }
    public void travel()
    {
        System.out.println("Implementing travel method...");
    }
    public static void main(String[] args) {
        WildAnimals wAnimals = new WildAnimals();
        System.out.println("\nCalling Eat Method by creating object of Wildanimals....");
        wAnimals.eat(); 
        System.out.println("\nCalling Travel Method by creating object of Wildanimals....");
        wAnimals.travel(); 
    }
}