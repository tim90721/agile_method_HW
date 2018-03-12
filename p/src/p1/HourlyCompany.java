package p1;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class HourlyCompany extends Company {
	public static void main(String[] args) {
		try {
			new HourlyCompany().run();
		} catch (FileNotFoundException ex) {
			System.out.println("File Not Found");
		}
	}

	/**
	 * Returns the next full-time employee from the file scanned by a specified
	 * Scanner object.
	 * 
	 * @param sc
	 *            – the Scanner object over the file.
	 *
	 * @return the next full-time employee scanned in from sc.
	 *
	 */
	@Override
	protected FulltimeEmployee getNextEmployee(Scanner sc) {
		Scanner lineScanner = new Scanner(sc.nextLine());
		String name = lineScanner.next();
		int hoursWorked = lineScanner.nextInt();
		double payRate = lineScanner.nextDouble();
		return new HourlyEmployee(name, hoursWorked, payRate);
	}
}
