/**
 * Esta clase crea el recibo una vez que se realiza la apuesta
 * 
 * @author SOFTPYLSA
 * @version 1.0
 * @since 25/09/2023
 */

package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Esta clase crea el recibo una vez que se realiza la apuesta
 * 
 * @author SOFTPYLSA
 * @version 1.0
 * @since 25/09/2023
 */
public class ReceiptDAO {

	private final String RECIEPT_FILENAME;
	private File myFile;
	private PrintWriter fileWriter;

	
	/**
	 * Constructor de la clase ReceiptDAO
	 */
	public ReceiptDAO() {
		// TODO Auto-generated constructor stub

		RECIEPT_FILENAME = "receipt.properties";
		myFile = new File("src/co/edu/unbosque/model/persistence/" + RECIEPT_FILENAME);

	}

	/**
	 * Funcion encargada de crear el recibo de las apuestas
	 */
	public void create(String date, String name, String document, String venueBet, String typeBet) {

		myFile = new File("src/co/edu/unbosque/model/persistence/" + RECIEPT_FILENAME);
		myFile.delete();

		try {
			if (!myFile.exists()) {
				myFile.createNewFile();
				fileWriter = new PrintWriter(myFile);
				fileWriter.write(
						"PRF_PROG1_20232_DIAZCRISTHIAN_RUEDASANTIAGO_LARAVALENTINA_GUERREROCAMILO.recibo.fecha=" + date
								+ "\nPRF_PROG1_20232_DIAZCRISTHIAN_RUEDASANTIAGO_LARAVALENTINA_GUERREROCAMILO.recibo.nombre="
								+ name
								+ "\nPRF_PROG1_20232_DIAZCRISTHIAN_RUEDASANTIAGO_LARAVALENTINA_GUERREROCAMILO.recibo.documento="
								+ document
								+ "\nPRF_PROG1_20232_DIAZCRISTHIAN_RUEDASANTIAGO_LARAVALENTINA_GUERREROCAMILO.recibo.sededondeapuesta="
								+ venueBet
								+ "\nPRF_PROG1_20232_DIAZCRISTHIAN_RUEDASANTIAGO_LARAVALENTINA_GUERREROCAMILO.recibo.tipoapuesta="
								+ typeBet);
				fileWriter.close();
			}
			fileWriter = new PrintWriter(myFile);
			fileWriter.write("PRF_PROG1_20232_DIAZCRISTHIAN_RUEDASANTIAGO_LARAVALENTINA_GUERREROCAMILO.recibo.fecha="
					+ date + "\nPRF_PROG1_20232_DIAZCRISTHIAN_RUEDASANTIAGO_LARAVALENTINA_GUERREROCAMILO.recibo.nombre="
					+ name
					+ "\nPRF_PROG1_20232_DIAZCRISTHIAN_RUEDASANTIAGO_LARAVALENTINA_GUERREROCAMILO.recibo.documento="
					+ document
					+ "\nPRF_PROG1_20232_DIAZCRISTHIAN_RUEDASANTIAGO_LARAVALENTINA_GUERREROCAMILO.recibo.sededondeapuesta="
					+ venueBet
					+ "\nPRF_PROG1_20232_DIAZCRISTHIAN_RUEDASANTIAGO_LARAVALENTINA_GUERREROCAMILO.recibo.tipoapuesta="
					+ typeBet);
			fileWriter.close();
		} catch (IOException e) {
			System.out.println("Problema al crear el archivo, revise problemas de acceso.");
		}
	}

	/**
	 * Obtiene el archivo.
	 */
	public File getMyFile() {
	    return myFile;
	}

	/**
	 * Establece el archivo.
	 */
	public void setMyFile(File myFile) {
	    this.myFile = myFile;
	}

	/**
	 * Obtiene el escritor de archivos.
	 */
	public PrintWriter getFileWriter() {
	    return fileWriter;
	}

	/**
	 * Establece el escritor de archivos.
	 */
	public void setFileWriter(PrintWriter fileWriter) {
	    this.fileWriter = fileWriter;
	}

	/**
	 * Obtiene el nombre del archivo de recibo.
	 */
	public String getRECIEPT_FILENAME() {
	    return RECIEPT_FILENAME;
	}

}
