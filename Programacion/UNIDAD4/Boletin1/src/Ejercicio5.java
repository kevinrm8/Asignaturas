
enum dias{Lunes,Martes,Miercoles,Jueves,Viernes,Sabado,Domingo};

public class Ejercicio5 {
	/* Nombre: Kevin
	 * Fecha:02/10/19
	 * Descripcion: Primeros programas
	 * */

	public static void main(String[] args) { // Para gastar el comando "enum" tenemos que declararlo fuera del class 
		
System.out.println("Odio los "+dias.Lunes+"."); // Gastamos el comando enum, nombrando la variable y la posicion que queremos mostrar
System.out.println("Los "+dias.Martes+" paso de la fase de negación a la fase de aceptación.");
System.out.println("Cuando es "+dias.Miercoles+" pienso que ya vamos por la mitad de la semana");
System.out.println("El previo del Viernes, el "+dias.Jueves+", es mi día favorito de la semana.");
System.out.println("El "+dias.Viernes+"  suelo quedar con mis amigos para cenar");
System.out.println("Los "+dias.Sabado+" me levanto tarde y siempre desayuno tortitas.");
System.out.println("Me deprimen los "+dias.Domingo+" porque pienso que mañana es "+dias.Lunes);

	}

}
