import java.util.Scanner;

public class Zadanie4{

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Podaj swój dochód");
		double d = reader.nextDouble();
		double p;
		if (d<85528) {
			p = 0.18*d- 556.02;
		}
		else {
			p = 14839.02 + 0.32*(85528-d);
		}
		System.out.println("Podatek wynosi "+p+"z³");
	}

}