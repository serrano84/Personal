package com.sistema.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sistema.beans.Persona;



@Controller
@RequestMapping(value="persona")
public class ControladorHola{
	
//	@Autowired
//	private Persona persona;
	
	@RequestMapping(method = RequestMethod.GET)
	public String index(){
		return "hola";
	}
	
	@RequestMapping(value="/hola", method=RequestMethod.GET)
	public String hola(){	
		
	//	System.out.println("valores de persona cambio: " + persona.getApellido());
		return "hola";
	}
	
	@SuppressWarnings("rawtypes")
	@RequestMapping(value="/getDatos", method=RequestMethod.POST)
	@ResponseBody
	public ResponseEntity getDatos(){
		System.out.println("llego al metodo getDatos");
		Persona persona = new Persona();
		persona.setNombre("Luis222");
		persona.setApellido("Serrano");
		return new ResponseEntity<>(persona, HttpStatus.OK);
	}
	
	
	@RequestMapping(value="/otro/{palabra}")
	public ResponseEntity home(@PathVariable String palabra) {
//		model.addAttribute("persona", new Persona("juanelo", "patiño"));
//		System.out.println("llega " + persona.getNombre() + palabra);
		return new ResponseEntity<> (null, HttpStatus.OK);
		
	}
	
	

}
