package com.zyj.spring.aopTest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AOPTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println(context.getBean("genericBean"));
	}
}
