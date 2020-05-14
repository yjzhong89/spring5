package com.zyj.spring.autowireTest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowireTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Student student = context.getBean(Student.class);
		student.test();
		student.test1();
	}
}
