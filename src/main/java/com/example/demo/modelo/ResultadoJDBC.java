package com.example.demo.modelo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ResultadoJDBC implements ResultadoDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int save(Resultado resultado) {
		
		return jdbcTemplate.update("insert into Resultado (nombre,puntuacion)values(?,?)",resultado.getName(),resultado.getPuntuacion());
	}

	@Override
	public List<Resultado> findAll() {
		return jdbcTemplate.query("select * from Resultado order by puntuacion desc limit 10",
		(rs, rowNum) -> new Resultado(rs.getInt("id"), rs.getString("nombre"),
		rs.getInt("puntuacion")));
		}

}
