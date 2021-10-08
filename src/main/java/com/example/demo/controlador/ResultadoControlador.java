package com.example.demo.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.modelo.Resultado;
import com.example.demo.modelo.ResultadoDao;



@Controller
public class ResultadoControlador {
	
	@Autowired
	private ResultadoDao resultadodao;
	
	@RequestMapping(value="/score", method=RequestMethod.GET)
	public String index(Model modelo) {
	List<Resultado> puntuacion = resultadodao.findAll();

	modelo.addAttribute("puntos",puntuacion);
	return "score";
	}

}
