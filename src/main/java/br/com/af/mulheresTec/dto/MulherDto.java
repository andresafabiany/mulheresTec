package br.com.af.mulheresTec.dto;

import java.util.Date;

import br.com.af.mulheresTec.entity.Tecnologia;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MulherDto extends AuditoriaDto{
	
	private Long cpf;
	private String nome;
	private Date dataNascimento;
	private Integer idade;
	private Integer telefone;
	private String endereco;
	private String profissao;
	private String descricao;
	private String habilidade;
    private Tecnologia tecnologia;

}
