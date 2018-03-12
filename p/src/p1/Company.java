package p1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Company {
	public static void main(String[] args){
		try{
			new Company().run();
		}
		catch(FileNotFoundException ex){
			System.out.println("File not found");
		}
	}
	
	/**
	 * Determines and prints out the best paid of the full-time employees
	 * scanned in from a specified file
	 */
	public void run() throws FileNotFoundException{
		final String INPUT_PROMPT = "Please enter the path for the file of employees: ";
		final String BEST_PAID_MESSAGE = "\n\nThe best-paid employee (and gross pay) is ";
		final String NO_INPUT_MESSAGE = "\n\nError: There were no employees scanned in.";
		String fileName;
		
		System.out.println(INPUT_PROMPT);
		fileName = new Scanner(System.in).next();
		Scanner sc = new Scanner(new File(fileName));
		
		FulltimeEmployee bestPaid = findBestPaid(sc);
		if(bestPaid == null)
			System.out.println(NO_INPUT_MESSAGE);
		else {
			System.out.println(BEST_PAID_MESSAGE + bestPaid.toString());
		}
	}
	
	/**
	 * Returns the best paid of all the full-time employees scanned in.
	 * @param sc the Scanner object used to scan in the employees
	 * @return the best paid of all the full-time employees scanned in,
	 * 			or null, if there were no employees scanned in.
	 */
	public FulltimeEmployee findBestPaid(Scanner sc){
		FulltimeEmployee full, bestPaid = new FulltimeEmployee();
		while(sc.hasNext()){
			full = getNextEmployee(sc);
			if(full.getGrossPay() > bestPaid.getGrossPay())
				bestPaid = full;
		}
		if(bestPaid.getGrossPay() == 0.00)
			return null;
		return bestPaid;
	}
	
	/**
	 * Returns the next full-time employee from the specified Scanner object
	 * 
	 * @param sc the Scanner object used to scan in the next employee
	 * @return the next full-time employee scanned in from sc.
	 */
	protected FulltimeEmployee getNextEmployee(Scanner sc){
		Scanner lineScanner = new Scanner(sc.nextLine());
		String name = lineScanner.next();
		double grossPay = lineScanner.nextDouble();
		return new FulltimeEmployee(name, grossPay);
	}
}
