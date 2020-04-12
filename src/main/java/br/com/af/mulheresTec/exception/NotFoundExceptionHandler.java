package br.com.af.mulheresTec.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.af.mulheresTec.response.ErroResponse;


@ControllerAdvice
public class NotFoundExceptionHandler {

	//este metodo sera chamado sempre que uma NotFoundExceptionHandler for lancada
		@ExceptionHandler(NotFoundException.class)
		public ResponseEntity<ErroResponse> handlerRecursoNaoEncontrado(NotFoundException e, HttpServletRequest request){
			
			ErroResponse erro = new ErroResponse();
			erro.setStatus(404L);
			erro.setTitulo(e.getMessage());
			erro.setMensagemDesenvolvedor("Confira se a URI/ID ou outros parâmetros estão corretos");
			erro.setTimestamp(System.currentTimeMillis());

	//retorna not found(404) e constroi o corpo com os detalhes do erro
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);		
		}
		
		
}
