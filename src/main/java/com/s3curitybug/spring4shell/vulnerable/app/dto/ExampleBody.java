package com.s3curitybug.spring4shell.vulnerable.app.dto;

public class ExampleBody {

	private String attribute1;

	private ExampleSubBody attribute2;

	public String getAttribute1() {
		return attribute1;
	}

	public void setAttribute1(String attribute1) {
		this.attribute1 = attribute1;
	}

	public ExampleSubBody getAttribute2() {
		return attribute2;
	}

	public void setAttribute2(ExampleSubBody attribute2) {
		this.attribute2 = attribute2;
	}

}
