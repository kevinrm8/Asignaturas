import java.util.*;

public class Prin_Lavadora {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String color;
		
		ArrayList<Lavadora> lista_lav = new ArrayList<Lavadora>();
		
		Lavadora lav;
		
		Lavadora lavadora1 = new Lavadora("SAMSUNG",500,100,999);
		// lavadora1.encender_lavadora();
		
		Lavadora lavadora2 = new Lavadora("SONY",500,100,999);
		// lavadora2.encender_lavadora();
		
		lista_lav.add(lavadora1);
		lista_lav.add(lavadora2);
		
		//Mostramos el encendender lavadora con el iterator, gastando una arraylist
		Iterator iter = lista_lav.iterator();
		while(iter.hasNext()) {
			lav = (Lavadora)iter.next();
			lav.encender_lavadora();
		}
		lavadora1.centrifugar();
		
		//System.out.println("Tenemos un total de: "+Lavadora.num_lav);
	
		System.out.println("Quieres especificar un color para la lavadora?Indique cual:");
		color = scanner.nextLine();
		color = color.toLowerCase();
		
			if (color.equals("no")) {
				lavadora1.ObtenerColor(color);
				
			}else System.out.println("Ha elegido el color: "+color);

		
		String mimodelo ="Mejor comprate un XIAOMI que tiene la mejor calidad-precio del mercado";
		lavadora1.set_modelo(mimodelo);
	
		System.out.println(lavadora1.get_modelo());
	}

}


