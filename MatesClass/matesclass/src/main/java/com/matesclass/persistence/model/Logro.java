package com.matesclass.persistence.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "LOGRO")
public class Logro implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2262539056378248469L;

	@Id
	@Column(name = "ID_LOGRO")
	private Long idLogro;

	@Column(name = "NOMBRE_LOGRO")
	private String nombreLogro;

	public Logro() {

	}

	public Logro(Long idLogro, String nombreLogro) {
		this.idLogro = idLogro;
		this.nombreLogro = nombreLogro;
	}

	public Long getIdLogro() {
		return idLogro;
	}

	public void setIdLogro(Long idLogro) {
		this.idLogro = idLogro;
	}

	public String getNombreLogro() {
		return nombreLogro;
	}

	public void setNombreLogro(String nombreLogro) {
		this.nombreLogro = nombreLogro;
	}

}
