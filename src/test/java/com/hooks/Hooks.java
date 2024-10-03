package com.hooks;


public class Hooks {
	@io.cucumber.java.Before
	public void beforeMethod() {
		System.out.println("Before Method");
	}

	@io.cucumber.java.After
	public void afterMethod() {
		System.out.println("After Method");
	}
}
