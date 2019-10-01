/**
 * @author Luis
 */

package utilities;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LecturaDato {
		
	  /**
	   * @return Devuelve un int introducido por el usuario
	   */
	  @SuppressWarnings("resource")
	    public static int LeerInt(){
	        boolean exito;
	        int salida=0;
	        do {
	            try{
	                salida=  new Scanner(System.in).nextInt();
	                exito=true;
	                }
	            catch(InputMismatchException e) {
	                Writer.escribirPantalla("Por favor, introduce un número entero");
	                exito= false;
	            }
	        }while(!exito);
	        return salida;
	        
	    }
	    
	  /**
	   * 
	   * @param Recibe un String para mostrarlo al usuario
	   * @return Devuelve una llamada al método LeerInt()
	   */
	    public static int LeerInt(String msg){
	        System.out.println(msg);
	        return LeerInt();
	    }    
	    
	    
	    /**
	     * 
	     * @return Devuelve el String introducido por el usuario
	     */
	    @SuppressWarnings("resource")
	    public static String LeerTexto(){
	        Scanner teclado=new Scanner(System.in);
	        return teclado.nextLine();
	    }
	    
	    /**
	     * 
	     * @param Recibe un String para mostrarlo al usuario
	     * @return Devuelve una llamada al método LeerTexto()
	     */
	    public static String LeerhTexto(String msg){
	        System.out.println(msg);
	        return LeerTexto();
	    }
	    
	    /**
	     * 
	     * @return Devuelve una fecha introducida por el usuario
	     */
	    public static Date LeerFecha(String msg) {
	        Date date=new Date(); 
	        String dateString ;
	        DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
	        Boolean exito;
	        do {
	            try {
	                dateString = LecturaDato.LeerhTexto(msg);
	                date = formatter.parse(dateString);
	                exito= true;
	            } catch (ParseException ex) {
	                exito = false;
	                Writer.escribirPantalla("Ha ocurrido un error en al insertar la fecha");
	            }
	        } while (!exito);
	        return date;
	    }

}
