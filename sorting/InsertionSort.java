import java.util.*;
import java.lang.*;
import java.io.*;

public class InsertionSort {
	public static void main (String[] args) throws java.lang.Exception {
		// your code goes here
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int tc = 0; tc<t; tc++) {
			int n = sc.nextInt();
			
			int[] arr = new int[n];
			
			for(int i = 0; i<n; i++) {
			    arr[i] = sc.nextInt();
			}
			
			insertionSort(arr);
			System.out.println(Arrays.toString(arr));
		}
		sc.close();
	}
	
	
	static void insertionSort(int[] arr) {
	    for(int i = 0; i<arr.length-1; i++) {
	        for(int j = i+1; j>0; j--) {
	            if(arr[j] < arr[j-1]) swap(arr, j, j-1);
	            else break;
	        }
	    }
	}
	
	static void swap(int[] arr, int first, int second) {
	    int temp = arr[first];
	    arr[first] = arr[second];
	    arr[second] = temp;
	}
}

