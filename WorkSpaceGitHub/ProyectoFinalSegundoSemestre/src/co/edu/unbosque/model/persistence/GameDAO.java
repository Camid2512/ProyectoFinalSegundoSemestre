package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class GameDAO {

	private final String GAME_FILENAME = "juegos.dat";
	private File myFile;
	private PrintWriter fileWriter;
	private final String ROOT = "PRF_PROG1_20232_DIAZCRISTHIAN_RUEDASANTIAGO_LARAVALENTINA_GUERREROCAMILO.";

	public GameDAO() {
		// TODO Auto-generated constructor stub
		myFile = new File("src/co/edu/unbosque/model/persistence/" + GAME_FILENAME);

	}

	public void create(double budget1, double budget2, double budget3, double budget4, double budget5) {

		myFile = new File("src/co/edu/unbosque/model/persistence/" + GAME_FILENAME);
		myFile.delete();

		try {
			if (!myFile.exists()) {
				myFile.createNewFile();
				fileWriter = new PrintWriter(myFile);
				fileWriter.write(ROOT + "nombrejuego1=loteria" + "\n" + ROOT + "tipojuego1=loteria" + "\n" + ROOT
						+ "presupuestoasignado1=" + budget1 + "\n" + ROOT + "nombrejuego2=superastro" + "\n" + ROOT
						+ "tipojuego2=loteria" + "\n" + ROOT + "presupuestoasignado2=" + budget2 + "\n" + ROOT
						+ "nombrejuego3=baloto" + "\n" + ROOT + "tipojuego3=loteria" + "\n" + ROOT
						+ "presupuestoasignado3=" + budget3 + "\n" + ROOT + "nombrejuego4=betplay" + "\n" + ROOT
						+ "tipojuego4=deportivo" + "\n" + ROOT + "presupuestoasignado4=" + budget4 + "\n" + ROOT
						+ "nombrejuego5=chance" + "\n" + ROOT + "tipojuego5=chance" + "\n" + ROOT
						+ "presupuestoasignado5=" + budget5);
				fileWriter.close();
			}
			fileWriter = new PrintWriter(myFile);
			fileWriter.write(ROOT + "nombrejuego1=loteria" + "\n" + ROOT + "tipojuego1=loteria" + "\n" + ROOT
					+ "presupuestoasignado1=" + budget1 + "\n" + ROOT + "nombrejuego2=superastro" + "\n" + ROOT
					+ "tipojuego2=loteria" + "\n" + ROOT + "presupuestoasignado2=" + budget2 + "\n" + ROOT
					+ "nombrejuego3=baloto" + "\n" + ROOT + "tipojuego3=loteria" + "\n" + ROOT + "presupuestoasignado3="
					+ budget3 + "\n" + ROOT + "nombrejuego4=betplay" + "\n" + ROOT + "tipojuego4=deportivo" + "\n"
					+ ROOT + "presupuestoasignado4=" + budget4 + "\n" + ROOT + "nombrejuego5=chance" + "\n" + ROOT
					+ "tipojuego5=chance" + "\n" + ROOT + "presupuestoasignado5=" + budget5);
			fileWriter.close();
		} catch (IOException e) {
			System.out.println("Problema al crear el archivo, revise problemas de acceso.");
		}
	}

	public double totalBudgetCalculated(double budget1, double budget2, double budget3, double budget4,
			double budget5) {

		double total = budget1 + budget2 + budget3 + budget4 + budget5;

		return total;

	}
}
