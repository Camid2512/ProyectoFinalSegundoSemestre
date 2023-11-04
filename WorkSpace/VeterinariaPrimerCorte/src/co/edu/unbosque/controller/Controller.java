package co.edu.unbosque.controller;

import java.util.ArrayList;

import co.edu.unbosque.model.Gato;
import co.edu.unbosque.model.Perro;
import co.edu.unbosque.view.Console;

public class Controller {

	private ArrayList<Perro> listaP;
	private ArrayList<Gato> listaG;
	private Console con;

	public Controller() {

		listaP = new ArrayList<Perro>();
		listaG = new ArrayList<Gato>();
		con = new Console();

	}

	public void crearPerro(String nombrePerro, String edadMeses, String raza, boolean esMacho, String nombreDueno) {

		listaP.add(new Perro(nombrePerro, edadMeses, raza, esMacho, nombreDueno));

	}

	public void crearGato(String nombreGato, int edadAnos, String raza, String comidaFavorita, String nombreDuena) {

		listaG.add(new Gato(nombreGato, edadAnos, raza, comidaFavorita, nombreDuena));

	}

	public boolean eliminarPerro(int index) {
		if (index >= listaP.size() || index < 0) {
			return false;
		} else {
			listaP.remove(index);
			return true;
		}
	}

	public boolean eliminarGato(int index) {
		if (index >= listaG.size() || index < 0) {
			return false;
		} else {
			listaG.remove(index);
			return true;
		}
	}

	public String mostrarPerro() {

		String salida1 = "";
		for (Perro p : listaP) {
			salida1 += p.toString();
		}
		return salida1;
	}

	public String mostrarGato() {

		String salida = "";
		for (Gato g : listaG) {
			salida += g.toString();
		}
		return salida;
	}

	public boolean actualizarPerro(int index, String newNombrePerro, String newEdadMeses, String newRaza,
			boolean newEsMacho, String newNombreDueno) {
		if (index >= listaP.size() || index < 0) {
			return false;
		} else {
			listaP.get(index).setNombrePerro(newNombrePerro);
			listaP.get(index).setEdadMeses(newEdadMeses);
			listaP.get(index).setRaza(newRaza);
			listaP.get(index).setEsMacho(newEsMacho);
			listaP.get(index).setNombreDueno(newNombreDueno);
			return true;
		}
	}

	public boolean actualizarGato(int index, String newNombreGato, int newEdadAnos, String newRaza,
			String newComidaFavorita, String newnombreDuena) {
		if (index >= listaG.size() || index < 0) {
			return false;
		} else {
			listaG.get(index).setNombreGato(newNombreGato);
			listaG.get(index).setEdadAnos(newEdadAnos);
			listaG.get(index).setRaza(newRaza);
			listaG.get(index).setComidaFavorita(newComidaFavorita);
			listaG.get(index).setNombreDuena(newnombreDuena);

			return true;
		}
	}

