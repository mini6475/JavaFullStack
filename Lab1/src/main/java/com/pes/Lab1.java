package com.pes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab1 {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("pes.xml");
		System.out.println("Spring container ready");
		//A a=(A) ctx.getBean("aobj");
		//A b=(A) ctx.getBean("aobj");
		//System.out.println(a==b);
		//a.show();
		//b.show();
		//B c=(B) ctx.getBean("bobj");
		//c.show();
		Hello h1=(Hello) ctx.getBean("Hello");
	}

}