/**
 * @author Julian Bautista
 */
package utilities;

import java.io.IOException;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerUtility {
	
	static Logger logger = Logger.getLogger("MyLog");
	static FileHandler fh;
	static Date fecha;
	
	
	LoggerUtility() {
		try {  
			fecha = new Date();
		    // This block configure the logger with handler and formatter  
		    fh = new FileHandler("C:/Users/admin/LogsPrueba.log");  
		    logger.addHandler(fh);
		    SimpleFormatter formatter = new SimpleFormatter();  
		    fh.setFormatter(formatter);  

		    // the following statement is used to log any messages  
		    logger.info(getActualDateString() + "Logger creado at");  

		} catch (SecurityException e) {  
		    e.printStackTrace();  
		} catch (IOException e) {  
		    e.printStackTrace();  
		}  
	}
	
	
	private static String getActualDateString() {
		return new Date().toGMTString();
	};
	/**
	 * 
	 * @param message el mensaje a imprimir en el log file
	 * warning es el nivel medio de gravedad
	 */
	public static void logWarning(String message) {
		logger.warning(getActualDateString() +  message);
	}
	/**
	 * 
	 * @param message el mensaje a escribir en el log file
	 * severe es el nivel más alto de gravedad
	 */
	public static void logSevere(String message) {
		logger.severe(getActualDateString() + message);
		
	}
	/**
	 * 
	 * @param message el mensaje a escribir en el log file
	 * fine es el nivel más bajo de gravedad
	 */
	public static void logFine(String message) {
		logger.fine(getActualDateString() +message);
	}
}

