package co.edu.unbosque.view;

import java.util.Scanner;

public class Console {
	private Scanner sc;

	public Console() {
		sc = new Scanner(System.in);

	}

	public String leerLineaCompleta() {
		return sc.nextLine();
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

	public boolean leerBoolean() {
		return sc.nextBoolean();
	}

	public String leerLineaEntera() {
		return sc.nextLine();
	}

	public String leerPalabra() {
		return sc.next();
	}

	public char leerCaracter() {
		return sc.next().charAt(0);
	}

	public void quemarLinea() {
		sc.nextLine();
	}

	public void impresionConSalto(String dato) {
		System.out.println(dato);
	}

	public void impresionSinSalto(String dato) {
		System.out.print(dato);

	}

}