package Ejer125;

public class ListaMultimedia {

	private int tam;
	private Multimedia[] lista;
	
	public ListaMultimedia(int tam) {
		this.tam = tam;
		lista = new Multimedia[tam];
	}
	
	public int size() {
		return lista.length;
	}
	
	public boolean add(Multimedia m) {
		boolean resultado = false;
		for(int i=0;i<lista.length;i++) {
			if(lista[i]==null) {
				lista[i] = m;
				resultado = true;
				break;
			}
		}
		return resultado;
		
	}
	
	public Multimedia get(int posicion) {
		return lista[posicion];
	}
	
	public int indexOf(Multimedia m) {
		int pos=-1;
		for(int i=0;i<lista.length;i++) {
			if(lista[i].equals(m)) {
				pos = i;
			}
		}
		
		return pos;
	}
	
	public String toString() {
		String resultado=" ";
		for(int i=0;i<lista.length;i++) {
			if(lista[i]==null) {
				break;
			}
			resultado =resultado + lista[i].ToString() + "\n";
		}
		return resultado;
	}
}
