package com.zyj.spring.autowireTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Autowired
	ITeacher iTeacher;

	IDoctor iDoctor;

	public void setIDoctor(IDoctor iDoctor) {
		this.iDoctor = iDoctor;
	}

	void test() {
		iTeacher.test();
	}

	void test1() {
		iDoctor.test();
	}
}
