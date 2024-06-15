package com.pes;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab1 {
public static void main(String[] args) {
	ApplicationContext ctx= new AnnotationConfigApplicationContext(MyConfig.class);
	A a= (A) ctx.getBean("Farooq");
	a.showA();
	A a1=(A) ctx.getBean("Farooq2");
	a1.showA();
    //B b= (B) ctx.getBean("Aqib");
	//b.showB();
	Hello c= (Hello) ctx.getBean("Asif");
	c.show();
	
	
}
}