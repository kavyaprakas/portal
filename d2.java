package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class d2{
private String StudentName="IamNeo";
@GetMapping("/")
public String getName() {
		return "Welcome "+StudentName;
	}

}
