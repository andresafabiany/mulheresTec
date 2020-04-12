package br.com.af.mulheresTec.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(
        value = {"createdAt", "updatedAt"},
        allowGetters = true
)
@Getter
@Setter
public abstract class Auditoria implements Serializable{
	
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATA_CRIACAO", nullable = false, updatable = false)
    @CreatedDate
    private Date dataCriacao;

	@Column(name = "USUARIO_CRIACAO", nullable = false, updatable = false)
	@CreatedDate
	private String usuarioCriacao;

	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATA_ATUALIZACAO", nullable = false)
    @LastModifiedDate
    private Date dataAtualizacao;
    
    @Column(name = "USUARIO_ATUALIZACAO", nullable = false)
    @LastModifiedDate
    private String usuarioAtualizacao;

}
