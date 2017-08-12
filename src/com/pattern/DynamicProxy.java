package com.pattern;

import java.lang.reflect.Method;

import com.interview.HeapAndStack;

public class DynamicProxy {
	
	public void reflectionTest(Object foo){
		Method method;
		try {
			method = foo.getClass().getMethod("doSthString", null);
			method.invoke(foo, null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	public static void main(String[] args) {
		HeapAndStack has = new HeapAndStack();
		DynamicProxy dp =  new DynamicProxy();
		dp.reflectionTest(has);
		
		
	}
}
