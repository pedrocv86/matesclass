package com.matesclass.persistence.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USU_LOGRO")
public class UsuLogro implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8265712177510867880L;

	@Id
	@Column(name = "ID_LOGRO")
	private Long idLogro;

	@Id
	@Column(name = "ID_USUARIO")
	private String idUsuario;

	public UsuLogro() {
	}

	public UsuLogro(Long idLogro, String idUsuario) {
		this.idLogro = idLogro;
		this.idUsuario = idUsuario;
	}

	public Long getIdLogro() {
		return idLogro;
	}

	public void setIdLogro(Long idLogro) {
		this.idLogro = idLogro;
	}

	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

}
