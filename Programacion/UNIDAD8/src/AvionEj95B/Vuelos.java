package AvionEj95B;

public class Vuelos {
	
		public static int contador=0;

		private String origen;
		private String destino;
		private String dia_ida;
		private String dia_vuelta;
		private String estado;
		private int id;

		
		public Vuelos(String origen,String destino,String dia_ida,String dia_vuelta) {
			
			this.origen = origen;
			this.destino = destino;
			this.dia_ida = dia_ida;
			this.dia_vuelta = dia_vuelta;
			estado="";
			
			contador++;
			id=contador; 
		}
		
		public void MostrarVuelos(String op) {
			if(op.equals("V")) {
				if(estado.equals("")) 
					System.out.println(id+":"+origen+"-"+destino+" IDA: dia "+dia_ida+" VUELTA: dia "+dia_vuelta);	
				}
			
			if(op.equals("C")) {
				if(estado.equals("CANCELADO")) {
					System.out.println(id+":"+origen+"-"+destino+" IDA: dia "+dia_ida+" VUELTA: dia "+dia_vuelta+" "+estado);
				}
			}
			if(op.equals("T")) 
					System.out.println(id+":"+origen+"-"+destino+" IDA: dia "+dia_ida+" VUELTA: dia "+dia_vuelta+" "+estado);
		
		}
		
		public void cancelar() {
			estado = "CANCELADO";
		}
			
}
