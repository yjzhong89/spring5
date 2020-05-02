package com.zyj.spring.beanTest;

import org.springframework.stereotype.Component;

@Component
public class TestBean {
	private String name = "Jimmy";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
