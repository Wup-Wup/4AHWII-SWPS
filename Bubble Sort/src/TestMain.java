
public class TestMain {

	public static void main(String[] args) {
		
		int a;
		
		int Array [] = new int [10000];
		
		for(int i=0; i<Array.length;i++) {
			Array[i]=(int)(Math.random()*10);
		}
		
		for(int i=0; i<Array.length;i++) {
			System.out.print(Array[i]+" ");
		}
		System.out.println();
		
		final long timeStart = System.currentTimeMillis();
		for(int i = Array.length; i>1;i--) {
			for(int j=0; j<i-1;j++) {
				if(Array[j]>Array[j+1]) {
					a=Array[j];
					Array[j]=Array[j+1];
					Array[j+1]=a;
				}
			}
		}
		final long timeEnd = System.currentTimeMillis();
	    
		for(int i=0; i<Array.length;i++) {
			System.out.print(Array[i]+" ");
		}
		System.out.println();
		
		System.out.println("Verlaufszeit: " + (timeEnd - timeStart) + " Millisek.");
	}
}
