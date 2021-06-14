package standart;

import java.util.Scanner;

public class AbbreviationScanner {

	
	public static int scanner(String message) {
		
		System.out.println(message);
		Scanner s = new Scanner(System.in);
		try {
			int abbreviation = s.nextInt();
			
			return abbreviation;
		}catch(java.util.InputMismatchException e) {
			return 1;
		}
	}
}