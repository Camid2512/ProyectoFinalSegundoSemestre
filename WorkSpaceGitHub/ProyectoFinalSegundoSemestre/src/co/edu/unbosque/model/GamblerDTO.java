package co.edu.unbosque.model;

import java.io.Serializable;

public class GamblerDTO implements Serializable {

	private static final long serialVersionUID = -7972015745358472339L;
	/**
	 * 
	 */
	private String fullName;
	private long documentId;
	private String gamingVenue;
	private String addres;
	private long phoneNumber;

	public GamblerDTO() {
		// TODO Auto-generated constructor stub
	}

	public GamblerDTO(String fullName, long documentId, String gamingVenue, String addres, long phoneNumber) {
		super();
		this.fullName = fullName;
		this.documentId = documentId;
		this.gamingVenue = gamingVenue;
		this.addres = addres;
		this.phoneNumber = phoneNumber;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public long getDocumentId() {
		return documentId;
	}

	public void setDocumentId(long documentId) {
		this.documentId = documentId;
	}

	public String getGamingVenue() {
		return gamingVenue;
	}

	public void setGamingVenue(String gamingVenue) {
		this.gamingVenue = gamingVenue;
	}

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "GamblerDTO [fullName=" + fullName + ", documentId=" + documentId + ", gamingVenue=" + gamingVenue
				+ ", addres=" + addres + ", phoneNumber=" + phoneNumber + "]";
	}

}
