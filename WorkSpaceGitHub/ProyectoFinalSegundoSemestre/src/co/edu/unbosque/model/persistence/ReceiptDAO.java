package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class ReceiptDAO {

	private final String RECIEPT_FILENAME;
	private File myFile;
	private PrintWriter fileWriter;

	public ReceiptDAO() {
		// TODO Auto-generated constructor stub

		RECIEPT_FILENAME = "receipt.properties";
		myFile = new File("src/co/edu/unbosque/model/persistence/" + RECIEPT_FILENAME);

	}

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

	public File getMyFile() {
		return myFile;
	}

	public void setMyFile(File myFile) {
		this.myFile = myFile;
	}

	public PrintWriter getFileWriter() {
		return fileWriter;
	}

	public void setFileWriter(PrintWriter fileWriter) {
		this.fileWriter = fileWriter;
	}

	public String getRECIEPT_FILENAME() {
		return RECIEPT_FILENAME;
	}

}
