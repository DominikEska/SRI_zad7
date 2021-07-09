package com.rest2.AplikacjaRest2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class FunkcjeBazodanowe {

	static final String DB_URL = "jdbc:postgresql://localhost/rest2";
	static final String USER = "postgres";
	static final String PASS = "postgres";

	public static Tworca getTworca(int id) {
		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM Tworca WHERE id_tworca = " + id);) {

			Tworca t = null;

			while (rs.next()) {
				t = new Tworca(rs.getInt("ID_tworca"), rs.getString("imie"), rs.getString("nazwisko"));
			}

			ResultSet rs2 = stmt.executeQuery("SELECT * FROM Obraz WHERE tworca_id = " + id);

			while (rs.next()) {
				t.addObrazek(new Obrazek(rs.getInt("ID_Obrazek"), rs.getString("tytul"),rs.getInt("Cena"),rs.getInt("tworca_id")));	
			}

			return t;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static ArrayList<Obrazek> getObrazyTworcy(int id) {
		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM Tworca WHERE id_tworca = " + id);) {

			Tworca t = null;

			while (rs.next()) {
				t = new Tworca(rs.getInt("ID_tworca"), rs.getString("imie"), rs.getString("nazwisko"));
			}

			ResultSet rs2 = stmt.executeQuery("SELECT * FROM Obraz WHERE tworca_id = " + id);

			while (rs.next()) {
				t.addObrazek(new Obrazek(rs.getInt("ID_Obrazek"), rs.getString("tytul"),rs.getInt("Cena"),rs.getInt("tworca_id")));	
			}

			return t.getObrazki();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void utworzPowiazanie(int id_tworca, int id_obraz) {
		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();
				String query = "UPDATE Obrazek SET tworca_id = " + id_tworca + "WHERE id_obrazek = " + id_obraz;
				stmt.execute(query);
	}
	
	public static void usunPowiazanie(int id_tworca, int id_obraz) {
		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();
				String query = "UPDATE Obrazek SET tworca_id = " + 0 + "WHERE id_obrazek = " + id_obraz;
				stmt.execute(query);
	}
}
