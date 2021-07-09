package com.rest2.AplikacjaRest2;

import java.util.ArrayList;

public class Tworca {

	private int ID_Tworca;
	private String imie;
	private String nazwisko;
	private ArrayList<Obrazek> stworzoneObrazy;

	public Tworca(int iD_Tworca, String imie, String nazwisko) {
		super();
		ID_Tworca = iD_Tworca;
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.stworzoneObrazy = new ArrayList<Obrazek>();
	}

	public int getID_Tworca() {
		return ID_Tworca;
	}

	public void setID_Tworca(int iD_Tworca) {
		ID_Tworca = iD_Tworca;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	@Override
	public String toString() {
		return "Tworca [ID_Tworca=" + ID_Tworca + ", imie=" + imie + ", nazwisko=" + nazwisko + ", stworzoneObrazy="
				+ stworzoneObrazy + "]";
	}

	public void addObrazek(Obrazek obrazek) {
		stworzoneObrazy.add(obrazek);
	}

	public ArrayList<Obrazek> getObrazki() {
		return stworzoneObrazy;
	}

}
