package sorts;

public class BubbleSort {
	
	static long zaehlerVBSort;
	static long zaehlerBSort;
	
	public static long getZaehlerVBSort() {
		return zaehlerVBSort;
	}

	public static long getZaehlerBSort() {
		return zaehlerBSort;
	}


	public static void sort(int arr[]) {
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr.length -i - 1; j++) {
				zaehlerVBSort++;
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					zaehlerBSort++;
				}
			}
		}
	}
}
