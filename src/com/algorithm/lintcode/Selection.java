package com.algorithm.lintcode;

import java.util.ArrayList;

public class Selection {
	
	public static void main(String[] args) {
		int a[] = {6,9,2,1,3,8,4};
		selectionSort(a);
		
		ArrayList<String> list = new ArrayList<>();
		list.iterator();
		
	}

	private static void selectionSort(int list[]) {
		
		for(int i=0;i<list.length;i++){
			int temp=0;
			int index=i;
			
			for(int j=i+1;j<list.length;j++){
				if(list[index]>list[j]){
					index = j;
				}
			}
			
			temp = list[index];
			list[index] = list[i];
			list[i] = temp;
			for(int k=0;k<list.length;k++){
				System.out.print(list[k] + " ");
			}
			System.out.println(" ");
		}
	}
}
