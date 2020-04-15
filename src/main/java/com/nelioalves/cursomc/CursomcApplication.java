package com.nelioalves.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nelioalves.cursomc.repositories.CategoriaRepository;
import com.nelioalves.cursomc.resources.domain.Categoria;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		// aqui o do professor foi usado:
		// categoriaRepository.save(Arrays.asList(cat1, cat2));
		// mas no meu dava erro. Pode ser por causa do JAVA 11 / JAVA 8
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
	}
}
