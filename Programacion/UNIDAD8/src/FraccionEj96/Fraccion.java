package FraccionEj96;

public class Fraccion {
	
	private int numerador;
	private int denominador;

	
	
	public Fraccion(int numerador,int denominador) {
		this.numerador=numerador;
		this.denominador=denominador;
	}
	public int GetNum() {
		return numerador;
	}
	public int GetDeno() {
		return denominador;
	}
	
	public String Escribir() {
		return numerador+"/"+denominador;
	}
	
	public Fraccion multiplicar(Fraccion f) {
	return new Fraccion(numerador*f.GetNum(),denominador*f.GetDeno());
	}
	
	public Fraccion division(Fraccion f) {
		return new Fraccion(numerador*f.GetDeno(),denominador*f.GetNum());
	}

	public Fraccion Invertir() {
		return new Fraccion(denominador,numerador);
	}
	
	
	
	
	public Fraccion Sumar(Fraccion f) {
		int num1,num2,num,mcm=0,mcd=0,i;
		
		num1 = denominador;
		num2 = f.GetDeno();
		num = numerador + f.GetNum();
        mcm=1;
        i=2;
        
        while(i <= num1 && i <= num2)
        {

            if(num1%i==0 || num2%i==0)
            {
            mcm=mcm*i;
            if(num1%i==0) 
            	num1=num1/i;
            if(num2%i==0) 
            	num2=num2/i;
            }
            else
                i=i+1;               
        }                        
                 
	
		return new Fraccion(num,mcm);
	}
}
