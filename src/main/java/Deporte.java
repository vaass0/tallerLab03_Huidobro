import java.util.*;

public class Deporte {

	private Collection<Equipo> equipos;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private String nombre;

	public Deporte( String nombre) {
		this.equipos = new ArrayList<>();
		this.nombre = nombre;
	}

	/**
	 * 
	 * @param equipo
	 */
	public boolean agregarEquipo(Equipo equipo) {
		for(Equipo team : equipos){
			if(team.getNombre().equals(equipo.getNombre())){
				return false;
			}
		}
		equipos.add(equipo);
		return true;
	}

	public boolean eliminarEquipo() {
		Scanner scanner = new Scanner(System.in);
		String nombre;
		System.out.println("Ingrese nombre del equipo: ");
		nombre = scanner.nextLine();
		for(Equipo team : equipos){
			if (team.getNombre().equals(nombre)){
				equipos.remove(team);
				return true;
			}
		}return false;
	}



}