package com.pes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab1 {
public static void main(String[] args) {
	  ApplicationContext ctx=new AnnotationConfigApplicationContext(MyConfig.class);
	   A a=(A) ctx.getBean("project");
	    a.showA();
	    B b=(B) ctx.getBean("Java");
	    b.showB();
	    Hello h=(Hello) ctx.getBean("program");
	    h.show();
	    System.out.println();
		}

}