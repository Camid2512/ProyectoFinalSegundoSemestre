package co.edu.unbosque.controller;

import java.util.ArrayList;

import co.edu.unbosque.model.EstudianteProg1;
import co.edu.unbosque.view.Console;

public class Controller {

	private ArrayList<EstudianteProg1> listaEstudiantes;
	private Console con;

	public Controller() {

		listaEstudiantes = new ArrayList<EstudianteProg1>();
		con = new Console();

	}

	public void crearEstudiante(String nombre, int edad, long cedula, boolean esMujer, int semestre) {

		listaEstudiantes.add(new EstudianteProg1(nombre, edad, cedula, esMujer, semestre));

	}

	public boolean eliminarEstudiante(int index) {

		if (index >= listaEstudiantes.size() || index < 0) {
			return false;
		} else {
			listaEstudiantes.remove(index);
			return true;
		}

	}

	public String mostrarEstudiantes() {

		String salida = "";

		for (EstudianteProg1 e : listaEstudiantes) {
			salida += e.toString();
		}

		return salida;

	}

	public boolean actualizarEstudiante(int index, String newNombre, int newEdad, long newCedula, boolean newGenero,
			int newSemestre) {
		if (index >= listaEstudiantes.size() || index < 0) {
			return false;
		} else {
			listaEstudiantes.get(index).setNombre(newNombre);
			listaEstudiantes.get(index).setEdad(newEdad);
			listaEstudiantes.get(index).setCedula(newCedula);
			listaEstudiantes.get(index).setEsMujer(newGenero);
			listaEstudiantes.get(index).setSemestre(newSemestre);
			return true;
		}
	}

	public void run() {

		cicloprincipal: while (true) {

			con.imprimirConSalto("APLICATIVO DE ESTUDIANTES PARA CREAR ESTUDIANTES :)");

			con.imprimirConSalto("MENU PRINCIPAL");
			con.imprimirConSalto("PULSE 1 PARA CREAR");
			con.imprimirConSalto("PULSE 2 PARA ACTUALIZAR");
			con.imprimirConSalto("PULSE 3 PARA ELIMINAR");
			con.imprimirConSalto("PULSE 4 PARA MOSTRAR");
			con.imprimirConSalto("PULSE 5 PARA SALIR");

			int opc = con.leerEntero();

			switch (opc) {
			case 1: {
				con.imprimirConSalto("Inserte por favor el nombre");
				con.quemarLinea();
				String nombre = con.leerLineaEntera();

				con.imprimirConSalto("Inserte por favor la edad");
				int edad = con.leerEntero();

				con.imprimirConSalto("Inserte por favor la cedula");
				long cedula = con.leerLong();
				con.quemarLinea();

				con.imprimirConSalto("¿Es usted mujer?");
				boolean esMujer = con.leerBoolean();

				// LUEGO DE BOOLEAN SE QUEMA LINEA
				con.quemarLinea();

				con.imprimirConSalto("Inserte por favor el semestre");
				int semestre = con.leerEntero();

				crearEstudiante(nombre, edad, cedula, esMujer, semestre);
				// OBLIGATORIO
				break;
			}
			case 2: {

			}

			case 3: {

				con.imprimirConSalto("DIGITE LA POSICION DEL ESTUDIANTE QUE QUIERE ELIMINAR");
				int posicion = con.leerEntero();

				if (eliminarEstudiante(posicion)) {
					con.imprimirConSalto("ESTUDIANTE ELIMINADO CON EXITO");
				} else {
					con.imprimirConSalto("ESE ESTUDIANTE NO EXISTE");
				}
				break;

			}
			case 4: {
				con.imprimirConSalto(mostrarEstudiantes());
				break;
			}
			case 5: {
				con.imprimirConSalto("HASTA LUEGO1");
				break cicloprincipal;
			}

			default: {
				con.imprimirConSalto("OPCION NO VALIDA INTENTE DE NUEVO");
				break;
			}
			}

		}

	}

}
