package com.zyj.spring.beanTest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		TestBean testBean = (TestBean) context.getBean("testBean");
		System.out.println(testBean.getName());


//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//		context.register(AppConfig.class);
//		context.refresh();
//		TestBean testBean = (TestBean) context.getBean("testBean");
//		System.out.println(testBean.getName());
	}
}
