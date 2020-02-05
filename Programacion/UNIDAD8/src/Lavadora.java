import java.util.Random;

public class Lavadora {

	private String modelo;
	private int capacidad;
	private int consumo;
	private int precio;
	private String color;
	static int num_lav=0;
	
	public Lavadora(String mod_lav, int cap, int cons, int prec) {
		modelo = mod_lav;
		capacidad = cap;
		consumo = cons;
		precio = prec;
		num_lav++;
	}
	
	
	public void encender_lavadora() {
		System.out.println("Encendemos la lavadora de "+modelo+" que tiene"
		+ " "+capacidad+" de capacidad, consume "+consumo+" W y tiene un precio de "+precio+" €.");
		
	}
	
	public void centrifugar() {
		System.out.println("Centrifugando");
		
	}
	
	public void ObtenerColor(String colorLav) {
		Random r = new Random();
		int n= r.nextInt(3)+1;
		
		switch (n) {
		case 1: colorLav = "blanco";
		color = colorLav;
		break;
		case 2: colorLav = "Rosa"; 
		color = colorLav;
		break;
		case 3: colorLav = "Verde"; 
		color = colorLav;
		break;
		
		}
		System.out.println("El color de su lavadora sera: "+color);
		
		
	}
	
	
	
	
	
	public String get_modelo() {
		return modelo;
	}
	public void set_modelo(String Xmodelo) {
		modelo = Xmodelo;
	}
}

