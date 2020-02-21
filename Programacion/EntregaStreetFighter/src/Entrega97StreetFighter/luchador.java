package Entrega97StreetFighter;

public class luchador {

	private String nombre;
	private int vida;
	private int victoria;
	
	public boolean semifinal=true;

	
	public luchador(String nombre){
		this.nombre = nombre;
		vida = 100;
		victoria = 0;
	}
	
	
	public  String getNombre() {
		return nombre;
	}
	
	
	
	public luchador Pelea(luchador J1,luchador J2) throws InterruptedException {
		int golpe;
		int round=1;
		J1.victoria=0;
		J2.victoria=0;
		round=1;
		do {
		System.out.println("ROUND "+round+"... FIGHT!!!");
		J1.vida=100;// Reset vidas a 100
		J2.vida=100;

		
		while(J1.vida>0 || J2.vida>0) {
			
			golpe= Golpe(); // Aleatorio
			J2.vida -= golpe; 
			
			if(J2.vida<=0)  // Resto la vida
				J2.vida=0;
			
			 Thread.sleep(1000);// DEJAR 1 SEGUNDO 
			System.out.println(J1.nombre+" golpea a "+J2.getNombre()+" con "+golpe+"\t\t"+J1.nombre+": "+J1.vida+" - "+J2.nombre+": "+J2.vida);
			
			if(J2.vida ==0) {
				J1.victoria++; // Sumo victoria de la ronda
				System.out.println("Ganador de la ronda: "+J1.nombre);
				break;
			}

			golpe= Golpe(); // Aleatorio
			J1.vida -= golpe; 
			
			if(J1.vida<=0)
				J1.vida=0;
			
			 Thread.sleep(1000);// DEJAR 1 SEGUNDO 
			System.out.println(J2.getNombre()+" golpea a "+J1.nombre+" con "+golpe+"\t\t"+J1.nombre+": "+J1.vida+" - "+J2.nombre+": "+J2.vida);
			
			if(J1.vida==0) {
				J2.victoria++;
				System.out.println("Ganador de la ronda: "+J2.nombre);
				break;
			}
		
		}
		round++;
		if(J1.victoria ==2) { // Si lleva 2 rondas gana
			System.out.println("Ganador de la pelea es: "+J1.nombre);
			if(semifinal)
				System.out.println(J1.nombre+": "+J2.nombre+", no vales ni para ser YouTuber");
			if(!semifinal) {
				System.out.println(J1.nombre+": "+J2.nombre+", pensaba que eras mas fuerte coleguilla");
			}
			semifinal = false;
			return J1;
			}
		
		if(J2.victoria==2) {
			System.out.println("Ganador de la pelea es: "+J2.nombre);
			if(semifinal)
				System.out.println(J2.nombre+": "+J1.nombre+", no vales ni para ser YouTuber");
			if(!semifinal) {
				System.out.println(J2.nombre+": "+J1.nombre+", pensaba que eras mas fuerte coleguilla");
			}
			semifinal = false;
			return J2;
			}
		
		}while(J1.victoria<2 || J2.victoria<2);
		
		return null;
	
	}
	
	public static int Golpe() {// Para saber cuanta vida quitas de forma aleatoria entre 1 y 50
		int golpe;
	
		golpe = (int) (Math.random()*50+1);
			
	return golpe;
	}

	
}
