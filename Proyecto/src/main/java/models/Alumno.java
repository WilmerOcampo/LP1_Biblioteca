package models;

public class Alumno {
	public String idalumno;
	public String nombrealumno;
	public String apellidoalumno;
	public String direccion;
	public String telefono;
	public String email;
	public Alumno() {
	}
	public Alumno(String idalumno, String nombrealumno, String apellidoalumno, String direccion, String telefono,
			String email) {
		this.idalumno = idalumno;
		this.nombrealumno = nombrealumno;
		this.apellidoalumno = apellidoalumno;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
	}
	public Alumno(String nombrealumno, String apellidoalumno, String direccion, String telefono, String email) {
		this.nombrealumno = nombrealumno;
		this.apellidoalumno = apellidoalumno;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Alumno [idalumno=" + idalumno + ", nombrealumno=" + nombrealumno + ", apellidoalumno=" + apellidoalumno
				+ ", direccion=" + direccion + ", telefono=" + telefono + ", email=" + email + "]";
	}
	public String getIdalumno() {
		return idalumno;
	}
	public void setIdalumno(String idalumno) {
		this.idalumno = idalumno;
	}
	public String getNombrealumno() {
		return nombrealumno;
	}
	public void setNombrealumno(String nombrealumno) {
		this.nombrealumno = nombrealumno;
	}
	public String getApellidoalumno() {
		return apellidoalumno;
	}
	public void setApellidoalumno(String apellidoalumno) {
		this.apellidoalumno = apellidoalumno;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
