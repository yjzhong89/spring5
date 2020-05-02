package com.zyj.spring.importTest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ImportTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		TestBean testBean = (TestBean) context.getBean("testBean");
		System.out.println(testBean.getName());
		ImportBean importTest = context.getBean(ImportBean.class);
		System.out.println(importTest.getName());
	}
}
