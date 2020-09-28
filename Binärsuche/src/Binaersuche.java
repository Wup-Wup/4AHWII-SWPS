public class Binaersuche {
	
	static boolean bSuche() {
		int max=testmain.array.length-1;
		int min=0;
		while(true) {
			int i=(min+max)/2;
			if(min>max) {
				return false;
			}
			if(testmain.array[i]>testmain.zahl) {
				max=i-1;
			}
			if(testmain.array[i]<testmain.zahl) {
				min=i+1;
			}
			if(testmain.array[i]==testmain.zahl) {
				return true;
			}
		}
	}
}
