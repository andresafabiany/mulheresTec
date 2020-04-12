package br.com.af.mulheresTec.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuditoriaDto {
	
    private Date dataCriacao;
	private String usuarioCriacao;
    private Date dataAtualizacao;
    private String usuarioAtualizacao;

}
