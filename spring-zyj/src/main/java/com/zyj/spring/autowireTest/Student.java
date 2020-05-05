package com.zyj.spring.autowireTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Autowired
	ITeacher iTeacher;

	void test() {
		iTeacher.test();
	}
}
