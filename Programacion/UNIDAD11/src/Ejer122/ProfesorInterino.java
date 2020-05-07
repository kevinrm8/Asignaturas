package Ejer122;

public class ProfesorInterino extends Profesor{
	
	private String Tipo_baja;
	private int duracion;

	public ProfesorInterino(String Nombre, String DNI, String lugar_de_residencia, int Edad, int Sueldo, String Centro,
			String Lugar_trabajo, String Tipo_baja, int duracion) {
		super(Nombre, DNI, lugar_de_residencia, Edad, Sueldo, Centro, Lugar_trabajo);
		
		this.Tipo_baja = Tipo_baja;
		this.duracion = duracion;
	
	}
	
	public double  MesesBaja(int duracion) {

		double meses;
		meses = duracion/30;
		return meses;
	}

}
