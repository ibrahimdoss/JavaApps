package com.etiya.springboot.core.utilities.results;

public class SuccessResult extends Result{
		
	public SuccessResult() {
		super(true);
	}
	
	public SuccessResult(String message) {
		super(true,message);
	}
}
