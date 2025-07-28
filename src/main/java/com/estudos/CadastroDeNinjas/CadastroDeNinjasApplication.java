package com.estudos.CadastroDeNinjas;

import com.estudos.CadastroDeNinjas.Ninjas.NinjaModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CadastroDeNinjasApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadastroDeNinjasApplication.class, args);

		int idade = 44;
		String nome = "Naruto";
		String email = "narutinho@gmail.com";

		System.out.println("Naruto");
		
	}
}
