import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Ej87 {

	public static void main(String[] args) {
		
		int tam,suma,media,maximo,minimo,numero=0;
				
		ArrayList<Integer> Numeros = new ArrayList();
		
		tam = ThreadLocalRandom.current().nextInt(10,20);
		
		for(int i=0;i<tam;i++) {
			Numeros.add(ThreadLocalRandom.current().nextInt(0,100+1));
		}
		suma = 0;
		media=0;
		maximo=0;
		minimo=0;
		
//		for(int i=0;i<tam;i++) {
//			suma += Numeros.get(i);
//			maximo=Numeros.get(0);
//			minimo=Numeros.get(0);
//				if(maximo<Numeros.get(i))
//					maximo = Numeros.get(i);
//				if(minimo>Numeros.get(i))
//					minimo = Numeros.get(i);
//		}
//		
//		media = suma/tam;
		
		Iterator<Integer> recorrer = Numeros.iterator();
		maximo=Numeros.get(0);
		minimo=Numeros.get(0);
		
		while( recorrer.hasNext()) {
			numero = recorrer.next();
			
			suma += numero;
			
				if(maximo<numero)
					maximo = numero;
				if(minimo>numero)
					minimo = numero;
		}
		media = suma/tam;
		
		
		System.out.println(Numeros);
		System.out.println("Suma: "+suma+" ,Media: "+media+" ,Maximo: "+maximo+ " ,Minimo: "+minimo);

	}

}
