package com.zyj.spring.autowireTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Student {
	@Autowired
	ITeacher iTeacher;

	IDoctor iDoctor;

	@Resource
	IScientist iScientist;

	public void setIDoctor(IDoctor iDoctor) {
		this.iDoctor = iDoctor;
	}

	void test() {
		iTeacher.test();
	}

	void test1() {
		iDoctor.test();
	}

	void test2() {
		iScientist.test();
	}
}
