
package model;

/**
 * Clase Usuario
 * 
 * Contiene información de cada Usuario
 * 
 * 
 * @author Sisa Romero
 *
 */

import java.util.Date;


public class Usuario {
	
		// --------------------
		// Constructores
		// --------------------
	
		/**
		 * Id de Usuario
		 */
		public int idUsuario;
		/**
		 * Nombre de Usuario
		 */
		public String nombreUsuario;
		/**
		 * Apellido de Usuario
		 */
		public String apellidoUsuario;
		/**
		 * FechaNacimiento de Usuario
		 */
		public Date fechaNacimiento;
		/**
		 * Fecha de registro de Usuario
		 */
		public Date fechaRegistro;
		
		// --------------------
		// Constructores
		// --------------------
		
		/**
		 * Constructor por defecto
		 */
		public Usuario() {
			super();		
		}
		
		/**
		 * Constructor con 5 parametros
		 * 
		 * @param idUsuario
		 *            id del usuario
		 * @param nombreUsuario
		 *            nombre del usuario
		 * @param apellidoUsuario
		 *            apellido del usuario
		 * @param fechaNacimiento
		 *            fecha de nacimiento del usuario
		 * @param fechaRegistro
		 *            fecha registro del usuario            
		 */		
		public Usuario(int idUsuario, String nombreUsuario, String apellidoUsuario, Date fechaNacimiento,
				Date fechaRegistro) {
			super();
			this.idUsuario = idUsuario;
			this.nombreUsuario = nombreUsuario;
			this.apellidoUsuario = apellidoUsuario;
			this.fechaNacimiento = fechaNacimiento;
			this.fechaRegistro = fechaRegistro;
		}
	
		/**
		 * Constructor con 4 parametros
		 * 
		 * @param nombreUsuario
		 *            nombre del usuario
		 * @param apellidoUsuario
		 *            apellido del usuario
		 * @param fechaNacimiento
		 *            fecha de nacimiento del usuario
		 * @param fechaRegistro
		 *            fecha registro del usuario            
		 */	
		
		public Usuario(String nombreUsuario, String apellidoUsuario, Date fechaNacimiento,
				Date fechaRegistro) {
			super();
		
			this.nombreUsuario = nombreUsuario;
			this.apellidoUsuario = apellidoUsuario;
			this.fechaNacimiento = fechaNacimiento;
			this.fechaRegistro = fechaRegistro;
		}
		
		
		public int getIdUsuario() {
			return idUsuario;
		}
		public void setIdUsuario(int idUsuario) {
			this.idUsuario = idUsuario;
		}
		public String getNombreUsuario() {
			return nombreUsuario;
		}
		public void setNombreUsuario(String nombreUsuario) {
			this.nombreUsuario = nombreUsuario;
		}
		public String getApellidoUsuario() {
			return apellidoUsuario;
		}
		public void setApellidoUsuario(String apellidoUsuario) {
			this.apellidoUsuario = apellidoUsuario;
		}
		public Date getFechaNacimiento() {
			return fechaNacimiento;
		}
		public void setFechaNacimiento(Date fechaNacimiento) {
			this.fechaNacimiento = fechaNacimiento;
		}
		public Date getFechaRegistro() {
			return fechaRegistro;
		}
		public void setFechaRegistro(Date fechaRegistro) {
			this.fechaRegistro = fechaRegistro;
		}

		@Override
		public String toString() {
			return "Usuario [idUsuario=" + idUsuario + ", nombreUsuario=" + nombreUsuario + ", apellidoUsuario="
					+ apellidoUsuario + ", fechaNacimiento=" + fechaNacimiento + ", fechaRegistro=" + fechaRegistro
					+ "]\n";
		}
		
		
	
	

}
