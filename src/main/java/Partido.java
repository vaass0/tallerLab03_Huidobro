import java.util.*;

public class Partido {

	private Cancha cancha;

	public Cancha getCancha() {
		return cancha;
	}

	public void setCancha(Cancha cancha) {
		this.cancha = cancha;
	}

	public Collection<Equipo> getEquipos() {
		return equipos;
	}

	public void setEquipos(Collection<Equipo> equipos) {
		this.equipos = equipos;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	private Collection<Equipo> equipos;
	private String fecha;
	private String resultado;

	public Partido(Cancha cancha, String fecha, String resultado) {
		this.cancha = cancha;
		this.equipos = new ArrayList<>();
		this.fecha = fecha;
		this.resultado = resultado;
	}
}