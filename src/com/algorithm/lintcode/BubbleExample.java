package com.algorithm.lintcode;

public class BubbleExample {
	
	public BubbleExample() {
		// TODO Auto-generated constructor stub
	}
	
	public static void bubbleSort(int[] a){
		   int temp = 0;
	       for(int i=0; i<a.length-1; i++){
	    	   for(int j=0; j<a.length-1; j++){
	    		   if(a[j]>a[j+1]){
	    			   temp = a[j+1];
		    		   a[j+1] = a[j];
		    		   a[j] = temp;
	    		   }	    		   
	    	   }
	       }
	       for(int i=0; i<a.length; i++)
	    	   System.out.println(a[i]);
	}  

	public static void main(String[] args) {
		 int a[]={49,38,30,27};  
		 bubbleSort(a);
	}
}
