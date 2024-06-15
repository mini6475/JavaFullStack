package com.pes;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MyConfig {
	@Bean(name = "Farooq")
	
	public A createA() {
		A a = new A();
		a.setA(21);
		a.setMessage("hi how are you");
		return a;
	}
    @Bean(name = "Farooq2")
    public A createA2() {
        A a = new A();
        a.setA(22);
        a.setMessage("I'm good, thanks");
        return a;
    }

	@Bean(name = "Aqib")
	public B createB() {
		
		return new B(21,"I am fine");
	}

	@Bean(name = "Asif")
	public Hello createHello() {
		Hello h=new Hello();
		//h.setAobj(a);
		
		return h;
	}
}