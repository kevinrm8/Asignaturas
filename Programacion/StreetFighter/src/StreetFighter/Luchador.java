package StreetFighter;

public class Luchador {
	
	private int vida;
	private int victoria=0;
	private String nombre;
	
	public Luchador(String nombre) {
		vida = 100;
		victoria=0;
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	public int getVida() {
		return vida;
	}
	public int setVida(int x) {
		return vida = x;
	}
	public int getVictoria() {
		return victoria;
	}
	public int sumarVictoria(int x) {
		return victoria += x;
	}
	public int setVictoria(int x) {
		return victoria = x;
	}

	
	
	public int golpea(Luchador J) { // Intensidad con la que se golpea
		int golpe = Random();
		if(J.getVida()<golpe)
			J.setVida(0);
		else J.setVida(J.getVida()-golpe);
		return golpe;
	}
	
	public int Random() { // NUMERO RANDOM
		int N = (int) (Math.random()*50+1);
		
		return N;
	}
	
}