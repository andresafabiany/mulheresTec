package br.com.af.mulheresTec.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@SuppressWarnings("serial")
@Entity
@Table(name = "tecnologia")
@Getter
@Setter
@NoArgsConstructor
public class Tecnologia extends Auditoria{
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="CODIGO_TECNOLOGIA")
    private Long id;
	
    @Column(name = "NOME", nullable = false, length = 100)
	private String nome;
	
    @Column(name = "DESCRICAO", nullable = false, length = 255)
	private String descricao;

}
