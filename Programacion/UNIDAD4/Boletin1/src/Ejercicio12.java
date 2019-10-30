
public class Ejercicio12 {
	/* Nombre: Kevin
	 * Fecha:02/10/19
	 * Descripcion: Programa para calcular votos 
	 * */

	public static void main(String[] args) {
int Podemos=6, PSOE=2, Ciudadanos=0, PP=2, VOX=0; // Declramos las variables de los votos de los partidos 
float izquierda=0, derecha=0; // La suma de los partidos de izquierdas y de derechas.

izquierda = Podemos + PSOE;   // Sumamos los votos de la izquierda y la derecha
derecha = Ciudadanos + PP+ VOX;

System.out.println("Los votos de la izquierda son "+izquierda+ " que constituyen el " +(izquierda/(izquierda+derecha)*100)+"% del total y los votos de la derecha son "+derecha+" que constituyen el "+(derecha/(izquierda+derecha))*100+"% del total.");

	}
}
