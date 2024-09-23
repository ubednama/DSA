import java.util.*;
import java.lang.*;
import java.io.*;

public class CyclicSort {
	public static void main (String[] args) throws java.lang.Exception {
		// your code goes here
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for(int tc = 0; tc<t; tc++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for(int i =0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            
            cyclicSort(arr);
            System.out.println(Arrays.toString(arr));
        }
        sc.close();
	}
	
	static void cyclicSort(int[] arr) {
	    int i = 0;
	    while(i < arr.length) {
	        int correctPos = arr[i] - 1;
	        if(arr[i] != arr[correctPos]) {
	            swap(arr, i, correctPos);
	        } else i++;
	    }
	}
	
	static void swap(int[] arr, int start, int end) {
	    arr[start] = arr[start] + arr[end];
	    arr[end] = arr[start] - arr[end];
	    arr[start] = arr[start] - arr[end];
	}
}
