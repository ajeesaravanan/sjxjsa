package org.demo;

public class Sample {
	public static void main(String[] args) {
		
		String a="java";
		String b= "sql";
		System.out.println("before swaping  "+a+" "+b);
		a=a+b;
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		System.out.println("after swapping "+a+" "+b);
	}

}
