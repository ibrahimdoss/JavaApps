package business.concretes;

import business.abstracts.Logger;

public class DatabaseLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("Database logland� : " + message);
		
	}

}
