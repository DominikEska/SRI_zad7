package com.rest2.AplikacjaRest2;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/zad3a")
	public Tworca getTworca(@RequestParam(value="id", defaultValue = "1") int id) {
		return FunkcjeBazodanowe.getTworca(id);
	}

	@GetMapping("/zad3b")
	public ArrayList<Obrazek> getObrazyTworcy(@RequestParam(value="id", defaultValue = "1") int id) {
		return FunkcjeBazodanowe.getObrazyTworcy(id);
	}
	
	@GetMapping("/zad3c")
	public String utworzPowiazanie(@RequestParam(value="id_tworca", defaultValue = "1") int id_tworca, @RequestParam(value="id_obraz", defaultValue = "1") int id_obraz) {
		
		FunkcjeBazodanowe.utworzPowiazanie(id_tworca, id_obraz);
		
		return "Aktualizacja wykonana";
	}
	
	@GetMapping("/zad3d")
	public String usunPowiazanie(@RequestParam(value="id_tworca", defaultValue = "1") int id_tworca, @RequestParam(value="id_obraz", defaultValue = "1") int id_obraz) {
		
		FunkcjeBazodanowe.usunPowiazanie(id_tworca, id_obraz);
		
		return "Aktualizacja wykonana";
	}
	
}
