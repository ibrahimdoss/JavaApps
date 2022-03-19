package business.concretes;

import business.abstracts.Logger;

public class FileLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("File loglandý : " + message);
		
	}

}
