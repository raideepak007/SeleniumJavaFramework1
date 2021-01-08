package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
	
	public static Logger logger = LogManager.getLogger(Log4jDemo.class);
	
	public static void main(String[] args) {
		
		System.out.println("\n  Hello World...!   \n");
		
		logger.trace("This is trace msg");
		logger.info("This is info msg");
		logger.error("This is an error msg");
		logger.warn("This is warning msg");
		logger.fatal("This is fatal msg");
		
		System.out.println("\n  Completed");
	}

}
