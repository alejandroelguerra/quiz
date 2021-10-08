package com.example.demo.modelo;

public class Resultado {
	public long id;
	public String nombre;
	public int puntuacion;

	public Resultado(long id, String nombre, int puntuacion) {
		this.id = id;
		this.nombre = nombre;
		this.puntuacion = puntuacion;
	}

	public Resultado(String nombre, int puntuacion) {
		this.nombre = nombre;
		this.puntuacion = puntuacion;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return nombre;
	}

	public void setName(String name) {
		this.nombre = name;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

}
