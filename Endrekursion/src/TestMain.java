
public class TestMain {

	public static void main(String[] args) {
		System.out.println(normal(5));
		System.out.println(endf(5));
	}

	static int normal(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return normal(n - 1) + normal(n - 2);
		}
	}

	static int end(int n, int f1, int f2) {
		if (n<=1){
			return f1+f2;
			} else {
				return end(n-1, f2+f1, f1);
		}
	}

	static int endf(int n) {
		return end(n - 1, 1, 0);
	}
}