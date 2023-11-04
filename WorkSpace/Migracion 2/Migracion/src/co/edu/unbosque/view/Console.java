package co.edu.unbosque.view;

import java.util.Scanner;

public class Console {
	
	private Scanner sc;

	public Console() {

		sc = new Scanner(System.in);

		// TODO Auto-generated constructor stub
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

	public float leerFloat() {
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

	public void saltoDeLinea() {
		System.out.println();
	}

	public char leerLetra() {
		return sc.next().charAt(0);
	}

}
