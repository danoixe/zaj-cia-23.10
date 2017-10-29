import java.util.Scanner;

public class Zadanie5 {

	public static void main(String[] args) {
		double m;
		Scanner reader = new Scanner(System.in);
		System.out.println("Podaj cenê towaru");
		double c = reader.nextDouble();
		System.out.println("Podaj liczbê rat");
		double r = reader.nextDouble();
		while (c<100 || c>10000) {
			System.out.println("Podaj cenê towaru miêdzy 100 a 100 000 z³");
			c = reader.nextDouble();
		}
		while   (r<6 || r>48) {
			System.out.println("Podaj liczbê rat miêdzy 6 a 48");
			r = reader.nextDouble();
		}
			if (r>6 && r<12) {
				m = 1.025*c;
			}
			else if (r>13 && r<24) {
				m = 1.05*c;
			}
			else {
				m = 1.1*c;
			}
			System.out.println("Miesiêczna rata wynosi "+m+".");
		}
	}
