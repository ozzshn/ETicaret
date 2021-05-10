package core.concretes;

import core.abstracts.LoggerService;
import loginGoogle.GoogleManager;

public class GLoggerManagerAdapter implements LoggerService{

	@Override
	public void logToSystem() {
		GoogleManager googleManager= new GoogleManager();
		googleManager.register();
		
		
	}
}
