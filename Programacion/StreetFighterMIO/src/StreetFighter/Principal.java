package StreetFighter;

public class Principal {

	public static void main(String[] args) {

		
		Luchador J1 = new Luchador("Ken");
		Luchador J2 = new Luchador("Ryu");
		Luchador J3 = new Luchador("Mr Bison");
				
		Escenario e1 = new Escenario("El templo de Pekin",J1,J2);
		Luchador ganador = e1.Pelea();
		Escenario e2 = new Escenario("El paraiso de Bisbon",ganador,J3);
		Luchador ganador2 = e2.Pelea();
	}

}
