package co.edu.unbosque.view;

import java.util.Scanner;

public class Console {
	private Scanner lector;

	public Console() {
		lector = new Scanner(System.in);

	}

	public String leerLineaCompleta() {
		return lector.nextLine();
	}

	public int leerEntero() {
		return lector.nextInt();
	}

	public long leerLong() {
		return lector.nextLong();
	}

	public float leerFloat() {
		return lector.nextFloat();
	}

	public double leerDouble() {
		return lector.nextDouble();
	}

	public boolean leerBoolean() {
		return lector.nextBoolean();
	}

	public String leerLineaEntera() {
		return lector.nextLine();
	}

	public String leerPalabra() {
		return lector.next();
	}

	public char leerCaracter() {
		return lector.next().charAt(0);
	}

	public void quemarLinea() {
		lector.nextLine();
	}

	public void impresionConSalto(String dato) {
		System.out.println(dato);
	}

	public void impresionSinSalto(String dato) {
		System.out.print(dato);

	}

}