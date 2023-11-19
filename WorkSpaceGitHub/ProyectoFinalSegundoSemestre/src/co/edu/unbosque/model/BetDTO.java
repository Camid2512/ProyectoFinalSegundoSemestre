package co.edu.unbosque.model;

import java.io.Serializable;

public class BetDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2754106331524816379L;
	private int day;
	private int month;
	private int year;
	private int hour;
	private int minute;
	private int second;

	private double betPlaced;

	private String headQuarterName;
	private long document;

	public BetDTO() {
		// TODO Auto-generated constructor stub
	}

	public BetDTO(int day, int month, int year, int hour, int minute, int second, double betPlaced,
			String headQuarterName, long document) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		this.betPlaced = betPlaced;
		this.headQuarterName = headQuarterName;
		this.document = document;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public double getBetPlaced() {
		return betPlaced;
	}

	public void setBetPlaced(double betPlaced) {
		this.betPlaced = betPlaced;
	}

	public String getHeadQuarterName() {
		return headQuarterName;
	}

	public void setHeadQuarterName(String headQuarterName) {
		this.headQuarterName = headQuarterName;
	}

	public long getDocument() {
		return document;
	}

	public void setDocument(long document) {
		this.document = document;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}