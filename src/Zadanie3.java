import java.util.Scanner;

public class Zadanie3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Podaj swoj� wag�");
		double waga = reader.nextDouble();
		System.out.println("Podaj sw�j wzrost");
		double wzrost = reader.nextDouble();
		double bmi = waga/(wzrost*wzrost);
		if (bmi<24.9 && bmi>18.5) {
			System.out.println("waga prawid�owa");
		}
		else if (bmi>24.9) {
			System.out.println("nadwaga");
		}
		else {
			System.out.println("niedowaga");
		}
		

	}

}
