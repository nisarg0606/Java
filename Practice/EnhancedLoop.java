package Practice;
import java.util.*;
class EnhanceForLoop{
    public static void main(String[] args) {
        System.out.println();
        String states[] = {"Gujarat", "Maharastra", "Goa", "Rajasthan"};
        for (int i = 0; i < states.length; i++) {
            System.out.println("Standard for-loop : state name: " +states[i]);
        }       
        System.out.println();
        for(String i:states)
        {
            System.out.println("Enhanced for-loop : state name: " + i);
        }
        System.out.println();
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Dehli");
        cities.add("Mumbai");
        cities.add("Kolkata");
        cities.add("Ahmedabad");
        System.out.println();
        for (int i = 0; i < cities.size(); i++) {
            System.out.println("Standard for-loop : city name: " +cities.get(i));
        }
        System.out.println();
        for(String city: cities)
        System.out.println("Enhanced for-loop : city name: " +city);
        System.out.println();
        System.out.println("In collections");
        System.out.println();
            printcollection(cities);
    }
    public static<AnyType> void printcollection(Collection<AnyType> c) {
        for(AnyType val: c)
        System.out.println(val);
    }
}