package com.rest2.AplikacjaRest2;

public class Obrazek {

	public static int ID_MAX;

	private int ID_Obrazek;
	private String tytul;
	private int cena;
	private int tworca_ID;

	public Obrazek(int iD_Obrazek, String tytul, int cena, int tworca_ID) {
		super();
		ID_Obrazek = iD_Obrazek;
		this.tytul = tytul;
		this.cena = cena;
		this.tworca_ID = tworca_ID;
	}

	public int getID_Obrazek() {
		return ID_Obrazek;
	}

	public void setID_Obrazek(int iD_Obrazek) {
		ID_Obrazek = iD_Obrazek;
	}

	public String getTytul() {
		return tytul;
	}

	public void setTytul(String tytul) {
		this.tytul = tytul;
	}

	public int getCena() {
		return cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}

	public int getTworca_ID() {
		return tworca_ID;
	}

	public void setTworca_ID(int tworca_ID) {
		this.tworca_ID = tworca_ID;
	}

	@Override
	public String toString() {
		return "Obrazek [ID_Obrazek=" + ID_Obrazek + ", tytul=" + tytul + ", cena=" + cena + ", tworca_ID=" + tworca_ID
				+ "]";
	}

}
