package Entrega97StreetFighter;

import java.util.*;

/* Nombre: Kevin
 * Entrega dia 19/02/2020
 * */
public class Principal {

	public static void main(String[] args) throws InterruptedException {
		//Creo los luchadores

		luchador J1 = new luchador("Ken");
		luchador J2 = new luchador("Ryu");
		luchador J3 = new luchador("Mr Bison");
		
		Escenario Esc = new Escenario("El Templo de Pekin");
		//Empieza la pelea
		System.out.println("Comienza la pelea entre "+J1.getNombre()+" y "+J2.getNombre()+" en "+Esc.getNombreEsc());
		luchador ganador = J1.Pelea(J1,J2); // Ganador lo guardo en ganador
		
		Escenario Esc2 = new Escenario("Bison Mansion");
		// El ganador de la anterior pelea se enfrenta a Mr Bison
		System.out.println("Comienza la pelea entre "+ganador.getNombre()+" y "+J3.getNombre()+" en "+Esc.getNombreEsc());
		luchador ganador2 = ganador.Pelea(ganador,J3);

	}


	
}