import java.util.*;

public class Club {

	private Collection<Deporte> deportes;
	private Collection<Cancha> canchas;
	private Collection<Deportista> deportistas;
	private Collection<Entrenador> entrenadores;

	public Club() {
		this.deportes = new ArrayList<>();
		this.canchas = new ArrayList<>();
		this.deportistas = new ArrayList<>();
		this.entrenadores = new ArrayList<>();
	}

	/**
	 * 
	 * @param cancha
	 */
	public boolean agregarCancha(Cancha cancha) {
		if(cancha.getUbicacion() != null){
			canchas.add(cancha);
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @param deporte
	 */
	public boolean agregarDeporte(Deporte deporte) {
		if(deporte.getNombre() != null){
			deportes.add(deporte);
			return true;
		}return false;
	}


	public boolean registrarDeportista(String nombre, String apellido, String deporte, String contacto) {
		for(Deportista player: deportistas){
			if(player.getNombre().equals(nombre) && player.getApellido().equals(apellido)){
				return false;
			}
		}
		Deportista deportista = new Deportista(nombre,apellido,contacto,deporte);
		deportistas.add(deportista);
		return true;
	}

	public boolean registrarEntrenador(String nombre, String experiencia, String deporte) {
		for(Entrenador trainer: entrenadores){
			if(trainer.getNombre().equals(nombre) && trainer.getDeporte().equals(deporte)){
				return false;
			}
		}
		Entrenador entrenador = new Entrenador(nombre,experiencia,deporte);
		entrenadores.add(entrenador);
		return true;
	}



}