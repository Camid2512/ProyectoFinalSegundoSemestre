package co.edu.unbosque.model;

public class ReceiptDTO {

	private String date, name, document, venueBet, betType;

	public ReceiptDTO() {
		// TODO Auto-generated constructor stub
	}

	public ReceiptDTO(String date, String name, String document, String venueBet, String betType) {
		super();
		this.date = date;
		this.name = name;
		this.document = document;
		this.venueBet = venueBet;
		this.betType = betType;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getVenueBet() {
		return venueBet;
	}

	public void setVenueBet(String venueBet) {
		this.venueBet = venueBet;
	}

	public String getBetType() {
		return betType;
	}

	public void setBetType(String betType) {
		this.betType = betType;
	}

	@Override
	public String toString() {
		return "ReceiptDTO [fecha=" + date + ", name=" + name + ", document=" + document + ", venueBet=" + venueBet
				+ ", betType=" + betType + "]";
	}

}
