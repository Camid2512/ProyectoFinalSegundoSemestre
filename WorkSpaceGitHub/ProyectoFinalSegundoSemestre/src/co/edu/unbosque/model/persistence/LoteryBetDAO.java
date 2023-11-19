package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.LoteryBetDTO;

public class LoteryBetDAO implements CRUDOperation {

	private ArrayList<LoteryBetDTO> loteryBetList;

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

	public LoteryBetDAO() {
		// TODO Auto-generated constructor stub

		loteryBetList = new ArrayList<LoteryBetDTO>();
		FILENAME = "apuestas-loteria.dat";
		SERIAL_FILENAME = "apuestas-loteriaserialized.dat";
		readFromFile();
		if (FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME) != null) {
			Object temp = FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME);
			@SuppressWarnings("unchecked")
			ArrayList<LoteryBetDTO> temp2 = (ArrayList<LoteryBetDTO>) temp;
			loteryBetList = temp2;
		} else {
			loteryBetList = new ArrayList<LoteryBetDTO>();
		}

	}

	@Override
	public void create(String... attribs) {
		// TODO Auto-generated method stub

		LoteryBetDTO loterybet = new LoteryBetDTO();

		loterybet.setDay(Integer.parseInt(attribs[0]));
		loterybet.setMonth(Integer.parseInt(attribs[1]));
		loterybet.setYear(Integer.parseInt(attribs[2]));
		loterybet.setHour(Integer.parseInt(attribs[3]));
		loterybet.setMinute(Integer.parseInt(attribs[4]));
		loterybet.setSecond(Integer.parseInt(attribs[5]));
		loterybet.setBetPlaced(Double.parseDouble(attribs[6]));
		loterybet.setHeadQuarterName(attribs[7]);
		loterybet.setDocument(Long.parseLong(attribs[8]));
		loterybet.setLoteryName(attribs[9]);
		loterybet.setNumbers(Integer.parseInt(attribs[10]));
		loterybet.setSerialNum(Integer.parseInt(attribs[11]));

		loteryBetList.add(loterybet);
		writeFile();
		writeSerializable();
	}

	@Override
	public void create(Object obj) {
		// TODO Auto-generated method stub
		loteryBetList.add((LoteryBetDTO) obj);
		writeFile();
		writeSerializable();
	}

	int index = 0;

	@Override
	public String readAll() {
		// TODO Auto-generated method stub
		index = 0;
		StringBuilder sb = new StringBuilder();
		loteryBetList.forEach(loteryBet -> {
			sb.append(index + "-->" + (loteryBet.toString() + "\n"));
			index++;
		});

		return sb.toString();
	}

	@Override
	public boolean updateByIndex(int index, String... newData) {
		if (index < 0 || index >= loteryBetList.size()) {
			return false;
		} else {
			if (!newData[0].isEmpty() || !newData[0].equals("") || newData[0].length() != 0) {
				loteryBetList.get(index).setDay(Integer.parseInt(newData[0]));
			}
			if (!newData[1].isEmpty() || !newData[1].equals("") || newData[1].length() != 0) {
				loteryBetList.get(index).setMonth(Integer.parseInt(newData[0]));
			}
			if (!newData[2].isEmpty() || !newData[2].equals("") || newData[2].length() != 0) {
				loteryBetList.get(index).setYear(Integer.parseInt(newData[2]));
			}
			if (!newData[3].isEmpty() || !newData[3].equals("") || newData[3].length() != 0) {
				loteryBetList.get(index).setBetPlaced(Double.parseDouble(newData[3]));
			}
			if (!newData[4].isEmpty() || !newData[4].equals("") || newData[4].length() != 0) {
				loteryBetList.get(index).setHeadQuarterName(newData[4]);
			}
			if (!newData[5].isEmpty() || !newData[5].equals("") || newData[5].length() != 0) {
				loteryBetList.get(index).setDocument(Long.parseLong(newData[5]));
			}
			if (!newData[6].isEmpty() || !newData[6].equals("") || newData[6].length() != 0) {
				loteryBetList.get(index).setLoteryName(newData[6]);
			}
			if (!newData[7].isEmpty() || !newData[7].equals("") || newData[7].length() != 0) {
				loteryBetList.get(index).setNumbers(Integer.parseInt(newData[7]));
			}
			if (!newData[8].isEmpty() || !newData[8].equals("") || newData[8].length() != 0) {
				loteryBetList.get(index).setSerialNum(Integer.parseInt(newData[8]));
			}
			writeFile();
			writeSerializable();
			return true;
		}
	}

	@Override
	public boolean delete(int index) {
		// TODO Auto-generated method stub
		if (index < 0 || index >= loteryBetList.size()) {
			return false;
		} else {
			loteryBetList.remove(index);
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
		} else if (loteryBetList.remove((LoteryBetDTO) obj)) {
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
			int hour = Integer.parseInt(cols[3]);
			int minute = Integer.parseInt(cols[4]);
			int second = Integer.parseInt(cols[5]);
			double betPlaced = Double.parseDouble(cols[6]);
			String headQuarterName = cols[7];
			long document = Long.parseLong(cols[8]);
			String loteryName = cols[9];
			int number = Integer.parseInt(cols[10]);
			int serialNum = Integer.parseInt(cols[11]);

			loteryBetList.add(new LoteryBetDTO(day, month, year, hour, minute, second, betPlaced, headQuarterName, document, loteryName,
					number, serialNum));

		}
	}

	String content = "";

	@Override
	public void writeFile() {
		// TODO Auto-generated method stub

		content = "";
		loteryBetList.forEach(loteryBet -> {
			content += loteryBet.getDay() + ";";
			content += loteryBet.getMonth() + ";";
			content += loteryBet.getYear() + ";";
			content += loteryBet.getHour() + ";";
			content += loteryBet.getMinute() + ";";
			content += loteryBet.getSecond() + ";";
			content += loteryBet.getBetPlaced() + ";";
			content += loteryBet.getHeadQuarterName() + ";";
			content += loteryBet.getDocument() + ";";
			content += loteryBet.getLoteryName() + ";";
			content += loteryBet.getNumbers() + ";";
			content += loteryBet.getSerialNum() + ";LOT\n";

		});
		FileHandler.openAndWriteFile(FILENAME, content);

	}

	@Override
	public void writeSerializable() {
		// TODO Auto-generated method stub
		FileHandler.serializableOpenAndWriteFile(SERIAL_FILENAME, loteryBetList);
	}

	public ArrayList<LoteryBetDTO> getLoteryBetList() {
		return loteryBetList;
	}

	public void setLoteryBetList(ArrayList<LoteryBetDTO> loteryBetList) {
		this.loteryBetList = loteryBetList;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getFILENAME() {
		return FILENAME;
	}

	public String getSERIAL_FILENAME() {
		return SERIAL_FILENAME;
	}

}
