package br.com.af.mulheresTec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.af.mulheresTec.service.impl.MulherServiceImpl;

@RestController
@RequestMapping("af/api/mulherTec")
public class MulherController {

	@Autowired
	MulherServiceImpl mulherServiceImpl;
	
	@GetMapping("/mulher")
	public ResponseEntity listarMulheres() {
		return null;
	}
	
	@GetMapping("/mulher/{id}")
	public ResponseEntity buscarPorMulher() {
		return null;
	}
	
	@PostMapping("/mulher")
	public ResponseEntity cadastrarMulher() {
		return null;
	}
	
	@PutMapping("/mulher/{id}")
	public ResponseEntity atualizarMulher() {
		return null;
	}
	
	@DeleteMapping("/mulher/{id}")
	public ResponseEntity apagarMulher() {
		return null;
	}
	
}
