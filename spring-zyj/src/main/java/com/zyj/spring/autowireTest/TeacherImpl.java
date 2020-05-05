package com.zyj.spring.autowireTest;

import org.springframework.stereotype.Component;

@Component
public class TeacherImpl implements ITeacher {
	@Override
	public void test() {
		System.out.println("teacher test");
	}
}
