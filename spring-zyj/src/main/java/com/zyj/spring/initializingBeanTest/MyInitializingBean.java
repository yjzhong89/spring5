package com.zyj.spring.initializingBeanTest;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class MyInitializingBean implements InitializingBean {
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("---------------");
	}

	@PostConstruct
	public void test() {
		System.out.println("post construct");
	}
}
