package br.com.af.mulheresTec.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface CrudService<T>{
	
	public List<T> listar();
	public T buscarPorId(Long id);
	public T salvar(T objeto);
	public T atualizar(T objeto);
	public T deletar(Long id);

}
