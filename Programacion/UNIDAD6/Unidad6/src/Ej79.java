import java.util.Scanner;

public class Ej79 {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		int num;
		System.out.println("Introduce la cuenta atras...");
		num = scanner.nextInt();
		
		explosion(num);
		
		if(num<0)
			System.out.println("BOOM!");
		
	}

	public static void explosion(int num) {
		
		if(num>=0) {
			System.out.println(num);
			num--;
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		}
		
		
		if(num>=0) explosion(num);

		}
		
	}


