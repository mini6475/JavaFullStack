package com.pes;

public class Hello {
	 private A aobj;
	 private B bobj;
	 public void setAobj(A aobj){
	 	System.out.println("Hello-setAobj");
	 	this.aobj=aobj;
	 }
	 public Hello() {
	 	super();
	 	System.out.println("Hello-1 no-arg");
	 	
	 }
	 public Hello(B bobj) {
	 	super();
	 	System.out.println("Hello-2 arg");
	 	this.bobj = bobj;
	 }

	 public void show(){
	 	System.out.println("show in Hello");
	 	
	 	aobj.showA();
	 	bobj.showB();
	 }
	}


