package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.GamblerDTO;

public class GamblerDAO implements CRUDOperation {

	private ArrayList<GamblerDTO> gamblerList;

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

	public GamblerDAO() {
		// TODO Auto-generated constructor stub

		gamblerList = new ArrayList<GamblerDTO>();
		FILENAME = "gambler.dat";
		SERIAL_FILENAME = "gamblerserialized.dat";

	}

	@Override
	public void create(String... attribs) {
		// TODO Auto-generated method stub

		GamblerDTO gambler = new GamblerDTO();

		gambler.setFullName(attribs[0]);
		gambler.setDocumentId(Long.parseLong(attribs[1]));
		gambler.setGamingVenue(attribs[2]);
		gambler.setAddres(attribs[3]);
		gambler.setPhoneNumber(Long.parseLong(attribs[4]));
		
		writeFile();
		writeSerializable();

	}

	@Override
	public void create(Object obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public String readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateByIndex(int index, String... newData) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int index) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void readFromFile() {
		// TODO Auto-generated method stub

	}

	@Override
	public void writeFile() {
		// TODO Auto-generated method stub

	}

	@Override
	public void writeSerializable() {
		// TODO Auto-generated method stub

	}

	public ArrayList<GamblerDTO> getGamblerList() {
		return gamblerList;
	}

	public void setGamblerList(ArrayList<GamblerDTO> gamblerList) {
		this.gamblerList = gamblerList;
	}

	public String getFILENAME() {
		return FILENAME;
	}

	public String getSERIAL_FILENAME() {
		return SERIAL_FILENAME;
	}
	
	

}
