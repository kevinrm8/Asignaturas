package EjCafetera;

public class Cafetera {

		private int capacidad_maxima;
		static int cantidad_actual=0;
		
		public Cafetera(int capacidad_caf) {
			capacidad_maxima = capacidad_caf;
			
		}
		
		public void llenar_cafetera(int llenar) {
			cantidad_actual = llenar;
			System.out.println("La cafetera tiene "+capacidad_maxima+", hay disponibles "+cantidad_actual);
		
		}
		
		public void servir_taza(int cafe_servido) {
			if(cantidad_actual==0) {
				System.out.println("La cafetera esta vacia");
			} else {
				if(cafe_servido>cantidad_actual) {
					System.out.println("Solo se puede servir "+cantidad_actual);
					cantidad_actual = 0;
					} else 
					{
						cantidad_actual -= cafe_servido;
						System.out.println("Servimos una taza de "+cafe_servido+"cl. y quedan en la cafetera  "+cantidad_actual);
						}
				}	
			}
		
		public void vaciar_cafetera() {
			cantidad_actual =0;
			System.out.println("Cafetera vacia");
		}
		
		public void agregar_cafe(int cantidad) {
			
			if((cantidad_actual+cantidad)>capacidad_maxima) {
				System.out.println("la cantidad actual es de "+cantidad_actual+ "cl. en una cafetera de "+capacidad_maxima+"cl. No se puede agregar "+cantidad+"cl. porque desbordaria al cafetera.");
			}else {
				System.out.println("Agregamos "+cantidad+"cl. y quedan en la cafetera "+(cantidad_actual+cantidad));
				cantidad_actual += cantidad;
			}
		}
		
		}
