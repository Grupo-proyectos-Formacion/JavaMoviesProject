package model;

import java.util.Date;

public class Usuario {
		
		public int idUsuario;
		public String nombreUsuario;
		public String apellidoUsuario;
		public Date fechaNacimiento;
		public Date fechaRegistro;
		
		public Usuario() {
			
			
			
		}
			
		public Usuario(int idUsuario, String nombreUsuario, String apellidoUsuario, Date fechaNacimiento,
				Date fechaRegistro) {
			super();
			this.idUsuario = idUsuario;
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
					+ "]";
		}
		
		
	
	

}
