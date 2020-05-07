
public class Pelicula extends Contenido {


	private int Oscars_nomin;
	private int Oscars_ganados;
	
	public Pelicula(String titulo, String productora, int anyo,int oscars_nomin,int oscars_ganados) {
		super(titulo, productora, anyo);
		Oscars_nomin = oscars_nomin;
		Oscars_ganados=oscars_ganados;
	}

	public int getOscars_nomin() {
		return Oscars_nomin;
	}

	public void setOscars_nomin(int oscars_nomin) {
		Oscars_nomin = oscars_nomin;
	}

	public int getOscars_ganados() {
		return Oscars_ganados;
	}

	public void setOscars_ganados(int oscars_ganados) {
		Oscars_ganados = oscars_ganados;
	}
	
	
}
