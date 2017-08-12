package com.hashcode;

import java.util.Objects;

public class User {  
    private String name;  
    private int age;  
    private String passport;  
  
    public User(String name, int age, String passport) {
		this.name = name;
		this.age = age;
		this.passport = passport;    	
	}

	//getters and setters, constructor  
  
    @Override  
    public boolean equals(Object o) {  
        if (o == this) return true;  
        if (!(o instanceof User)) {  
            return false;  
        }  
        User user = (User) o;  
        return age == user.age &&  
                Objects.equals(name, user.name) &&  
                Objects.equals(passport, user.passport);  
    }  
  
    @Override  
    public int hashCode() {  
        return Objects.hash(name, age, passport);  
    }  
    
    public static void main(String[] args) {
    	
    	User u = new User("Lian Yue", 31, "1c2lpz");
    	int output = u.hashCode();
    	System.out.println(output);
    	int a =224;
    	int b =224;
    	String s1 = "abc";
    	String s2 = "abc";
    	
    	System.out.println(a==b);
    	System.out.println(s1==s2);
    	
    	User user1 = new User("mkyong", 35, "111222333");
        User user2 = new User("mkyong", 35, "111222333");

        System.out.println(user1.equals(user2)); // true
	}
  
}  
