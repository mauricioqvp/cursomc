package com.nelioalves.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nelioalves.cursomc.domain.Categoria;
import com.nelioalves.cursomc.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	//TODO não entendi! O pacote está com nome errado
	// com.nelioavels.cursomc.resources.domain na aula está com.nelioavels.cursomc.resources.domain 
	@Autowired
	private CategoriaService service;

	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		// aqui tem um CONFLITO
		// no pdf o professor chama BUSCAR de FIND e eu atualizei p FIND
		// em todo o resto da aplicação, terá que ser usando FIND
		// este método está implementado no CategoriaService (linha 14)
		Categoria obj = service.find(id);
		return ResponseEntity.ok().body(obj);
		
		/*
		 * Categoria cat1 = new Categoria(1, "Informatica"); Categoria cat2 = new
		 * Categoria(2, "Escritorio");
		 * 
		 * List<Categoria> lista = new ArrayList<>(); lista.add(cat1); lista.add(cat2);
		 * 
		 * return lista;
		 */
	}
}
