import java.util.*;

public class Club {

	private Collection<Deporte> deportes;
	private Collection<Cancha> canchas;

	public Club() {
		this.deportes = new ArrayList<>();
		this.canchas = new ArrayList<>();
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

}