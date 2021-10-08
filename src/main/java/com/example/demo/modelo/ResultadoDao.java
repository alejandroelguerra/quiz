package com.example.demo.modelo;

import java.util.List;

public interface ResultadoDao {
	
	int save(Resultado resultado);
	List<Resultado>findAll();
}
