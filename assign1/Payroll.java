package assign1;

import java.io.File;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Payroll {
    public static void main(String[] args) {
        File file = new File("D:\\Java\\assign1\\Salary.txt");
        try (Scanner sc = new Scanner(file)) {
            SortedSet<Double> associate = new TreeSet<>();
            SortedSet<Double> full = new TreeSet<>();
            SortedSet<Double> assistant = new TreeSet<>();
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] parts = line.split(" ");
                String position = parts[2];
                Double salary = Double.parseDouble(parts[3]);

                if (position.equals("assistant")) {
                    assistant.add(salary);
                } else if (position.equals("associate")) {
                    associate.add(salary);
                } else {
                    full.add(salary);
                }
            }
            System.out.println("\n---------------Associate Professors----------------");
            System.out.println("Total Associate Professors are: " + associate.size());
            System.out.println("Highest Salary in Associate Professor: " + associate.last());
            System.out.println("Lowest Salary in Associate Professor: " + associate.first());
            double sum = 0;
            for (Double d : associate) {
                sum = sum + d;
            }
            System.out.printf("Average Salary in Associate Professors: %.2f", sum / associate.size());
            System.out.println("\n\n---------------Assistant Professors----------------");
            System.out.println("Total Assistant Professors are: " + assistant.size());
            System.out.println("Highest Salary in Assistant Professor: " + assistant.last());
            System.out.println("Lowest Salary in Assistant Professor: " + assistant.first());
            for (Double d : assistant) {
                sum = sum + d;
            }
            System.out.printf("Average Salary in Assistant Professors: %.2f", sum / assistant.size());
            System.out.println("\n\n---------------Full Professors ----------------");
            System.out.println("Total Full Professors are: " + full.size());
            System.out.println("Highest Salary in Full Professor: " + full.last());
            System.out.println("Lowest Salary in Full Professor: " + full.first());
            for (Double d : full) {
                sum = sum + d;
            }
            System.out.printf("Average Salary in Full Professors: %.2f", sum / full.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
