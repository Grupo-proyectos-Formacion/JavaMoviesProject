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
		
	/*public static void escribirFichero(Mensaje msg){
		System.out.print("[Fichero] "+msg.getTexto());
	}*/

}
	
