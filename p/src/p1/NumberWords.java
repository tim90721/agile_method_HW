package p1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberWords {

	public void run() {
		final String NUMBER_WORDS_MESSAGE = "\nAnswer";
		Scanner sc = new Scanner("805-17\n22z2\nx\n0");
		while (sc.hasNext()) {
			System.out.println(NUMBER_WORDS_MESSAGE + getNumberWords(sc));
		}
	}
	
	public void runTruncate(){
		Scanner sc = new Scanner(" John Sam Ed \"\" ");
		if(sc == null)
			throw new NullPointerException();
		while(sc.hasNext()){
			String token = sc.next();
			System.out.println(token + " ");
			System.out.println(truncate(token));
		}
	}

	public String getNumberWords(Scanner sc){
		try{
			String[] digitWords = {"zero", "one", "two", "three",
					"four", "five", "six", "seven", "eight", "nine", "ten"
			};
			int number = sc.nextInt();
			int saveNumber = number;
			int digit;
			String sign = "";
			String numberWords = "";
			
			if(number < 0){
				sign = "minus";
				number = -number;
			}
			if(number == 0){
				numberWords = digitWords[0];
			}
			while(number > 0){
				digit = number % 10;
				number = number / 10;
				numberWords = digitWords[digit] + numberWords;
			}
			return Integer.toString(saveNumber) + "is" + sign + numberWords;
		}
		catch(InputMismatchException ex){
			return ex.toString() + ": " + sc.next() + " is not an int.";
		}
	}
	
	public String truncate(String token){
		try{
			return token.substring(0, 3);
		}
		catch(StringIndexOutOfBoundsException ex){
			return ex.toString();
		}
		catch(NullPointerException ex){
			return ex.toString();
		}
	}
	
	public static void main(String[] args){
		new NumberWords().run();
		new NumberWords().runTruncate();
	}
}
