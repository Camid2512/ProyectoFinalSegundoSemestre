package co.edu.unbosque.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import co.edu.unbosque.model.persistence.PalabraDAO;
import co.edu.unbosque.view.Console;

public class Controller {

	private Console con;
	private Properties prop;
	private PalabraDAO paDAO;

	public Controller() {
		// TODO Auto-generated constructor stub

		con = new Console();
		prop = new Properties();
		paDAO = new PalabraDAO();

	}

	public void run() {

		try {
			prop.load(new BufferedReader(
					new FileReader("src/co/edu/unbosque/model/persistence/menuprincipal.properties")));

			con.imprimirConSalto(prop.getProperty("propiedades.menuprincipal.titulo"));
			con.imprimirConSalto(prop.getProperty("propiedades.menuprincipal.pregunta"));
			con.imprimirConSalto(prop.getProperty("propiedades.menuprincipal.salir"));
			con.imprimirConSalto(prop.getProperty("propiedades.menuprincipal.opcion"));
			con.imprimirConSalto(prop.getProperty("propiedades.menuprincipal.palabras"));

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			prop.load(new BufferedReader(new FileReader("src/co/edu/unbosque/model/persistence/spanish.properties")));
			for (int i = 0; i < 40; i++) {
				String nombre = prop.getProperty("propiedades.palabra.nombrepalabra" + (i + 1));
				String significado = prop.getProperty("propiedades.palabra.significadopalabra" + (i + 1));
				paDAO.create(nombre, significado);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			prop.load(
					new BufferedReader(new FileReader("src/co/edu/unbosque/model/persistence/portuguese.properties")));
			for (int i = 0; i < 40; i++) {
				String nombre = prop.getProperty("propiedades.palabra.nombrepalabra" + (i + 1));
				String significado = prop.getProperty("propiedades.palabra.significadopalabra" + (i + 1));
				paDAO.create(nombre, significado);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			prop.load(new BufferedReader(new FileReader("src/co/edu/unbosque/model/persistence/latin.properties")));
			for (int i = 0; i < 40; i++) {
				String nombre = prop.getProperty("propiedades.palabra.nombrepalabra" + (i + 1));
				String significado = prop.getProperty("propiedades.palabra.significadopalabra" + (i + 1));
				paDAO.create(nombre, significado);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			prop.load(new BufferedReader(new FileReader("src/co/edu/unbosque/model/persistence/german.properties")));
			for (int i = 0; i < 40; i++) {
				String nombre = prop.getProperty("propiedades.palabra.nombrepalabra" + (i + 1));
				String significado = prop.getProperty("propiedades.palabra.significadopalabra" + (i + 1));
				paDAO.create(nombre, significado);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			prop.load(new BufferedReader(new FileReader("src/co/edu/unbosque/model/persistence/english.properties")));
			for (int i = 0; i < 40; i++) {
				String nombre = prop.getProperty("propiedades.palabra.nombrepalabra" + (i + 1));
				String significado = prop.getProperty("propiedades.palabra.significadopalabra" + (i + 1));
				paDAO.create(nombre, significado);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		mainloop: while (true) {

			int t = con.leerEntero();

			if (t < 0) {

				break mainloop;

			} else {

				con.imprimirConSalto(paDAO.searchAndReadByIndex(t));

			}

		}

	}

}
