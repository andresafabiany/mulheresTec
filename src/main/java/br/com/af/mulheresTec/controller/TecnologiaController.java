package br.com.af.mulheresTec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.af.mulheresTec.service.impl.TecnologiaServiceImpl;

@RestController
@RequestMapping("af/api/mulherTec")
public class TecnologiaController {
	
	@Autowired
	TecnologiaServiceImpl tecnologiaServiceImpl;
	
	@GetMapping("/tecnologia")
	public ResponseEntity listarTecnologias() {
		return null;
	}
	
	@GetMapping("/tecnologia/{id}")
	public ResponseEntity buscarPorTecnologia() {
		return null;
	}
	
	@PostMapping("/tecnologia")
	public ResponseEntity cadastrarTecnologia() {
		return null;
	}
	
	@PutMapping("/tecnologia/{id}")
	public ResponseEntity atualizarTecnologia() {
		return null;
	}
	
	@DeleteMapping("/tecnologia/{id}")
	public ResponseEntity apagarTecnologia() {
		return null;
	}

}
