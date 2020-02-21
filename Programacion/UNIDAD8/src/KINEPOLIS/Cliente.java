package KINEPOLIS;

public class Cliente {
	String nombre;
	int edad;
	
	public Cliente(String nombre,int edad){
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public String getNombre(){
		return nombre;
	}
	public int getEdad() {
		return edad;
	}

	public void mostrar() {
		System.out.println(nombre+","+edad);
	}
	
}
