package Demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4jDemo {

	
		private static Logger Logger = LogManager.getLogger(log4jDemo.class);
		public static void main(String[] args) {
			System.out.println("Logger information");
			Logger.info("this is information message");
			Logger.error("this is error message");
			Logger.warn("This is warning message");
			Logger.fatal("This is fatal message");
			
			System.out.println("PRINT LOGGER INFOMATION OR ERROR OR WARN OR FATAL");
		}		

}
