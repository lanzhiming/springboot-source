package com.lanzhm.spring.ch2.testscope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		DemoSingletonService s1 = context.getBean(DemoSingletonService.class);
		DemoSingletonService s2 = context.getBean(DemoSingletonService.class);
		System.out.println("s1==s2? "+(s1==s2)+"\n");
		
		DemoPrototypeService p1 = context.getBean(DemoPrototypeService.class);
		DemoPrototypeService p2 = context.getBean(DemoPrototypeService.class);
		System.out.println("p1==p2? "+(p1==p2));
		context.close();
	}

}
