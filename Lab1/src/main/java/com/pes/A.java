package com.pes;

public class A {
 private int a;
 private String message;
 
public int getA() {
	return a;
}
public void setA(int a) {
	this.a = a;
}
public A()
{
	System.out.println("A constructor is executing");
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
 public void showA()
 {
	 System.out.println("A show methods ");
	 System.out.println(a);
	 System.out.println(message);
 }
}