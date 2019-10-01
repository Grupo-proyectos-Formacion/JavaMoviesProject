/**
 * @author Luis
 */

package utilities;
	

public class Writer {
		
	
	
	public static void escribirPantalla(String msg){
		System.out.print("[Pantalla] "+msg+"\n");
	}
		
	public static void escribirPantalla(StringBuilder msg){
		System.out.print("[Pantalla] "+msg+"\n");
	}
	
	public static void escribirLoggerFine(String msg) {
		LoggerUtility.logFine(msg);
	}
	
	public static void escribirLoggerWarning(String msg) {
		LoggerUtility.logWarning(msg);
	}
	
	public static void escribirLoggerSevere(String msg) {
		LoggerUtility.logSevere(msg);
	}

}
	
