
public class TestMain {

	public static void main(String[] args) {
		
		System.out.println(summenfunktion(10));

	}
	
	public static int summenfunktion(int number) {
		if(number==0) {
			return 0;
		}
		return summenfunktion(number-1)+number;
	}

}
