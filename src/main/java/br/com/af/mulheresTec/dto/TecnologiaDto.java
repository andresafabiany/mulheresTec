package br.com.af.mulheresTec.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TecnologiaDto extends AuditoriaDto{
	
    private Long id;
	private String nome;
	private String descricao;

}
