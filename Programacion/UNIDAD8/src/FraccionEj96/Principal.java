package FraccionEj96;

public class Principal {

	public static void main(String[] args) {

		Fraccion f1 = new Fraccion(5,9);
		Fraccion f2 = new Fraccion(2,3);
		Fraccion fmul = f1.multiplicar(f2);
		System.out.println(fmul.Escribir());
		fmul = fmul.Invertir();
		System.out.println(fmul.Escribir());
		Fraccion fdiv = f1.division(f2);
		System.out.println(fdiv.Escribir());
		Fraccion suma = f1.Sumar(f2);
		System.out.println(suma.Escribir());

		
		}
}
