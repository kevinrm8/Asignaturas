
public class Serie extends Contenido {


	private int NTemporadas;
	private boolean Finalizada;
	
	public Serie(String titulo, String productora, int anyo,int ntemporadas,boolean finalizada) {
		super(titulo, productora, anyo);
		NTemporadas=ntemporadas;
		Finalizada = finalizada ;
		
	}

	public int getNTemporadas() {
		return NTemporadas;
	}

	public void setNTemporadas(int nTemporadas) {
		NTemporadas = nTemporadas;
	}

	public boolean isFinalizada() {
		return Finalizada;
	}

	public void setFinalizada(boolean finalizada) {
		Finalizada = finalizada;
	}
	
	
}
