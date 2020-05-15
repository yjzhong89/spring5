package com.zyj.spring.initializingBeanTest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InitializingBeanTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	}
}
