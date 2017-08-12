package com.interview;

class SuperClass{  
    public SuperClass(){  
    	super();
        System.out.println("SuperClass of constructor");  
        m();  
    }  
    public void m(){  
        System.out.println("SuperClass.m()");  
    }  
}  
public class SubClassTest extends SuperClass {  
    private int i = 10;  
    public SubClassTest(){
    	System.out.println(i);
        System.out.println("SubClass of constructor");  
        super.m();  
        m();  
    }  
    public void m(){  
        System.out.println("SubClass.m(): i = " + i);  
    }  
    public static void main(String[] args){  
    	for(int i=0;i<10;i++){
    		if(i==2){
    			break;
    		}
    		System.out.println(i);
    	}
    	
    	//SubClassTest t = new SubClassTest();  
    }  
}  
