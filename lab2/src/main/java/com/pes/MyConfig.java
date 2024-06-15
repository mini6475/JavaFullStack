package com.pes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
	@Bean(name="project")
public A createA() {
		
	return new A();
}
	@Bean(name="Java")
	public B createB() {
		return new B(21,"hello");
	}
	@Bean(name="program")
	public Hello createHello(A a,B b) {
		Hello h= new Hello(b);
		h.setAobj(a);
		return h;
	}
}




