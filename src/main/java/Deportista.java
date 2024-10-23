public class Deportista {

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	public String getDeporte() {
		return deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	private Equipo equipo;
	private String nombre;
	private String apellido;
	private String contacto;
	private String deporte;

	public Deportista(String nombre,String apellido, String contacto, String deporte){
		this.deporte = deporte;
		this.apellido = apellido;
		this.nombre = nombre;
		this.contacto = contacto;
	}
}