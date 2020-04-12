package br.com.af.mulheresTec.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class ErroResponse {
	
	private String titulo;
	private Long status;
	private Long timestamp;
	private String mensagemDesenvolvedor;

}
