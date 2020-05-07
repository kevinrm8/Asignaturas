
public class Contenido {

	private String Titulo;
	private String Productora;
	private int Anyo;
	private boolean Visto;
	
	public Contenido(String titulo, String productora, int anyo) {
		Titulo = titulo;
		Productora = productora;
		Anyo = anyo;
		Visto = false;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getProductora() {
		return Productora;
	}

	public void setProductora(String productora) {
		Productora = productora;
	}

	public int getAnyo() {
		return Anyo;
	}

	public void setAnyo(int anyo) {
		Anyo = anyo;
	}

	public boolean isVisto() {
		return Visto;
	}

	public void setVisto(boolean visto) {
		Visto = visto;
	}

	@Override
	public String toString() {
		return Titulo + "|" + Productora + "|" + Anyo + "|" + Visto;
	}
	
	
}