	public void run() {

		mainloop: while (true) {

			con.imprimirConSalto("Bienvenido a la veterniaria MiauGua");

			con.imprimirConSalto("Por favor indiquenos que opcion desea realizar:");
			con.imprimirConSalto("1. Anadir mascota (gato/perro)");
			con.imprimirConSalto("2. Mostrar mascotas");
			con.imprimirConSalto("3. Actualizar mascota (gato/perro)");
			con.imprimirConSalto("4. Eliminar mascota");
			con.imprimirConSalto("5. Salir");

			int opc = con.leerEntero();
			switch (opc) {
			case 1: {

				con.imprimirConSalto("Para empezar necesitamos saber que tipo de mascota tienes");
				con.quemarLinea();
				con.imprimirConSalto("Perro o Gato?");

				String res = con.leerLineaEntera();

				if (res.equalsIgnoreCase("perro")) {

					con.imprimirConSalto("Debido a que elegiste Perro, digita los siguientes datos:");

					con.imprimirConSalto("Nombre del perro");
					String nombrePerro = con.leerLineaEntera();
					con.imprimirConSalto("");

					con.imprimirConSalto("Edad en meses de: " + nombrePerro);
					String edadMeses = con.leerLineaEntera();
					con.imprimirConSalto("");

					con.imprimirConSalto("Raza de: " + nombrePerro);
					String raza = con.leerLineaEntera();
					con.imprimirConSalto("");

					con.imprimirConSalto("¿Es macho?");
					boolean esMacho = true;
					String seraMacho = con.leerLineaEntera();
					if (seraMacho.equalsIgnoreCase("SI")) {
						esMacho = true;
					} else {
						esMacho = false;
					}
					con.imprimirConSalto("");

					con.imprimirConSalto("Nombre del dueno");
					String nombreDueno = con.leerLineaEntera();
					con.imprimirConSalto("");

					crearPerro(nombrePerro, edadMeses, raza, esMacho, nombreDueno);
				} else {

					con.imprimirConSalto("Debido a que elegiste Gato, digita los siguientes datos:");

					con.imprimirConSalto("Nombre del gato");
					String nombreGato = con.leerLineaEntera();
					con.imprimirConSalto("");

					con.imprimirConSalto("Edad en anos de: " + nombreGato);
					int edadAnos = con.leerEntero();
					con.quemarLinea();
					con.imprimirConSalto("");

					con.imprimirConSalto("Raza de: " + nombreGato);
					String raza = con.leerLineaEntera();
					con.imprimirConSalto("");

					con.imprimirConSalto("Comida favorita de: " + nombreGato);
					String comidaFavorita = con.leerLineaEntera();
					con.imprimirConSalto("");

					con.imprimirConSalto("Nombre de la duena/o");
					String nombreDuena = con.leerLineaEntera();
					con.imprimirConSalto("");

					crearGato(nombreGato, edadAnos, raza, comidaFavorita, nombreDuena);

				}

				break;
			}

			case 2: {

				con.quemarLinea();
				con.imprimirConSalto("Estas son todas las mascotas hasta el momento:");
				con.imprimirConSalto("");

				con.imprimirConSalto(mostrarGato());
				con.imprimirConSalto(mostrarPerro());

				break;

			}
			case 3: {

				con.quemarLinea();
				con.imprimirConSalto("Que lista quieres actualizar?");
				con.imprimirConSalto("Indica entre PERROS o GATOS");
				String queLista = con.leerLineaEntera();

				if (queLista.equalsIgnoreCase("Perro") || queLista.equalsIgnoreCase("perros")) {

					con.imprimirConSalto("Necesitamos los siguientes datos para actualizar a los perros");

					con.imprimirConSalto("Indique por favor el numero del perro a actualizar (La lista empieza en 1)");
					int numPerro = (con.leerEntero() - 1);
					con.quemarLinea();
					con.imprimirConSalto("");

					con.imprimirConSalto("Cual es el nuevo nombre del perro?");
					String newNombrePerro = con.leerLineaEntera();
					con.imprimirConSalto("");

					con.imprimirConSalto("Cual es la nueva edad del perro (Sigue siendo en meses)?");
					String newEdadMeses = con.leerLineaEntera();
					con.imprimirConSalto("");

					con.imprimirConSalto("Cual es la raza del nuevo perro?");
					String newRaza = con.leerLineaEntera();
					con.imprimirConSalto("");

					con.imprimirConSalto("El nuevo perro es macho?");
					boolean newEsMacho = true;
					String seraMacho = con.leerLineaEntera();
					if (seraMacho.equalsIgnoreCase("SI")) {
						newEsMacho = true;
					} else {
						newEsMacho = false;
					}
					con.imprimirConSalto("");

					con.imprimirConSalto("Cual es el nuevo nombre del dueno?");
					String newNombreDueno = con.leerLineaEntera();
					con.imprimirConSalto("");

					con.imprimirConSalto("Datos actualizados");

					actualizarPerro(numPerro, newNombrePerro, newEdadMeses, newRaza, newEsMacho, newNombreDueno);
				} else {

					con.imprimirConSalto("Necesitamos los siguientes datos para actualizar a los gatos");

					con.imprimirConSalto("Indique por favor el numero del gato a actualizar (La lista empieza en 1)");
					int numGato = (con.leerEntero() - 1);
					con.quemarLinea();
					con.imprimirConSalto("");

					con.imprimirConSalto("Cual es el nuevo nombre del gato?");
					String newNombreGato = con.leerLineaEntera();
					con.imprimirConSalto("");

					con.imprimirConSalto("Cual es la nueva edad del gato (Sigue siendo en anos)?");
					int newEdadMeses = con.leerEntero();
					con.quemarLinea();
					con.imprimirConSalto("");

					con.imprimirConSalto("Cual es la raza del nuevo gato");
					String newRaza = con.leerLineaEntera();
					con.imprimirConSalto("");

					con.imprimirConSalto("Cual es la comida favorita del nuevo gato?");
					String newComidaFavorita = con.leerLineaEntera();
					con.imprimirConSalto("");

					con.imprimirConSalto("Cual es el nuevo nombre de la duena/o?");
					String newNombreDuena = con.leerLineaEntera();
					con.imprimirConSalto("");

					con.imprimirConSalto("Datos actualizados");

					actualizarGato(numGato, newNombreGato, newEdadMeses, newRaza, newComidaFavorita, newNombreDuena);
				}

				break;

			}
			case 4: {

				con.quemarLinea();
				con.imprimirConSalto("Que triste que tengamos que sacar algun animal de la veterinaria");

				con.imprimirConSalto("Por favor indique si el animal es un perro o un gato");

				String animal = con.leerLineaEntera();

				if (animal.equalsIgnoreCase("Perro") || animal.equalsIgnoreCase("Perros")) {
					con.imprimirConSalto("Indique el numero del perro que desea eliminar");
					int numPerro = (con.leerEntero() - 1);

					eliminarPerro(numPerro);
				} else {
					con.imprimirConSalto("Indique el numero del gato que desea eliminar");
					int numGato = (con.leerEntero() - 1);

					eliminarGato(numGato);
				}
				break;
			}
			case 5: {

				con.imprimirConSalto("Gracias por usar la veterinaria");
				con.imprimirConSalto("----------ADIOS----------");
				break mainloop;

			}

			default:

				con.imprimirConSalto("ESA OPCION NO ESTA DISPONIBLE");
				con.imprimirConSalto("Intentelo de nuevo con las 5 opciones dichas antes.");
				break;
			}

		}

	}

}
