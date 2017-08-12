package com.algorithm.lintcode;

import java.util.Arrays;
import java.util.Objects;

public class AlgoTest {

	public static void main(String[] args) {
		int a[] = {5,8,10,1,4,6};
		bubbleAlgoDescendant(a);
//		bubbleAlgoAscendant(a);
		
		selectionAlgo(a);
	}

	private static void bubbleAlgoDescendant(int[] a) {
		int temp =0;
		boolean done = false;
		for(int i=0; i<a.length-1 && !done;i++){
			done = true;
			for(int j=0; j<a.length-1-i;j++){
				if(a[j]<a[j+1]){
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					done = false;
				}
			}
			System.out.println(Arrays.toString(a));
		}
	}

	private static void bubbleAlgoAscendant(int[] a) {
		int temp = 0;
		boolean done = false;
		
		for (int i=0; i<a.length-1 && !done; i++){
			
			done = true;
			
			for(int j=0; j<a.length-1-i;j++){								
				if(a[j]>a[j+1]){
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					done = false;
				}
			}
			System.out.println(Arrays.toString(a));
		}
	}

	private static void selectionAlgo(int[] a) {
		
		
	}
}
