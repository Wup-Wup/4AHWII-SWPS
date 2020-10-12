
public class TestMain {

	public static void main(String[] args) {

		System.out.println(normal(42, 8));
		System.out.println(rekursiv(42, 8));
	}

	static int erg = 0;

	public static int normal(int zahl1, int zahl2) {

		for (int i = 0; i < zahl2; i++) {
			erg = erg + zahl1;
		}
		return erg;
	}

	public static int rekursiv(int zahl1, int zahl2) {

		if (zahl2 <= 0) {
			return erg;
		}
		return rekursiv(erg + zahl1, zahl2 - 1);
	}
}