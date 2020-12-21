
public class TestMain {

	static int[] rara = new int[1000];
	static int[] best = new int[1000];
	static int[] worst = new int[1000];
	static long timeStart;
	static long timeEnd;
	static int a;

	public static void main(String[] args) {

		bestCase();
		worstCase();
		lotto();
		
		System.out.println("Insertion Sort:");
		
		System.out.println("BestCase:");
		timeStart = System.currentTimeMillis();
		binaryInsertionSort(best);
		timeEnd = System.currentTimeMillis();
		System.out.println("Zeit: "+ (timeEnd - timeStart) +" ms");
		System.out.println();
		
		System.out.println("WorstCase:");
		timeStart = System.currentTimeMillis();
		binaryInsertionSort(worst);
		timeEnd = System.currentTimeMillis();
		System.out.println("Zeit: "+ (timeEnd - timeStart) +" ms");
		System.out.println();
		
		System.out.println("Lotto:");
		timeStart = System.currentTimeMillis();
		binaryInsertionSort(rara);
		timeEnd = System.currentTimeMillis();
		System.out.println("Zeit: "+ (timeEnd - timeStart) +" ms");
		System.out.println();
		
		bestCase();
		worstCase();
		lotto();
		
		System.out.println("BubbleSort:");
		
		System.out.println("BestCase:");
		timeStart = System.currentTimeMillis();
		bubbleSort(best);
		timeEnd = System.currentTimeMillis();
		System.out.println("Zeit: "+ (timeEnd - timeStart) +" ms");
		System.out.println();
		
		System.out.println("WorstCase:");
		timeStart = System.currentTimeMillis();
		bubbleSort(worst);
		timeEnd = System.currentTimeMillis();
		System.out.println("Zeit: "+ (timeEnd - timeStart) +" ms");
		System.out.println();
		
		System.out.println("Lotto:");
		timeStart = System.currentTimeMillis();
		bubbleSort(rara);
		timeEnd = System.currentTimeMillis();
		System.out.println("Zeit: "+ (timeEnd - timeStart) +" ms");
		System.out.println();
		
	}

	public static void bestCase() {
		for (int i = 0; i < best.length; i++) {

			best[i] = (int) (Math.random() * 10000);

		}

		for (int i = 0; i < best.length; i++) {
			best[i] = (int) (Math.random() * 10000);
		}

		for (int i = best.length; i > 1; i--) {
			for (int j = 0; j < i - 1; j++) {
				if (best[j] > best[j + 1]) {
					a = best[j];
					best[j] = best[j + 1];
					best[j + 1] = a;
				}
			}
		}
/*		for (int i = 0; i < best.length; i++) {
			System.out.print(best[i] + " ");
		}
		System.out.println();	*/
	}

	public static void worstCase() {
		for (int i = 0; i < worst.length; i++) {

			worst[i] = (int) (Math.random() * 10000);

		}

		for (int i = 0; i < worst.length; i++) {
			worst[i] = (int) (Math.random() * 10000);
		}

		for (int i = worst.length; i > 1; i--) {
			for (int j = 0; j < i - 1; j++) {
				if (worst[j] < worst[j + 1]) {
					a = worst[j];
					worst[j] = worst[j + 1];
					worst[j + 1] = a;
				}
			}
		}
/*		for (int i = 0; i < worst.length; i++) {
			System.out.print(worst[i] + " ");
		}
		System.out.println();		*/
	}

	public static void lotto() {

		boolean vorh = false;
		boolean added = false;
		int a = 0;

		for (int i = 0; i < rara.length; i++) {
			added = false;
			while (!added) {
				vorh = false;
				a = (int) (Math.random() * 10000 + 1);
				for (int j = 0; j < i; j++) {
					if (rara[j] == a) {
						vorh = true;
						break;
					}
				}
				if (!vorh) {
					rara[i] = a;
					added = true;
				}
			}
		}

/*		for (int i = 0; i < rara.length; i++) {
			System.out.print(rara[i] + " ");
		}
		System.out.println();		*/
	}

	public static void binaryInsertionSort(int[] nums) {
	    int length = nums.length;

	    for (int i = 1; i < length; ++i) {
	        int key = nums[i];
	        int insertedPosition = binarySearch(nums, 0, i - 1, key);

	        for (int j = i - 1; j >= insertedPosition; --j) {
	            nums[j + 1] = nums[j];
	        }

	        nums[insertedPosition] = key;
	    }
	    for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
	    System.out.println();
	}

	public static int binarySearch(int[] nums, int start, int end, int key) {
	    while (start <= end) {
	        int mid = start + (end - start) / 2;

	        if (key < nums[mid]) {
	            end = mid - 1;
	        } else {
	            start = mid + 1;
	        }
	    }

	    return start;
	}
	
	public static void bubbleSort(int [] elements) {
		for(int i = elements.length; i>1;i--) {
			for(int j=0; j<i-1;j++) {
				if(elements[j]>elements[j+1]) {
					a=elements[j];
					elements[j]=elements[j+1];
					elements[j+1]=a;
				}
			}
		}
		 for (int i = 0; i < elements.length; i++) {
				System.out.print(elements[i]+" ");
			}
		    System.out.println();
	}
}