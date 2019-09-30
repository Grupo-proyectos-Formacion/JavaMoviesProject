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
	    
	    public static int LeerInt(String msg){
	        System.out.println(msg);
	        return LeerInt();
	    }    
	    
	    @SuppressWarnings("resource")
	    public static String LeerTexto(){
	        Scanner teclado=new Scanner(System.in);
	        return teclado.nextLine();
	    }
	    
	    public static String LeerhTexto(String msg){
	        System.out.println(msg);
	        return LeerTexto();
	    }
	    
	    public static Date LeerFecha() {
	        Date date=new Date(); ///CHAPUZA
	        String dateString ;
	        DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
	        Boolean exito;
	        do {
	            try {
	                dateString = LecturaDato.LeerhTexto("\n Dame una fecha con el formato dd-mm-aaaa");
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
