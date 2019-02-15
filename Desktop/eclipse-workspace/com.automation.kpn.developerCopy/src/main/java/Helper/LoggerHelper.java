package Helper;

import org.apache.log4j.Logger;



public class LoggerHelper {
	
			private static boolean root=false;
		
		public static Logger getLogger(Class cls){
			
			if(root){
				return Logger.getLogger(cls);
			}
			
			root = true;
			return Logger.getLogger(cls);
		}
		
		public static void main(String[] args) {
			Logger log = LoggerHelper.getLogger(LoggerHelper.class);
			log.info("logger is configured");
			log.info("logger is configured");
			log.info("logger is configured");
			
		}
	}


