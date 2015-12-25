package com.interview;

import java.util.ArrayList;
import java.util.List;

public class HeapAndStack {

	   public static void main(String[] args) {
		  List<String> list = new ArrayList<String>();
		  int a = 10;
		  String b = new String();
		  doSth(list);
		  doSthInt(a);
		  doSthString(b);
		  System.out.println(list.size());
		  System.out.println(a);
		  System.out.println(b);

	   }
	
		private static void doSthString(String b) {
		// TODO Auto-generated method stub
		b = b + "!!!!";
		System.out.println("doSthString method: " + b);
	}

		private static void doSthInt(int a) {
			a++;
			System.out.println("doSthInt method: " + a);
		}

		private static void doSth(List<String> list) {
			list.add("1");
			list.add("2");	
			list.add("3");	

		}
	
	}
