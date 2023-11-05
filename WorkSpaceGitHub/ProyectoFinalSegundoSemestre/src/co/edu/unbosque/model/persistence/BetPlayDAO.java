package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.BetPlayDTO;

public class BetPlayDAO implements CRUDOperation {

	private ArrayList<BetPlayDTO> betPlayList;
	/**
	 * Este es el atributo de el nombre de archivo
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	private final String FILENAME;

	/**
	 * Este es el atributo de el nombre serial de archivo
	 * 
	 * @author Cristhian Diaz
	 * @version 1.0
	 * @since 25/09/2023
	 */
	private final String SERIAL_FILENAME;

	public BetPlayDAO() {
		// TODO Auto-generated constructor stub

		betPlayList = new ArrayList<BetPlayDTO>();
		FILENAME = "betplay.dat";
		SERIAL_FILENAME = "betplayserializable.csv";
		readFromFile();
		if (FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME) != null) {
			Object temp = FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME);
			@SuppressWarnings("unchecked")
			ArrayList<BetPlayDTO> temp2 = (ArrayList<BetPlayDTO>) temp;
			betPlayList = temp2;
		} else {
			betPlayList = new ArrayList<BetPlayDTO>();
		}

	}

	@Override
	public void create(String... attribs) {
		// TODO Auto-generated method stub
		BetPlayDTO bet = new BetPlayDTO();

		bet.setDay(Integer.parseInt(attribs[0]));
		bet.setMonth(Integer.parseInt(attribs[1]));
		bet.setYear(Integer.parseInt(attribs[2]));
		bet.setBetPlaced(Double.parseDouble(attribs[3]));
		bet.setHeadQuarterName(attribs[4]);
		bet.setDocument(Long.parseLong(attribs[5]));
		bet.setTeam1(attribs[6]);
		bet.setTeam2(attribs[7]);
		bet.setTeam3(attribs[8]);
		bet.setTeam4(attribs[9]);
		bet.setTeam5(attribs[10]);
		bet.setTeam6(attribs[11]);
		bet.setTeam7(attribs[12]);
		bet.setTeam8(attribs[13]);
		bet.setTeam9(attribs[14]);
		bet.setTeam10(attribs[15]);
		bet.setTeam11(attribs[16]);
		bet.setTeam12(attribs[17]);
		bet.setTeam13(attribs[18]);
		bet.setTeam14(attribs[19]);
		bet.setTeam15(attribs[20]);
		bet.setTeam16(attribs[21]);
		bet.setTeam17(attribs[22]);
		bet.setTeam18(attribs[23]);
		bet.setTeam19(attribs[24]);
		bet.setTeam20(attribs[25]);
		bet.setGameResult(Integer.parseInt(attribs[26]));

		betPlayList.add(bet);
		writeFile();
		writeSerializable();
	}

	@Override
	public void create(Object obj) {
		// TODO Auto-generated method stub
		betPlayList.add((BetPlayDTO) obj);
		writeFile();
		writeSerializable();
	}

	int index = 0;

	@Override
	public String readAll() {
		// TODO Auto-generated method stub
		index = 0;
		StringBuilder sb = new StringBuilder();
		betPlayList.forEach(bet -> {
			sb.append(index + "-->" + (bet.toString() + "\n"));
			index++;
		});

		return sb.toString();
	}

	@Override
	public boolean updateByIndex(int index, String... newData) {
		if (index < 0 || index >= betPlayList.size()) {
			return false;
		} else {
			if (!newData[0].isEmpty() || !newData[0].equals("") || newData[0].length() != 0) {
				betPlayList.get(index).setDay(Integer.parseInt(newData[0]));
			}
			if (!newData[1].isEmpty() || !newData[1].equals("") || newData[1].length() != 0) {
				betPlayList.get(index).setMonth(Integer.parseInt(newData[0]));
			}
			if (!newData[2].isEmpty() || !newData[2].equals("") || newData[2].length() != 0) {
				betPlayList.get(index).setYear(Integer.parseInt(newData[2]));
			}
			if (!newData[3].isEmpty() || !newData[3].equals("") || newData[3].length() != 0) {
				betPlayList.get(index).setBetPlaced(Double.parseDouble(newData[3]));
			}
			if (!newData[4].isEmpty() || !newData[4].equals("") || newData[4].length() != 0) {
				betPlayList.get(index).setHeadQuarterName(newData[4]);
			}
			if (!newData[5].isEmpty() || !newData[5].equals("") || newData[5].length() != 0) {
				betPlayList.get(index).setDocument(Long.parseLong(newData[5]));
			}
			if (!newData[6].isEmpty() || !newData[6].equals("") || newData[6].length() != 0) {
				betPlayList.get(index).setTeam1(newData[6]);
			}
			if (!newData[7].isEmpty() || !newData[7].equals("") || newData[7].length() != 0) {
				betPlayList.get(index).setTeam1(newData[7]);
			}
			if (!newData[8].isEmpty() || !newData[8].equals("") || newData[8].length() != 0) {
				betPlayList.get(index).setTeam1(newData[8]);
			}
			if (!newData[9].isEmpty() || !newData[9].equals("") || newData[9].length() != 0) {
				betPlayList.get(index).setTeam1(newData[9]);
			}
			if (!newData[10].isEmpty() || !newData[10].equals("") || newData[10].length() != 0) {
				betPlayList.get(index).setTeam1(newData[10]);
			}
			if (!newData[11].isEmpty() || !newData[11].equals("") || newData[11].length() != 0) {
				betPlayList.get(index).setTeam1(newData[11]);
			}
			if (!newData[12].isEmpty() || !newData[12].equals("") || newData[12].length() != 0) {
				betPlayList.get(index).setTeam1(newData[12]);
			}
			if (!newData[13].isEmpty() || !newData[13].equals("") || newData[13].length() != 0) {
				betPlayList.get(index).setTeam1(newData[13]);
			}
			if (!newData[14].isEmpty() || !newData[14].equals("") || newData[14].length() != 0) {
				betPlayList.get(index).setTeam1(newData[14]);
			}
			if (!newData[15].isEmpty() || !newData[15].equals("") || newData[15].length() != 0) {
				betPlayList.get(index).setTeam1(newData[15]);
			}
			if (!newData[16].isEmpty() || !newData[16].equals("") || newData[16].length() != 0) {
				betPlayList.get(index).setTeam1(newData[16]);
			}
			if (!newData[17].isEmpty() || !newData[17].equals("") || newData[17].length() != 0) {
				betPlayList.get(index).setTeam1(newData[17]);
			}
			if (!newData[18].isEmpty() || !newData[18].equals("") || newData[18].length() != 0) {
				betPlayList.get(index).setTeam1(newData[18]);
			}
			if (!newData[19].isEmpty() || !newData[19].equals("") || newData[19].length() != 0) {
				betPlayList.get(index).setTeam1(newData[19]);
			}
			if (!newData[20].isEmpty() || !newData[20].equals("") || newData[20].length() != 0) {
				betPlayList.get(index).setTeam1(newData[20]);
			}
			if (!newData[21].isEmpty() || !newData[21].equals("") || newData[21].length() != 0) {
				betPlayList.get(index).setTeam1(newData[21]);
			}
			if (!newData[22].isEmpty() || !newData[22].equals("") || newData[22].length() != 0) {
				betPlayList.get(index).setTeam1(newData[22]);
			}
			if (!newData[23].isEmpty() || !newData[23].equals("") || newData[23].length() != 0) {
				betPlayList.get(index).setTeam1(newData[23]);
			}
			if (!newData[24].isEmpty() || !newData[24].equals("") || newData[24].length() != 0) {
				betPlayList.get(index).setTeam1(newData[24]);
			}
			if (!newData[25].isEmpty() || !newData[25].equals("") || newData[25].length() != 0) {
				betPlayList.get(index).setTeam1(newData[25]);
			}
			if (!newData[26].isEmpty() || !newData[26].equals("") || newData[26].length() != 0) {
				betPlayList.get(index).setGameResult(Integer.parseInt(newData[26]));
			}
			writeFile();
			writeSerializable();
			return true;
		}
	}

	@Override
	public boolean delete(int index) {
		// TODO Auto-generated method stub
		if (index < 0 || index >= betPlayList.size()) {
			return false;
		} else {
			betPlayList.remove(index);
			writeFile();
			writeSerializable();
			return true;
		}
	}

	@Override
	public boolean delete(Object obj) {
		// TODO Auto-generated method stub
		if (obj == null) {
			return false;
		} else if (betPlayList.remove((BetPlayDTO) obj)) {
			writeFile();
			writeSerializable();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void readFromFile() {
		// TODO Auto-generated method stub
		String content = FileHandler.openAndReadFile(FILENAME);
		if (content.isEmpty()) {
			return;
		}
		String[] lines = content.split("\n");
		for (int i = 0; i < lines.length; i++) {
			String[] cols = lines[i].split(";");

			int day = Integer.parseInt(cols[0]);
			int month = Integer.parseInt(cols[1]);
			int year = Integer.parseInt(cols[2]);
			double betPlaced = Double.parseDouble(cols[3]);
			String headQuarterName = cols[4];
			long document = Long.parseLong(cols[5]);
			String team1 = cols[6];
			String team2 = cols[7];
			String team3 = cols[8];
			String team4 = cols[9];
			String team5 = cols[10];
			String team6 = cols[11];
			String team7 = cols[12];
			String team8 = cols[13];
			String team9 = cols[14];
			String team10 = cols[15];
			String team11 = cols[16];
			String team12 = cols[17];
			String team13 = cols[18];
			String team14 = cols[19];
			String team15 = cols[20];
			String team16 = cols[21];
			String team17 = cols[22];
			String team18 = cols[23];
			String team19 = cols[24];
			String team20 = cols[25];
			int gameResult = Integer.parseInt(cols[26]);

			betPlayList.add(new BetPlayDTO(day, month, year, betPlaced, headQuarterName, document, team1, team2, team3,
					team4, team5, team6, team7, team8, team9, team10, team11, team12, team13, team14, team15, team16,
					team17, team18, team19, team20, gameResult));

		}
	}

	String content = "";

	@Override
	public void writeFile() {
		// TODO Auto-generated method stub

		content = "";
		betPlayList.forEach(bet -> {
			content += bet.getDay() + ";";
			content += bet.getMonth() + ";";
			content += bet.getYear() + ";";
			content += bet.getBetPlaced() + ";";
			content += bet.getHeadQuarterName() + ";";
			content += bet.getDocument() + ";";
			content += bet.getTeam1() + ";";
			content += bet.getTeam2() + ";";
			content += bet.getTeam3() + ";";
			content += bet.getTeam4() + ";";
			content += bet.getTeam5() + ";";
			content += bet.getTeam6() + ";";
			content += bet.getTeam7() + ";";
			content += bet.getTeam8() + ";";
			content += bet.getTeam9() + ";";
			content += bet.getTeam10() + ";";
			content += bet.getTeam11() + ";";
			content += bet.getTeam12() + ";";
			content += bet.getTeam13() + ";";
			content += bet.getTeam14() + ";";
			content += bet.getTeam15() + ";";
			content += bet.getTeam16() + ";";
			content += bet.getTeam17() + ";";
			content += bet.getTeam18() + ";";
			content += bet.getTeam19() + ";";
			content += bet.getTeam20() + ";";
			content += bet.getGameResult() + ";BETPLAY\n";

		});
		FileHandler.openAndWriteFile(FILENAME, content);

	}

	@Override
	public void writeSerializable() {
		// TODO Auto-generated method stub
		FileHandler.serializableOpenAndWriteFile(SERIAL_FILENAME, betPlayList);
	}

}