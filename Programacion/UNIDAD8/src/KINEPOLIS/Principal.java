package KINEPOLIS;

import java.util.*;

public class Principal {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int opc,cant,anyadir,edad,info;
		String nombre;
		

		
		System.out.println("Bienvenido a Kinepolis, ¿de cuantas salas dispone tu cine?");
		cant = scanner.nextInt();
		
		HashMap<Integer,Queue> Sala = new HashMap<Integer,Queue>();
		
		for(int i=0;i<cant;i++) {
			Queue<Cliente> ColaCine = new LinkedList<Cliente>();
			Sala.put(i,ColaCine);
		}
		
		System.out.println("---- Menu KINEPOLIS ----");
		do {
			System.out.println("1-Encolar cliente en una sala");
			System.out.println("2-Desencolar cliente en una sala");
			System.out.println("3-Informacion de una sala");
			System.out.println("Estado del cine");
			System.out.println("5-Salir");
			opc = scanner.nextInt();scanner.nextLine();
			
		switch(opc) {
			case 1: 
				System.out.println("Sala donde añadir personas:");
				anyadir = scanner.nextInt();scanner.nextLine();	
									
					System.out.println("Nombre: ");
					nombre = scanner.nextLine();
					System.out.println("Edad: ");
					edad = scanner.nextInt();

					
					//Sala.get(anyadir).add(new Cliente(nombre,edad));

			
							
				break;
			case 2: 
				break;
			case 3: 
				System.out.println("Informacion de la sala: ");
				info = scanner.nextInt();scanner.nextLine();
				
				Queue c1 = Sala.get(info);
				Iterator iter = c1.iterator();
				while (iter.hasNext()) {
						Cliente cli1 = (Cliente)iter.next();
						System.out.println(cli1.getNombre());
				}
				System.out.println();
				
				break;
			case 4: 
				break;
			case 5: 
				break;

		}	
	
		}while(opc!=5);
			
		
	}





}
