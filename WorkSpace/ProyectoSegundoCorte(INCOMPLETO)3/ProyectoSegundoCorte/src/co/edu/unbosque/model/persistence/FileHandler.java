package co.edu.unbosque.model.persistence;

/** 
 * Esta es la clase File handler es el manejo de archivos
 * @author Cristhian Diaz
 * @version 1.0
 * @since 25/09/2023*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileHandler {

	/**
	 * Este es el atributo de el scanner
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	private static Scanner fileReader;

	/**
	 * Este es el atributo dela impresion de datos
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	private static PrintWriter fileWriter;
	/**
	 * Este es el atributo de el archivo
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	private static File myFile;
	/**
	 * Este es el atributo de cargar archivo
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	private static FileOutputStream fos;
	
	/**
	 * Este es el atributo de entrada de objeto
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	private static ObjectInputStream ois;
	
	/**
	 * Este es el atributo de sobreescribir archivo
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	private static FileInputStream fis;
	
	/**
	 * Este es el atributo de salida de objeto
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	private static ObjectOutputStream oos;

	/**
	 * Este es el constructor vacio de File handler
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public FileHandler() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Este es el serializado abrir y leer de los archivos FileHandler
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public static Object serializableOpenAndReadFile(String fileName) {
		try {
			fis = new FileInputStream(new File("src/co/edu/unbosque/model/persistence/" + fileName));
		} catch (FileNotFoundException e) {
			try {
				System.out.println("Archvio serializado no encontrado, creandolo ahora mismo");
				File temp = new File("src/co/edu/unbosque/model/persistence/" + fileName);
				temp.createNewFile();
				fis = new FileInputStream(new File("src/co/edu/unbosque/model/persistence/" + fileName));
			} catch (IOException e1) {
				System.out.println("ERROR el archivo serializado no pudo ser creado");
				e1.printStackTrace();
			}
		}
		Object content = null;
		try {
			ois = new ObjectInputStream(fis);
			content = ois.readObject();
			ois.close();
		} catch (IOException e) {
			System.out.println("No se pudo leer en el archivo serializado (input)");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("ERROR al obtener el contenido");
			e.printStackTrace();
		}
		return content;
	}

	/**
	 * Este es el serializado abrir y sobreescribir de los archivos FileHandler
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public static void serializableOpenAndWriteFile(String fileName, Object content) {

		try {
			fos = new FileOutputStream(new File("src/co/edu/unbosque/model/persistence/" + fileName));
		} catch (FileNotFoundException e) {
			File temp = new File("src/co/edu/unbosque/model/persistence/" + fileName);
			try {
				fos = new FileOutputStream(temp);
			} catch (FileNotFoundException e1) {
				System.out.println("Problemas al crear o buscar el archivo serializado (escritura)");
				e1.printStackTrace();
			}
		}
		try {
			oos = new ObjectOutputStream(fos);
			oos.writeObject(content);
			oos.close();
		} catch (IOException e) {
			System.out.println("Problemas al abrir el archivo serializado (escritura)");
			e.printStackTrace();
		}
	}

	/**
	 * Este es el abrir y leer de los archivos FileHandler
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */

	public static String openAndReadFile(String url) {
		myFile = new File("src/co/edu/unbosque/model/persistence/" + url);
		String contenido = "";
		try {
			if (!myFile.exists()) {
				myFile.createNewFile();
			}
			fileReader = new Scanner(myFile);
			while (fileReader.hasNext()) {
				contenido += fileReader.nextLine();
			}
			fileReader.close();
		} catch (IOException e) {
			System.out.println("Problema al crear el archivo, revise problemas de acceso.");
		}
		return contenido;
	}

	/**
	 * Este es el abrir y sobreescribir de los archivos FileHandler
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	public static void openAndWriteFile(String url, String contentToWrite) {
		myFile = new File("src/co/edu/unbosque/model/persistence/" + url);
		myFile.delete();
		try {
			if (!myFile.exists()) {
				myFile.createNewFile();
			}
			fileWriter = new PrintWriter(myFile);
			fileWriter.write(contentToWrite);
			fileWriter.close();
		} catch (IOException e) {
			System.out.println("Problema al crear el archivo, revise problemas de acceso.");
		}
	}

}
