package com.zyj.spring.autowireTest;

import org.springframework.stereotype.Component;

@Component
public class Scientist implements IScientist {
	@Override
	public void test() {
		System.out.println("scientist test");
	}
}
