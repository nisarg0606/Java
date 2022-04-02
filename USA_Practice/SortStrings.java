package USA_Practice;

public class SortStrings {
    
    public static void main(String[] args) {
        String name[] = { "Mumbai", "Gujarat", "Rajasthan", "Dehli", "Punjab", "Tamil Nadu" };
        // int size = name.length;
        // String temp = null;
        for (int i = 0; i < name.length; i++) {
            for (int j = i + 1; j < name.length; j++) {
                if (name[j].compareTo(name[i]) < 0) {
                    String temp = name[i];
                    name[i] = name[j];
                    name[j] = temp;
                }
            }
        }
        System.out.println("After Sorting.....");
        for (String i : name) {
            System.out.print(i + "    ");
        }
    }
}
