
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class day1 {
	@GetMapping("/")
	public String show() {
		return"Welcome";
	}

}