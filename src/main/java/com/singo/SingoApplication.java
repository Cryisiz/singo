package com.singo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




@SpringBootApplication
@RestController
public class SingoApplication {
	@GetMapping
	public String welcome(){
		return "Welcome";
	}
	public static void main(String[] args) {
		SpringApplication.run(SingoApplication.class, args);
	}

}
