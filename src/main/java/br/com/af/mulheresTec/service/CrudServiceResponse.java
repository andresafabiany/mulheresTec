package br.com.af.mulheresTec.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.af.mulheresTec.response.Response;

@Service
@SuppressWarnings("rawtypes")
public interface CrudServiceResponse<T> {
	
	public ResponseEntity<Response> listar();
	public ResponseEntity<Response> buscarPorId(Long id);
	public ResponseEntity<Response> salvar(T objeto);
	public ResponseEntity<Response> atualizar(T objeto);
	public ResponseEntity<Response> deletar(Long id);

}
