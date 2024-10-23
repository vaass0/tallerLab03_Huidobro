import java.util.*;

public class Equipo {

	private Collection<Deportista> deportistas;

	public Entrenador getEntrenador() {
		return entrenador;
	}

	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}

	private Entrenador entrenador;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private String nombre;

	public Equipo( String nombre) {
		this.deportistas = new ArrayList<>();
		this.nombre = nombre;
	}

	/**
	 * 
	 * @param deportista
	 */
	public boolean agregarDeportista(Deportista deportista) {
		if (deportista.getEquipo() == null){
			deportistas.add(deportista);
			deportista.setEquipo(this);
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @param trainer
	 */
	public boolean agregarEntrenador(Entrenador trainer) {
		if (trainer.getEquipo() == null){
			setEntrenador(trainer);
			trainer.setEquipo(this);
			return true;
		}
		return false;
	}

	public boolean eliminarEntrenador() {
		if(getEntrenador() != null){
			setEntrenador(null);
			return true;
		}
		return false;

	}

	/**
	 * 
	 * @param nombre
	 * @param apellido
	 */
	public boolean eliminarDeportista(String nombre, String apellido) {
		for(Deportista player: deportistas){
			if(player.getNombre().equals(nombre) && player.getApellido().equals(apellido)){
				deportistas.remove(player);
				return true;
			}
		}return false;
	}

}