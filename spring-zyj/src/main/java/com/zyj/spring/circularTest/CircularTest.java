package com.zyj.spring.circularTest;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CircularTest {
	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("circularTest.xml");
	}
}
