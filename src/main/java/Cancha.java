import java.util.*;

public class Cancha {

	private Collection<Partido> partidos;
	private String tipoDeSuperficie;
	private String capacidadEspectadores;
	private String ubicacion;

	public Cancha(String capacidadEspectadores, String tipoDeSuperficie, String ubicacion) {
		this.capacidadEspectadores = capacidadEspectadores;
		this.partidos = new ArrayList<>();
		this.tipoDeSuperficie = tipoDeSuperficie;
		this.ubicacion = ubicacion;
	}


	/**
	 *
	 * @param partido
	 */
	public boolean crearPartido(Partido partido) {
          if(partido.getCancha() == null){
			  partido.setCancha(this);
			  return true;
		  }
		  return false;
	}
	/**
	 * 
	 * @param partido
	 */
	public boolean reservarCancha(Partido partido) {
		for (Partido match : partidos) {
			if (match.getFecha().equals(partido.getFecha())) {
				return false;
			}
		}
		partidos.add(partido);
		return true;
	}
	/**
	 * 
	 * @param fecha
	 */
	public boolean consultarDisponibilidad(String fecha) {
		for (Partido partido : partidos) {
			if (partido.getFecha().equals(fecha)) {
				return false;
			}
		}
		return true;
	}

	public String getCapacidadEspectadores() {
		return capacidadEspectadores;
	}

	public void setCapacidadEspectadores(String capacidadEspectadores) {
		this.capacidadEspectadores = capacidadEspectadores;
	}

	public Collection<Partido> getPartidos() {
		return partidos;
	}

	public void setPartidos(Collection<Partido> partidos) {
		this.partidos = partidos;
	}

	public String getTipoDeSuperficie() {
		return tipoDeSuperficie;
	}

	public void setTipoDeSuperficie(String tipoDeSuperficie) {
		this.tipoDeSuperficie = tipoDeSuperficie;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
}