
public class Lavadora {

	private String modelo;
	private int capacidad;
	private int consumo;
	private int precio;
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

}

