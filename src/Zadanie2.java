import java.util.Scanner;

public class Zadanie2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int a = reader.nextInt();
		int b = reader.nextInt();
		int c = reader.nextInt();
		if (a>b && a>c) {
			System.out.println("Najwiêksza liczba to "+a);
			if (b>c) {
				System.out.println("Najmniejsza liczba to "+c);
			}
			else {
				System.out.println("Najmniejsza liczba to "+b);
			}
			
		}
		else if (b>a && b>c) {
			System.out.println("Najwiêksza liczba to "+b);
			if (a>c) {
				System.out.println("Najmniejsza liczba to "+c);
			}
			else {
				System.out.println("Najmniejsza liczba to "+a);
			}
		}
		else {
			System.out.println("Najwiêksza liczba to "+c);
			if (a>b) {
				System.out.println("Najmniejsza liczba to "+b);
			}
			else {
				System.out.println("Najmniejsza liczba to "+a);
			}
		}

		
	}

}
