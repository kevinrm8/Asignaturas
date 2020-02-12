package PizzaPack;
import PizzaPack.Pizza2.*;

public class Principal {

	public static void main(String[] args) {
		
		Pizza2 p1 = new Pizza2(Tipopizza.Margarita, TamPizza.Mediana);
		System.out.println(p1.estado_pizza());
		
		Pizza2 p2 = new Pizza2(Tipopizza.Hawaiana, TamPizza.Familiar);
		System.out.println(p2.estado_pizza());
		
		System.out.println(Pizza2.totalpedidas);
		
		p1.servir();
		System.out.println(p1.estado_pizza());
		p1.servir();
		
		System.out.println(Pizza2.totalpedidas);
		System.out.println(Pizza2.totalservidas);
		
	}
}