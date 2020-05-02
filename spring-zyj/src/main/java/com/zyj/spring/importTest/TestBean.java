package com.zyj.spring.importTest;

import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Component
@Import({ImportBean.class})
public class TestBean {
	private String name = "Jimmy";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
