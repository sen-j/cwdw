/* Napisz program, kt�ry sprawdza czy liczba x zawiera si� w przedziale <5,10> i wy�wietl
odpowiedni komunikat. */

import java.util.Random;

public class zad2 {

	public static void main(String[] args) {
		Random rand = new Random();
		int x = rand.nextInt(16);
		System.out.println("Wylosowana liczba: "+x);
		
		if((x>=5) && (x<=10)) {
			System.out.println("Zmienna x nale�y do przedzia�u <5,10>");
		} else {
			System.out.println("Zmienna x nie nale�y do przedzia�u <5,10>");
		}
		

	}

}
