package com.zyj.spring.autowireTest;

import org.springframework.stereotype.Component;

@Component
public class DoctorImpl implements IDoctor {
	@Override
	public void test() {
		System.out.println("doctor test");
	}
}
