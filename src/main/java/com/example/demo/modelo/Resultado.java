package com.example.demo.modelo;

public class Resultado {
	private long id;
	private String nombre;
	private int puntuacion;

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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	

}
