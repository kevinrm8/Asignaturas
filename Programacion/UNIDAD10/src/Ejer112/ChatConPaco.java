package Ejer112;

import java.io.*;
import java.util.*;

public class ChatConPaco {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		String Chat;

		File Arc = new File("chat.txt");

		Chat = CrearChat();

		Arc.createNewFile();

		try {
			FileWriter ArcW = new FileWriter(Arc);
			ArcW.write(Chat);
			ArcW.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

	private static String CrearChat() {
		Scanner scanner = new Scanner(System.in);
		String nombre;
		String frase;
		String chat;
		int cont;

		System.out.println("Bienvenido al chat con Paco");
		chat = "Bienvenido al chat con Paco\n";
		System.out.println("Paco: Hola que tal, cómo te llamas?");
		chat += "Paco: Hola que tal, cómo te llamas?\n";
		nombre = scanner.nextLine();
		chat += nombre + "\n";
		System.out.println("Paco: Hola " + nombre + ", ¿Como estas hoy?");
		chat += "Paco: Hola " + nombre + ", ¿Como estas hoy?\n";
		do {
			cont = 0;
			System.out.print(nombre + ": ");
			chat += nombre + ": ";
			frase = scanner.nextLine().toLowerCase();
			chat += frase + "\n";

			if (frase.contains("vete")) {
				System.out.println("Paco: Nos vemos " + nombre + "!");
				chat += "Paco: Nos vemos " + nombre + "!\n";
				break;
			}
			for (int i = 0; i < frase.length(); i++) {
				if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o'
						|| frase.charAt(i) == 'u') {
					cont++;
				}

			}

			if (cont % 2 == 0) {
				System.out.println("Paco: Qué interesante...cuentame más…");
				chat += "Paco: Qué interesante...cuentame más…\n";
			} else {
				System.out.println("Paco: No me interesa nada, cuentame otra cosa");
				chat += "Paco: No me interesa nada, cuentame otra cosa\n";
			}

		} while (!frase.contains("vete"));

		return chat;
	}

}
