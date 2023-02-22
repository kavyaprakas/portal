package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class d13{
	private String yourFavColor="Violet";
	@GetMapping("/")
	public String getMyFav() {
		return "My Fav Color is "+yourFavColor;
	}

}
