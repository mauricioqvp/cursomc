package com.nelioalves.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nelioalves.cursomc.resources.domain.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository <Categoria, Integer>{

}
