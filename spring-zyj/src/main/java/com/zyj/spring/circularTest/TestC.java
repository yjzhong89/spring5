package com.zyj.spring.circularTest;

public class TestC {
	private TestA testA;

	public TestC(TestA testA) {
		this.testA = testA;
	}

	public TestA getTestA() {
		return testA;
	}

	public void setTestA(TestA testA) {
		this.testA = testA;
	}
}
