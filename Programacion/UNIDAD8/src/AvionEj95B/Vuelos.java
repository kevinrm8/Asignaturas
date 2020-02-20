package AvionEj95B;

import java.text.*;
import java.util.*;

public class Vuelos {
	
		public static int contador=0;
		public static int tiempo;
		
		private String origen;
		private String destino;
		private String FechaSalida; // dia_ida
		private String FechaVuelta; // dia_vuelta
		private String estado;
		private String HoraSalida;
		private String HoraVuelta;
		
		private String TSalida;
		private String TVuelta;
		
		private SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		private Date Salida;
		private Date Vuelta;
		
		private int id;

		
		public Vuelos(String origen,String destino,String FechaSalida,String HoraSalida,String FechaVuelta,String HoraVuelta) throws Exception {
			
			this.origen = origen;
			this.destino = destino;
			//this.dia_ida = dia_ida;
			//this.dia_vuelta = dia_vuelta;
			estado="";
			
			contador++;
			id=contador; 
			
			this.FechaSalida = FechaSalida;
			this.FechaVuelta = FechaVuelta;
			this.HoraSalida = HoraSalida;
			this.HoraVuelta = HoraVuelta;
			TSalida = FechaSalida +" "+HoraSalida;
			TVuelta = FechaVuelta +" "+HoraVuelta;
			Salida = formato.parse(TSalida);
			Vuelta = formato.parse(TVuelta);
		
		}
		
		public void MostrarVuelos(String op) {
			if(op.equals("V")) {
				if(estado.equals("")) 
					System.out.println(id+":"+origen+"-"+destino+" IDA:"+Salida+" VUELTA: "+Vuelta);	
				}
			
			if(op.equals("C")) {
				if(estado.equals("CANCELADO")) {
					System.out.println(id+":"+origen+"-"+destino+" IDA:"+Salida+" VUELTA: "+Vuelta+" "+estado );
				}
			}
			if(op.equals("T")) 
					System.out.println(id+":"+origen+"-"+destino+" IDA: "+Salida+" VUELTA: "+Vuelta+" "+estado);
		
		}
		
		public void cancelar() {
			estado = "CANCELADO";
		}
		
		public int Estancia(){
			int tiempo;
			
			tiempo = (int) ((Vuelta.getTime()-Salida.getTime())/86400000);
			
			return tiempo;
		}
			
}
