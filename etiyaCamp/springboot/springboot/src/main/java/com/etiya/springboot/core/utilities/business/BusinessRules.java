package com.etiya.springboot.core.utilities.business;

import com.etiya.springboot.core.utilities.results.Result;

public class BusinessRules {
	
	public static Result run(Result... logics) {
		
			for (Result logic : logics) {
				
				if (!logic.isSuccess()) {
					return logic;
				}
			}
			
			return null;
	}
}
