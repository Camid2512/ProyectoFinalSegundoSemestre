package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

public class HouseSettingDAO {

	private final String CONFIG_FILENAME;
	private File myFile;
	private PrintWriter fileWriter;

	public HouseSettingDAO() {

		CONFIG_FILENAME = "config.properties";

	}

	public void create(String name, int numberVenue, double totalBudget) {
		myFile = new File("src/co/edu/unbosque/model/persistence/" + CONFIG_FILENAME);
		myFile.delete();
		try {
			if (!myFile.exists()) {
				myFile.createNewFile();
				fileWriter = new PrintWriter(myFile);
				fileWriter.write(
						"PRF_PROG1_20232_DIAZCRISTHIAN_RUEDASANTIAGO_LARAVALENTINA_GUERREROCAMILO.porperties.nombrecasa="
								+ name
								+ "\nPRF_PROG1_20232_DIAZCRISTHIAN_RUEDASANTIAGO_LARAVALENTINA_GUERREROCAMILO.porperties.numerosede="
								+ numberVenue
								+ "\nPRF_PROG1_20232_DIAZCRISTHIAN_RUEDASANTIAGO_LARAVALENTINA_GUERREROCAMILO.porperties.presupuesto="
								+ totalBudget);
				fileWriter.close();
			}
			fileWriter = new PrintWriter(myFile);
			fileWriter.write(
					"PRF_PROG1_20232_DIAZCRISTHIAN_RUEDASANTIAGO_LARAVALENTINA_GUERREROCAMILO.porperties.nombrecasa="
							+ name
							+ "\nPRF_PROG1_20232_DIAZCRISTHIAN_RUEDASANTIAGO_LARAVALENTINA_GUERREROCAMILO.porperties.numerosede="
							+ numberVenue
							+ "\nPRF_PROG1_20232_DIAZCRISTHIAN_RUEDASANTIAGO_LARAVALENTINA_GUERREROCAMILO.porperties.presupuesto="
							+ totalBudget);
			fileWriter.close();
		} catch (IOException e) {
			System.out.println("Problema al crear el archivo, revise problemas de acceso.");
		}
	}

}
