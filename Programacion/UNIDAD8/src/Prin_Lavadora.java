
public class Prin_Lavadora {

	public static void main(String[] args) {
		
		
		Lavadora lavadora1 = new Lavadora("Xiaomi",500,100,999);
		lavadora1.encender_lavadora();
		
		Lavadora lavadora2 = new Lavadora("Xiaomi",500,100,999);
		lavadora2.encender_lavadora();
		
		
		lavadora1.centrifugar();
		
		System.out.println("Tenemos un total de: "+Lavadora.num_lav);
	}

}


