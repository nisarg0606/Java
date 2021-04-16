package Practice;

import java.util.Scanner;

public class BirthdayCalculator {
	static void findAge(int current_date, int current_month, int current_year, int birth_date, int birth_month,
			int birth_year) {
		int month[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (birth_date > current_date) {
			current_month = current_month - 1;
			current_date = current_date + month[birth_month - 1];
		}
		if (birth_month > current_month) {
			current_year = current_year - 1;
			current_month = current_month + 12;
		}

		int calculated_date = current_date - birth_date;
		int calculated_month = current_month - birth_month;
		int calculated_year = current_year - birth_year;

		System.out.println("Present Age");
		System.out.println(calculated_year +" Years, "+ calculated_month+" Months, " + calculated_date + " Days.");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Current date: ");
		int current_date = sc.nextInt();
		System.out.print("Enter Current Month: ");
		int current_month = sc.nextInt();
		System.out.print("Enter Current Year: ");
		int current_year = sc.nextInt();
		// present date

		// birth dd// mm// yyyy
		System.out.print("Enter Birth Date: ");
		int birth_date = sc.nextInt();
		System.out.print("Enter Birth Month: ");
		int birth_month = sc.nextInt();
		System.out.print("Enter Birth Year: ");
		int birth_year = sc.nextInt();
		findAge(current_date, current_month, current_year, birth_date, birth_month, birth_year);
		sc.close();
	}
}