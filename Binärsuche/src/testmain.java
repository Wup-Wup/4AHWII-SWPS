import java.util.Arrays;
import java.util.Scanner;

public class testmain {

	static int zahl;
	static int array[] = new int[10000000];
	static boolean allowed = true;
	static long bZeit;
	static long nZeit;

	public static void main(String[] args) {

		fillArray();

		Scanner scanner = new Scanner(System.in);

		do {
			try {
				System.out.println("Bitte geben sie eine ganze Zahl ein.");
				String sZahl = scanner.nextLine();
				zahl = Integer.parseInt(sZahl);
				allowed = false;
			} catch (NumberFormatException nfe) {
				nfe.printStackTrace();
			}
		} while (allowed);

		final long bTimeStart = System.nanoTime();
		if (Binaersuche.bSuche()) {
			final long bTimeEnd = System.nanoTime();

			final long nTimeStart = System.nanoTime();
			Normalsuche.nSuche();
			final long nTimeEnd = System.nanoTime();

			bZeit = bTimeEnd - bTimeStart;
			nZeit = nTimeEnd - nTimeStart;

			ausgabe();

		} else {
			System.out.println("Die gesuchte Zahl ist nicht im Array.");
		}
		scanner.close();

	}

	static void fillArray() {

		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		Arrays.sort(array);
	}

	static void ausgabe() {
		System.out.println("Es dauerte " + bZeit + " Nanosekunden" + " (" + bZeit / 1000000 + " Millisekunden) um die"
				+ " Zahl mittels binärer Suche zu finden.");

		System.out.println("Es dauerte " + nZeit + " Nanosekunden" + " (" + nZeit / 1000000 + " Millisekunden) um die"
				+ " Zahl mittels normaler Suche zu finden.\n");
	}
}