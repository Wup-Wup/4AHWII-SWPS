package sorts;

public class MergeSort {
	
	static long zaehlerMSort;
	static long zaehlerVMSort;

	public static long getZaehlerMSort() {
		return zaehlerMSort;
	}

	public static long getZaehlerVMSort() {
		return zaehlerVMSort;
	}

	 public static int[] sort(int l, int r, int [] intArr) {
	        
	        if (l < r) {
	            int q = (l + r) / 2;
	            
	            sort(l, q, intArr);
	            sort(q + 1, r, intArr);
	            merge(l, q, r, intArr);
	        }
	        return intArr;
	    }

	    private static void merge(int l, int q, int r, int[] intArr) {
	        int[] arr = new int[intArr.length];
	        int i, j;
	        for (i = l; i <= q; i++) {
	            arr[i] = intArr[i];
	        }
	        for (j = q + 1; j <= r; j++) {
	            arr[r + q + 1 - j] = intArr[j];
	        }
	        i = l;
	        j = r;
	        for (int k = l; k <= r; k++) {
	        	zaehlerVMSort++;
	            if (arr[i] <= arr[j]) {
		        	zaehlerMSort++;
	                intArr[k] = arr[i];
	                i++;
	            } else {
	                intArr[k] = arr[j];
	                j--;
	            }
	        }
	    }
}
