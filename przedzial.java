/* Napisz program, kt�ry sprawdza czy liczba x zawiera si� w przedziale (3,5) i wy�wietl
odpowiedni komunikat. */

import java.util.Random;

public class zad2 {

	public static void main(String[] args) {
		Random rand = new Random();
		int x = rand.nextInt(11);
		System.out.println("Wylosowana liczba: "+x);
		
		if((x>=3) && (x<=5)) {
			System.out.println("Zmienna x nale�y do przedzia�u (3,5)");
		} else {
			System.out.println("Zmienna x nie nale�y do przedzia�u (3,5)");
		}
		

	}

}
