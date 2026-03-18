import java.util.*;
import java.lang.*;
import java.io.*;

public class BubbleSort {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for(int tc = 0; tc < t; tc++) {
			int n = sc.nextInt();

			int[] arr = new int[n];

			for(int i=0; i<n; i++) {
				arr[i] = sc.nextInt();
			}

			bubbleSort(arr);
			System.out.println(Arrays.toString(arr));
		}
		sc.close();
	}

	static void bubbleSort(int[] arr) {
		boolean swapped;
		for(int i = 0; i<arr.length; i++) {
			swapped = false;
			for(int j = 1; j<arr.length - i; j++) {
				if(arr[j] <arr[j-1]) {
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
					swapped = true;
				}
			}
			if(!swapped) break;
		}
	}
}
