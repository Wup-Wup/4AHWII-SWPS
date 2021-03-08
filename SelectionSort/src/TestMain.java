

public class TestMain {

	static long zaehler1;
	static long zaehler2;
	
	public static void main(String[] args) {

        int arr[] = new int [100000]; 
        int arr2[] = new int [100000];
        int a;
        for(int i=0;i<arr2.length;i++) {
			a=(int)(Math.random()*10000);
			arr[i]=a;
			arr2[i]=a;
		}
        sort(arr);
        sortStable(arr2);
        printArray(arr,arr2); 
	}
	
	static void sort(int arr[]) 
    { 
        int n = arr.length; 
  
        for (int i = 0; i < n-1; i++) 
        { 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min_idx]) {
                	min_idx = j; 
                	zaehler1++;
                }
                    
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        } 
    } 
	
	   static void sortStable(int[] a) 
	    { 
	        for (int i = 0; i < a.length - 1; i++)  
	        { 
	            int min = i; 
	            for (int j = i + 1; j < a.length; j++) 
	                if (a[min] > a[j]) {
	                	zaehler2++;
	                	min = j; 
	                }
	                    
	  
	            int key = a[min]; 
	            while (min > i)  
	            { 
	                a[min] = a[min - 1]; 
	                min--; 
	                zaehler2++;
	            } 
	              
	            a[i] = key; 
	        } 
	    } 
  
    static void printArray(int arr[], int arr2[]) 
    {  
   /*     for (int i=0; i<arr2.length; ++i) {
        	System.out.println(arr2[i]+"");
        }
        System.out.println("\n");
        for (int i=0; i<arr.length; ++i) {
            System.out.println	(arr[i]+" ");
        }	*/
        System.out.println(zaehler1+" "+zaehler2); 
    } 
}
