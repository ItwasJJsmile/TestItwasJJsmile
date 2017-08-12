package com.interview.learnhashmap;

import java.util.HashMap;
import java.util.Map;

public class HashmapText {

	public static void main(String[] args) {
		String text = "abc";
		System.out.println(text.hashCode());
		
		HashMap<String,String> m = new HashMap<>();
		m.put("1", "a");
		m.put("2", "b");
		m.put("3", "c");
		for(Map.Entry<String, String> entry : m.entrySet()){
			
		}
	}
}
