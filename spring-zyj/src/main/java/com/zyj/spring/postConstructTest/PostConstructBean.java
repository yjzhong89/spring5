package com.zyj.spring.postConstructTest;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class PostConstructBean {

	@PostConstruct
	public void test() {
		System.out.println("PostConstructBean");
	}
}
