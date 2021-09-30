package com.example.demo.controlador;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
//holaaaaa
@Controller
public class Controlador {
//CREACION PREGUNTA 1
	@RequestMapping(value="/pregunta1",method=RequestMethod.GET)
	public String pregunta1(Model model, HttpSession session) {
		

		return "pregunta1";
	}

	@RequestMapping(value = "/pregunta1",method = RequestMethod.POST)
	public String pregunta1_post(Model model, HttpServletRequest request,
			@RequestParam String p1) {
		//return "redirect:/pregunta2";
		@SuppressWarnings("unchecked")
		List<String> messages = (List<String>) request.getSession().getAttribute("RESPUESTA");
		if (messages == null) {
		messages = new ArrayList<>();
		request.getSession().setAttribute("RESPUESTA", messages);
		}
		messages.add(p1);
		request.getSession().setAttribute("RESPUESTA", messages);
		return "redirect:/pregunta2";
	}
//CREACION PREGUNTA 2
	@RequestMapping(value="/pregunta2",method=RequestMethod.GET)
	public String pregunta2_get(Model model, HttpSession session) {
		
		
		return "pregunta2";
	}
	
	@RequestMapping(value = "/pregunta2",method = RequestMethod.POST)
	public String pregunta2_post(Model model, HttpServletRequest request,
			@RequestParam String p2) {
		@SuppressWarnings("unchecked")
		List<String> messages = (List<String>) request.getSession().getAttribute("RESPUESTA");
		if (messages == null) {
		messages = new ArrayList<>();
		request.getSession().setAttribute("RESPUESTA", messages);
		}
		messages.add(p2);
		request.getSession().setAttribute("RESPUESTA", messages);
		return "redirect:/pregunta3";
	}
//CREACION PREGUNTA 3
	@RequestMapping(value="/pregunta3",method=RequestMethod.GET)
	public String pregunta3_get(Model model, HttpSession session) {
		
		
		return "pregunta3";
	}
	
	@RequestMapping(value = "/pregunta3",method = RequestMethod.POST)
	public String pregunta3_post(Model model, HttpServletRequest request,
			@RequestParam (defaultValue = "false")Boolean p3_a, 
			@RequestParam (defaultValue = "false")Boolean p3_b,
			@RequestParam (defaultValue = "false")Boolean p3_c,
			@RequestParam (defaultValue = "false")Boolean p3_d ) {
		
		if(p3_a==false && p3_b==false && p3_c==false && p3_d==false) {
			return "redirect:/pregunta3";
		}
		if(p3_b==true) {
			@SuppressWarnings("unchecked")
			List<String> messages = (List<String>) request.getSession().getAttribute("RESPUESTA");
			if (messages == null) {
			messages = new ArrayList<>();
			request.getSession().setAttribute("RESPUESTA", messages);
			}
			messages.add("Correcto");
			request.getSession().setAttribute("RESPUESTA", messages);
		}
		if(p3_d==true) {
			@SuppressWarnings("unchecked")
			List<String> messages = (List<String>) request.getSession().getAttribute("RESPUESTA");
			if (messages == null) {
			messages = new ArrayList<>();
			request.getSession().setAttribute("RESPUESTA", messages);
			}
			messages.add("Correcto");
			request.getSession().setAttribute("RESPUESTA", messages);
		}
		
		return "redirect:/pregunta4";

	}
//CREACION PREGUNTA 4
	@RequestMapping(value="/pregunta4",method=RequestMethod.GET)
	public String pregunta4_get(Model model, HttpSession session) {
		
		
		return "pregunta4";
	}
	@RequestMapping(value = "/pregunta4",method = RequestMethod.POST)
	public String pregunta4_post(Model model, HttpServletRequest request,
			@RequestParam String p4) {	
		@SuppressWarnings("unchecked")
		List<String> messages = (List<String>) request.getSession().getAttribute("RESPUESTA");
		if (messages == null) {
		messages = new ArrayList<>();
		request.getSession().setAttribute("RESPUESTA", messages);
		}
		messages.add(p4);
		request.getSession().setAttribute("RESPUESTA", messages);
		return "redirect:/pregunta5";
	}

//CREACION PREGUNTA 5
	@RequestMapping(value="/pregunta5",method=RequestMethod.GET)
	public String pregunta5_get(Model model, HttpSession session) {
		
		
		return "pregunta5";
	}
	@RequestMapping(value = "/pregunta5",method = RequestMethod.POST)
	public String pregunta5_post(Model model, HttpServletRequest request,
			@RequestParam String p5) {	
		@SuppressWarnings("unchecked")
		List<String> messages = (List<String>) request.getSession().getAttribute("RESPUESTA");
		if (messages == null) {
		messages = new ArrayList<>();
		request.getSession().setAttribute("RESPUESTA", messages);
		}
		messages.add(p5);
		request.getSession().setAttribute("RESPUESTA", messages);
		return "redirect:/pregunta6";
	}
//CREACION PREGUNTA 6
	@RequestMapping(value="/pregunta6",method=RequestMethod.GET)
	public String pregunta6_get(Model model, HttpSession session) {
		
		
		return "pregunta6";
	}
	
	@RequestMapping(value = "/pregunta6",method = RequestMethod.POST)
	public String pregunta6_post(Model model, HttpServletRequest request,
			@RequestParam String p6) {	
		if(p6.equals("Dev1ce")) {
			@SuppressWarnings("unchecked")
			List<String> messages = (List<String>) request.getSession().getAttribute("RESPUESTA");
			if (messages == null) {
			messages = new ArrayList<>();
			request.getSession().setAttribute("RESPUESTA", messages);
			}
			messages.add("Correcto");
			request.getSession().setAttribute("RESPUESTA", messages);
		}
		return "redirect:/pregunta7";
	}
//CREACION PREGUNTA 7
	@RequestMapping(value="/pregunta7",method=RequestMethod.GET)
	public String pregunta7_get(Model model, HttpSession session) {
		
		
		return "pregunta7";
	}
	@RequestMapping(value = "/pregunta7",method = RequestMethod.POST)
	public String pregunta7_post(Model model, HttpServletRequest request,
			@RequestParam String p7) {	
		@SuppressWarnings("unchecked")
		List<String> messages = (List<String>) request.getSession().getAttribute("RESPUESTA");
		if (messages == null) {
		messages = new ArrayList<>();
		request.getSession().setAttribute("RESPUESTA", messages);
		}
		messages.add(p7);
		request.getSession().setAttribute("RESPUESTA", messages);
		return "redirect:/resultado";
	}
//CREACION RESULTADO
	@RequestMapping(value="/resultado",method=RequestMethod.GET)
	public String resultado_get(Model model, HttpSession session) {
		@SuppressWarnings("unchecked")
		List<String> messages = (List<String>) session.getAttribute("RESPUESTA");
		if (messages == null) {
		messages = new ArrayList<>();
		}
		model.addAttribute("sessionMessages", messages);
		int i=0;
		int resultado=0;
		for(i=0;i<messages.size();i++) {
			
			if(messages.get(i).equals("Correcto")) {
				resultado=resultado+1;
			}
		}
		model.addAttribute("resultado_quiz", resultado);
		return "resultado";
	}

//ELIMINAR SESSION
	@PostMapping("/destroy")
	public String destroySession(HttpServletRequest request) {
	request.getSession().invalidate();
	return "redirect:/pregunta1";
	}
}









