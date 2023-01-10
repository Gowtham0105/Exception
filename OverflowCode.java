package exceptionhandle;

public class OverflowCode {
	public void findA() {
		findB();
	}
	public void findB() {
		findA();
	}

}
