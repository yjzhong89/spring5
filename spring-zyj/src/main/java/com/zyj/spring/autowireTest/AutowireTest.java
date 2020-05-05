package com.zyj.spring.autowireTest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowireTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		context.getBean(Student.class).test();
	}
}
