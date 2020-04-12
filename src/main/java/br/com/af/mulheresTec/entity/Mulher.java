package br.com.af.mulheresTec.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@SuppressWarnings("serial")
@Entity
@Table(name = "mulher")
@Getter
@Setter
@NoArgsConstructor
public class Mulher extends Auditoria{
	
	@Id
	@Column(name = "CPF")
	private Long cpf;
	
	@Column(name = "NOME", nullable = false, length = 100)
	private String nome;
	
	@Column(name = "DATA_NASCIMENTO")
	private Date dataNascimento;
	
	@Column(name = "IDADE")
	private Integer idade;
	
	@Column(name = "TELEFONE", nullable = false)
	private Integer telefone;
	
	@Column(name = "ENDERENCO")
	private String endereco;
	
	@Column(name = "PROFISSAO")
	private String profissao;
	
	@Column(name = "DESCRICAO", nullable = false, length = 255)
	private String descricao;
	
	@Column(name = "HABILIDADE")
	private String habilidade;
	
	@OneToMany
	@JoinColumn(name="CODIGO_TECNOLOGIA")
    private Tecnologia tecnologia;

}
