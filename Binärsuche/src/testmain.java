import java.util.Arrays;
import java.util.Scanner;

public class testmain {

	static int zahl;
	static int array[] = new int[10000000];
	static boolean allowed = true;
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		do {
			try {
				System.out.println("Bitte geben sie eine Zahl ein.");
				String sZahl = scanner.nextLine();
				zahl = Integer.parseInt(sZahl);
				allowed = false;
			} catch (NumberFormatException nfe) {
				nfe.printStackTrace();
			}
		}while(allowed);
		
		fillArray();
		final long bTimeStart = System.nanoTime();
		if (Binaersuche.bSuche()) {
			final long bTimeEnd = System.nanoTime();
			System.out.println(
					"Es dauerte " + (bTimeEnd - bTimeStart) + " Nanosekunden" + " (" + (bTimeEnd - bTimeStart) / 1000000
							+ " Millisekunden) um die" + " Zahl mittels binärer Suche zu finden.");

			final long nTimeStart = System.nanoTime();
			Normalsuche.nSuche();
			final long nTimeEnd = System.nanoTime();
			System.out.println(
					"Es dauerte " + (nTimeEnd - nTimeStart) + " Nanosekunden" + " (" + (nTimeEnd - nTimeStart) / 1000000
							+ " Millisekunden) um die" + " Zahl mittels normaler Suche zu finden.\n");

		} else {
			System.out.println("Die gesuchte Zahl ist nicht im Array.");
		}
		scanner.close();
	}

	static void fillArray() {

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * array.length + 1);
		}
		Arrays.sort(array);
	}
}