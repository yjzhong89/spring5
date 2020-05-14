package com.zyj.spring.postConstructTest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PostConstructTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	}
}
