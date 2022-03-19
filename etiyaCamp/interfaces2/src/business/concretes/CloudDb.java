package business.concretes;

import business.abstracts.Logger;

public class CloudDb implements Logger {

	@Override
	public void log(String message) {
		System.out.println("CloudDb loglandý : " + message);
		
	}

}
