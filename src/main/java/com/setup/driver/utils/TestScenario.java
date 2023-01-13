package com.setup.driver.utils;
public enum TestScenario {
		
	T1("Valid Credential"),
	T2("Valid Credentian with ignore letter case"),
	T3("Invalid username "),
	T4("Invalid Password"),
	T5("Null username"),
	T6("Null password");
	
	
	
	private String testName;
	
	TestScenario(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
