package PizzaPack;

public class Pizza2 {
	
	private String tipo_pizza;
	private String tam_pizza;
	private String estado;
	
	public static int totalpedidas=0;
	public static int totalservidas=0;
	
	// PARA VERIFICAR TIPOS Y TAMAÑO
	
	public enum Tipopizza {
		Margarita,Funghi,CuatroQuesos,Hawaiana
	}
	public enum TamPizza{
		Familiar,Mediana
	}
	
	/*
	public Pizza(String tipo,String tam) {
		tipo_pizza = tipo;
		tam_pizza = tam;
		estado = "Pedida";
		totalpedidas++;
	} */
	
	public Pizza2(Tipopizza tipo,TamPizza tam) {
		tipo_pizza = tipo.toString();
		tam_pizza = tam.toString();
		estado = "Pedida";
		totalpedidas++;
	}
	

	public String estado_pizza() {
		
			return "Pizza de tipo "+tipo_pizza+" y tamaño "+tam_pizza+". Estado: "+estado;
			}
	
	public void servir() {
		if(estado.equals("Servida")) {
			System.out.println("Esta pizza ya se ha servido");
		}else {
			estado = "Servida";
			totalservidas++;
			totalpedidas--;
		}
	}
}