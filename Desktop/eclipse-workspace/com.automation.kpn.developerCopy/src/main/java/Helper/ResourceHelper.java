package Helper;

import org.apache.log4j.Logger;

public class ResourceHelper {
		private static Logger log = Logger.getLogger(ResourceHelper.class);

		public static String getResourcePath(String path) {
			System.out.println(path);
			System.out.println(System.getProperty("user.dir") + path);
	        String basePath = System.getProperty("user.dir");
	        log.info("resource Path:" + basePath +path);
			return basePath +  path;
		}
}
