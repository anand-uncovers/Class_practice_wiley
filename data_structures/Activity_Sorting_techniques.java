package data_structures;

import java.util.Arrays;

public class Activity_Sorting_techniques {
	
	
	///Quick Sort
	static int quickSwaps=0;
	static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      quickSwaps++;
      
    }
	
	static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = (low - 1);
 
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
               
                
            }
        }
        swap(arr, i + 1, high);
       
        return (i + 1);
    }
 
	static void quickSort(int[] arr, int low, int high)
    {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
           
        }
       
    }
	
	
	//Bubble Sort
	//public static void BubbleSort {
	 static void bubbleSort(int[] arr) {  
	        int n = arr.length;  
	        int temp = 0;  
	         for(int i=0; i < n; i++){  
	                 for(int j=1; j < (n-i); j++){  
	                          if(arr[j-1] > arr[j]){  
	                                 //swap elements  
	                                 temp = arr[j-1];  
	                                 arr[j-1] = arr[j];  
	                                 arr[j] = temp;  
	                         }  
	                          
	                 }  
	         }  
	
	
		
	}
	//Insertion Sort
	//public static void insertionSort(int arr[]) {
	 public static void insertionSort(int array[]) {  
	        int n = array.length;  
	        for (int j = 1; j < n; j++) {  
	            int key = array[j];  
	            int i = j-1;  
	            while ( (i > -1) && ( array [i] > key ) ) {  
	                array [i+1] = array [i];  
	                i--;  
	            }  
	            array[i+1] = key;  
	        }  
	}
	public static void main(String[] args) {
		 //int arr[]= {2,5,3,1};
		int arr[]= {1,5,4,3,2};
		 int N = arr.length;
		 
		int arr1[]= new int[N];
		for(int i=0;i<N;i++) {
			arr1[i]=arr[i];
		}
		Arrays.sort(arr);
		 
		int flag=0;
		
		for(int i=0;i<N;i++) {
			if(arr[i]!=arr1[i])flag--;
		}
		if(flag==0) {
			System.out.println("Already Sorted");
			for(int i=0;i<N;i++)
				System.out.print(arr[i]+" ");
			
			System.out.println();
		}
		else {
	        // Quick Sort
	       // quickSort(arr, 0, N - 1);
	      //  System.out.println("Sorted array usin Quick Sort:");
	      // for(int i=0;i<N;i++) {
	    //	   System.out.print(arr[i]+" ");
	     //  }
	     //  System.out.println();
	     //  System.out.println("NO of swaps-"+ quickSwaps);
		
		
		//bubble Sort
	     //  bubbleSort(arr);
	    //   System.out.println("Sorted array usin Bubble Sort:");
	    //   for(int i=0;i<N;i++) {
	    //	   System.out.print(arr[i]+" ");
	     //  }
			
			insertionSort(arr);
			System.out.println("Sorted array usin Insertion Sort:");
		      for(int i=0;i<N;i++) {
		   	   System.out.print(arr[i]+" ");
			
	       
	       
	       
	       
		}
		 

	}

	}
}
