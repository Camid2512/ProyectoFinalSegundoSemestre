package co.edu.unbosque.view;

import java.util.Scanner;

public class Console {

	private Scanner sc;

	public Console() {

		sc = new Scanner(System.in);

	}

	public void imprimirConSalto(String dato) {
		System.out.println(dato);
	}

	public void imprimirSinSalto(String dato) {
		System.out.print(dato);
	}

	public int leerEntero() {
		return sc.nextInt();
	}

	public long leerLong() {
		return sc.nextLong();
	}

	public float leerfloat() {
		return sc.nextFloat();
	}

	public double leerDouble() {
		return sc.nextDouble();
	}

	public String leerLineaEntera() {
		return sc.nextLine();
	}

	public String leerPalabra() {
		return sc.next();
	}

	public boolean leerBoolean() {
		return sc.nextBoolean();
	}

	public void quemarLinea() {
		sc.nextLine();
	}

	public void SaltoDeLinea() {
		System.out.println();
	}

	public char leerChar() {
		return sc.next().charAt(0);
	}

}
